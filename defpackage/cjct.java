package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cjct implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cjkc apply(augi augiVar) {
        cjkb cjkbVar = (cjkb) cjkc.a.createBuilder();
        c(augiVar, cjkbVar);
        int i = augiVar.b;
        b(augiVar, cjkbVar);
        d(augiVar, cjkbVar);
        return (cjkc) cjkbVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(augi augiVar, cjkb cjkbVar);

    public abstract void c(augi augiVar, cjkb cjkbVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(augi augiVar, cjkb cjkbVar);
}
