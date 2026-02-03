package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum azva implements evst {
    BACKUP_FEATURE_UNDEFINED(0),
    BACKUP_FEATURE_TEST(1),
    BACKUP_FEATURE_D2D(2),
    BACKUP_FEATURE_BACKUP_MANAGER(3);

    public final int e;

    azva(int i) {
        this.e = i;
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
