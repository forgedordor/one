package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class txh extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eqna eqnaVar = (eqna) obj;
        int iOrdinal = eqnaVar.ordinal();
        if (iOrdinal == 0) {
            return eplv.NOT_SET;
        }
        if (iOrdinal == 1) {
            return eplv.DISABLED;
        }
        if (iOrdinal == 2) {
            return eplv.ENABLED;
        }
        if (iOrdinal == 3) {
            return eplv.ENABLING;
        }
        if (iOrdinal == 4) {
            return eplv.UNRECOGNIZED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eqnaVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eplv eplvVar = (eplv) obj;
        int iOrdinal = eplvVar.ordinal();
        if (iOrdinal == 0) {
            return eqna.MULTI_DEVICE_STATE_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return eqna.DISABLED;
        }
        if (iOrdinal == 2) {
            return eqna.ENABLED;
        }
        if (iOrdinal == 3) {
            return eqna.ENABLING;
        }
        if (iOrdinal == 4) {
            return eqna.UNRECOGNIZED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eplvVar.toString()));
    }
}
