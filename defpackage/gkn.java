package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkn extends jbi implements jbd {
    public boolean a;
    public boolean b;
    public float c = 2.0f;
    public float d = 1.0f;
    public boolean e;
    public fdlr f;
    public gxi g;
    public ddp h;
    public ikp i;
    public final ddp j;
    public final ies k;
    public ebk l;

    public gkn(boolean z, boolean z2, ebk ebkVar, gxi gxiVar, ikp ikpVar) {
        this.a = z;
        this.b = z2;
        this.l = ebkVar;
        this.g = gxiVar;
        this.i = ikpVar;
        this.j = new ddp(new kir((this.e && z) ? 2.0f : 1.0f), diu.c, null, 12);
        ies iesVarD = ifb.d(new fdap() { // from class: gkg
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iew iewVar = (iew) obj;
                final gkn gknVar = this.a;
                float fD = kin.d(iewVar, ((kir) gknVar.j.d()).a);
                iik iikVar = new iik((byte[]) null);
                ikp ikpVarD = gknVar.i;
                if (ikpVarD == null) {
                    ikpVarD = gsc.d((gsa) jbe.a(gknVar, gsc.a), 6);
                }
                ika.a(iikVar, ikpVarD.a(iewVar.a(), iewVar.q(), iewVar));
                iik iikVar2 = new iik((byte[]) null);
                iikVar2.s(new ihu(0.0f, Float.intBitsToFloat((int) (iewVar.a() & 4294967295L)) - fD, Float.intBitsToFloat((int) (iewVar.a() >> 32)), Float.intBitsToFloat((int) (4294967295L & iewVar.a()))));
                final iik iikVar3 = new iik((byte[]) null);
                iikVar3.q(iikVar2, iikVar, 1);
                return iewVar.p(new fdap() { // from class: gkh
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        imw imwVar = (imw) obj2;
                        imwVar.p();
                        ddp ddpVar = gknVar.h;
                        ddpVar.getClass();
                        imy.m(imwVar, iikVar3, new ikt(((ije) ddpVar.d()).i), 0.0f, null, 60);
                        return fctx.a;
                    }
                });
            }
        });
        N(iesVarD);
        this.k = iesVarD;
    }

    public final gxi a() {
        gxi gxiVar = this.g;
        return gxiVar == null ? gxo.a((gda) jbe.a(this, gdd.a), (fnp) jbe.a(this, fnr.a)) : gxiVar;
    }

    @Override // defpackage.icr
    public final boolean dN() {
        return false;
    }

    @Override // defpackage.icr
    public final void dU() {
        this.f = fdil.d(E(), null, null, new gkk(this, null), 3);
        if (this.h == null) {
            long jC = a().c(this.a, this.b, this.e);
            this.h = new ddp(new ije(jC), (dib) cys.a.invoke(ije.f(jC)), null, 12);
        }
    }

    public final Object e(fcxy fcxyVar) throws Throwable {
        this.e = false;
        Object objG = fdum.g((fdum) this.l.a, new gkl(new ArrayList(), this), fcxyVar);
        return objG == fcyl.a ? objG : fctx.a;
    }

    public final void f() {
        fdil.d(E(), null, null, new gki(this, null), 3);
        fdil.d(E(), null, null, new gkj(this, null), 3);
    }
}
