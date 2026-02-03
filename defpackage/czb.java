package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czb extends fdbr implements fdat {
    final /* synthetic */ dhk a;
    final /* synthetic */ dew b;
    final /* synthetic */ Object c;
    final /* synthetic */ fdau d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czb(dhk dhkVar, dew dewVar, Object obj, fdau fdauVar) {
        super(2);
        this.a = dhkVar;
        this.b = dewVar;
        this.c = obj;
        this.d = fdauVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [dew, java.lang.Object] */
    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Object objE;
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            dhk dhkVar = this.a;
            cyy cyyVar = new cyy(this.b);
            Object obj3 = this.c;
            dib dibVar = diu.a;
            if (dhkVar.t()) {
                hmlVar.v(1666852333);
                hmlVar.o();
                objE = dhkVar.e();
            } else {
                hmlVar.v(1666598288);
                boolean zD = hmlVar.D(dhkVar);
                objE = hmlVar.f();
                if (zD || objE == hmk.a) {
                    hzg hzgVarA = hzf.a();
                    fdap fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
                    hzg hzgVarB = hzf.b(hzgVarA);
                    try {
                        Object objE2 = dhkVar.e();
                        hzf.e(hzgVarA, hzgVarB, fdapVarK);
                        hmlVar.y(objE2);
                        objE = objE2;
                    } catch (Throwable th) {
                        hzf.e(hzgVarA, hzgVarB, fdapVarK);
                        throw th;
                    }
                }
                hmlVar.o();
            }
            hmlVar.v(1378811975);
            float f = true != fdbq.f(objE, obj3) ? 0.0f : 1.0f;
            hmlVar.o();
            Float fValueOf = Float.valueOf(f);
            boolean zD2 = hmlVar.D(dhkVar);
            Object objF = hmlVar.f();
            if (zD2 || objF == hmk.a) {
                cyz cyzVar = new cyz(dhkVar);
                hxn hxnVar = hrp.a;
                objF = new hnt(cyzVar, null);
                hmlVar.y(objF);
            }
            Object objA = ((hsf) objF).a();
            hmlVar.v(1378811975);
            float f2 = true == fdbq.f(objA, obj3) ? 1.0f : 0.0f;
            hmlVar.o();
            Float fValueOf2 = Float.valueOf(f2);
            boolean zD3 = hmlVar.D(dhkVar);
            Object objF2 = hmlVar.f();
            if (zD3 || objF2 == hmk.a) {
                cza czaVar = new cza(dhkVar);
                hxn hxnVar2 = hrp.a;
                objF2 = new hnt(czaVar, null);
                hmlVar.y(objF2);
            }
            hsf hsfVarF = dhy.f(dhkVar, fValueOf, fValueOf2, cyyVar.a(((hsf) objF2).a(), hmlVar, 0), dibVar, hmlVar, 0);
            ico icoVar = ics.e;
            boolean zD4 = hmlVar.D(hsfVarF);
            Object objF3 = hmlVar.f();
            if (zD4 || objF3 == hmk.a) {
                objF3 = new cyx(hsfVarF);
                hmlVar.y(objF3);
            }
            ics icsVarA = ijn.a(icoVar, (fdap) objF3);
            fdau fdauVar = this.d;
            Object obj4 = this.c;
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarA);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            int i2 = (int) j;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i2))) {
                Integer numValueOf = Integer.valueOf(i2);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            fdauVar.a(obj4, hmlVar, 0);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
