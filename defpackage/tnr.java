package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
class tnr implements Function {
    public static eqkj a(aumj aumjVar) {
        int iOrdinal = aumjVar.ordinal();
        if (iOrdinal == 0) {
            return eqkj.ENCRYPTION_STATE_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return eqkj.ENCRYPTION_STATE_ENCRYPTED;
        }
        if (iOrdinal == 2) {
            return eqkj.ENCRYPTION_STATE_NOT_ENCRYPTED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(aumjVar))));
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        throw null;
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        throw null;
    }
}
