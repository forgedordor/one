package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rqf {
    public final List a;
    public final rig b;

    public rqf(List list, rig rigVar) {
        this.a = list;
        this.b = rigVar;
    }

    static final rhy a(ImageDecoder.Source source, int i, int i2, rex rexVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new rnk(i, i2, rexVar));
        if (oc$$ExternalSyntheticApiModelOutline0.m$2(drawableDecodeDrawable)) {
            return new rqc(oc$$ExternalSyntheticApiModelOutline0.m609m((Object) drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: ".concat(String.valueOf(String.valueOf(drawableDecodeDrawable))));
    }

    public static final boolean b(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }
}
