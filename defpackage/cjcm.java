package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cjcm implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final auch apply(cjgt cjgtVar) {
        aucg aucgVar = (aucg) auch.a.createBuilder();
        b(cjgtVar, aucgVar);
        c(cjgtVar, aucgVar);
        d(cjgtVar, aucgVar);
        e(aucgVar);
        return (auch) aucgVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(cjgt cjgtVar, aucg aucgVar);

    public abstract void c(cjgt cjgtVar, aucg aucgVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(cjgt cjgtVar, aucg aucgVar);

    public abstract void e(aucg aucgVar);
}
