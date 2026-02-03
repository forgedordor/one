package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsia extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        etli etliVar = (etli) obj;
        int iOrdinal = etliVar.ordinal();
        if (iOrdinal == 0) {
            return evlj.USER_ACTION_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return evlj.USER_ACTION_POSITIVE;
        }
        if (iOrdinal == 2) {
            return evlj.USER_ACTION_NEGATIVE;
        }
        if (iOrdinal == 3) {
            return evlj.USER_ACTION_DISMISS;
        }
        if (iOrdinal == 4) {
            return evlj.USER_ACTION_ACKNOWLEDGE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(etliVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evlj evljVar = (evlj) obj;
        int iOrdinal = evljVar.ordinal();
        if (iOrdinal == 0) {
            return etli.ACTION_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return etli.ACTION_POSITIVE;
        }
        if (iOrdinal == 2) {
            return etli.ACTION_NEGATIVE;
        }
        if (iOrdinal == 3) {
            return etli.ACTION_DISMISS;
        }
        if (iOrdinal == 4) {
            return etli.ACTION_ACKNOWLEDGE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evljVar.toString()));
    }
}
