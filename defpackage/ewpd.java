package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ewpd implements evst {
    NOT_SET(0),
    TRUE(1),
    FALSE(2);

    public final int d;

    ewpd(int i) {
        this.d = i;
    }

    public static ewpd b(int i) {
        if (i == 0) {
            return NOT_SET;
        }
        if (i == 1) {
            return TRUE;
        }
        if (i != 2) {
            return null;
        }
        return FALSE;
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
