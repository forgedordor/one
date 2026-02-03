package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebip {
    private final fgya a;
    private final int b;

    public ebip(int i) {
        this.a = null;
        this.b = i;
    }

    private final boolean c() {
        return this.a == null;
    }

    final int a() {
        return c() ? this.b : this.a.a();
    }

    final List b(final Class cls) {
        if (c()) {
            throw new IllegalStateException("expected non-legacy LookupProxy");
        }
        fgzh[] fgzhVarArrE = this.a.e();
        if (fgzhVarArrE != null) {
            return (List) DesugarArrays.stream(fgzhVarArrE).filter(new Predicate() { // from class: ebin
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
                    return ((fgzh) obj) != null;
                }
            }).map(new Function() { // from class: ebio
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (fgzh) cls.cast((fgzh) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList());
        }
        int i = ekgb.d;
        return ekoe.a;
    }

    public ebip(fgya fgyaVar) {
        this.a = fgyaVar;
        this.b = -1;
    }
}
