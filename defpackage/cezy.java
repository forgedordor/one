package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cezy implements cffr {
    public final cffq a;
    public final long b;
    public final Optional c;
    public final Callable d;
    private final eiju e;
    private final cfrh f;
    private final eosc g;
    private String h = "";
    private long i = 0;

    public cezy(cffq cffqVar, eosc eoscVar, long j, Optional optional, Callable callable, eiju eijuVar, cfrh cfrhVar) {
        this.a = cffqVar;
        this.c = optional;
        this.b = j;
        this.d = callable;
        this.e = eijuVar;
        this.f = cfrhVar;
        this.g = eoscVar;
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.i;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return this.f;
    }

    @Override // defpackage.cfrj
    public final ListenableFuture c(final ezpp ezppVar) {
        this.h = ezppVar.c;
        return this.e.i(new eooz() { // from class: cezw
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ezol ezolVar = (ezol) obj;
                Supplier supplier = new Supplier() { // from class: cezx
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return ezolVar;
                    }
                };
                cezy cezyVar = this.a;
                cffp cffpVarA = cezyVar.a.a(cezyVar.b, cezyVar.c, cezyVar.d, supplier);
                return cffpVarA.b(ezppVar, cffpVarA.a());
            }
        }, this.g);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(cezv cezvVar, evuh evuhVar) {
        return cezvVar.b().a().c((ezll) evuhVar);
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
        this.i = j;
        return eork.i(ezlnVar);
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "RegisterRefreshRpcHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.h;
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
