package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eqev implements Function {
    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ezsb ezsbVar = (ezsb) obj;
        int iOrdinal = ezsbVar.ordinal();
        if (iOrdinal == 0) {
            return eqdm.a;
        }
        if (iOrdinal == 1) {
            return eqdm.b;
        }
        if (iOrdinal == 2) {
            return eqdm.c;
        }
        if (iOrdinal == 3) {
            return eqdm.a;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(ezsbVar))));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
