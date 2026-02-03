package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epe {
    public static final void a(final Object obj, final int i, final epf epfVar, final fdat fdatVar, hml hmlVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(872548579);
        if (i4 == 0) {
            i3 = (true != hmlVarC.F(obj) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.F(epfVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 1024 : 2048;
        }
        if (hmlVarC.J((i3 & 1171) != 1170, i3 & 1)) {
            boolean zD = hmlVarC.D(obj) | hmlVarC.D(epfVar);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new epa(obj, epfVar);
                hmwVar.af(objS);
            }
            final epa epaVar = (epa) objS;
            epaVar.b = i;
            epa epaVar2 = (epa) hmlVarC.e(iyj.a);
            hzg hzgVarA = hzf.a();
            fdap fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
            hzg hzgVarB = hzf.b(hzgVarA);
            try {
                if (epaVar2 != epaVar.b()) {
                    epaVar.e.b(epaVar2);
                    if (epaVar.c > 0) {
                        epa epaVar3 = epaVar.f;
                        if (epaVar3 != null) {
                            epaVar3.a();
                        }
                        if (epaVar2 != null) {
                            epaVar2.c();
                        } else {
                            epaVar2 = null;
                        }
                        epaVar.f = epaVar2;
                    }
                }
                hzf.e(hzgVarA, hzgVarB, fdapVarK);
                boolean zD2 = hmlVarC.D(epaVar);
                Object objS2 = hmwVar.S();
                if (zD2 || objS2 == hmk.a) {
                    objS2 = new fdap() { // from class: epb
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            return new epd(epaVar);
                        }
                    };
                    hmwVar.af(objS2);
                }
                hob.c(epaVar, (fdap) objS2, hmlVarC);
                hnj.a(iyj.a.c(epaVar), fdatVar, hmlVarC, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                hzf.e(hzgVarA, hzgVarB, fdapVarK);
                throw th;
            }
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: epc
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    Object obj4 = obj;
                    int i5 = i;
                    epf epfVar2 = epfVar;
                    epe.a(obj4, i5, epfVar2, fdatVar, (hml) obj2, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
