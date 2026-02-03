package defpackage;

import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acam extends dyhv {
    final /* synthetic */ acan a;

    public acam(acan acanVar) {
        this.a = acanVar;
    }

    @Override // defpackage.dyhv
    public final void a() {
        ecem.c();
        b(Collection.EL.stream((Set) this.a.c.b()).allMatch(new Predicate() { // from class: acak
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
                return ((bvmk) obj).c();
            }
        }));
    }
}
