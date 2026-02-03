package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum exob implements evst {
    COMPLETION_STYLE_UNKNOWN(0),
    COMPLETION_STYLE_CARD(1),
    COMPLETION_STYLE_TOAST(2),
    UNRECOGNIZED(-1);

    private final int f;

    exob(int i) {
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
