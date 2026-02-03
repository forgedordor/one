package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfgw implements cfrj {
    private final String a;
    private final cfre b;
    private final fcsu c;
    private String d = "";
    private long e = 0;

    public cfgw(fcsu fcsuVar, cfre cfreVar, String str) {
        this.c = fcsuVar;
        this.b = cfreVar;
        this.a = str;
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.e;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return this.b;
    }

    @Override // defpackage.cfrj
    public final ListenableFuture c(ezpp ezppVar) {
        cqca.c("Bugle", "Verify request Id: ".concat(String.valueOf(ezppVar.c)));
        this.d = ezppVar.c;
        eznn eznnVar = (eznn) ezno.a.createBuilder();
        eznnVar.copyOnWrite();
        ezno eznoVar = (ezno) eznnVar.instance;
        ezppVar.getClass();
        eznoVar.c = ezppVar;
        eznoVar.b |= 1;
        eznnVar.copyOnWrite();
        ezno eznoVar2 = (ezno) eznnVar.instance;
        String str = this.a;
        str.getClass();
        eznoVar2.d = str;
        return eork.i((ezno) eznnVar.build());
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "VerifyRpcHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.d;
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
    public final ListenableFuture d(cezv cezvVar, ezno eznoVar) {
        return cezvVar.d(cnln.b(((asqx) this.c.b()).c(this.b.b))).i(eznoVar);
    }

    @Override // defpackage.cfrj
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final ListenableFuture e(eznq eznqVar) {
        long j;
        if (eznqVar != null) {
            ezpr ezprVar = eznqVar.c;
            if (ezprVar == null) {
                ezprVar = ezpr.a;
            }
            j = ezprVar.b;
        } else {
            j = 0;
        }
        this.e = j;
        return eork.i(eznqVar);
    }

    @Override // defpackage.cfxa
    public final void k() {
    }

    @Override // defpackage.cfxa
    public final /* synthetic */ void l() {
    }
}
