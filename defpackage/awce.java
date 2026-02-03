package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awce {
    final /* synthetic */ Collection a;
    final /* synthetic */ awch b;

    public awce(awch awchVar, Collection collection) {
        this.a = collection;
        this.b = awchVar;
    }

    public final String toString() {
        Stream stream = Collection.EL.stream(this.a);
        final awch awchVar = this.b;
        Stream map = stream.map(new Function() { // from class: awcd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return awchVar.d((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return ((ekgb) map.collect(ekcv.a)).toString();
    }
}
