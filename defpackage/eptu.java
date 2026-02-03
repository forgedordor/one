package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eptu implements evst {
    UNKNOWN(0),
    MLS_HEALTH_STATUS_EPOCH_ADVANCEMENT_REQUESTED(1),
    MLS_HEALTH_STATUS_ONGOING_EPOCH_ADVANCEMENT(2),
    MLS_HEALTH_STATUS_ERA_ADVANCEMENT_REQUESTED(7),
    MLS_HEALTH_STATUS_ONGOING_ERA_ADVANCEMENT(4),
    MLS_HEALTH_STATUS_SELF_HEAL_FAILED(6),
    MLS_HEALTH_STATUS_END_MLS_REQUESTED(8),
    MLS_HEALTH_STATUS_ONGOING_END_MLS(9),
    MLS_HEALTH_STATUS_DONE_END_MLS(10),
    MLS_HEALTH_STATUS_ONGOING_REVIVE_MLS(11),
    MLS_HEALTH_STATUS_ONGOING_ERA_ADVANCEMENT_FOR_REVIVE(12),
    MLS_HEALTH_STATUS_HEALTHY(13),
    UNRECOGNIZED(-1);

    private final int o;

    eptu(int i) {
        this.o = i;
    }

    public static eptu b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return MLS_HEALTH_STATUS_EPOCH_ADVANCEMENT_REQUESTED;
            case 2:
                return MLS_HEALTH_STATUS_ONGOING_EPOCH_ADVANCEMENT;
            case 3:
            case 5:
            default:
                return null;
            case 4:
                return MLS_HEALTH_STATUS_ONGOING_ERA_ADVANCEMENT;
            case 6:
                return MLS_HEALTH_STATUS_SELF_HEAL_FAILED;
            case 7:
                return MLS_HEALTH_STATUS_ERA_ADVANCEMENT_REQUESTED;
            case 8:
                return MLS_HEALTH_STATUS_END_MLS_REQUESTED;
            case 9:
                return MLS_HEALTH_STATUS_ONGOING_END_MLS;
            case 10:
                return MLS_HEALTH_STATUS_DONE_END_MLS;
            case 11:
                return MLS_HEALTH_STATUS_ONGOING_REVIVE_MLS;
            case 12:
                return MLS_HEALTH_STATUS_ONGOING_ERA_ADVANCEMENT_FOR_REVIVE;
            case 13:
                return MLS_HEALTH_STATUS_HEALTHY;
        }
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
