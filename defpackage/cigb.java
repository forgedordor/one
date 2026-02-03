package defpackage;

import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cigb {
    public final long a;

    public cigb(long j) {
        this.a = j;
    }

    public static cigb b() {
        return new cifz(0L).a();
    }

    public final cifz a() {
        return new cifz(this.a);
    }

    public final ekgb c() {
        Stream streamFilter = DesugarArrays.stream(ciga.values()).filter(new Predicate() { // from class: cify
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.a.d((ciga) obj);
            }
        });
        int i = ekgb.d;
        return (ekgb) streamFilter.collect(ekcv.a);
    }

    public final boolean d(ciga cigaVar) {
        return (this.a & cigaVar.f) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof cigb) && this.a == ((cigb) obj).a;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a));
    }
}
