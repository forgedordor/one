package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfds implements cfrj {
    public final cfrd a;
    private final cert b;
    private final ceta c;
    private final eosc d;
    private String e = "";
    private long f = 0;

    public cfds(eosc eoscVar, cfrd cfrdVar, cert certVar, ceta cetaVar) {
        this.d = eoscVar;
        this.c = cetaVar;
        this.b = certVar;
        this.a = cfrdVar;
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.f;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return this.a;
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(cezv cezvVar, evuh evuhVar) {
        return o((ezni) evuhVar);
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "GaiaUnregisterRpcHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.e;
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void h(Throwable th) {
        cfri.c(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void i() {
        cfri.a(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void j() {
        cfri.b(this);
    }

    @Override // defpackage.cfrj
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final eiju c(final ezpp ezppVar) {
        this.e = ezppVar.c;
        return this.c.f().h(new ejvr() { // from class: cfdr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ezpo ezpoVar = (ezpo) ezpp.a.createBuilder(ezppVar);
                ezpoVar.copyOnWrite();
                ((ezpp) ezpoVar.instance).e = this.a.a.a;
                evqs evqsVarX = evqs.x((byte[]) obj);
                ezpoVar.copyOnWrite();
                ((ezpp) ezpoVar.instance).f = evqsVarX;
                ezpp ezppVar2 = (ezpp) ezpoVar.build();
                eznh eznhVar = (eznh) ezni.a.createBuilder();
                eznhVar.copyOnWrite();
                ezni ezniVar = (ezni) eznhVar.instance;
                ezppVar2.getClass();
                ezniVar.c = ezppVar2;
                ezniVar.b |= 1;
                eznhVar.copyOnWrite();
                ((ezni) eznhVar.instance).d = 1;
                return (ezni) eznhVar.build();
            }
        }, this.d);
    }

    @Override // defpackage.cfrj
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final eiju e(eznk eznkVar) {
        ezpr ezprVar = eznkVar.b;
        if (ezprVar == null) {
            ezprVar = ezpr.a;
        }
        this.f = ezprVar.b;
        return eijx.e(eznkVar);
    }

    public final eiju o(ezni ezniVar) {
        return this.b.d(ezniVar);
    }

    @Override // defpackage.cfxa
    public final void k() {
    }

    @Override // defpackage.cfxa
    public final /* synthetic */ void l() {
    }
}
