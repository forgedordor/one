package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cjcw implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final augq apply(cjkm cjkmVar) {
        augp augpVar = (augp) augq.a.createBuilder();
        b(cjkmVar, augpVar);
        c(cjkmVar, augpVar);
        return (augq) augpVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(cjkm cjkmVar, augp augpVar);

    public abstract void c(cjkm cjkmVar, augp augpVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
