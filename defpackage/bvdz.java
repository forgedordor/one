package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum bvdz {
    VERIFICATION_NA,
    VERIFICATION_VERIFIED,
    VERIFICATION_UNVERIFIED,
    VERIFICATION_IN_PROGRESS;

    static {
        bvdz bvdzVar = VERIFICATION_UNVERIFIED;
        ekhx.r(VERIFICATION_IN_PROGRESS, bvdzVar);
    }

    public final boolean a() {
        return this != VERIFICATION_NA;
    }
}
