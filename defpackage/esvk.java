package defpackage;

import java.nio.charset.Charset;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esvk {
    public static final Charset a;
    public static final esvj b;
    private static final eoib c;
    private final eswe d;

    static {
        eoia eoiaVar = (eoia) eoib.a.createBuilder();
        eoiaVar.copyOnWrite();
        eoib eoibVar = (eoib) eoiaVar.instance;
        eoibVar.b |= 1;
        eoibVar.c = 0L;
        eoiaVar.copyOnWrite();
        eoib.b((eoib) eoiaVar.instance);
        eoiaVar.copyOnWrite();
        eoib.a((eoib) eoiaVar.instance);
        c = (eoib) eoiaVar.build();
        a = Charset.forName("UTF-8");
        b = esvj.d().a();
    }

    public esvk(String str, String str2) {
        eswh eswhVar = (eswh) eswi.a.createBuilder();
        eswhVar.copyOnWrite();
        eswi eswiVar = (eswi) eswhVar.instance;
        str.getClass();
        eswiVar.b |= 1;
        eswiVar.c = str;
        eswhVar.copyOnWrite();
        eswi eswiVar2 = (eswi) eswhVar.instance;
        eswiVar2.b |= 2;
        eswiVar2.d = str2;
        eswd eswdVar = (eswd) eswe.a.createBuilder();
        eswdVar.copyOnWrite();
        eswe esweVar = (eswe) eswdVar.instance;
        eswi eswiVar3 = (eswi) eswhVar.build();
        eswiVar3.getClass();
        esweVar.c = eswiVar3;
        esweVar.b |= 1;
        eswo eswoVar = (eswo) eswq.a.createBuilder();
        eswoVar.copyOnWrite();
        eswq eswqVar = (eswq) eswoVar.instance;
        eswqVar.c = 0;
        eswqVar.b |= 1;
        eswdVar.copyOnWrite();
        eswe esweVar2 = (eswe) eswdVar.instance;
        eswq eswqVar2 = (eswq) eswoVar.build();
        eswqVar2.getClass();
        esweVar2.d = eswqVar2;
        esweVar2.b |= 2;
        this.d = (eswe) eswdVar.build();
    }

    public static Object a(eksx eksxVar, ekrz ekrzVar) {
        return eksxVar.i().d(ekrzVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.eswj c(defpackage.eoid r7, int r8, defpackage.esvj r9, java.lang.Object... r10) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esvk.c(eoid, int, esvj, java.lang.Object[]):eswj");
    }

    public final eswj b(eksx eksxVar, int i, esvj esvjVar) {
        String name;
        eoid eoidVar;
        feeg feegVar;
        if (eksxVar.i().d(dzhy.a) != null) {
            eoic eoicVar = (eoic) eoid.a.createBuilder();
            eoib eoibVar = c;
            eoicVar.copyOnWrite();
            eoid eoidVar2 = (eoid) eoicVar.instance;
            eoibVar.getClass();
            eoidVar2.c = eoibVar;
            eoidVar2.b |= 1;
            int iIntValue = eksxVar.m().intValue();
            eoicVar.copyOnWrite();
            eoid eoidVar3 = (eoid) eoicVar.instance;
            eoidVar3.b |= 4;
            eoidVar3.e = iIntValue;
            String strB = eksxVar.e().b();
            eoicVar.copyOnWrite();
            eoid eoidVar4 = (eoid) eoicVar.instance;
            strB.getClass();
            eoidVar4.b |= 8;
            eoidVar4.f = strB;
            String strD = eksxVar.e().d();
            eoicVar.copyOnWrite();
            eoid eoidVar5 = (eoid) eoicVar.instance;
            strD.getClass();
            eoidVar5.b |= 16;
            eoidVar5.g = strD;
            int iA = eksxVar.e().a();
            eoicVar.copyOnWrite();
            eoid eoidVar6 = (eoid) eoicVar.instance;
            eoidVar6.b |= 32;
            eoidVar6.h = iA;
            String strE = eksxVar.e().e();
            if (strE != null) {
                eoicVar.copyOnWrite();
                eoid eoidVar7 = (eoid) eoicVar.instance;
                eoidVar7.b |= 64;
                eoidVar7.i = strE;
            }
            String str = (String) eksxVar.i().d(dzhy.b);
            if (str != null) {
                eoicVar.copyOnWrite();
                eoid eoidVar8 = (eoid) eoicVar.instance;
                eoidVar8.b |= 2;
                eoidVar8.d = str;
            } else {
                eoicVar.copyOnWrite();
                eoid eoidVar9 = (eoid) eoicVar.instance;
                eoidVar9.b |= 2;
                eoidVar9.d = "Unknown native thread";
            }
            ekub ekubVarJ = eksxVar.j();
            if (ekubVarJ != null) {
                eoicVar.copyOnWrite();
                eoid eoidVar10 = (eoid) eoicVar.instance;
                eoidVar10.b |= 256;
                eoidVar10.j = ekubVarJ.b;
            } else {
                String string = eksxVar.k().toString();
                eoicVar.copyOnWrite();
                eoid eoidVar11 = (eoid) eoicVar.instance;
                string.getClass();
                eoidVar11.b |= 256;
                eoidVar11.j = string;
            }
            eoidVar = (eoid) eoicVar.build();
        } else {
            ekub ekubVarJ2 = eksxVar.j();
            if (ekubVarJ2 != null) {
                name = ekubVarJ2.b;
            } else {
                Object objK = eksxVar.k();
                name = objK instanceof String ? (String) objK : objK != null ? objK.getClass().getName() : "null";
            }
            Throwable th = i == 2 ? (Throwable) a(eksxVar, ekrl.a) : null;
            ekrq ekrqVarE = eksxVar.e();
            Level levelM = eksxVar.m();
            String strB2 = ekrqVarE.b();
            String strD2 = ekrqVarE.d();
            int iA2 = ekrqVarE.a();
            eoic eoicVar2 = (eoic) eoid.a.createBuilder();
            eoib eoibVar2 = c;
            eoicVar2.copyOnWrite();
            eoid eoidVar12 = (eoid) eoicVar2.instance;
            eoibVar2.getClass();
            eoidVar12.c = eoibVar2;
            eoidVar12.b |= 1;
            String name2 = Thread.currentThread().getName();
            eoicVar2.copyOnWrite();
            eoid eoidVar13 = (eoid) eoicVar2.instance;
            name2.getClass();
            eoidVar13.b |= 2;
            eoidVar13.d = name2;
            int iIntValue2 = levelM.intValue();
            eoicVar2.copyOnWrite();
            eoid eoidVar14 = (eoid) eoicVar2.instance;
            eoidVar14.b |= 4;
            eoidVar14.e = iIntValue2;
            eoicVar2.copyOnWrite();
            eoid eoidVar15 = (eoid) eoicVar2.instance;
            strB2.getClass();
            eoidVar15.b |= 8;
            eoidVar15.f = strB2;
            eoicVar2.copyOnWrite();
            eoid eoidVar16 = (eoid) eoicVar2.instance;
            strD2.getClass();
            eoidVar16.b |= 16;
            eoidVar16.g = strD2;
            eoicVar2.copyOnWrite();
            eoid eoidVar17 = (eoid) eoicVar2.instance;
            eoidVar17.b |= 32;
            eoidVar17.h = iA2;
            if (name != null) {
                eoicVar2.copyOnWrite();
                eoid eoidVar18 = (eoid) eoicVar2.instance;
                eoidVar18.b |= 256;
                eoidVar18.j = name;
            }
            if (th != null) {
                eoii eoiiVarA = ((esve) esvjVar).c ? eoli.a(th, false) : eoli.c(th);
                eoicVar2.copyOnWrite();
                eoid eoidVar19 = (eoid) eoicVar2.instance;
                eoin eoinVar = (eoin) eoiiVarA.build();
                eoinVar.getClass();
                eoidVar19.k = eoinVar;
                eoidVar19.b |= 1024;
            }
            eoidVar = (eoid) eoicVar2.build();
        }
        eswj eswjVarC = eksxVar.j() != null ? c(eoidVar, i, esvjVar, eksxVar.S()) : c(eoidVar, i, esvjVar, new Object[0]);
        if (i == 2 && ((esve) esvjVar).a && (feegVar = (feeg) a(eksxVar, esvm.b)) != null) {
            eswjVarC.copyOnWrite();
            eswn eswnVar = (eswn) eswjVarC.instance;
            eswn eswnVar2 = eswn.a;
            eswnVar.e = feegVar;
            eswnVar.b |= 4;
        }
        return eswjVarC;
    }
}
