package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
class tnt implements Function {
    public static eqkm a(cpyo cpyoVar) {
        int iOrdinal = cpyoVar.ordinal();
        if (iOrdinal == 0) {
            return eqkm.FEATURE_TYPE_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return eqkm.FEATURE_TYPE_MULTI_DEVICE;
        }
        if (iOrdinal == 2) {
            return eqkm.FEATURE_TYPE_BACKUP_AND_RESTORE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(cpyoVar))));
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
