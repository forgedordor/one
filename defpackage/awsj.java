package defpackage;

import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awsj implements Function {
    final /* synthetic */ List a;

    public awsj(List list) {
        this.a = list;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        awsd awsdVar = (awsd) obj;
        ekfw ekfwVar = new ekfw();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ekfwVar.h(String.valueOf(awjm.b((awjl) it.next())));
        }
        awsdVar.ap(new dqpm("groups.token", 3, awsd.as(ekfwVar.g()), false));
        return awsdVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
