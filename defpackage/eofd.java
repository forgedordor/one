package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eofd implements evst {
    UNKNOWN_CLASSIFICATION_SOURCE(0),
    LINGUA(1),
    RCS_ENFORCEMENT(2),
    STRANGER_DANGER(3),
    ON_DEVICE_STRANGER_DANGER(4),
    SAFE_URL(5),
    HADES_REGEX_AND_MODELS(6),
    SCOOBY(7),
    IN_APK_FUZZY_MATCHING(8),
    PENPAL(9),
    MESSAGE_SCAM_GUARD(10),
    UNRECOGNIZED(-1);

    private final int n;

    eofd(int i) {
        this.n = i;
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
