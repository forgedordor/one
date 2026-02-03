package com.bumptech.glide.load;

import defpackage.rig;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ImageHeaderParser {

    /* compiled from: PG */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);

        private final boolean a;

        ImageType(boolean z) {
            this.a = z;
        }

        public boolean hasAlpha() {
            return this.a;
        }

        public boolean isWebp() {
            int iOrdinal = ordinal();
            return iOrdinal == 5 || iOrdinal == 6 || iOrdinal == 7;
        }
    }

    int a(InputStream inputStream, rig rigVar);

    int b(ByteBuffer byteBuffer, rig rigVar);

    ImageType c(InputStream inputStream);

    ImageType d(ByteBuffer byteBuffer);

    boolean e(InputStream inputStream, rig rigVar);

    boolean f(ByteBuffer byteBuffer, rig rigVar);
}
