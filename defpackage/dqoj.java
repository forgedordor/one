package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqoj extends dqrb {
    public final Supplier a;
    public final Supplier b;
    public final Supplier c;
    public final Supplier d;
    public final Supplier e;
    public final Supplier f;
    public final Supplier g;
    public final Supplier h;
    public final Supplier i;
    public final boolean j;
    public final Supplier k;
    private final Supplier l;
    private final Supplier m;
    private final Supplier n;
    private final Supplier o;
    private final Supplier p;
    private final Supplier q;
    private final elvg r;

    public dqoj(Supplier supplier, Supplier supplier2, Supplier supplier3, Supplier supplier4, Supplier supplier5, Supplier supplier6, Supplier supplier7, Supplier supplier8, Supplier supplier9, Supplier supplier10, Supplier supplier11, Supplier supplier12, Supplier supplier13, boolean z, Supplier supplier14, Supplier supplier15, Supplier supplier16, elvg elvgVar) {
        this.a = supplier;
        this.b = supplier2;
        this.l = supplier3;
        this.c = supplier4;
        this.d = supplier5;
        this.m = supplier6;
        this.e = supplier7;
        this.n = supplier8;
        this.o = supplier9;
        this.f = supplier10;
        this.g = supplier11;
        this.h = supplier12;
        this.i = supplier13;
        this.j = z;
        this.k = supplier14;
        this.p = supplier15;
        this.q = supplier16;
        this.r = elvgVar;
    }

    @Override // defpackage.dqrb
    public final elvg a() {
        return this.r;
    }

    @Override // defpackage.dqrb
    public final Supplier b() {
        return this.o;
    }

    @Override // defpackage.dqrb
    public final Supplier c() {
        return this.i;
    }

    @Override // defpackage.dqrb
    public final Supplier d() {
        return this.e;
    }

    @Override // defpackage.dqrb
    public final Supplier e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqrb) {
            dqrb dqrbVar = (dqrb) obj;
            if (this.a.equals(dqrbVar.g()) && this.b.equals(dqrbVar.i()) && this.l.equals(dqrbVar.k()) && this.c.equals(dqrbVar.o()) && this.d.equals(dqrbVar.h()) && this.m.equals(dqrbVar.n()) && this.e.equals(dqrbVar.d()) && this.n.equals(dqrbVar.j()) && this.o.equals(dqrbVar.b()) && this.f.equals(dqrbVar.e()) && this.g.equals(dqrbVar.m()) && this.h.equals(dqrbVar.q()) && this.i.equals(dqrbVar.c()) && this.j == dqrbVar.r() && this.k.equals(dqrbVar.f()) && this.p.equals(dqrbVar.l()) && this.q.equals(dqrbVar.p()) && this.r.equals(dqrbVar.a())) {
                dqrbVar.t();
                dqrbVar.s();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dqrb
    public final Supplier f() {
        return this.k;
    }

    @Override // defpackage.dqrb
    public final Supplier g() {
        return this.a;
    }

    @Override // defpackage.dqrb
    public final Supplier h() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    @Override // defpackage.dqrb
    public final Supplier i() {
        return this.b;
    }

    @Override // defpackage.dqrb
    public final Supplier j() {
        return this.n;
    }

    @Override // defpackage.dqrb
    public final Supplier k() {
        return this.l;
    }

    @Override // defpackage.dqrb
    public final Supplier l() {
        return this.p;
    }

    @Override // defpackage.dqrb
    public final Supplier m() {
        return this.g;
    }

    @Override // defpackage.dqrb
    public final Supplier n() {
        return this.m;
    }

    @Override // defpackage.dqrb
    public final Supplier o() {
        return this.c;
    }

    @Override // defpackage.dqrb
    public final Supplier p() {
        return this.q;
    }

    @Override // defpackage.dqrb
    public final Supplier q() {
        return this.h;
    }

    @Override // defpackage.dqrb
    public final boolean r() {
        return this.j;
    }

    public final String toString() {
        elvg elvgVar = this.r;
        Supplier supplier = this.q;
        Supplier supplier2 = this.p;
        Supplier supplier3 = this.k;
        Supplier supplier4 = this.i;
        Supplier supplier5 = this.h;
        Supplier supplier6 = this.g;
        Supplier supplier7 = this.f;
        Supplier supplier8 = this.o;
        Supplier supplier9 = this.n;
        Supplier supplier10 = this.e;
        Supplier supplier11 = this.m;
        Supplier supplier12 = this.d;
        Supplier supplier13 = this.c;
        Supplier supplier14 = this.l;
        Supplier supplier15 = this.b;
        return "D26rConfiguration{enforceCheckInitializedSupplier=" + this.a.toString() + ", enforceThreadChecksOnCursorsSupplier=" + supplier15.toString() + ", omitUnchangedRowsFromUpdatesByDefaultSupplier=" + supplier14.toString() + ", throwOnExtractBindDatasArrayLengthCheckSupplier=" + supplier13.toString() + ", enforceConcurrentCursorModificationDurinBindSupplier=" + supplier12.toString() + ", suppressPhantomRowsByDefaultSupplier=" + supplier11.toString() + ", catchBulkInsertThrowablesSupplier=" + supplier10.toString() + ", observableQueryOnReadyKillSwitch=" + supplier9.toString() + ", addIdsToBindDataInBulkInsertSupplier=" + supplier8.toString() + ", enableDbOverridesSupplier=" + supplier7.toString() + ", readExecutor=" + supplier6.toString() + ", writeExecutor=" + supplier5.toString() + ", blockingExecutor=" + supplier4.toString() + ", isPrimaryProcess=" + this.j + ", enableQueryCaching=" + supplier3.toString() + ", queryCacheSize=" + supplier2.toString() + ", timeNanosSupplier=" + supplier.toString() + ", buildFlavor=" + elvgVar.toString() + ", moveObservableQueryTriggeringToDatabaseInterface=false, enableObservableQueryTrackerV2=false}";
    }

    @Override // defpackage.dqrb
    public final void s() {
    }

    @Override // defpackage.dqrb
    public final void t() {
    }
}
