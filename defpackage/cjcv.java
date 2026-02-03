package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cjcv implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cjkq apply(augo augoVar) {
        cjkp cjkpVar = (cjkp) cjkq.a.createBuilder();
        c(augoVar, cjkpVar);
        b(augoVar, cjkpVar);
        d(augoVar, cjkpVar);
        return (cjkq) cjkpVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(augo augoVar, cjkp cjkpVar);

    public abstract void c(augo augoVar, cjkp cjkpVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(augo augoVar, cjkp cjkpVar);
}
