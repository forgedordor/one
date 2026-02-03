package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eqli implements evst {
    INITIAL_SYNC_STATE_UNSPECIFIED(0),
    RESTORE(1),
    BACKUP(2),
    FAILED(4),
    COMPLETE(100),
    UNRECOGNIZED(-1);

    private final int h;

    eqli(int i) {
        this.h = i;
    }

    public static eqli b(int i) {
        if (i == 0) {
            return INITIAL_SYNC_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return RESTORE;
        }
        if (i == 2) {
            return BACKUP;
        }
        if (i == 4) {
            return FAILED;
        }
        if (i != 100) {
            return null;
        }
        return COMPLETE;
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
