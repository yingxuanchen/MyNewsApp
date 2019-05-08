package com.example.mynewsapp;

/**
 * An {@link News} object contains information related to a single news.
 */
public class News {

    /**
     * Section that the news is in
     */
    private String mSection;

    /**
     * Title of the news
     */
    private String mTitle;

    /**
     * Time the news was published
     */
    private long mTimeInMilliseconds;

    /**
     * Author of the news article
     */
    private String mAuthor;

    /**
     * Website URL of the news
     */
    private String mUrl;

    /**
     * Constructs a new {@link News} object.
     *
     * @param section            is the section the news is in
     * @param title              is the title of the news
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the news was published
     * @param author             is the author of the news article
     * @param url                is the website URL to find more details about the news
     */
    public News(String section, String title, long timeInMilliseconds, String author, String url) {
        mSection = section;
        mTitle = title;
        mTimeInMilliseconds = timeInMilliseconds;
        mAuthor = author;
        mUrl = url;
    }

    /**
     * Returns the section the news is in.
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Returns the news title.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the time the news was published.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the author of the news.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Returns the website URL to find more information about the news.
     */
    public String getUrl() {
        return mUrl;
    }
}
