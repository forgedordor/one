package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cjdb implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final auik apply(cjlo cjloVar) {
        auij auijVar = (auij) auik.a.createBuilder();
        b(cjloVar, auijVar);
        c(cjloVar, auijVar);
        return (auik) auijVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(cjlo cjloVar, auij auijVar);

    public abstract void c(cjlo cjloVar, auij auijVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
