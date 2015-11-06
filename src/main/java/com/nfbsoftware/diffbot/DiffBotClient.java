package com.nfbsoftware.diffbot;

import java.net.URLEncoder;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.nfbsoftware.diffbot.model.Article;
import com.nfbsoftware.diffbot.model.ArticleResponse;
import com.nfbsoftware.diffbot.model.ErrorResponse;
import com.nfbsoftware.diffbot.model.Image;
import com.nfbsoftware.diffbot.model.ImageResponse;
import com.nfbsoftware.diffbot.model.Video;
import com.nfbsoftware.diffbot.model.VideoResponse;
import com.nfbsoftware.util.WebPost;

import flexjson.JSONDeserializer;

/**
 * This is a Java utility class that is used to communicate with the DiffBot RESTful API.
 * 
 * @author brendanclemenzi
 */
public class DiffBotClient
{
    private static final Log logger = LogFactory.getLog(DiffBotClient.class);
    
    private String m_accessToken;
    private String m_requestTimeout;
    
    private static final String DIFFBOT_ARTICLE_API = "http://api.diffbot.com/v3/article";
    private static final String DIFFBOT_IMAGE_API = "http://api.diffbot.com/v3/image";
    private static final String DIFFBOT_VIDEO_API = "http://api.diffbot.com/v3/video";
    
    /**
     * 
     * @param accessToken for the diffbot API
     */
    public DiffBotClient(String accessToken)
    {
        m_accessToken = accessToken;
        m_requestTimeout = "30000";
        
        logger.debug("Diffbot timeout configuration: " + m_requestTimeout + "ms");
    }
    
    /**
     * 
     * @param accessToken for the diffbot API
     * @param timeoutMilliseconds
     */
    public DiffBotClient(String accessToken, String timeoutMilliseconds)
    {
        m_accessToken = accessToken;
        m_requestTimeout = timeoutMilliseconds;
        
        logger.debug("Diffbot timeout configuration: " + m_requestTimeout + "ms");
    }
    
    /**
     * <p>Returns an object that represents the Article being extracted from the given page url.</p>
     * 
     * @param pageUrl
     * @return Article
     * @throws Exception
     */
    public Article getArticle(String pageUrl) throws Exception
    {
        ArticleResponse restApiResponse = getArticleResponse(pageUrl);
        
        return restApiResponse.getObjects().get(0);
    }
    
    /**
     * <p>Returns the full response object for the article extracted from the given url</p>
     * 
     * @param pageUrl
     * @return ArticleResponse
     * @throws Exception
     */
    public ArticleResponse getArticleResponse(String pageUrl) throws Exception
    {
        logger.debug("Processing Article Request for " + pageUrl);
        
        String apiResponse = getApiResponse(DIFFBOT_ARTICLE_API, pageUrl);
        
        // Process the JSON response into an object we can use
        JSONDeserializer<ArticleResponse> js = new JSONDeserializer<ArticleResponse>();
        ArticleResponse restApiResponse = js.deserialize(apiResponse, ArticleResponse.class);
        
        return restApiResponse;
    }
    
    /**
     * <p>Returns an object list that represents the images being extracted from the given page url.</p>
     * 
     * @param pageUrl
     * @return List<Image>
     * @throws Exception
     */
    public List<Image> getImages(String pageUrl) throws Exception
    {
        ImageResponse restApiResponse = getImageResponse(pageUrl);
        
        return restApiResponse.getObjects();
    }
    
    /**
     * <p>Returns the full response object for the images extracted from the given url</p>
     * 
     * @param pageUrl
     * @return ImageResponse
     * @throws Exception
     */
    public ImageResponse getImageResponse(String pageUrl) throws Exception
    {
        logger.debug("Processing Image Request for " + pageUrl);
        
        String apiResponse = getApiResponse(DIFFBOT_IMAGE_API, pageUrl);
        
        // Process the JSON response into an object we can use
        JSONDeserializer<ImageResponse> js = new JSONDeserializer<ImageResponse>();
        ImageResponse restApiResponse = js.deserialize(apiResponse, ImageResponse.class);
        
        return restApiResponse;
    }

    /**
     * <p>Returns an object that represents the Video being extracted from the given page url.</p>
     * 
     * @param pageUrl
     * @return Video
     * @throws Exception
     */
    public Video getVideo(String pageUrl) throws Exception
    {
        VideoResponse restApiResponse = getVideoResponse(pageUrl);
        
        return restApiResponse.getObjects().get(0);
    }
    
    /**
     * <p>Returns the full response object for the video extracted from the given url</p>
     * 
     * @param pageUrl
     * @return VideoResponse
     * @throws Exception
     */
    public VideoResponse getVideoResponse(String pageUrl) throws Exception
    {
        logger.debug("Processing Video Request for " + pageUrl);
        
        String apiResponse = getApiResponse(DIFFBOT_VIDEO_API, pageUrl);
        
        // Process the JSON response into an object we can use
        JSONDeserializer<VideoResponse> js = new JSONDeserializer<VideoResponse>();
        VideoResponse restApiResponse = js.deserialize(apiResponse, VideoResponse.class);
        
        return restApiResponse;
    }
    
    /**
     * 
     * @param diffBotApi
     * @param pageUrl
     * @return
     * @throws Exception
     */
    private String getApiResponse(String apiUrl, String pageUrl) throws Exception
    {
        WebPost webPostUtil = new WebPost();
        
        logger.debug("Connecting to DiffBot API");
        String fullApiUrl = apiUrl + "?token=" + m_accessToken + "&timeout=" + m_requestTimeout + "&url=" + URLEncoder.encode(pageUrl, "UTF-8");
        webPostUtil.connect(fullApiUrl, "text/html; charset=utf-8", "GET");
        
        // Get the response for the API
        String apiResponse = webPostUtil.receive();
        logger.debug("Diffbott API Response: " + apiResponse);
        
        // Check for an error code
        if(apiResponse.contains("errorCode"))
        {
            JSONDeserializer<ErrorResponse> js = new JSONDeserializer<ErrorResponse>();
            ErrorResponse errorResponse = js.deserialize(apiResponse, ErrorResponse.class); 
            
            logger.equals(errorResponse.getError());
            throw new Exception(errorResponse.getError());
        }
        
        webPostUtil.disconnect();
        
        return apiResponse;
    }
}
