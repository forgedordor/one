package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum enzc implements evst {
    UNKNOWN(0),
    RESTORE_WORKFLOW_OUT_OF_DATE(1),
    BACKUP_SCHEMA_OUT_OF_DATE(2);

    public final int d;

    enzc(int i) {
        this.d = i;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
