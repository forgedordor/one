package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cjda implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cjls apply(auii auiiVar) {
        cjlr cjlrVar = (cjlr) cjls.a.createBuilder();
        c(auiiVar, cjlrVar);
        b(auiiVar, cjlrVar);
        return (cjls) cjlrVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(auii auiiVar, cjlr cjlrVar);

    public abstract void c(auii auiiVar, cjlr cjlrVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
