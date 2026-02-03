package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bag implements bkt, bnh {
    public final bli a;

    public bag() {
        this(bli.a());
    }

    static bag a(bjq bjqVar) {
        return new bag(bli.b(bjqVar));
    }

    @Override // defpackage.bnh
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bko c() {
        return new bko(blo.f(this.a));
    }

    @Override // defpackage.bkt
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void e(bvc bvcVar) {
        this.a.c(bku.N, bvcVar);
    }

    @Override // defpackage.azw
    public final bli f() {
        return this.a;
    }

    @Override // defpackage.bkt
    @Deprecated
    public final /* bridge */ /* synthetic */ void g(Size size) {
        this.a.c(bku.J, size);
    }

    @Override // defpackage.bkt
    public final /* bridge */ /* synthetic */ void h(int i) {
        this.a.c(bku.G, Integer.valueOf(i));
    }

    private bag(bli bliVar) {
        this.a = bliVar;
        Class cls = (Class) bliVar.n(brm.n, null);
        if (cls != null && !cls.equals(baj.class)) {
            throw new IllegalArgumentException(a.i(cls, this, "Invalid target class configuration for ", ": "));
        }
        bliVar.c(bni.y, bnk.IMAGE_ANALYSIS);
        bliVar.c(bni.n, baj.class);
        bjo bjoVar = bni.m;
        if (bliVar.n(bjoVar, null) == null) {
            bliVar.c(bjoVar, a.w(baj.class));
        }
    }
}
