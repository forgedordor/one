package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgeu extends dges {
    final /* synthetic */ dgfg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgeu(dgfg dgfgVar) {
        super(dgfgVar);
        this.c = dgfgVar;
    }

    @Override // defpackage.dges, defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "ReregisteringState";
    }

    @Override // defpackage.dges
    protected final void h(ebqs ebqsVar) throws ebmn {
        dgfg dgfgVar = this.c;
        eblf eblfVar = dgfgVar.t.a;
        if (Objects.isNull(eblfVar)) {
            throw new ebmn("Null SipStack");
        }
        dgfgVar.F = g(ebqsVar);
        i(eblfVar, ebqsVar);
        dgfgVar.w(dgfgVar.af);
    }
}
