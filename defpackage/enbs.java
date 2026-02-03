package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum enbs implements evst {
    UNSPECIFIED(0),
    GENERATE_KEY_PACKAGES(1),
    CREATE_GROUP_AND_ADD_MEMBERS(2),
    ENCRYPT_PLAINTEXT(3),
    ENCRYPT_BYTES(4),
    PROCESS_MESSAGE(5),
    REMOVE_OTHER_MEMBERS_FROM_GROUP(6),
    PROPOSE_REMOVE_SELF(7),
    ADD_MEMBERS_TO_GROUP(8),
    GENERATE_DELIVERY_RECEIPT_SIGNATURE(9),
    PROCESS_POSITIVE_DELIVERY_RECEIPT(10),
    PROCESS_NEGATIVE_DELIVERY_RECEIPT(11),
    GENERATE_DISPLAY_RECEIPT_SIGNATURE(12),
    PROCESS_DISPLAY_RECEIPT(13),
    DELETE_GROUP(14),
    RUN_MAINTENANCE(15),
    APPLY_END_MLS(16),
    GET_GROUP_STATUS(17),
    GET_ZINNIA_STATE_REPRESENTATION(18),
    APPLY_REVIVE_MLS(19),
    MAYBE_REFRESH(20),
    GET_EXPIRED_MEMBERS(21),
    SYNC_MLS_MEMBERSHIP(22);

    public final int x;

    enbs(int i) {
        this.x = i;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.x;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.x);
    }
}
