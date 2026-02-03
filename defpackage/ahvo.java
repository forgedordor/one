package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahvo implements Function {
    public static final ahvo a = new ahvo();

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        btsm btsmVar = (btsm) obj;
        btsmVar.b(btsp.a);
        return btsmVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
