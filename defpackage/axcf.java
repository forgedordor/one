package defpackage;

import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axcf implements Function {
    final /* synthetic */ Iterable a;

    public axcf(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        axax axaxVar = (axax) obj;
        ekfw ekfwVar = new ekfw();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ekfwVar.h(String.valueOf(axcn.b((axcm) it.next())));
        }
        axaxVar.ap(new dqpm("my_identities.token", 3, axax.as(ekfwVar.g()), false));
        return axaxVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
