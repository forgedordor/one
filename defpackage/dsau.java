package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsau extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        etjn etjnVar = (etjn) obj;
        int iOrdinal = etjnVar.ordinal();
        if (iOrdinal == 0) {
            return evoo.ACTION_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return evoo.ACTION_POSITIVE;
        }
        if (iOrdinal == 2) {
            return evoo.ACTION_NEGATIVE;
        }
        if (iOrdinal == 3) {
            return evoo.ACTION_DISMISS;
        }
        if (iOrdinal == 4) {
            return evoo.ACTION_ACKNOWLEDGE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(etjnVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evoo evooVar = (evoo) obj;
        int iOrdinal = evooVar.ordinal();
        if (iOrdinal == 0) {
            return etjn.ACTION_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return etjn.ACTION_POSITIVE;
        }
        if (iOrdinal == 2) {
            return etjn.ACTION_NEGATIVE;
        }
        if (iOrdinal == 3) {
            return etjn.ACTION_DISMISS;
        }
        if (iOrdinal == 4) {
            return etjn.ACTION_ACKNOWLEDGE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evooVar.toString()));
    }
}
