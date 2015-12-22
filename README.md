simple-diffbot
==============

A simplified Java library for the [Diffbot](http://www.diffbot.com/) API

Features
--------

  * Supports Article API v3
  * Supports Image API v3
  * Supports Video API v3
  * Support for setting the response timeout in the client constructor
  * Published on Maven Central Repository
  
Getting started
---------------
Including the Java library in your project

The easiest way to incorporate the library into your Java project is to use Maven. Simply add a new dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>com.nfbsoftware</groupId>
	<artifactId>simple-diffbot</artifactId>
	<version>1.0.14</version>
</dependency>
```

Usage
-----
Client Options

```java	
String diffbotToken = "25...89e9";  //set your api token here
DiffbotClient client = new DiffbotClient(diffbotToken);
```

```java	
String diffbotToken = "25...89e9";  //set your api token here
String timoutMS = "30000"; // Set the request time out in MS
DiffbotClient client = new DiffbotClient(diffbotToken, timoutMS);
```

Article API

```java	
String diffbotToken = "25...89e9";  //set your api token here
DiffbotClient client = new DiffbotClient(diffbotToken);

// Pass the desired website url to the Diffbot client
Article articleValue = client.getArticle("http://www.mnh.si.edu/exhibits/losing_paradise");
        
// Now lets print out all the available article attributes 
System.out.println("Article ID: " + articleValue.getId());
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
	System.out.println("Article Image[" + imageCount + "] ID: " + imageValue.getId());
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
	System.out.println("Article Tag[" + tagCount + "] ID: " + tagValue.getId());
	System.out.println("Article Tag[" + tagCount + "] Label: " + tagValue.getLabel());
	System.out.println("Article Tag[" + tagCount + "] Uri: " + tagValue.getUri());
	System.out.println("Article Tag[" + tagCount + "] Count: " + tagValue.getCount());
	System.out.println("Article Tag[" + tagCount + "] Prevalence: " + tagValue.getPrevalence());
	System.out.println("Article Tag[" + tagCount + "] Score: " + tagValue.getScore());
            
	tagCount++;
}
```

Image API

```java	
String diffbotToken = "25...89e9";  //set your api token here
DiffbotClient client = new DiffbotClient(diffbotToken);

// Pass the desired website url to the Diffbot client
List<Image> imageList = client.getImages("http://www.mnh.si.edu/exhibits/losing_paradise");

// Now lets print out all the available image attributes 
int imageCount = 0;
for(Image imageValue : imageList)
{
	System.out.println("Image[" + imageCount + "] ID: " + imageValue.getId());
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
```

Video API

```java	
String diffbotToken = "25...89e9";  //set your api token here
DiffbotClient client = new DiffbotClient(diffbotToken);

// Pass the desired website url to the Diffbot client
Video videoValue = client.getVideo("https://www.youtube.com/watch?v=MftOONlDQac");
        
// Now lets print out all the available article attributes 
System.out.println("Video ID: " + videoValue.getId());
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
	System.out.println("Video Image[" + imageCount + "] ID: " + imageValue.getId());
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
```