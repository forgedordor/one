package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class aimt {
    private final fcsu a;
    public final elkq b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public aimt(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        elkq elkqVar;
        this.d = fcsuVar4;
        fcsuVar3.b();
        this.a = fcsuVar;
        this.c = fcsuVar2;
        this.e = fcsuVar5;
        if (((crnp) fcsuVar4.b()).e()) {
            elkqVar = (elkq) elku.a.createBuilder();
            String strE = e();
            elkqVar.copyOnWrite();
            elku elkuVar = (elku) elkqVar.instance;
            strE.getClass();
            elkuVar.b |= 1;
            elkuVar.c = strE;
            int iF = f();
            elkqVar.copyOnWrite();
            elku elkuVar2 = (elku) elkqVar.instance;
            elkuVar2.e = iF - 1;
            elkuVar2.b |= 4;
            String strD = d();
            elkqVar.copyOnWrite();
            elku elkuVar3 = (elku) elkqVar.instance;
            strD.getClass();
            elkuVar3.b |= 2;
            elkuVar3.d = strD;
            enwr enwrVarA = a();
            elkqVar.copyOnWrite();
            elku elkuVar4 = (elku) elkqVar.instance;
            elkuVar4.o = enwrVarA.N;
            elkuVar4.b |= 4096;
            elvg elvgVar = cqbe.a;
            elkqVar.copyOnWrite();
            elku elkuVar5 = (elku) elkqVar.instance;
            elkuVar5.u = elvgVar.x;
            elkuVar5.b = 262144 | elkuVar5.b;
        } else {
            elkqVar = (elkq) elku.a.createBuilder();
            elkqVar.copyOnWrite();
            elku elkuVar6 = (elku) elkqVar.instance;
            elkuVar6.b |= 1;
            elkuVar6.c = "UNKNOWN_SIM_OPERATOR";
            elkqVar.copyOnWrite();
            elku elkuVar7 = (elku) elkqVar.instance;
            elkuVar7.e = 0;
            elkuVar7.b |= 4;
            elkqVar.copyOnWrite();
            elku elkuVar8 = (elku) elkqVar.instance;
            elkuVar8.b |= 2;
            elkuVar8.d = "UNKNOWN_NETWORK_OPERATOR";
            elvg elvgVar2 = cqbe.a;
            elkqVar.copyOnWrite();
            elku elkuVar9 = (elku) elkqVar.instance;
            elkuVar9.u = elvgVar2.x;
            elkuVar9.b = 262144 | elkuVar9.b;
        }
        this.b = elkqVar;
    }

    private final enwr a() {
        try {
            return ((chzn) this.a.b()).b(((cmmh) ((cmlb) this.e.b()).f().orElseThrow()).c);
        } catch (cmjj | NoSuchElementException unused) {
            return enwr.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS;
        }
    }

    private final String d() {
        return cssr.a(((crny) this.c.b()).j().q(), "UNKNOWN_NETWORK_OPERATOR");
    }

    private final String e() {
        return cssr.a(((crny) this.c.b()).j().u(), "UNKNOWN_SIM_OPERATOR");
    }

    private final int f() {
        try {
            return ((cmmh) ((cmlb) this.e.b()).f().orElseThrow()).o ? 2 : 1;
        } catch (cmjj | NoSuchElementException unused) {
            return 1;
        }
    }

    public final elku b() {
        return (elku) this.b.build();
    }

    public final void c(int i) {
        crof crofVarH = ((crny) this.c.b()).h(i);
        int[] iArrD = crofVarH.D();
        elvr elvrVar = (elvr) elvs.a.createBuilder();
        int i2 = iArrD[0];
        elvrVar.copyOnWrite();
        elvs elvsVar = (elvs) elvrVar.instance;
        elvsVar.b |= 1;
        elvsVar.c = i2;
        int i3 = iArrD[1];
        elvrVar.copyOnWrite();
        elvs elvsVar2 = (elvs) elvrVar.instance;
        elvsVar2.b |= 2;
        elvsVar2.d = i3;
        elvs elvsVar3 = (elvs) elvrVar.build();
        elkq elkqVar = this.b;
        elkqVar.copyOnWrite();
        elku elkuVar = (elku) elkqVar.instance;
        elku elkuVar2 = elku.a;
        elvsVar3.getClass();
        elkuVar.q = elvsVar3;
        elkuVar.b |= 16384;
        String strA = cssr.a(crofVarH.u(), e());
        elkqVar.copyOnWrite();
        elku elkuVar3 = (elku) elkqVar.instance;
        strA.getClass();
        elkuVar3.b |= 1;
        elkuVar3.c = strA;
        String strA2 = cssr.a(crofVarH.q(), d());
        elkqVar.copyOnWrite();
        elku elkuVar4 = (elku) elkqVar.instance;
        strA2.getClass();
        elkuVar4.b |= 2;
        elkuVar4.d = strA2;
    }
}
