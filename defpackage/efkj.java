package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum efkj {
    INCORRECT_ERA("incorrect-era"),
    INCORRECT_EPOCH("incorrect-epoch"),
    INCORRECT_EPOCH_AUTHENTICATOR("incorrect-epoch-authenticator"),
    EXPIRED_CREDENTIAL("expired-credential"),
    MISMATCHED_RCS_GROUP_STATE("mismatched-rcs-group-state"),
    UNPARSABLE_COMMIT("unparsable-commit"),
    MISMATCHED_CONFIRMATION_TAG("mismatched-confirmation-tag"),
    PENDING_PROPOSAL("pending-proposal"),
    TRANSIENT_ERROR("transient-error"),
    ENCRYPTION_NOT_AVAILABLE("encryption-not-available"),
    INVALID_COMMIT("invalid-commit");

    public final String l;

    efkj(String str) {
        this.l = str;
    }
}
