package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iuk implements iui, ixp, ixd {
    public final jcg a;
    public iuh b;
    public boolean c;

    public iuk(jcg jcgVar, iuh iuhVar) {
        this.a = jcgVar;
        this.b = iuhVar;
    }

    @Override // defpackage.ixd
    public final ivy dX(ivy ivyVar) {
        ixa ixaVar;
        if (!(ivyVar instanceof ixa)) {
            if (!(ivyVar instanceof jer)) {
                itw.a("Unsupported LayoutCoordinates");
                throw new fcta();
            }
            jdf jdfVarC = ((jer) ivyVar).C();
            if (jdfVarC != null && (ixaVar = jdfVarC.p) != null) {
                return ixaVar;
            }
        }
        return ivyVar;
    }

    @Override // defpackage.ixd
    public final /* synthetic */ long dY(ivy ivyVar, ivy ivyVar2) {
        return ixc.a(this, ivyVar, ivyVar2);
    }

    @Override // defpackage.kio
    public final float ed() {
        return this.a.ed();
    }

    @Override // defpackage.kiy
    public final float ee() {
        return this.a.ee();
    }

    @Override // defpackage.kiy
    public final float eg(long j) {
        return kix.a(this.a, j);
    }

    @Override // defpackage.kio
    public final float eh(float f) {
        return kin.a(this.a, f);
    }

    @Override // defpackage.ixp
    public final ixn ej(int i, int i2, Map map, fdap fdapVar) {
        return ixo.a(this.a, i, i2, map, fdapVar);
    }

    @Override // defpackage.kio
    public final float el(int i) {
        return kin.b(this.a, i);
    }

    @Override // defpackage.kio
    public final float em(long j) {
        return kin.c(this.a, j);
    }

    @Override // defpackage.kio
    public final float en(float f) {
        return kin.d(this.a, f);
    }

    @Override // defpackage.kio
    public final int eo(long j) {
        return kin.e(this.a, j);
    }

    @Override // defpackage.kio
    public final int ep(float f) {
        return kin.f(this.a, f);
    }

    @Override // defpackage.kio
    public final long eq(long j) {
        return kin.g(this.a, j);
    }

    @Override // defpackage.kio
    public final long er(long j) {
        return kin.h(this.a, j);
    }

    @Override // defpackage.kiy
    public final long es(float f) {
        return kix.b(this.a, f);
    }

    @Override // defpackage.kio
    public final long et(float f) {
        return kin.i(this.a, f);
    }

    @Override // defpackage.ixp
    public final ixn eu(int i, int i2, Map map, fdap fdapVar, fdap fdapVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            itw.d(a.z(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new iuj(i, i2, map, fdapVar, fdapVar2, this);
    }

    @Override // defpackage.ivu
    public final boolean ev() {
        return false;
    }

    @Override // defpackage.ivu
    public final kji q() {
        return this.a.q();
    }
}
