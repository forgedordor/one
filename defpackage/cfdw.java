package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfdw implements cfrj {
    private final cqls a;
    private String b = "";
    private long c = 0;
    private final fcsu d;
    private final cfgi e;

    public cfdw(cqls cqlsVar, fcsu fcsuVar, cfgi cfgiVar) {
        this.a = cqlsVar;
        this.d = fcsuVar;
        this.e = cfgiVar;
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.c;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return cfrh.d;
    }

    @Override // defpackage.cfrj
    public final ListenableFuture c(ezpp ezppVar) {
        bvio bvioVar = (bvio) this.d.b();
        cqlp cqlpVar = (cqlp) this.a;
        bvioVar.c(cqlpVar.c, ezppVar.c);
        this.b = ezppVar.c;
        ezix ezixVar = (ezix) eziy.a.createBuilder();
        ezixVar.copyOnWrite();
        eziy eziyVar = (eziy) ezixVar.instance;
        ezppVar.getClass();
        eziyVar.c = ezppVar;
        eziyVar.b |= 1;
        evqs evqsVarX = evqs.x(cqlpVar.a);
        ezixVar.copyOnWrite();
        ((eziy) ezixVar.instance).d = evqsVarX;
        return eork.i((eziy) ezixVar.build());
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(cezv cezvVar, evuh evuhVar) {
        eziy eziyVar = (eziy) evuhVar;
        eyyh eyyhVarA = cezvVar.c.a();
        fbnd fbndVar = eyyhVarA.a;
        fbrk fbrkVarA = eyyi.a;
        if (fbrkVarA == null) {
            synchronized (eyyi.class) {
                fbrkVarA = eyyi.a;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Pairing", "GetPairingData");
                    fbrhVarA.b();
                    eziy eziyVar2 = eziy.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(eziyVar2);
                    fbrhVarA.b = new fcrh(ezja.a);
                    fbrkVarA = fbrhVarA.a();
                    eyyi.a = fbrkVarA;
                }
            }
        }
        return fcrw.a(fbndVar.a(fbrkVarA, eyyhVarA.b), eziyVar);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture e(evuh evuhVar) {
        ezja ezjaVar = (ezja) evuhVar;
        if (ezjaVar == null) {
            return eork.h(new IllegalArgumentException("Pairing response is null"));
        }
        ezpr ezprVar = ezjaVar.c;
        if (ezprVar == null) {
            ezprVar = ezpr.a;
        }
        this.c = ezprVar.b;
        if ((ezjaVar.b & 2) == 0) {
            return eork.h(new IllegalArgumentException("Pairing response has no ID"));
        }
        byte[] bArrI = ezjaVar.d.I();
        if (bArrI == null) {
            return eork.h(new IllegalArgumentException("Paring payload is null"));
        }
        try {
            cqca.c("Bugle", "Retrieved pairing data.");
            return eork.i(ezjaVar);
        } catch (evtj unused) {
            return eork.h(new IllegalArgumentException("Failed to parse payload data"));
        }
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "GetPairingDataRpcHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.b;
    }

    @Override // defpackage.cfrj
    public final void h(Throwable th) {
        cqca.o("BugleNetwork", "Failed to make RPC call: className=%s requestId=%s, responseId=%d", "GetPairingDataRpcHandler", this.b, Long.valueOf(this.c));
        if (cems.a(th) == Status.Code.UNAVAILABLE) {
            this.e.a();
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
