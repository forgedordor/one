package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rns implements rfb {
    @Override // defpackage.rfb
    public final rhy b(Context context, rhy rhyVar, int i, int i2) {
        if (!rvk.p(i, i2)) {
            throw new IllegalArgumentException(a.z(i2, i, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        rii riiVar = raw.b(context).a;
        Bitmap bitmap = (Bitmap) rhyVar.c();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(riiVar, bitmap, i, i2);
        return bitmap.equals(bitmapC) ? rhyVar : rnr.f(bitmapC, riiVar);
    }

    protected abstract Bitmap c(rii riiVar, Bitmap bitmap, int i, int i2);
}
