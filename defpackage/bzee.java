package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzee implements Function {
    final /* synthetic */ Collection a;

    public bzee(Collection collection) {
        this.a = collection;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        brec brecVar = (brec) obj;
        brecVar.t(ekgb.n((Collection) Collection.EL.stream(this.a).map(new barv()).collect(Collectors.toCollection(new barw()))));
        return brecVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
