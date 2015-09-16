package com.nfbsoftware.diffbot.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.nfbsoftware.util.NfbUUID;
import com.nfbsoftware.util.StringUtil;

/**
 * 
 * @author brendanclemenzi
 *
 */
public class Video
{
    private String m_id;
    private String m_text;
    private String m_pageUrl;
    private String m_embedUrl;
    private BigInteger m_naturalHeight;
    private String m_humanLanguage;
    private String m_date;
    private String m_type;
    private String m_url;
    private String m_author;
    private String m_title;
    private BigInteger m_duration;
    private String m_diffbotUri;
    private String m_html;
    private String m_mime;
    private BigInteger m_naturalWidth;
    private BigInteger m_viewCount;
    
    private List<Image> m_images = new ArrayList<Image>();
    
    public String getId()
    {
        if(StringUtil.isNullOrEmpty(m_id))
        {
            m_id = NfbUUID.generateGUID();
        }
        
        return m_id;
    }
    public void setId(String id)
    {
        m_id = id;
    }
    
    public String getText()
    {
        return m_text;
    }
    public void setText(String text)
    {
        m_text = text;
    }
    
    public String getPageUrl()
    {
        return m_pageUrl;
    }
    public void setPageUrl(String pageUrl)
    {
        m_pageUrl = pageUrl;
    }
    
    public String getEmbedUrl()
    {
        return m_embedUrl;
    }
    public void setEmbedUrl(String embedUrl)
    {
        m_embedUrl = embedUrl;
    }
    
    public BigInteger getNaturalHeight()
    {
        return m_naturalHeight;
    }
    public void setNaturalHeight(BigInteger naturalHeight)
    {
        m_naturalHeight = naturalHeight;
    }
    
    public String getHumanLanguage()
    {
        return m_humanLanguage;
    }
    public void setHumanLanguage(String humanLanguage)
    {
        m_humanLanguage = humanLanguage;
    }
    
    public String getDate()
    {
        return m_date;
    }
    public void setDate(String date)
    {
        m_date = date;
    }
    
    public String getType()
    {
        return m_type;
    }
    public void setType(String type)
    {
        m_type = type;
    }
    
    public String getUrl()
    {
        return m_url;
    }
    public void setUrl(String url)
    {
        m_url = url;
    }
    
    public String getAuthor()
    {
        return m_author;
    }
    public void setAuthor(String author)
    {
        m_author = author;
    }
    
    public String getTitle()
    {
        return m_title;
    }
    public void setTitle(String title)
    {
        m_title = title;
    }
    
    public BigInteger getDuration()
    {
        return m_duration;
    }
    public void setDuration(BigInteger duration)
    {
        m_duration = duration;
    }
    
    public String getDiffbotUri()
    {
        return m_diffbotUri;
    }
    public void setDiffbotUri(String diffbotUri)
    {
        m_diffbotUri = diffbotUri;
    }
    
    public String getHtml()
    {
        return m_html;
    }
    public void setHtml(String html)
    {
        m_html = html;
    }
    
    public String getMime()
    {
        return m_mime;
    }
    public void setMime(String mime)
    {
        m_mime = mime;
    }
    
    public BigInteger getNaturalWidth()
    {
        return m_naturalWidth;
    }
    public void setNaturalWidth(BigInteger naturalWidth)
    {
        m_naturalWidth = naturalWidth;
    }
    
    public BigInteger getViewCount()
    {
        return m_viewCount;
    }
    public void setViewCount(BigInteger viewCount)
    {
        m_viewCount = viewCount;
    }
    
    public List<Image> getImages()
    {
        return m_images;
    }
    public void setImages(List<Image> images)
    {
        m_images = images;
    }
}
