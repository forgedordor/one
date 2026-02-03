package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwef {
    public static dwqf a(eypr eyprVar) {
        dwqe dwqeVarF = dwqf.f();
        dwqeVarF.c(eyprVar.d);
        dwqeVarF.f(eyprVar.e);
        dwqeVarF.d(eyprVar.c.I());
        dwqeVarF.e(eyprVar.g);
        if ((eyprVar.b & 1) != 0) {
            eyax eyaxVar = eyprVar.f;
            if (eyaxVar == null) {
                eyaxVar = eyax.a;
            }
            dwqeVarF.b(dwdw.a(eyaxVar));
        }
        return dwqeVarF.a();
    }

    public static eypr b(dwqf dwqfVar) {
        eypq eypqVar = (eypq) eypr.a.createBuilder();
        evqs evqsVarX = evqs.x(dwqfVar.e());
        eypqVar.copyOnWrite();
        ((eypr) eypqVar.instance).c = evqsVarX;
        int iA = dwqfVar.a();
        eypqVar.copyOnWrite();
        ((eypr) eypqVar.instance).d = iA;
        int iB = dwqfVar.b();
        eypqVar.copyOnWrite();
        ((eypr) eypqVar.instance).e = iB;
        String strD = dwqfVar.d();
        eypqVar.copyOnWrite();
        eypr eyprVar = (eypr) eypqVar.instance;
        strD.getClass();
        eyprVar.g = strD;
        if (dwqfVar.c().g()) {
            eyax eyaxVarB = dwdw.b(((Integer) dwqfVar.c().c()).intValue());
            eypqVar.copyOnWrite();
            eypr eyprVar2 = (eypr) eypqVar.instance;
            eyaxVarB.getClass();
            eyprVar2.f = eyaxVarB;
            eyprVar2.b |= 1;
        }
        return (eypr) eypqVar.build();
    }
}
