package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bvl implements bnh {
    public final bli a;

    bvl() {
        this(bli.a());
    }

    @Override // defpackage.bnh
    public final /* bridge */ /* synthetic */ bni c() {
        return new bvm(blo.f(this.a));
    }

    @Override // defpackage.azw
    public final bli f() {
        return this.a;
    }

    public bvl(bli bliVar) {
        this.a = bliVar;
        bjo bjoVar = brm.n;
        Class cls = (Class) bliVar.n(bjoVar, null);
        if (cls != null && !cls.equals(bvk.class)) {
            throw new IllegalArgumentException(a.i(cls, this, "Invalid target class configuration for ", ": "));
        }
        bliVar.c(bni.y, bnk.STREAM_SHARING);
        bliVar.c(bjoVar, bvk.class);
        bjo bjoVar2 = brm.m;
        if (bliVar.n(bjoVar2, null) == null) {
            bliVar.c(bjoVar2, a.w(bvk.class));
        }
    }
}
