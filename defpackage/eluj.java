package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eluj implements evst {
    UNKNOWN_ENGAGEMENT_LEVEL(0),
    ENGAGEMENT_LEVEL_INACTIVE(1),
    ENGAGEMENT_LEVEL_PASSIVE(2),
    ENGAGEMENT_LEVEL_ACTIVE(3);

    public final int e;

    eluj(int i) {
        this.e = i;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
