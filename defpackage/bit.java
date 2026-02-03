package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum bit {
    RELEASED(false),
    RELEASING(true),
    CLOSED(false),
    PENDING_OPEN(false),
    CLOSING(true),
    OPENING(true),
    OPEN(true),
    CONFIGURED(true);

    public final boolean i;

    bit(boolean z) {
        this.i = z;
    }
}
