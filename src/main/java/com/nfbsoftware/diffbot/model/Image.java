package com.nfbsoftware.diffbot.model;

import java.math.BigInteger;

import com.nfbsoftware.util.NfbUUID;
import com.nfbsoftware.util.StringUtil;

/**
 * 
 * @author brendanclemenzi
 *
 */
public class Image
{
    private String m_id;
    private String m_title;
    private BigInteger m_height;
    private BigInteger m_naturalHeight;
    private String m_diffbotUri;
    private Boolean m_primary;
    private BigInteger m_width;
    private BigInteger m_naturalWidth;
    private String m_url;
    private String m_type;
    private String m_resolvedPageUrl;
    private String m_xpath;
    
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
    
    public String getTitle()
    {
        return m_title;
    }
    public void setTitle(String title)
    {
        m_title = title;
    }
    
    public BigInteger getHeight()
    {
        return m_height;
    }
    public void setHeight(BigInteger height)
    {
        m_height = height;
    }
    
    public BigInteger getNaturalHeight()
    {
        return m_naturalHeight;
    }
    public void setNaturalHeight(BigInteger naturalHeight)
    {
        m_naturalHeight = naturalHeight;
    }
    
    public String getDiffbotUri()
    {
        return m_diffbotUri;
    }
    public void setDiffbotUri(String diffbotUri)
    {
        m_diffbotUri = diffbotUri;
    }
    
    public Boolean getPrimary()
    {
        return m_primary;
    }
    public void setPrimary(Boolean primary)
    {
        m_primary = primary;
    }
    
    public BigInteger getWidth()
    {
        return m_width;
    }
    public void setWidth(BigInteger width)
    {
        m_width = width;
    }
    
    public BigInteger getNaturalWidth()
    {
        return m_naturalWidth;
    }
    public void setNaturalWidth(BigInteger naturalWidth)
    {
        m_naturalWidth = naturalWidth;
    }
    
    public String getUrl()
    {
        return m_url;
    }
    public void setUrl(String url)
    {
        m_url = url;
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
    
    public String getXpath()
    {
        return m_xpath;
    }
    public void setXpath(String xpath)
    {
        m_xpath = xpath;
    }
}
