package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class txg implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        auml aumlVar = (auml) obj;
        switch (aumlVar) {
            case UNSPECIFIED_STATUS:
                return eqna.MULTI_DEVICE_STATE_UNSPECIFIED;
            case ENABLED:
                return eqna.ENABLED;
            case ENABLING:
                return eqna.ENABLING;
            case ENABLE_FAILED:
                return eqna.MULTI_DEVICE_STATE_UNSPECIFIED;
            case DISABLED:
                return eqna.DISABLED;
            case DISABLING:
                return eqna.MULTI_DEVICE_STATE_UNSPECIFIED;
            case DISABLE_FAILED:
                return eqna.MULTI_DEVICE_STATE_UNSPECIFIED;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(aumlVar))));
        }
    }
}
