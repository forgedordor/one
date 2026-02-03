package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum duiu {
    NEW_FILE_KEY(0),
    ADD_DOWNLOAD_TRANSFORM(1),
    USE_CHECKSUM_ONLY(2);

    public final int d;

    duiu(int i) {
        this.d = i;
    }

    static duiu a(int i) {
        if (i == 0) {
            return NEW_FILE_KEY;
        }
        if (i == 1) {
            return ADD_DOWNLOAD_TRANSFORM;
        }
        if (i == 2) {
            return USE_CHECKSUM_ONLY;
        }
        throw new IllegalArgumentException(a.g(i, "Unknown MDD FileKey version:"));
    }
}
