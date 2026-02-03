package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajch {
    private final fcsu a;
    private final crnp b;

    public ajch(fcsu fcsuVar, crnp crnpVar) {
        fcsuVar.getClass();
        crnpVar.getClass();
        this.a = fcsuVar;
        this.b = crnpVar;
    }

    private static final long b(boolean z) {
        return z ? 1L : 0L;
    }

    public final void a(int i, String str, ajcn ajcnVar, ajcp ajcpVar) {
        str.getClass();
        ajcnVar.getClass();
        ailn ailnVarA = ((aimb) this.a.b()).a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.GAIA_REPORT_EVENT, ellgVar);
        elzh elzhVar = (elzh) elzs.a.createBuilder();
        elzhVar.getClass();
        elzhVar.copyOnWrite();
        elzs elzsVar = (elzs) elzhVar.instance;
        elzsVar.b |= 1;
        elzsVar.c = str;
        elzhVar.copyOnWrite();
        elzs elzsVar2 = (elzs) elzhVar.instance;
        elzsVar2.b |= 4;
        elzsVar2.d = i;
        elzk elzkVar = (elzk) elzl.a.createBuilder();
        elzkVar.getClass();
        elzi elziVar = (elzi) elzj.a.createBuilder();
        elziVar.getClass();
        int i2 = ajcnVar.e;
        elziVar.copyOnWrite();
        elzj elzjVar = (elzj) elziVar.instance;
        elzjVar.b |= 1;
        elzjVar.c = i2;
        boolean zD = this.b.d();
        elziVar.copyOnWrite();
        elzj elzjVar2 = (elzj) elziVar.instance;
        elzjVar2.b |= 2;
        elzjVar2.d = zD;
        int i3 = ajcnVar.d;
        elziVar.copyOnWrite();
        elzj elzjVar3 = (elzj) elziVar.instance;
        elzjVar3.b |= 4;
        elzjVar3.e = i3;
        evsn evsnVarBuild = elziVar.build();
        evsnVarBuild.getClass();
        elzkVar.copyOnWrite();
        elzl elzlVar = (elzl) elzkVar.instance;
        elzlVar.c = (elzj) evsnVarBuild;
        elzlVar.b |= 4;
        evsn evsnVarBuild2 = elzkVar.build();
        evsnVarBuild2.getClass();
        elzhVar.copyOnWrite();
        elzs elzsVar3 = (elzs) elzhVar.instance;
        elzsVar3.e = (elzl) evsnVarBuild2;
        elzsVar3.b |= 8;
        elzo elzoVar = (elzo) elzr.a.createBuilder();
        elzoVar.getClass();
        elzm elzmVar = (elzm) elzn.a.createBuilder();
        elzmVar.getClass();
        long jB = b(ajcpVar.c);
        elzmVar.copyOnWrite();
        elzn elznVar = (elzn) elzmVar.instance;
        elznVar.b |= 1;
        elznVar.c = jB;
        boolean z = ajcpVar.f || ajcpVar.g;
        elzmVar.copyOnWrite();
        elzn elznVar2 = (elzn) elzmVar.instance;
        elznVar2.b |= 2;
        elznVar2.d = b(z);
        boolean z2 = ajcpVar.h > 0;
        elzmVar.copyOnWrite();
        elzn elznVar3 = (elzn) elzmVar.instance;
        elznVar3.b |= 16;
        elznVar3.g = b(z2);
        long jB2 = b(ajcpVar.e);
        elzmVar.copyOnWrite();
        elzn elznVar4 = (elzn) elzmVar.instance;
        elznVar4.b |= 4;
        elznVar4.e = jB2;
        long jB3 = b(ajcpVar.d);
        elzmVar.copyOnWrite();
        elzn elznVar5 = (elzn) elzmVar.instance;
        elznVar5.b |= 8;
        elznVar5.f = jB3;
        evsn evsnVarBuild3 = elzmVar.build();
        evsnVarBuild3.getClass();
        elzoVar.copyOnWrite();
        elzr elzrVar = (elzr) elzoVar.instance;
        elzrVar.c = (elzn) evsnVarBuild3;
        elzrVar.b |= 1;
        elzp elzpVar = (elzp) elzq.a.createBuilder();
        elzpVar.getClass();
        long j = ajcpVar.i;
        elzpVar.copyOnWrite();
        elzq elzqVar = (elzq) elzpVar.instance;
        elzqVar.b = 1 | elzqVar.b;
        elzqVar.c = j;
        long j2 = ajcpVar.j;
        elzpVar.copyOnWrite();
        elzq elzqVar2 = (elzq) elzpVar.instance;
        elzqVar2.b |= 2;
        elzqVar2.d = j2;
        long j3 = ajcpVar.h;
        elzpVar.copyOnWrite();
        elzq elzqVar3 = (elzq) elzpVar.instance;
        elzqVar3.b |= 4;
        elzqVar3.e = j3;
        evsn evsnVarBuild4 = elzpVar.build();
        evsnVarBuild4.getClass();
        elzoVar.copyOnWrite();
        elzr elzrVar2 = (elzr) elzoVar.instance;
        elzrVar2.d = (elzq) evsnVarBuild4;
        elzrVar2.b |= 2;
        evsn evsnVarBuild5 = elzoVar.build();
        evsnVarBuild5.getClass();
        elzhVar.copyOnWrite();
        elzs elzsVar4 = (elzs) elzhVar.instance;
        elzsVar4.f = (elzr) evsnVarBuild5;
        elzsVar4.b |= 16;
        evsn evsnVarBuild6 = elzhVar.build();
        evsnVarBuild6.getClass();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.co = (elzs) evsnVarBuild6;
        ellhVar.h |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        ailnVarA.j((ellg) elgr.a(ellgVar).toBuilder(), aioj.LOG_SPEC_GAIA_REPORT);
    }
}
