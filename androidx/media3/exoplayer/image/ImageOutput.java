package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import defpackage.nbk;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ImageOutput {
    public static final ImageOutput a = new nbk();

    void a();

    void onImageAvailable(long j, Bitmap bitmap);
}
