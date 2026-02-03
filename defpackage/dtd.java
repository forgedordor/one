package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtd implements dyb {
    public final fdap a;
    public final dwy b = new dtc(this);
    public final dok c = new dok();
    public final hox d;
    public final hox e;
    public final hox f;

    public dtd(fdap fdapVar) {
        this.a = fdapVar;
        hsi hsiVar = hsi.a;
        this.d = new hpl(false, hsiVar);
        this.e = new hpl(false, hsiVar);
        this.f = new hpl(false, hsiVar);
    }

    @Override // defpackage.dyb
    public final float a(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }

    @Override // defpackage.dyb
    public final Object e(dod dodVar, fdat fdatVar, fcxy fcxyVar) {
        Object objA = fdjy.a(new dtb(this, dodVar, fdatVar, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.dyb
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // defpackage.dyb
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // defpackage.dyb
    public final boolean i() {
        return ((Boolean) this.d.a()).booleanValue();
    }
}
