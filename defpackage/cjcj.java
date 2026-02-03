package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cjcj implements Function {
    public abstract void a(cjgd cjgdVar, aube aubeVar);

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(cjgd cjgdVar, aube aubeVar);

    @Override // java.util.function.Function
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final aubf apply(cjgd cjgdVar) {
        aube aubeVar = (aube) aubf.a.createBuilder();
        a(cjgdVar, aubeVar);
        b(cjgdVar, aubeVar);
        return (aubf) aubeVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
