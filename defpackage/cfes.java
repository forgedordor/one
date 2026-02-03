package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfes implements cffr {
    public static final cepp a = cepp.c("Bugle.PhoneRegisterRefreshRpc.Response");
    public final fcsu b;
    public final cepq c;
    private final cffq d;
    private final cexn e;
    private final alrj f;
    private final long g;
    private final Optional h;
    private final Callable i;
    private final Supplier j;
    private final cfre k;
    private final fcsu l;
    private String m = "";
    private long n = 0;

    static {
        eksp.c("BugleNetwork");
    }

    public cfes(cffq cffqVar, cexn cexnVar, cepq cepqVar, alrj alrjVar, fcsu fcsuVar, fcsu fcsuVar2, long j, Optional optional, Callable callable, Supplier supplier, cfre cfreVar) {
        this.b = fcsuVar;
        this.d = cffqVar;
        this.e = cexnVar;
        this.f = alrjVar;
        this.l = fcsuVar2;
        this.g = j;
        this.h = optional;
        this.i = callable;
        this.j = supplier;
        this.k = cfreVar;
        this.c = cepqVar;
    }

    public static cevq m(ezlj ezljVar) {
        evsx evsxVar = ezljVar.k;
        Integer numValueOf = Integer.valueOf(cefn.ETOUFFEE.h);
        if (!evsxVar.contains(numValueOf)) {
            ezuu ezuuVar = ezljVar.l;
            if (ezuuVar == null) {
                ezuuVar = ezuu.a;
            }
            if (!ezuuVar.b.contains(numValueOf)) {
                return cevq.REGISTERED_WITHOUT_PREKEYS;
            }
        }
        return cevq.REGISTERED_WITH_PREKEYS;
    }

    public static Optional n(ezlj ezljVar) {
        if ((ezljVar.b & 16) == 0) {
            return Optional.empty();
        }
        eznz eznzVar = ezljVar.m;
        if (eznzVar == null) {
            eznzVar = eznz.a;
        }
        return Optional.of(eznzVar);
    }

    public static Optional o(ezlj ezljVar) {
        if ((ezljVar.b & 8) == 0) {
            return Optional.empty();
        }
        ezuu ezuuVar = ezljVar.l;
        if (ezuuVar == null) {
            ezuuVar = ezuu.a;
        }
        return Optional.of(ezuuVar);
    }

    public static Optional p(ezlj ezljVar) {
        if ((ezljVar.b & 128) == 0) {
            return Optional.empty();
        }
        ezoc ezocVar = ezljVar.o;
        if (ezocVar == null) {
            ezocVar = ezoc.b;
        }
        return Optional.of(ezocVar);
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.n;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return this.k;
    }

    @Override // defpackage.cfrj
    public final ListenableFuture c(ezpp ezppVar) {
        this.m = ezppVar.c;
        cffp cffpVarA = this.d.a(this.g, this.h, this.i, this.j);
        alqm alqmVarR = this.f.r(q());
        cfgr cfgrVarA = cffpVarA.a();
        cfgrVarA.i();
        cfgrVarA.h();
        cfgrVarA.g(alqmVarR, 2);
        cfgrVarA.e(alqmVarR);
        cfgrVarA.f(alqmVarR);
        return cffpVarA.b(ezppVar, cfgrVarA);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(final cezv cezvVar, evuh evuhVar) {
        final ezll ezllVar = (ezll) evuhVar;
        final cexm cexmVarA = this.e.a(q());
        final ezlj ezljVar = ezllVar.h;
        if (ezljVar == null) {
            ezljVar = ezlj.a;
        }
        eiju eijuVarI = cexmVarA.i();
        eooz eoozVar = new eooz() { // from class: cfeq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cevq cevqVar;
                ezlj ezljVar2 = ezljVar;
                cevq cevqVar2 = (cevq) obj;
                cevq cevqVarM = cfes.m(ezljVar2);
                if (cevqVarM == cevq.REGISTERED_WITHOUT_PREKEYS && cevqVar2 == (cevqVar = cevq.REGISTERED_WITH_PREKEYS)) {
                    cevqVarM = cevqVar;
                }
                return cexmVarA.o(cevqVarM, cfes.p(ezljVar2), cfes.n(ezljVar2), cfes.o(ezljVar2));
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarI.i(eoozVar, eoqgVar).i(new eooz() { // from class: cfer
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cfes cfesVar = this.a;
                ezol ezolVarB = cnln.b(((asqx) cfesVar.b.b()).c(cfesVar.q()));
                cezv cezvVar2 = cezvVar;
                return cfesVar.c.a(cfes.a, cezvVar2.d(ezolVarB).f(ezllVar));
            }
        }, eoqgVar);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture e(evuh evuhVar) {
        long j;
        ezln ezlnVar = (ezln) evuhVar;
        if (ezlnVar != null) {
            ezpr ezprVar = ezlnVar.c;
            if (ezprVar == null) {
                ezprVar = ezpr.a;
            }
            j = ezprVar.b;
        } else {
            j = 0;
        }
        this.n = j;
        return eork.i(ezlnVar);
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "PhoneRegisterRefreshRpcHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.m;
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

    public final String q() {
        cfep cfepVar = (cfep) this.l.b();
        String str = this.k.b;
        cfepVar.a(str, 2);
        return str;
    }

    @Override // defpackage.cfxa
    public final void k() {
    }

    @Override // defpackage.cfxa
    public final /* synthetic */ void l() {
    }
}
