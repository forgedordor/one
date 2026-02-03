package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cjcy implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final augz apply(cjlc cjlcVar) {
        augy augyVar = (augy) augz.a.createBuilder();
        b(cjlcVar, augyVar);
        c(cjlcVar, augyVar);
        e(augyVar);
        if ((cjlcVar.b & 32) != 0) {
            boolean z = cjlcVar.h;
            augyVar.copyOnWrite();
            augz augzVar = (augz) augyVar.instance;
            augzVar.b |= 8;
            augzVar.f = z;
        }
        d(cjlcVar, augyVar);
        f(augyVar);
        return (augz) augyVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(cjlc cjlcVar, augy augyVar);

    public abstract void c(cjlc cjlcVar, augy augyVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(cjlc cjlcVar, augy augyVar);

    public abstract void e(augy augyVar);

    public abstract void f(augy augyVar);
}
