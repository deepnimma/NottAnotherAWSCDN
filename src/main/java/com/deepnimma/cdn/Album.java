/* (C)2025 */
package com.deepnimma.cdn;

import com.deepnimma.tcg.SeriesIdentifier;
import lombok.Getter;
import lombok.Setter;

public class Album {
    @Getter
    @Setter
    private SeriesIdentifier identifier;

    @Getter
    private String[] imageLinks;

    public Album() {
        this.imageLinks = new String[0];
    } // Album

    public Album(SeriesIdentifier identifier) {
        this();
        this.identifier = identifier;
    } // Album
} // Album
