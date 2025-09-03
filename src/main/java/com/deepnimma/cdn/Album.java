/* (C)2025 */
package com.deepnimma.cdn;

import com.deepnimma.tcg.SeriesIdentifier;

public class Album {
    private SeriesIdentifier identifier;
    private String[] imageLinks;

    public Album() {
        this.imageLinks = new String[0];
    } // Album

    public Album(SeriesIdentifier identifier) {
        this();
        this.identifier = identifier;
    } // Album
} // Album
