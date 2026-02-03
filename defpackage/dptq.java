package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dptq {
    public Bitmap a;
    public long b = 0;
    public final fctc c = fctd.a(new fdae() { // from class: dptp
        @Override // defpackage.fdae
        public final Object invoke() {
            dptq dptqVar = this.a;
            if (dptqVar.a != null) {
                return new iif(dptqVar.a());
            }
            throw new IllegalArgumentException("PausedFrameBitmap#prepareForSize must be called before imageBitmap can be used");
        }
    });

    public final Bitmap a() {
        Bitmap bitmap = this.a;
        if (bitmap != null) {
            return bitmap;
        }
        fdbq.c("bitmap");
        return null;
    }

    public final void b(Bitmap bitmap) {
        bitmap.getClass();
        this.a = bitmap;
    }
}
