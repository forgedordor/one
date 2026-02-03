package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum aslb implements evst {
    UNKNOWN(0),
    CREATED(1),
    REPLIED_BY_USER(2),
    UNRECOGNIZED(-1);

    private final int f;

    aslb(int i) {
        this.f = i;
    }

    public static aslb b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return CREATED;
        }
        if (i != 2) {
            return null;
        }
        return REPLIED_BY_USER;
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
