package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfel implements cfrj {
    private final cfgs b;
    private final cert c;
    private final eosc d;
    private String e = "";
    private long f = 0;
    public final cfrd a = new cfrd("GDitto");

    public cfel(cfgs cfgsVar, eosc eoscVar, cert certVar) {
        this.b = cfgsVar;
        this.c = certVar;
        this.d = eoscVar;
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
    public final ListenableFuture c(ezpp ezppVar) {
        this.e = ezppVar.c;
        ezpo ezpoVar = (ezpo) ezpp.a.createBuilder(ezppVar);
        ezpoVar.copyOnWrite();
        ezpp ezppVar2 = (ezpp) ezpoVar.instance;
        String str = this.a.a;
        ezppVar2.e = str;
        final ezpp ezppVar3 = (ezpp) ezpoVar.build();
        cfgr cfgrVarA = this.b.a();
        cfgrVarA.j();
        cfgrVarA.l = ceoy.a(str, ezppVar3.c);
        return eika.k(cfgrVarA.b(), new eooz() { // from class: cfek
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ezli ezliVar = (ezli) obj;
                if ((((ezlj) ezliVar.instance).b & 1) == 0) {
                    return eijx.d(new IllegalArgumentException("The DeviceId can't be empty in SignInGaia request."));
                }
                ezpp ezppVar4 = ezppVar3;
                cfel cfelVar = this.a;
                ezmq ezmqVar = (ezmq) ezmr.a.createBuilder();
                ezmqVar.copyOnWrite();
                ezmr ezmrVar = (ezmr) ezmqVar.instance;
                ezppVar4.getClass();
                ezmrVar.c = ezppVar4;
                ezmrVar.b |= 1;
                ezmqVar.copyOnWrite();
                ((ezmr) ezmqVar.instance).f = cfelVar.a.a;
                ezmqVar.copyOnWrite();
                ((ezmr) ezmqVar.instance).e = felt.a(3);
                ezmqVar.copyOnWrite();
                ezmr ezmrVar2 = (ezmr) ezmqVar.instance;
                ezlj ezljVar = (ezlj) ezliVar.build();
                ezljVar.getClass();
                ezmrVar2.d = ezljVar;
                ezmrVar2.b |= 2;
                return eijx.e((ezmr) ezmqVar.build());
            }
        }, this.d);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(cezv cezvVar, evuh evuhVar) {
        ezmr ezmrVar = (ezmr) evuhVar;
        ezpp ezppVar = ezmrVar.c;
        if (ezppVar == null) {
            ezppVar = ezpp.a;
        }
        this.e = ezppVar.c;
        return this.c.c(ezmrVar);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture e(evuh evuhVar) {
        long j;
        ezmt ezmtVar = (ezmt) evuhVar;
        if (ezmtVar != null) {
            ezpr ezprVar = ezmtVar.c;
            if (ezprVar == null) {
                ezprVar = ezpr.a;
            }
            j = ezprVar.b;
        } else {
            j = 0;
        }
        this.f = j;
        return eijx.e(ezmtVar);
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "LookupGaiaRegistrationRpcHandler";
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

    @Override // defpackage.cfxa
    public final void k() {
    }

    @Override // defpackage.cfxa
    public final /* synthetic */ void l() {
    }
}
