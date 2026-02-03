package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cjcu implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final augk apply(cjjy cjjyVar) {
        augj augjVar = (augj) augk.a.createBuilder();
        b(cjjyVar, augjVar);
        c(cjjyVar, augjVar);
        return (augk) augjVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(cjjy cjjyVar, augj augjVar);

    public abstract void c(cjjy cjjyVar, augj augjVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
