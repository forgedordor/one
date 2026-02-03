package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eayr {
    public static eayr b(List list) {
        return new eaxl(ekgb.n(list));
    }

    public abstract ekgb a();

    final String c() {
        return (String) Collection.EL.stream(a()).map(new Function() { // from class: eayp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Integer) obj).toString();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(","));
    }
}
