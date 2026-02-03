package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctdd implements fdap {
    final /* synthetic */ Instant a;

    public ctdd(Instant instant) {
        this.a = instant;
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
            ctclVar2.j = null;
            ctclVar2.b &= -65;
        } else {
            evvp evvpVarB = evxd.b(instant);
            ctckVar.copyOnWrite();
            ctcl ctclVar3 = (ctcl) ctckVar.instance;
            ctclVar3.j = evvpVarB;
            ctclVar3.b |= 64;
        }
        evsn evsnVarBuild = ctckVar.build();
        evsnVarBuild.getClass();
        return (ctcl) evsnVarBuild;
    }
}
