package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum emvh implements evst {
    FORKING_REASON_UNSPECIFIED(0),
    SELF_NOT_RCS_CAPABLE(1),
    RECIPIENT_NOT_RCS_CAPABLE(2),
    OTHER_FORKING_REASON(3);

    public final int e;

    emvh(int i) {
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
