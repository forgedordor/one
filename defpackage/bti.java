package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bti {
    public static bti i(Bitmap bitmap, bob bobVar, Rect rect, int i, Matrix matrix, bib bibVar) {
        return new bsg(bitmap, bobVar, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i, matrix, bibVar);
    }

    public static bti j(bbm bbmVar, bob bobVar, Size size, Rect rect, int i, Matrix matrix, bib bibVar) {
        if (bsc.d(bbmVar.a())) {
            lcg.j(bobVar, "JPEG image must have Exif.");
        }
        return new bsg(bbmVar, bobVar, bbmVar.a(), size, rect, i, matrix, bibVar);
    }

    public abstract int a();

    public abstract int b();

    public abstract Matrix c();

    public abstract Rect d();

    public abstract Size e();

    public abstract bib f();

    public abstract bob g();

    public abstract Object h();
}
