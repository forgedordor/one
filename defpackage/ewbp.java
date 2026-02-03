package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ewbp implements evst {
    GELLER_SNAPSHOT_REASON_UNSPECIFIED(0),
    CREATE_REQUEST(1);

    public final int c;

    ewbp(int i) {
        this.c = i;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
