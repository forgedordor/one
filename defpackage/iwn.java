package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iwn implements izm, ixp {
    final /* synthetic */ iwy a;
    private final /* synthetic */ iwq b;

    public iwn(iwy iwyVar) {
        this.a = iwyVar;
        this.b = iwyVar.h;
    }

    @Override // defpackage.izm
    public final List a(Object obj, fdat fdatVar) {
        iwy iwyVar = this.a;
        jcr jcrVar = (jcr) iwyVar.g.f(obj);
        if (jcrVar != null && iwyVar.a.G().indexOf(jcrVar) < iwyVar.d) {
            return jcrVar.D();
        }
        hum humVar = iwyVar.l;
        if (humVar.b < iwyVar.e) {
            itw.c("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i = humVar.b;
        int i2 = iwyVar.e;
        if (i == i2) {
            humVar.n(obj);
        } else {
            humVar.d(i2, obj);
        }
        iwyVar.e++;
        cuz cuzVar = iwyVar.j;
        if (cuzVar.g(obj)) {
            jcr jcrVar2 = (jcr) cuzVar.f(obj);
            iwo iwoVar = jcrVar2 != null ? (iwo) iwyVar.f.f(jcrVar2) : null;
            if (iwoVar != null && iwoVar.d) {
                iwyVar.k(jcrVar2, obj, fdatVar);
            }
        } else {
            iwyVar.k.e(obj, iwyVar.a(obj, fdatVar));
            jcr jcrVar3 = iwyVar.a;
            if (jcrVar3.aC() == 3) {
                jcrVar3.ab(true);
            } else {
                jcr.aw(jcrVar3, true, 6);
            }
        }
        jcr jcrVar4 = (jcr) cuzVar.f(obj);
        if (jcrVar4 == null) {
            return fcvo.a;
        }
        List listQ = jcrVar4.v().q();
        int size = listQ.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((jdv) listQ.get(i3)).f.b = true;
        }
        return listQ;
    }

    @Override // defpackage.kio
    public final float ed() {
        return this.b.b;
    }

    @Override // defpackage.kiy
    public final float ee() {
        return this.b.c;
    }

    @Override // defpackage.kiy
    public final float eg(long j) {
        return kix.a(this.b, j);
    }

    @Override // defpackage.kio
    public final float eh(float f) {
        return kin.a(this.b, f);
    }

    @Override // defpackage.ixp
    public final ixn ej(int i, int i2, Map map, fdap fdapVar) {
        return ixo.a(this.b, i, i2, map, fdapVar);
    }

    @Override // defpackage.kio
    public final float el(int i) {
        return kin.b(this.b, i);
    }

    @Override // defpackage.kio
    public final float em(long j) {
        return kin.c(this.b, j);
    }

    @Override // defpackage.kio
    public final float en(float f) {
        return kin.d(this.b, f);
    }

    @Override // defpackage.kio
    public final int eo(long j) {
        return kin.e(this.b, j);
    }

    @Override // defpackage.kio
    public final int ep(float f) {
        return kin.f(this.b, f);
    }

    @Override // defpackage.kio
    public final long eq(long j) {
        return kin.g(this.b, j);
    }

    @Override // defpackage.kio
    public final long er(long j) {
        return kin.h(this.b, j);
    }

    @Override // defpackage.kiy
    public final long es(float f) {
        return kix.b(this.b, f);
    }

    @Override // defpackage.kio
    public final long et(float f) {
        return kin.i(this.b, f);
    }

    @Override // defpackage.ixp
    public final ixn eu(int i, int i2, Map map, fdap fdapVar, fdap fdapVar2) {
        return this.b.eu(i, i2, map, fdapVar, fdapVar2);
    }

    @Override // defpackage.ivu
    public final boolean ev() {
        return this.b.ev();
    }

    @Override // defpackage.ivu
    public final kji q() {
        return this.b.a;
    }
}
