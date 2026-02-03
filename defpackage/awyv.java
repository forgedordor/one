package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awyv {
    public final awxn a;
    private final crny b;

    public awyv(awxn awxnVar, crny crnyVar) {
        this.a = awxnVar;
        this.b = crnyVar;
    }

    public final ekhx a() {
        return this.a.j();
    }

    public final ekhx b() {
        return this.a.c();
    }

    public final Optional c() {
        return this.a.d();
    }

    public final Optional d() {
        Stream map = Collection.EL.stream(this.b.m()).map(new Function() { // from class: awys
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((crof) obj).a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final ekhx ekhxVarA = a();
        ekhxVarA.getClass();
        return map.filter(new Predicate() { // from class: awyt
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
                return ekhxVarA.contains((Integer) obj);
            }
        }).findFirst();
    }

    public final Optional e() {
        return this.a.g();
    }

    public final boolean f() {
        return this.a.i();
    }
}
