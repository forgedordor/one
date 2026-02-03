package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rnq implements rez {
    private final rii a = new rij();

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ rhy a(Object obj, int i, int i2, rex rexVar) {
        return c(oc$$ExternalSyntheticApiModelOutline0.m608m(obj), i, i2, rexVar);
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ boolean b(Object obj, rex rexVar) {
        oc$$ExternalSyntheticApiModelOutline0.m608m(obj);
        return true;
    }

    public final rhy c(ImageDecoder.Source source, int i, int i2, rex rexVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new rnk(i, i2, rexVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new rnr(bitmapDecodeBitmap, this.a);
    }
}
