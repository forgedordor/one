package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cjxp implements evst {
    RCS_SUCCESS_NOTIFICATION_STATE_UNSPECIFIED(0),
    RCS_SUCCESS_NOTIFICATION_STATE_SUCCESS_AWAITING_NOTIFY(1),
    RCS_SUCCESS_NOTIFICATION_STATE_NOTIFIED(2),
    UNRECOGNIZED(-1);

    public static final evsu e = new evsu() { // from class: cjxo
        @Override // defpackage.evsu
        public final /* synthetic */ evst a(int i) {
            if (i == 0) {
                return cjxp.RCS_SUCCESS_NOTIFICATION_STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return cjxp.RCS_SUCCESS_NOTIFICATION_STATE_SUCCESS_AWAITING_NOTIFY;
            }
            if (i != 2) {
                return null;
            }
            return cjxp.RCS_SUCCESS_NOTIFICATION_STATE_NOTIFIED;
        }
    };
    private final int g;

    cjxp(int i) {
        this.g = i;
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
