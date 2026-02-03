package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class caye {
    private static final cqce d = cqce.g("BugleWorkQueue", "ExecutionState");
    public String a;
    public Future c;
    private final long e;
    public final SettableFuture b = SettableFuture.create();
    private cayd f = cayd.PENDING;

    public caye(long j) {
        this.e = j;
    }

    final void a() {
        Future future = this.c;
        if (future != null) {
            future.cancel(true);
        }
    }

    public final void b() {
        this.b.set(cbcw.k());
    }

    final void c(cayd caydVar) {
        cqbd cqbdVarD = d.d();
        cqbdVarD.I("setting execution state");
        long j = this.e;
        cqbdVarD.z("rowId", j);
        cqbdVarD.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, this.a);
        cqbdVarD.A("fromState", this.f);
        cqbdVarD.A("toState", caydVar);
        cqbdVarD.r();
        if (this.f == caydVar) {
            return;
        }
        int iOrdinal = caydVar.ordinal();
        if (iOrdinal != 0 && (iOrdinal == 1 ? this.f == cayd.UNKNOWN : !(iOrdinal == 2 ? this.f != cayd.PENDING : iOrdinal == 3 ? this.f != cayd.SUBMITTED : iOrdinal == 4 && this.f != cayd.EXECUTING))) {
            this.f = caydVar;
            return;
        }
        throw new IllegalStateException("illegal state transition from " + String.valueOf(this.f) + " to " + String.valueOf(caydVar) + " for id " + j);
    }

    final boolean d(cayd caydVar) {
        return this.f == caydVar;
    }

    public final String toString() {
        return "{" + this.a + "; " + String.valueOf(this.f) + "}";
    }
}
