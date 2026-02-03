package defpackage;

import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awye {
    public volatile ekhx a = ekon.a;
    public volatile ekgp b = ekoj.a;

    final ekgb a() {
        Stream streamFilter = Collection.EL.stream(this.b.values()).filter(new Predicate() { // from class: awyd
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
                return ((awxn) obj).e().isEmpty();
            }
        });
        int i = ekgb.d;
        return (ekgb) streamFilter.collect(ekcv.a);
    }

    final Optional b(axcm axcmVar) {
        awxn awxnVar = (awxn) this.b.get(axcmVar);
        if (awxnVar != null && awxnVar.e().isPresent()) {
            awxnVar = (awxn) this.b.get(awxnVar.e().get());
        }
        return Optional.ofNullable(awxnVar);
    }

    final void c(Iterable iterable) {
        this.a = ekhx.n(iterable);
    }

    final void d(Iterable iterable) {
        final ekgi ekgiVar = new ekgi();
        Iterable$EL.forEach(iterable, new Consumer() { // from class: awyc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                awxn awxnVar = (awxn) obj;
                ekgiVar.i(awxnVar.b(), awxnVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.b = ekgiVar.c();
    }
}
