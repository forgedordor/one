package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cong implements evst {
    FILE(0),
    THUMBNAIL(1);

    public final int c;

    cong(int i) {
        this.c = i;
    }

    public static cong b(int i) {
        if (i == 0) {
            return FILE;
        }
        if (i != 1) {
            return null;
        }
        return THUMBNAIL;
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
