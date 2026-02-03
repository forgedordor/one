package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsic implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evnq evnqVar = (evnq) obj;
        int iOrdinal = evnqVar.ordinal();
        if (iOrdinal == 0) {
            return etgd.ANDROID_PERMISSION_TYPE_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return etgd.ANDROID_POST_NOTIFICATIONS;
        }
        if (iOrdinal == 2) {
            return etgd.ANDROID_CAMERA;
        }
        if (iOrdinal == 3) {
            return etgd.ANDROID_ACCESS_FINE_LOCATION;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(evnqVar))));
    }
}
