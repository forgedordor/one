package defpackage;

import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awkt implements Function {
    final /* synthetic */ Set a;

    public awkt(Set set) {
        this.a = set;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        awkn awknVar = (awkn) obj;
        ekfw ekfwVar = new ekfw();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ekfwVar.h(String.valueOf(awjm.b((awjl) it.next())));
        }
        awknVar.ap(new dqpm("destinations.token", 3, awkn.as(ekfwVar.g()), false));
        return awknVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
