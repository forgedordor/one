package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsi {
    public static final ddz a = dea.c(300, 0, dev.a, 2);

    public static final gsp a(boolean z, fdap fdapVar, gsq gsqVar, boolean z2, hml hmlVar, int i, int i2) {
        fdap fdapVar2;
        if ((i2 & 2) != 0) {
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new fdap() { // from class: gsd
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ddz ddzVar = gsi.a;
                        return true;
                    }
                };
                hmlVar.y(objF);
            }
            fdapVar2 = (fdap) objF;
        } else {
            fdapVar2 = fdapVar;
        }
        gsq gsqVar2 = (i2 & 4) != 0 ? gsq.a : gsqVar;
        final boolean z3 = ((i2 & 8) == 0) & z2;
        final kio kioVar = (kio) hmlVar.e(jmh.e);
        boolean zD = hmlVar.D(kioVar) | hmlVar.A(56.0f);
        Object objF2 = hmlVar.f();
        if (zD || objF2 == hmk.a) {
            objF2 = new fdae() { // from class: gse
                @Override // defpackage.fdae
                public final Object invoke() {
                    ddz ddzVar = gsi.a;
                    return Float.valueOf(kioVar.en(56.0f));
                }
            };
            hmlVar.y(objF2);
        }
        final fdae fdaeVar = (fdae) objF2;
        boolean zD2 = hmlVar.D(kioVar) | hmlVar.A(125.0f);
        Object objF3 = hmlVar.f();
        if (zD2 || objF3 == hmk.a) {
            objF3 = new fdae() { // from class: gsf
                @Override // defpackage.fdae
                public final Object invoke() {
                    ddz ddzVar = gsi.a;
                    return Float.valueOf(kioVar.en(125.0f));
                }
            };
            hmlVar.y(objF3);
        }
        final boolean z4 = 1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1));
        final fdae fdaeVar2 = (fdae) objF3;
        Object[] objArr = {Boolean.valueOf(z4), fdapVar2, Boolean.valueOf(z3)};
        fdat fdatVar = new fdat() { // from class: gsl
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return ((gsp) obj2).c();
            }
        };
        final fdap fdapVar3 = fdapVar2;
        fdap fdapVar4 = new fdap() { // from class: gsm
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                boolean z5 = z4;
                fdae fdaeVar3 = fdaeVar;
                fdap fdapVar5 = fdapVar3;
                return new gsp(z5, fdaeVar3, fdaeVar2, (gsq) obj, fdapVar5, z3);
            }
        };
        final gsq gsqVar3 = gsqVar2;
        hyu hyuVar = new hyu(fdatVar, fdapVar4);
        boolean zD3 = ((((i & 14) ^ 6) > 4 && hmlVar.E(z4)) || (i & 6) == 4) | hmlVar.D(fdaeVar) | hmlVar.D(fdaeVar2) | ((((i & 896) ^ 384) > 256 && hmlVar.B(gsqVar3.ordinal())) || (i & 384) == 256) | ((((i & 112) ^ 48) > 32 && hmlVar.D(fdapVar3)) || (i & 48) == 32) | hmlVar.E(z3);
        Object objF4 = hmlVar.f();
        if (zD3 || objF4 == hmk.a) {
            Object obj = new fdae() { // from class: gsg
                @Override // defpackage.fdae
                public final Object invoke() {
                    ddz ddzVar = gsi.a;
                    return new gsp(z4, fdaeVar, fdaeVar2, gsqVar3, fdapVar3, z3);
                }
            };
            hmlVar.y(obj);
            objF4 = obj;
        }
        return (gsp) hxy.e(objArr, hyuVar, (fdae) objF4, hmlVar, 0, 4);
    }
}
