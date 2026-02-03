package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cjqo implements evst {
    FI_MULTI_SYNC_STATUS_UNSPECIFIED(0),
    FI_MULTI_SYNC_STATUS_ENABLED(1),
    FI_MULTI_SYNC_STATUS_DISABLED(2),
    UNRECOGNIZED(-1);

    public static final evsu e = new evsu() { // from class: cjqn
        @Override // defpackage.evsu
        public final /* synthetic */ evst a(int i) {
            if (i == 0) {
                return cjqo.FI_MULTI_SYNC_STATUS_UNSPECIFIED;
            }
            if (i == 1) {
                return cjqo.FI_MULTI_SYNC_STATUS_ENABLED;
            }
            if (i != 2) {
                return null;
            }
            return cjqo.FI_MULTI_SYNC_STATUS_DISABLED;
        }
    };
    private final int g;

    cjqo(int i) {
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
