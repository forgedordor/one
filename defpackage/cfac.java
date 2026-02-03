package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfac implements cfrj {
    private static final eksp a = eksp.c("BugleDitto");
    private final ezol b;
    private String c = "";
    private long d = 0;
    private final cqls e;
    private final fcsu f;
    private final ezik g;
    private final evqs h;
    private final cfgi i;

    public cfac(ezol ezolVar, ezik ezikVar, evqs evqsVar, cqls cqlsVar, fcsu fcsuVar, cfgi cfgiVar) {
        this.b = ezolVar;
        this.e = cqlsVar;
        this.f = fcsuVar;
        this.g = ezikVar;
        this.h = evqsVar;
        this.i = cfgiVar;
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.d;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return cfrh.d;
    }

    @Override // defpackage.cfrj
    public final ListenableFuture c(ezpp ezppVar) {
        ((bvio) this.f.b()).o(((cqlp) this.e).c, ezppVar.c);
        this.c = ezppVar.c;
        ezif ezifVar = (ezif) ezig.a.createBuilder();
        ezifVar.copyOnWrite();
        ezig ezigVar = (ezig) ezifVar.instance;
        ezppVar.getClass();
        ezigVar.c = ezppVar;
        ezigVar.b |= 1;
        ezifVar.copyOnWrite();
        ezig ezigVar2 = (ezig) ezifVar.instance;
        ezol ezolVar = this.b;
        ezolVar.getClass();
        ezigVar2.d = ezolVar;
        ezigVar2.b |= 2;
        ezifVar.copyOnWrite();
        ezig ezigVar3 = (ezig) ezifVar.instance;
        evqs evqsVar = this.h;
        evqsVar.getClass();
        ezigVar3.f = evqsVar;
        ezifVar.copyOnWrite();
        ezig ezigVar4 = (ezig) ezifVar.instance;
        ezik ezikVar = this.g;
        ezikVar.getClass();
        ezigVar4.e = ezikVar;
        ezigVar4.b |= 4;
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(bzmz.F, Integer.valueOf(evqsVar.d()));
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/net/handler/CreateRelayPairingRpcHandler", "createRequest", 75, "CreateRelayPairingRpcHandler.java")).q("Pairing included Ditto info and client extensions");
        return eork.i((ezig) ezifVar.build());
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(cezv cezvVar, evuh evuhVar) {
        ezig ezigVar = (ezig) evuhVar;
        eyyh eyyhVarA = cezvVar.c.a();
        fbnd fbndVar = eyyhVarA.a;
        fbrk fbrkVarA = eyyi.b;
        if (fbrkVarA == null) {
            synchronized (eyyi.class) {
                fbrkVarA = eyyi.b;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Pairing", "CreateRelayPairing");
                    fbrhVarA.b();
                    ezig ezigVar2 = ezig.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(ezigVar2);
                    fbrhVarA.b = new fcrh(ezii.a);
                    fbrkVarA = fbrhVarA.a();
                    eyyi.b = fbrkVarA;
                }
            }
        }
        return fcrw.a(fbndVar.a(fbrkVarA, eyyhVarA.b), ezigVar);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture e(evuh evuhVar) {
        ezii eziiVar = (ezii) evuhVar;
        if (eziiVar == null) {
            return eork.h(new IllegalArgumentException("Relay pairing response is null"));
        }
        ezpr ezprVar = eziiVar.c;
        if (ezprVar == null) {
            ezprVar = ezpr.a;
        }
        this.d = ezprVar.b;
        if ((eziiVar.b & 2) == 0) {
            return eork.h(new IllegalArgumentException("Relay pairing response has no ID"));
        }
        ezol ezolVar = eziiVar.d;
        if (ezolVar == null) {
            ezolVar = ezol.a;
        }
        return eork.i(ezolVar);
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "CreateRelayPairingRpcHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.c;
    }

    @Override // defpackage.cfrj
    public final void h(Throwable th) {
        cqca.o("BugleNetwork", "Failed to make RPC call: className=%s requestId=%s, responseId=%d", "CreateRelayPairingRpcHandler", this.c, Long.valueOf(this.d));
        if (cems.a(th) == Status.Code.UNAVAILABLE) {
            this.i.a();
        }
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
