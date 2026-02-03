package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctdf implements fdap {
    final /* synthetic */ Instant a;
    final /* synthetic */ ekhx b;

    public ctdf(Instant instant, ekhx ekhxVar) {
        this.a = instant;
        this.b = ekhxVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ctcl ctclVar = (ctcl) obj;
        ctclVar.getClass();
        ctck ctckVar = (ctck) ctclVar.toBuilder();
        Instant instant = this.a;
        if (instant == null) {
            ctckVar.copyOnWrite();
            ctcl ctclVar2 = (ctcl) ctckVar.instance;
            ctclVar2.h = null;
            ctclVar2.b &= -33;
        } else {
            evvp evvpVarB = evxd.b(instant);
            ctckVar.copyOnWrite();
            ctcl ctclVar3 = (ctcl) ctckVar.instance;
            ctclVar3.h = evvpVarB;
            ctclVar3.b |= 32;
        }
        ekhx ekhxVar = this.b;
        ctckVar.copyOnWrite();
        ((ctcl) ctckVar.instance).i = evsn.emptyProtobufList();
        if (!ekhxVar.isEmpty()) {
            ctckVar.copyOnWrite();
            ctcl ctclVar4 = (ctcl) ctckVar.instance;
            evtg evtgVar = ctclVar4.i;
            if (!evtgVar.c()) {
                ctclVar4.i = evsn.mutableCopy(evtgVar);
            }
            evpz.addAll(ekhxVar, ctclVar4.i);
        }
        evsn evsnVarBuild = ctckVar.build();
        evsnVarBuild.getClass();
        return (ctcl) evsnVarBuild;
    }
}
