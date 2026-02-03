package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cffz implements cfrj {
    public final bvkr a;
    public final ezol b;
    private final eosc c;
    private String d = "";
    private long e = 0;

    public cffz(bvkr bvkrVar, eosc eoscVar, ezol ezolVar) {
        this.a = bvkrVar;
        this.c = eoscVar;
        this.b = ezolVar;
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.e;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return cfrh.d;
    }

    @Override // defpackage.cfrj
    public final ListenableFuture c(ezpp ezppVar) {
        this.d = ezppVar.c;
        ezme ezmeVar = (ezme) ezmf.a.createBuilder();
        ezmeVar.copyOnWrite();
        ezmf ezmfVar = (ezmf) ezmeVar.instance;
        ezppVar.getClass();
        ezmfVar.c = ezppVar;
        ezmfVar.b |= 1;
        ezmeVar.copyOnWrite();
        ezmf ezmfVar2 = (ezmf) ezmeVar.instance;
        ezmfVar2.d = this.b;
        ezmfVar2.b |= 2;
        return eork.i((ezmf) ezmeVar.build());
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(final cezv cezvVar, evuh evuhVar) {
        final ezmf ezmfVar = (ezmf) evuhVar;
        return eijx.g(new Callable() { // from class: cffx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cffz cffzVar = this.a;
                return Boolean.valueOf(cffzVar.a.t(cffzVar.b));
            }
        }, this.c).i(new eooz() { // from class: cffy
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eyyh eyyhVarA = cezvVar.c.a();
                fbnd fbndVar = eyyhVarA.a;
                fbrk fbrkVarA = eyyi.c;
                if (fbrkVarA == null) {
                    synchronized (eyyi.class) {
                        fbrkVarA = eyyi.c;
                        if (fbrkVarA == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Pairing", "RevokeRelayPairing");
                            fbrhVarA.b();
                            ezmf ezmfVar2 = ezmf.a;
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(ezmfVar2);
                            fbrhVarA.b = new fcrh(ezmh.a);
                            fbrkVarA = fbrhVarA.a();
                            eyyi.c = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVarA, eyyhVarA.b), ezmfVar);
            }
        }, eoqg.a);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture e(evuh evuhVar) {
        long j;
        ezmh ezmhVar = (ezmh) evuhVar;
        if (ezmhVar != null) {
            ezpr ezprVar = ezmhVar.b;
            if (ezprVar == null) {
                ezprVar = ezpr.a;
            }
            j = ezprVar.b;
        } else {
            j = 0;
        }
        this.e = j;
        cqca.c("BugleNetwork", "Unpaired successfully");
        return eijx.e(ezmhVar);
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "RevokeRelayPairingRpcHandler";
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

    @Override // defpackage.cfxa
    public final void k() {
    }

    @Override // defpackage.cfxa
    public final /* synthetic */ void l() {
    }
}
