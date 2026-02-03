package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evje implements evst {
    FETCH_REASON_UNSPECIFIED(0),
    FULL_SYNC_INSTRUCTION(1),
    SYNC_INSTRUCTION(2),
    COLLABORATOR_API_CALL(3),
    GUNS_MIGRATION(4),
    INBOX(5),
    DELAYED_IMPRESSION(6),
    REMOTE_DELETED_MESSAGES(7),
    LOCALE_CHANGED(8),
    GROWTHKIT_PERIODIC_FETCH(9),
    GROWTHKIT_SYNC_ON_STARTUP(10),
    GROWTHKIT_SYNC_AFTER_PROMO_SHOWN(11),
    GROWTHKIT_SYNC_AFTER_USER_ACTION(12),
    GROWTHKIT_SYNC_FOR_TEST_REASON(13),
    GROWTHKIT_SYNC_INSTRUCTION(14);

    public final int p;

    evje(int i) {
        this.p = i;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
