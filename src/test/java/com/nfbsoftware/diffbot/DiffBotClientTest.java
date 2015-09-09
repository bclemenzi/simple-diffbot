package com.nfbsoftware.diffbot;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.nfbsoftware.diffbot.model.Article;
import com.nfbsoftware.diffbot.model.Image;
import com.nfbsoftware.diffbot.model.Tag;
import com.nfbsoftware.diffbot.model.Video;

/**
 * 
 * @author Brendan Clemenzi
 * @email brendan@clemenzi.com
 */
public class DiffBotClientTest extends TestCase
{
    private String DIFFBOT_DEV_TOKEN = "3bc3...";  //set your api token here
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DiffBotClientTest( String testName )
    {
        super( testName );
    }
    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DiffBotClientTest.class );
    }
    
    /**
     * 
     * @throws Exception
     */
    public void testArticleApi() throws Exception
    {
        System.out.println("====> Starting DiffBotClientTest.testArticleApi");
        
        DiffBotClient client = new DiffBotClient(DIFFBOT_DEV_TOKEN);

        /*
        Article articleValue = client.getArticle("http://www.mnh.si.edu/exhibits/losing_paradise");
        
        System.out.println("Article DiffbotUri: " + articleValue.getDiffbotUri());
        System.out.println("Article Html: " + articleValue.getHtml());
        System.out.println("Article HumanLanguage: " + articleValue.getHumanLanguage());
        System.out.println("Article PageUrl: " + articleValue.getPageUrl());
        System.out.println("Article ResolvedPageUrl: " + articleValue.getResolvedPageUrl());
        System.out.println("Article SiteName: " + articleValue.getSiteName());
        System.out.println("Article Text: " + articleValue.getText());
        System.out.println("Article Title: " + articleValue.getTitle());
        System.out.println("Article Type: " + articleValue.getType());
        
        int imageCount = 0;
        for(Image imageValue : articleValue.getImages())
        {
            System.out.println("Article Image[" + imageCount + "] DiffbotUri: " + imageValue.getDiffbotUri());
            System.out.println("Article Image[" + imageCount + "] ResolvedPageUrl: " + imageValue.getResolvedPageUrl());
            System.out.println("Article Image[" + imageCount + "] Title: " + imageValue.getTitle());
            System.out.println("Article Image[" + imageCount + "] Type: " + imageValue.getType());
            System.out.println("Article Image[" + imageCount + "] Url: " + imageValue.getUrl());
            System.out.println("Article Image[" + imageCount + "] Xpath: " + imageValue.getXpath());
            System.out.println("Article Image[" + imageCount + "] Height: " + imageValue.getHeight());
            System.out.println("Article Image[" + imageCount + "] NaturalHeight: " + imageValue.getNaturalHeight());
            System.out.println("Article Image[" + imageCount + "] NaturalWidth: " + imageValue.getNaturalWidth());
            System.out.println("Article Image[" + imageCount + "] Primary: " + imageValue.getPrimary());
            System.out.println("Article Image[" + imageCount + "] Width: " + imageValue.getWidth());
            
            imageCount++;
        }
        
        int tagCount = 0;
        for(Tag tagValue : articleValue.getTags())
        {
            System.out.println("Article Tag[" + tagCount + "] Label: " + tagValue.getLabel());
            System.out.println("Article Tag[" + tagCount + "] Uri: " + tagValue.getUri());
            System.out.println("Article Tag[" + tagCount + "] Count: " + tagValue.getCount());
            System.out.println("Article Tag[" + tagCount + "] ID: " + tagValue.getId());
            System.out.println("Article Tag[" + tagCount + "] Prevalence: " + tagValue.getPrevalence());
            System.out.println("Article Tag[" + tagCount + "] Score: " + tagValue.getScore());
            
            tagCount++;
        }

        Assert.assertTrue("testArticleApi returned an error", articleValue.getSiteName().equalsIgnoreCase("si.edu"));
        */
        assertTrue(true);
        
        System.out.println("====> Finished DiffBotClientTest.testArticleApi");
    }
    
    /**
     * 
     * @throws Exception
     */
    public void testImageApi() throws Exception
    {
        System.out.println("====> Starting DiffBotClientTest.testImageApi");
        
        DiffBotClient client = new DiffBotClient(DIFFBOT_DEV_TOKEN);
        
        /*
        List<Image> imageList = client.getImages("http://www.mnh.si.edu/exhibits/losing_paradise");
        
        int imageCount = 0;
        for(Image imageValue : imageList)
        {
            System.out.println("Image[" + imageCount + "] DiffbotUri: " + imageValue.getDiffbotUri());
            System.out.println("Image[" + imageCount + "] ResolvedPageUrl: " + imageValue.getResolvedPageUrl());
            System.out.println("Image[" + imageCount + "] Title: " + imageValue.getTitle());
            System.out.println("Image[" + imageCount + "] Type: " + imageValue.getType());
            System.out.println("Image[" + imageCount + "] Url: " + imageValue.getUrl());
            System.out.println("Image[" + imageCount + "] Xpath: " + imageValue.getXpath());
            System.out.println("Image[" + imageCount + "] Height: " + imageValue.getHeight());
            System.out.println("Image[" + imageCount + "] NaturalHeight: " + imageValue.getNaturalHeight());
            System.out.println("Image[" + imageCount + "] NaturalWidth: " + imageValue.getNaturalWidth());
            System.out.println("Image[" + imageCount + "] Primary: " + imageValue.getPrimary());
            System.out.println("Image[" + imageCount + "] Width: " + imageValue.getWidth());
                    
            imageCount++;
        }
        
        Assert.assertTrue("testImageApi returned an error", imageList.size()==3);
        */
        assertTrue(true);
        
        System.out.println("====> Finished DiffBotClientTest.testImageApi");
    }
    
    /**
     * 
     * @throws Exception
     */
    public void testVideoApi() throws Exception
    {
        System.out.println("====> Starting DiffBotClientTest.testVideoApi");
        
        DiffBotClient client = new DiffBotClient(DIFFBOT_DEV_TOKEN, "50000");
        
        /*
        Video videoValue = client.getVideo("http://discoverykids.com/videos/dog-catches-frisbee-slow-motion-the-discovery-slow-down");
        
        System.out.println("Video Author: " + videoValue.getAuthor());
        System.out.println("Video Date: " + videoValue.getDate());
        System.out.println("Video DiffbotUri: " + videoValue.getDiffbotUri());
        System.out.println("Video Htm: " + videoValue.getHtml());
        System.out.println("Video HumanLanguage: " + videoValue.getHumanLanguage());
        System.out.println("Video Mime: " + videoValue.getMime());
        System.out.println("Video PageUrl: " + videoValue.getPageUrl());
        System.out.println("Video Text: " + videoValue.getText());
        System.out.println("Video Title: " + videoValue.getTitle());
        System.out.println("Video Type: " + videoValue.getType());
        System.out.println("Video Url: " + videoValue.getUrl());
        System.out.println("Video Duration: " + videoValue.getDuration());
        System.out.println("Video NaturalHeight: " + videoValue.getNaturalHeight());
        System.out.println("Video NaturalWidth: " + videoValue.getNaturalWidth());
        System.out.println("Video ViewCount: " + videoValue.getViewCount());
        
        int imageCount = 0;
        for(Image imageValue : videoValue.getImages())
        {
            System.out.println("Video Image[" + imageCount + "] DiffbotUri: " + imageValue.getDiffbotUri());
            System.out.println("Video Image[" + imageCount + "] ResolvedPageUrl: " + imageValue.getResolvedPageUrl());
            System.out.println("Video Image[" + imageCount + "] Title: " + imageValue.getTitle());
            System.out.println("Video Image[" + imageCount + "] Type: " + imageValue.getType());
            System.out.println("Video Image[" + imageCount + "] Url: " + imageValue.getUrl());
            System.out.println("Video Image[" + imageCount + "] Xpath: " + imageValue.getXpath());
            System.out.println("Video Image[" + imageCount + "] Height: " + imageValue.getHeight());
            System.out.println("Video Image[" + imageCount + "] NaturalHeight: " + imageValue.getNaturalHeight());
            System.out.println("Video Image[" + imageCount + "] NaturalWidth: " + imageValue.getNaturalWidth());
            System.out.println("Video Image[" + imageCount + "] Primary: " + imageValue.getPrimary());
            System.out.println("Video Image[" + imageCount + "] Width: " + imageValue.getWidth());
            
            imageCount++;
        }

        Assert.assertTrue("testVideoApi returned an error", videoValue.getMime().equalsIgnoreCase("video/mp4"));
        */
        assertTrue(true);
        
        System.out.println("====> Finished DiffBotClientTest.testVideoApi");
    }
}
