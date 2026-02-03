package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cjci implements Function {
    public abstract void a(aubd aubdVar, cjgg cjggVar);

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(aubd aubdVar, cjgg cjggVar);

    public abstract void c(aubd aubdVar, cjgg cjggVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final cjgh apply(aubd aubdVar) {
        cjgg cjggVar = (cjgg) cjgh.a.createBuilder();
        b(aubdVar, cjggVar);
        int i = aubdVar.b;
        a(aubdVar, cjggVar);
        c(aubdVar, cjggVar);
        return (cjgh) cjggVar.build();
    }
}
