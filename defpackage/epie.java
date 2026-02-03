package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum epie implements evst {
    UPI_ELIGIBILITY_UNSPECIFIED(0),
    ELIGIBLE(1),
    INELIGIBLE(2),
    UNRECOGNIZED(-1);

    private final int f;

    epie(int i) {
        this.f = i;
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
