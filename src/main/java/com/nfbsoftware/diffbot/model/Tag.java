package com.nfbsoftware.diffbot.model;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 
 * @author brendanclemenzi
 */
public class Tag
{
    private BigInteger m_id;
    private BigInteger m_count;
    private BigDecimal m_prevalence;
    private BigDecimal m_score;
    private String m_label;
    private String m_uri;
    
    public BigInteger getId()
    {
        return m_id;
    }
    public void setId(BigInteger id)
    {
        m_id = id;
    }
    
    public BigInteger getCount()
    {
        return m_count;
    }
    public void setCount(BigInteger count)
    {
        m_count = count;
    }
    
    public BigDecimal getPrevalence()
    {
        return m_prevalence;
    }
    public void setPrevalence(BigDecimal prevalence)
    {
        m_prevalence = prevalence;
    }
    
    public BigDecimal getScore()
    {
        return m_score;
    }
    public void setScore(BigDecimal score)
    {
        m_score = score;
    }
    
    public String getLabel()
    {
        return m_label;
    }
    public void setLabel(String label)
    {
        m_label = label;
    }
    
    public String getUri()
    {
        return m_uri;
    }
    public void setUri(String uri)
    {
        m_uri = uri;
    }
}
