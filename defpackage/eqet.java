package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eqet implements Function {
    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ezsa ezsaVar = (ezsa) obj;
        int iOrdinal = ezsaVar.ordinal();
        if (iOrdinal == 0) {
            return eqdk.a;
        }
        if (iOrdinal == 1) {
            return eqdk.b;
        }
        if (iOrdinal == 2) {
            return eqdk.c;
        }
        if (iOrdinal == 3) {
            return eqdk.a;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(ezsaVar))));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
