package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfgv implements cfrj {
    private final cfre a;
    private String b = "";
    private long c = 0;

    public cfgv(cfre cfreVar) {
        this.a = cfreVar;
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.c;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return this.a;
    }

    @Override // defpackage.cfrj
    public final ListenableFuture c(ezpp ezppVar) {
        this.b = ezppVar.c;
        eznh eznhVar = (eznh) ezni.a.createBuilder();
        eznhVar.copyOnWrite();
        ezni ezniVar = (ezni) eznhVar.instance;
        ezppVar.getClass();
        ezniVar.c = ezppVar;
        ezniVar.b |= 1;
        eznhVar.copyOnWrite();
        ((ezni) eznhVar.instance).d = 1;
        return eork.i((ezni) eznhVar.build());
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(cezv cezvVar, evuh evuhVar) {
        return cezvVar.c().a().e((ezni) evuhVar);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture e(evuh evuhVar) {
        long j;
        eznk eznkVar = (eznk) evuhVar;
        if (eznkVar != null) {
            ezpr ezprVar = eznkVar.b;
            if (ezprVar == null) {
                ezprVar = ezpr.a;
            }
            j = ezprVar.b;
        } else {
            j = 0;
        }
        this.c = j;
        return eork.i(eznkVar);
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "UnregisterPhoneRpcHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.b;
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
