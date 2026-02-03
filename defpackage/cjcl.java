package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cjcl implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cjgx apply(auce auceVar) {
        cjgw cjgwVar = (cjgw) cjgx.a.createBuilder();
        d(auceVar, cjgwVar);
        int i = auceVar.b;
        b(auceVar, cjgwVar);
        if ((auceVar.b & 2) != 0) {
            String str = auceVar.d;
            cjgwVar.copyOnWrite();
            cjgx cjgxVar = (cjgx) cjgwVar.instance;
            str.getClass();
            cjgxVar.b |= 8;
            cjgxVar.e = str;
        }
        c(auceVar, cjgwVar);
        return (cjgx) cjgwVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(auce auceVar, cjgw cjgwVar);

    public abstract void c(auce auceVar, cjgw cjgwVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(auce auceVar, cjgw cjgwVar);
}
