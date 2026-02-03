package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rpn implements rhy {
    private final Bitmap a;

    public rpn(Bitmap bitmap) {
        this.a = bitmap;
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

    @Override // defpackage.rhy
    public final void e() {
    }
}
