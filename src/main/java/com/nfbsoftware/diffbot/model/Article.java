package com.nfbsoftware.diffbot.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author brendanclemenzi
 */
public class Article
{
    private String m_text;
    private String m_title;
    private String m_diffbotUri;
    private String m_pageUrl;
    private String m_humanLanguage;
    private String m_html;
    private String m_type;
    private String m_resolvedPageUrl;
    private String m_siteName;
    
    private List<Tag> m_tags = new ArrayList<Tag>();
    private List<Image> m_images = new ArrayList<Image>();
    
    public String getText()
    {
        return m_text;
    }
    public void setText(String text)
    {
        m_text = text;
    }
    
    public String getTitle()
    {
        return m_title;
    }
    public void setTitle(String title)
    {
        m_title = title;
    }
    
    public String getDiffbotUri()
    {
        return m_diffbotUri;
    }
    public void setDiffbotUri(String diffbotUri)
    {
        m_diffbotUri = diffbotUri;
    }
    
    public String getPageUrl()
    {
        return m_pageUrl;
    }
    public void setPageUrl(String pageUrl)
    {
        m_pageUrl = pageUrl;
    }
    
    public String getHumanLanguage()
    {
        return m_humanLanguage;
    }
    public void setHumanLanguage(String humanLanguage)
    {
        m_humanLanguage = humanLanguage;
    }
    
    public String getHtml()
    {
        return m_html;
    }
    public void setHtml(String html)
    {
        m_html = html;
    }
    
    public String getType()
    {
        return m_type;
    }
    public void setType(String type)
    {
        m_type = type;
    }
    
    public String getResolvedPageUrl()
    {
        return m_resolvedPageUrl;
    }
    public void setResolvedPageUrl(String resolvedPageUrl)
    {
        m_resolvedPageUrl = resolvedPageUrl;
    }
    
    public String getSiteName()
    {
        return m_siteName;
    }
    public void setSiteName(String siteName)
    {
        m_siteName = siteName;
    }
    
    public List<Tag> getTags()
    {
        return m_tags;
    }
    public void setTags(List<Tag> tags)
    {
        m_tags = tags;
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
