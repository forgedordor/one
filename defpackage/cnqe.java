package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnqe {
    private final fcsu a;
    private final eygg b;
    private final fcsu c;
    private final fcsu d;

    public cnqe(fcsu fcsuVar, eygg eyggVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = fcsuVar;
        this.b = eyggVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
    }

    public final void a(int i) {
        fcsu fcsuVar = this.d;
        if (!((ajjp) fcsuVar.b()).b()) {
            ((ajjp) fcsuVar.b()).a();
            return;
        }
        emjh emjhVar = (emjh) emjj.a.createBuilder();
        emjhVar.copyOnWrite();
        emjj emjjVar = (emjj) emjhVar.instance;
        emjjVar.c = i - 1;
        emjjVar.b |= 1;
        boolean zIsPresent = ((Optional) this.b.b()).isPresent();
        emjhVar.copyOnWrite();
        emjj emjjVar2 = (emjj) emjhVar.instance;
        emjjVar2.b |= 4;
        emjjVar2.d = zIsPresent;
        fcsu fcsuVar2 = this.c;
        boolean zE = ((crnp) fcsuVar2.b()).e();
        emjhVar.copyOnWrite();
        emjj emjjVar3 = (emjj) emjhVar.instance;
        emjjVar3.b |= 8;
        emjjVar3.e = zE;
        boolean zD = ((crnp) fcsuVar2.b()).d();
        emjhVar.copyOnWrite();
        emjj emjjVar4 = (emjj) emjhVar.instance;
        emjjVar4.b |= 16;
        emjjVar4.f = zD;
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.TELEPHONY_DATABASE_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        emjj emjjVar5 = (emjj) emjhVar.build();
        emjjVar5.getClass();
        ellhVar2.af = emjjVar5;
        ellhVar2.d |= 2;
        ((aill) this.a.b()).j(ellgVar);
    }
}
