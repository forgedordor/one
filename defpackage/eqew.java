package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eqew implements Function {
    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ezsd ezsdVar = (ezsd) obj;
        int iOrdinal = ezsdVar.ordinal();
        if (iOrdinal == 0) {
            return eqdn.a;
        }
        if (iOrdinal == 1) {
            return eqdn.b;
        }
        if (iOrdinal == 2) {
            return eqdn.c;
        }
        if (iOrdinal == 3) {
            return eqdn.d;
        }
        if (iOrdinal == 4) {
            return eqdn.a;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(ezsdVar))));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
