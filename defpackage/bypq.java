package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bypq implements bypt {
    @Override // defpackage.bypt
    public final eiju a(ekgb ekgbVar, Optional optional) {
        return eijx.e(new byhd(1, (Map) Collection.EL.stream(ekgbVar).collect(Collectors.toMap(new Function() { // from class: bypm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (byiv) obj;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bypn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new byqt();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new BinaryOperator() { // from class: bypo
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (byqv) obj;
            }
        }, new Supplier() { // from class: bypp
            @Override // java.util.function.Supplier
            public final Object get() {
                return new HashMap();
            }
        }))));
    }

    @Override // defpackage.bypt
    public final /* synthetic */ eiju b(String str, String str2, int i, boolean z) {
        throw new UnsupportedOperationException("NotImplementedYet");
    }

    @Override // defpackage.bypt
    public final eiju c(String str, String str2, int i) {
        return eijx.e(true);
    }
}
