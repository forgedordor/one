package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cstk {
    public static final ekgp a = ekgp.o(csuj.C11N, eqrm.C11N, csuj.RCS, eqrm.RCS, csuj.NOT_YET_KNOWN, eqrm.NOT_YET_KNOWN, csuj.C11N_RCS, eqrm.C11N_RCS);
    public static final cqce b = cqce.g("Bugle", "VerifiedSmsInvestigativeRpcService");
    public final cswj c;
    public final ceru d;
    public final Context e;
    public final eosc f;
    public final eosc g;

    public cstk(cswj cswjVar, ceru ceruVar, Context context, eosc eoscVar, eosc eoscVar2) {
        this.c = cswjVar;
        this.d = ceruVar;
        this.e = context;
        this.f = eoscVar;
        this.g = eoscVar2;
    }

    public static String a(String str) {
        if (byew.a().booleanValue()) {
            return "";
        }
        return str.hashCode() + "-redacted";
    }
}
