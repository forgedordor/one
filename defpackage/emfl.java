package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum emfl implements evst {
    UNKNOWN_RCS_GROUP_IDENTIFIER(0),
    RCS_GROUP_ID(1),
    RCS_CONFERENCE_URI(2),
    RCS_GROUP_SELF_MSISDN(3);

    public final int e;

    emfl(int i) {
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
