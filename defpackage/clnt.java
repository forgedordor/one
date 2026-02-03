package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum clnt implements evst {
    OUTCOME_UNSPECIFIED(0),
    OUTCOME_SUCCESS(1),
    OUTCOME_FAILURE(2),
    UNRECOGNIZED(-1);

    private final int f;

    clnt(int i) {
        this.f = i;
    }

    public static clnt b(int i) {
        if (i == 0) {
            return OUTCOME_UNSPECIFIED;
        }
        if (i == 1) {
            return OUTCOME_SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return OUTCOME_FAILURE;
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
