package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum bvqo implements evst {
    EMOJI_DOWNLOAD_STATUS_UNKNOWN(0),
    EMOJI_DOWNLOAD_STATUS_DOWNLOADED(1),
    EMOJI_DOWNLOAD_STATUS_ERROR(2),
    UNRECOGNIZED(-1);

    private final int f;

    bvqo(int i) {
        this.f = i;
    }

    public static bvqo b(int i) {
        if (i == 0) {
            return EMOJI_DOWNLOAD_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return EMOJI_DOWNLOAD_STATUS_DOWNLOADED;
        }
        if (i != 2) {
            return null;
        }
        return EMOJI_DOWNLOAD_STATUS_ERROR;
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
