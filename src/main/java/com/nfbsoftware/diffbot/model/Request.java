package com.nfbsoftware.diffbot.model;

import java.math.BigInteger;

/**
 * 
 * @author brendanclemenzi
 */
public class Request
{
    private String m_pageUrl;
    private String m_api;
    private BigInteger m_version;
    
    public String getPageUrl()
    {
        return m_pageUrl;
    }
    public void setPageUrl(String pageUrl)
    {
        m_pageUrl = pageUrl;
    }
    
    public String getApi()
    {
        return m_api;
    }
    public void setApi(String api)
    {
        m_api = api;
    }
    
    public BigInteger getVersion()
    {
        return m_version;
    }
    public void setVersion(BigInteger version)
    {
        m_version = version;
    }
}
