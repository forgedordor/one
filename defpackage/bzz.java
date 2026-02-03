package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzz implements bnh, bkt {
    public final bli a;

    private bzz(bli bliVar) {
        this.a = bliVar;
        if (!bliVar.t(cay.a)) {
            throw new IllegalArgumentException("VideoOutput is required");
        }
        bjo bjoVar = brm.n;
        Class cls = (Class) bliVar.n(bjoVar, null);
        if (cls != null && !cls.equals(cad.class)) {
            throw new IllegalArgumentException(a.i(cls, this, "Invalid target class configuration for ", ": "));
        }
        bliVar.c(bni.y, bnk.VIDEO_CAPTURE);
        bliVar.c(bjoVar, cad.class);
        bjo bjoVar2 = brm.m;
        if (bliVar.n(bjoVar2, null) == null) {
            bliVar.c(bjoVar2, a.w(cad.class));
        }
    }

    static bzz a(bjq bjqVar) {
        return new bzz(bli.b(bjqVar));
    }

    @Override // defpackage.bnh
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final cay c() {
        return new cay(blo.f(this.a));
    }

    public final void d(azv azvVar) {
        this.a.c(bkr.o, azvVar);
    }

    @Override // defpackage.bkt
    public final /* bridge */ /* synthetic */ void e(bvc bvcVar) {
        this.a.c(bku.N, bvcVar);
    }

    @Override // defpackage.azw
    public final bli f() {
        return this.a;
    }

    @Override // defpackage.bkt
    public final /* bridge */ /* synthetic */ void g(Size size) {
        throw new UnsupportedOperationException("setTargetResolution is not supported.");
    }

    @Override // defpackage.bkt
    public final /* bridge */ /* synthetic */ void h(int i) {
        this.a.c(bku.G, Integer.valueOf(i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public bzz(cap capVar) {
        bli bliVarA = bli.a();
        bliVarA.c(cay.a, capVar);
        this(bliVarA);
    }
}
