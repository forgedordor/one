package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daki {
    public static final hsf a(Object obj, fdat fdatVar, hml hmlVar, int i) {
        fdatVar.getClass();
        hmlVar.v(6688264);
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        Object obj2 = hmk.a;
        if (objS == obj2) {
            objS = hob.a(fcyi.a, hmlVar);
            hmwVar.af(objS);
        }
        fdjx fdjxVar = (fdjx) objS;
        hmlVar.v(5004770);
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !hmlVar.D(obj)) && (i & 6) != 4) {
            z = false;
        }
        Object objS2 = hmwVar.S();
        if (z || objS2 == obj2) {
            fdpu fdpuVar = new fdpu(fctx.a);
            dake dakeVar = new dake(null, fdatVar, obj);
            int i2 = fdsn.a;
            objS2 = fdtg.b(new fdwg(dakeVar, fdpuVar), fdjxVar, fdur.b, new dajy());
            hmwVar.af(objS2);
        }
        hmwVar.ab();
        hsf hsfVarA = hro.a((fdvc) objS2, hmlVar);
        hmwVar.ab();
        return hsfVarA;
    }

    public static final hsf b(fdap fdapVar, hml hmlVar) {
        fdapVar.getClass();
        hmlVar.v(-348746670);
        dajy dajyVar = new dajy();
        hmlVar.v(5004770);
        boolean zF = hmlVar.F(fdapVar);
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        if (zF || objS == hmk.a) {
            objS = new dakb(fdapVar, null);
            hmwVar.af(objS);
        }
        hmwVar.ab();
        hsf hsfVarA = hrt.a(dajyVar, (fdat) objS, hmlVar);
        hmwVar.ab();
        return hsfVarA;
    }

    public static final hsf c(fdap fdapVar, hml hmlVar) {
        fdapVar.getClass();
        hmlVar.v(-107938876);
        fctx fctxVar = fctx.a;
        hmlVar.v(5004770);
        boolean zF = hmlVar.F(fdapVar);
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        if (zF || objS == hmk.a) {
            objS = new dakc(fdapVar, null);
            hmwVar.af(objS);
        }
        hmwVar.ab();
        hsf hsfVarA = a(fctxVar, (fdat) objS, hmlVar, 6);
        hmwVar.ab();
        return hsfVarA;
    }
}
