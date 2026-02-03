package com.google.android.ims.rcsservice.chatsession.message;

import defpackage.ekfw;
import defpackage.ekgb;
import defpackage.esyx;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class GeneralPurposeRichCardMediaInfo {
    private static final String APPLICATION_PDF = "application/pdf";
    private static final String IMAGE_GIF = "image/gif";
    public static final String IMAGE_HEIGHT_MEDIUM = "MEDIUM_HEIGHT";
    public static final String IMAGE_HEIGHT_SHORT = "SHORT_HEIGHT";
    public static final String IMAGE_HEIGHT_TALL = "TALL_HEIGHT";
    private static final String IMAGE_JPEG = "image/jpeg";
    private static final String IMAGE_JPG = "image/jpg";
    private static final String IMAGE_PNG = "image/png";
    static final ekgb<String> SUPPORTED_MEDIA_IMAGE_TYPES;
    private static final ekgb<String> SUPPORTED_MEDIA_VIDEO_TYPES;
    public static final ekgb<String> SUPPORTED_RICH_CARD_FILE_TYPES;
    public static final ekgb<String> SUPPORTED_RICH_CARD_MEDIA_TYPES;
    private static final String VIDEO_H263 = "video/h263";
    private static final String VIDEO_M4V = "video/m4v";
    private static final String VIDEO_MP4 = "video/mp4";
    private static final String VIDEO_MPEG = "video/mpeg";
    private static final String VIDEO_MPEG4 = "video/mpeg4";
    private static final String VIDEO_WEBM = "video/webm";

    @esyx
    public String height;

    @esyx
    public String mediaContentType;

    @esyx
    public Long mediaFileSize;

    @esyx
    public String mediaUrl;

    @esyx
    public String thumbnailContentType;

    @esyx
    public Long thumbnailFileSize;

    @esyx
    public String thumbnailUrl;

    static {
        ekgb<String> ekgbVarU = ekgb.u(IMAGE_JPEG, IMAGE_JPG, IMAGE_GIF, IMAGE_PNG);
        SUPPORTED_MEDIA_IMAGE_TYPES = ekgbVarU;
        ekgb<String> ekgbVarW = ekgb.w(VIDEO_H263, VIDEO_M4V, VIDEO_MP4, VIDEO_MPEG, VIDEO_MPEG4, VIDEO_WEBM);
        SUPPORTED_MEDIA_VIDEO_TYPES = ekgbVarW;
        SUPPORTED_RICH_CARD_FILE_TYPES = ekgb.r(APPLICATION_PDF);
        ekfw ekfwVar = new ekfw();
        ekfwVar.j(ekgbVarU);
        ekfwVar.j(ekgbVarW);
        SUPPORTED_RICH_CARD_MEDIA_TYPES = ekfwVar.g();
    }
}
