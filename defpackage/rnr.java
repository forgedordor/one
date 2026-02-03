package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rnr implements rhy, rht {
    private final Bitmap a;
    private final rii b;

    public rnr(Bitmap bitmap, rii riiVar) {
        rvi.e(bitmap, "Bitmap must not be null");
        this.a = bitmap;
        rvi.e(riiVar, "BitmapPool must not be null");
        this.b = riiVar;
    }

    public static rnr f(Bitmap bitmap, rii riiVar) {
        if (bitmap == null) {
            return null;
        }
        return new rnr(bitmap, riiVar);
    }

    @Override // defpackage.rhy
    public final int a() {
        return rvk.a(this.a);
    }

    @Override // defpackage.rhy
    public final Class b() {
        return Bitmap.class;
    }

    @Override // defpackage.rhy
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // defpackage.rht
    public final void d() {
        this.a.prepareToDraw();
    }

    @Override // defpackage.rhy
    public final void e() {
        this.b.d(this.a);
    }
}
