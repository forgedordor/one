package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cjdc implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cjma apply(auip auipVar) {
        cjlz cjlzVar = (cjlz) cjma.a.createBuilder();
        c(auipVar, cjlzVar);
        int i = auipVar.b;
        b(auipVar, cjlzVar);
        if ((auipVar.b & 2) != 0) {
            String str = auipVar.d;
            cjlzVar.copyOnWrite();
            cjma cjmaVar = (cjma) cjlzVar.instance;
            str.getClass();
            cjmaVar.b |= 8;
            cjmaVar.e = str;
        }
        return (cjma) cjlzVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(auip auipVar, cjlz cjlzVar);

    public abstract void c(auip auipVar, cjlz cjlzVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
