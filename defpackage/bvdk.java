package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum bvdk {
    UNARCHIVED(0),
    ARCHIVED(1),
    KEEP_ARCHIVED(2),
    SPAM_FOLDER(3),
    BLOCKED_FOLDER(4),
    CROSS_COUNTRY_FOLDER(5);

    public static final Set g = ekhx.s(SPAM_FOLDER, BLOCKED_FOLDER, CROSS_COUNTRY_FOLDER);
    public final int h;

    bvdk(int i2) {
        this.h = i2;
    }

    public static bvdk a(int i2) {
        for (bvdk bvdkVar : values()) {
            if (bvdkVar.h == i2) {
                return bvdkVar;
            }
        }
        throw new IllegalArgumentException(a.g(i2, "Invalid ArchiveStatus value: "));
    }

    public static bvdk b(boolean z) {
        return z ? ARCHIVED : UNARCHIVED;
    }

    public static int h(bvdk bvdkVar) {
        if (bvdkVar != null) {
            int iOrdinal = bvdkVar.ordinal();
            if (iOrdinal == 0) {
                return 3;
            }
            if (iOrdinal == 1) {
                return 4;
            }
            if (iOrdinal == 2) {
                return 5;
            }
            if (iOrdinal == 3) {
                return 6;
            }
            if (iOrdinal == 4) {
                return 7;
            }
            if (iOrdinal == 5) {
                return 8;
            }
        }
        return 2;
    }

    public final boolean d() {
        return this != UNARCHIVED;
    }

    public final boolean e() {
        return g.contains(this);
    }

    public final boolean f() {
        return this == SPAM_FOLDER;
    }

    public final boolean g() {
        return this.h >= KEEP_ARCHIVED.h;
    }
}
