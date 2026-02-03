package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum cvbb implements evst {
    NONE(0),
    ARCHIVE(1),
    DELETE(2),
    MARK_AS_READ_OR_UNREAD(3);

    public final int e;

    cvbb(int i) {
        this.e = i;
    }

    public static cvbb b(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return ARCHIVE;
        }
        if (i == 2) {
            return DELETE;
        }
        if (i != 3) {
            return null;
        }
        return MARK_AS_READ_OR_UNREAD;
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
