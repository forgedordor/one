package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum ezai implements evst {
    UNKNOWN_STATUS(0),
    RECEIVED(1),
    SHOWN(2),
    SHOWN_REPLIED(3),
    CLICKED(4),
    UNRECOGNIZED(-1);

    private final int h;

    ezai(int i) {
        this.h = i;
    }

    public static ezai b(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return RECEIVED;
        }
        if (i == 2) {
            return SHOWN;
        }
        if (i == 3) {
            return SHOWN_REPLIED;
        }
        if (i != 4) {
            return null;
        }
        return CLICKED;
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
