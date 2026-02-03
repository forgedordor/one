package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ubi implements ual {
    private static final cqce a = cqce.g("BugleCms", "ParticipantEventHandler");
    private final ubo b;

    public ubi(ubo uboVar) {
        this.b = uboVar;
    }

    @Override // defpackage.ual
    public final /* bridge */ /* synthetic */ ListenableFuture a(eqmo eqmoVar) {
        if (eqmoVar.b != 4) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.A(bzmz.u.a, eqmn.a(eqmoVar.b));
            cqbdVarE.I("Cannot handle event");
            cqbdVarE.r();
            return eijx.e(null);
        }
        eqno eqnoVar = (eqno) eqmoVar.c;
        int i = eqnoVar.b;
        int iB = eqnn.b(i);
        if (iB == 0) {
            iB = 1;
        }
        if (iB - 2 == 1) {
            ubo uboVar = this.b;
            String str = eqnoVar.c;
            int iB2 = eqnn.b(i);
            return uboVar.a(str, eqnn.a(iB2 != 0 ? iB2 : 1));
        }
        cqbd cqbdVarA = a.a();
        String str2 = bzmz.t.a;
        int iB3 = eqnn.b(eqnoVar.b);
        cqbdVarA.A(str2, eqnn.a(iB3 != 0 ? iB3 : 1));
        cqbdVarA.A(bzmz.v.a, "Ignore");
        cqbdVarA.A(bzmz.w.a, eqnoVar.c);
        cqbdVarA.A(bzmz.x.a, "Not implemented");
        cqbdVarA.I("ParticipantEvent received");
        cqbdVarA.r();
        return eijx.e(null);
    }
}
