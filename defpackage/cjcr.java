package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cjcr implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aufh apply(cjjl cjjlVar) {
        aufe aufeVar = (aufe) aufh.b.createBuilder();
        h(cjjlVar, aufeVar);
        f(cjjlVar, aufeVar);
        k(aufeVar);
        e(cjjlVar, aufeVar);
        c(cjjlVar, aufeVar);
        d(cjjlVar, aufeVar);
        b(cjjlVar, aufeVar);
        i(cjjlVar, aufeVar);
        l(aufeVar);
        if ((cjjlVar.b & 1) != 0) {
            j(cjjlVar, aufeVar);
        }
        g(cjjlVar, aufeVar);
        return (aufh) aufeVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(cjjl cjjlVar, aufe aufeVar);

    public abstract void c(cjjl cjjlVar, aufe aufeVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(cjjl cjjlVar, aufe aufeVar);

    public abstract void e(cjjl cjjlVar, aufe aufeVar);

    public abstract void f(cjjl cjjlVar, aufe aufeVar);

    public abstract void g(cjjl cjjlVar, aufe aufeVar);

    public abstract void h(cjjl cjjlVar, aufe aufeVar);

    public abstract void i(cjjl cjjlVar, aufe aufeVar);

    public abstract void j(cjjl cjjlVar, aufe aufeVar);

    public abstract void k(aufe aufeVar);

    public abstract void l(aufe aufeVar);
}
