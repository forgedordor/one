package defpackage;

import j$.util.function.Function$CC;
import java.util.Collection;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzcy implements Function {
    final /* synthetic */ Collection a;

    public bzcy(Collection collection) {
        this.a = collection;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        botl botlVar = (botl) obj;
        botlVar.u(barn.d(this.a));
        return botlVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
