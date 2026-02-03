package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cjdd implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final auis apply(cjlw cjlwVar) {
        auir auirVar = (auir) auis.a.createBuilder();
        b(cjlwVar, auirVar);
        c(cjlwVar, auirVar);
        return (auis) auirVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(cjlw cjlwVar, auir auirVar);

    public abstract void c(cjlw cjlwVar, auir auirVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
