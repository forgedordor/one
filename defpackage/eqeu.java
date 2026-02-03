package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eqeu implements Function {
    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ezsc ezscVar = (ezsc) obj;
        int iOrdinal = ezscVar.ordinal();
        if (iOrdinal == 0) {
            return eqdl.a;
        }
        if (iOrdinal == 1) {
            return eqdl.b;
        }
        if (iOrdinal == 2) {
            return eqdl.c;
        }
        if (iOrdinal == 3) {
            return eqdl.a;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(ezscVar))));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
