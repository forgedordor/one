package defpackage;

import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfwa extends HashMap {
    private final dfvs a;

    public dfwa(dfvs dfvsVar) {
        this.a = dfvsVar;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dgzn put(String str, dgzn dgznVar) {
        if (dfog.H()) {
            Optional optionalFilter = this.a.a.k().map(new Function() { // from class: dfvp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((dgiq) obj).o();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: dfvq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((InstantMessageConfiguration) obj).mMaxConcurrentSession);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).filter(new Predicate() { // from class: dfvr
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
                    return ((Integer) obj).intValue() > 0;
                }
            });
            while (optionalFilter.isPresent() && size() >= ((Integer) optionalFilter.get()).intValue()) {
                Map.Entry entry = (Map.Entry) Collection.EL.stream(entrySet()).min(Comparator.CC.comparing(new Function() { // from class: dfvz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(((dgzn) ((Map.Entry) obj).getValue()).M);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                })).get();
                dgzn dgznVar2 = (dgzn) entry.getValue();
                dgznVar2.n(9, 68);
                remove(entry.getKey());
                dhja.q("The max session limit is exceeded. Stopping least recently active session id: %s", dhiz.GENERIC.c(dgznVar2.k));
            }
        }
        return (dgzn) super.put(str, dgznVar);
    }
}
