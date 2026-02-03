package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bxgh extends bxgz {
    public final int d;

    public bxgh(String str, int i, cogw cogwVar) {
        super(str, cogwVar);
        this.d = i;
    }

    public int c() {
        return this.d;
    }

    public abstract Bitmap d();

    public abstract Bitmap e();

    public abstract Drawable f(Resources resources);

    public abstract boolean i();

    public abstract byte[] j();
}
