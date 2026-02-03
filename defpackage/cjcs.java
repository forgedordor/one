package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cjcs implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cjjn apply(aubl aublVar) {
        cjjm cjjmVar = (cjjm) cjjn.a.createBuilder();
        b(aublVar, cjjmVar);
        return (cjjn) cjjmVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(aubl aublVar, cjjm cjjmVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
