package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rij implements rii {
    @Override // defpackage.rii
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.rii
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.rii
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.rii
    public final void c() {
    }

    @Override // defpackage.rii
    public final void e(float f) {
    }

    @Override // defpackage.rii
    public final void f(int i) {
    }
}
