package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euxi implements euxm {
    public final Bitmap a;
    private final euxo b;

    public euxi(Bitmap bitmap) {
        this.a = bitmap;
        euxd euxdVar = new euxd();
        int i = euxh.a[bitmap.getConfig().ordinal()];
        euxdVar.b(i != 1 ? i != 2 ? 0 : 1 : 8);
        euxdVar.c(1);
        this.b = euxdVar.a();
    }

    @Override // defpackage.euxm
    public final euxo a() {
        return this.b;
    }

    @Override // defpackage.euxm
    public final void b() {
        this.a.recycle();
    }
}
