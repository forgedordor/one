package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgxl implements dgxj {
    private final dgxm a;
    private final crmx b;
    private final dgxf c;
    private final eblg d;
    private final dgxb e;
    private final dgxh f;
    private final dgxu g;
    private final dgxd h;
    private final dfio i;

    public dgxl(dfio dfioVar, dgxm dgxmVar, crmx crmxVar, dgxf dgxfVar, eblg eblgVar, dgxb dgxbVar, dgxh dgxhVar, dgxu dgxuVar, dgxd dgxdVar) {
        this.i = dfioVar;
        this.a = dgxmVar;
        this.b = crmxVar;
        this.c = dgxfVar;
        this.d = eblgVar;
        this.e = dgxbVar;
        this.f = dgxhVar;
        this.g = dgxuVar;
        this.h = dgxdVar;
    }

    @Override // defpackage.dgxj
    public final dgxi a(dfys dfysVar, dgwg dgwgVar, dhjt dhjtVar, dgiq dgiqVar, dhaw dhawVar, Context context) {
        if (dfog.R() || !dfpk.q() || dgiqVar.h() == null || !dgiqVar.h().mPresenceDiscovery) {
            dhja.k("Using OPTIONS Capabilities Discovery.", new Object[0]);
            return new dgxp(dfysVar, dgwgVar, this.a, this.d, this.b, this.e, this.c, this.f, dhjtVar);
        }
        dhja.k("Using Capabilities Discovery over Presence.", new Object[0]);
        return new dgxt(dfysVar, dgwgVar, this.a, this.i, dhawVar, context, this.b, this.c, dhjtVar, this.g, this.h);
    }
}
