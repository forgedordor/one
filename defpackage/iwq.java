package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iwq implements izm {
    public kji a = kji.b;
    public float b;
    public float c;
    final /* synthetic */ iwy d;

    public iwq(iwy iwyVar) {
        this.d = iwyVar;
    }

    @Override // defpackage.izm
    public final List a(Object obj, fdat fdatVar) {
        iwy iwyVar = this.d;
        iwyVar.h();
        jcr jcrVar = iwyVar.a;
        int iAC = jcrVar.aC();
        if (iAC != 1 && iAC != 3 && iAC != 2 && iAC != 4) {
            itw.d("subcompose can only be used inside the measure or layout blocks");
        }
        cuz cuzVar = iwyVar.g;
        Object objF = cuzVar.f(obj);
        if (objF == null) {
            objF = (jcr) iwyVar.j.b(obj);
            if (objF != null) {
                if (iwyVar.n <= 0) {
                    itw.d("Check failed.");
                }
                iwyVar.n--;
            } else {
                objF = iwyVar.e(obj);
                if (objF == null) {
                    objF = iwyVar.d(iwyVar.d);
                }
            }
            cuzVar.e(obj, objF);
        }
        jcr jcrVar2 = (jcr) objF;
        if (fcva.Q(jcrVar.G(), iwyVar.d) != jcrVar2) {
            int iIndexOf = jcrVar.G().indexOf(jcrVar2);
            if (iIndexOf < iwyVar.d) {
                itw.c(a.h(obj, "Key \"", "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."));
            }
            int i = iwyVar.d;
            if (i != iIndexOf) {
                iwyVar.j(iIndexOf, i);
            }
        }
        iwyVar.d++;
        iwyVar.k(jcrVar2, obj, fdatVar);
        return (iAC == 1 || iAC == 3) ? jcrVar2.D() : jcrVar2.C();
    }

    @Override // defpackage.kio
    public final float ed() {
        return this.b;
    }

    @Override // defpackage.kiy
    public final float ee() {
        return this.c;
    }

    @Override // defpackage.kiy
    public final /* synthetic */ float eg(long j) {
        return kix.a(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float eh(float f) {
        return kin.a(this, f);
    }

    @Override // defpackage.ixp
    public final /* synthetic */ ixn ej(int i, int i2, Map map, fdap fdapVar) {
        return ixo.a(this, i, i2, map, fdapVar);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float el(int i) {
        return kin.b(this, i);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float em(long j) {
        return kin.c(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float en(float f) {
        return kin.d(this, f);
    }

    @Override // defpackage.kio
    public final /* synthetic */ int eo(long j) {
        return kin.e(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ int ep(float f) {
        return kin.f(this, f);
    }

    @Override // defpackage.kio
    public final /* synthetic */ long eq(long j) {
        return kin.g(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ long er(long j) {
        return kin.h(this, j);
    }

    @Override // defpackage.kiy
    public final /* synthetic */ long es(float f) {
        return kix.b(this, f);
    }

    @Override // defpackage.kio
    public final /* synthetic */ long et(float f) {
        return kin.i(this, f);
    }

    @Override // defpackage.ixp
    public final ixn eu(int i, int i2, Map map, fdap fdapVar, fdap fdapVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            itw.d(a.z(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new iwp(i, i2, map, fdapVar, this, this.d, fdapVar2);
    }

    @Override // defpackage.ivu
    public final boolean ev() {
        jcr jcrVar = this.d.a;
        return jcrVar.aC() == 4 || jcrVar.aC() == 2;
    }

    @Override // defpackage.ivu
    public final kji q() {
        return this.a;
    }
}
