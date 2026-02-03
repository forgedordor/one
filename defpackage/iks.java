package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iks extends icr implements jcd {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public long i;
    public ikp j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o = 3;
    public final fdap p = new ikq(this);

    public iks(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, long j, ikp ikpVar, boolean z, long j2, long j3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = j;
        this.j = ikpVar;
        this.k = z;
        this.l = j2;
        this.m = j3;
        this.n = i;
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        iyl iylVarE = ixkVar.e(j);
        return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new ikr(iylVarE, this));
    }

    @Override // defpackage.icr
    public final boolean dN() {
        return false;
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int e(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.a(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int f(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.b(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int g(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.c(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int h(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.d(this, ivuVar, ivtVar, i);
    }

    public final String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha = " + this.c + ", translationX=" + this.d + ", translationY=" + this.e + ", shadowElevation=" + this.f + ", rotationX=0.0, rotationY=0.0, rotationZ=" + this.g + ", cameraDistance=" + this.h + ", transformOrigin=" + ((Object) ikz.c(this.i)) + ", shape=" + this.j + ", clip=" + this.k + ", renderEffect=null, ambientShadowColor=" + ((Object) ije.g(this.l)) + ", spotShadowColor=" + ((Object) ije.g(this.m)) + ", compositingStrategy=" + ((Object) ijk.a(this.n)) + ", blendMode=" + ((Object) iis.a(this.o)) + ", colorFilter=null)";
    }
}
