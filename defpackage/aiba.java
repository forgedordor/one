package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aiba implements evst {
    UNDEFINED(0),
    TEST(1),
    D2D(2),
    RESTORE_FEATURE_BACKUP_MANAGER(3);

    public final int e;

    aiba(int i) {
        this.e = i;
    }

    public static aiba b(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return TEST;
        }
        if (i == 2) {
            return D2D;
        }
        if (i != 3) {
            return null;
        }
        return RESTORE_FEATURE_BACKUP_MANAGER;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
