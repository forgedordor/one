package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum sfp implements evst {
    USER_FEEDBACK_UNKNOWN(0),
    USER_FEEDBACK_MARKED_NOT_SPAM(1),
    USER_FEEDBACK_MARKED_SPAM(2),
    USER_FEEDBACK_CONFIRMED_SPAM(3),
    USER_FEEDBACK_LEFT_SPAM(4),
    USER_FEEDBACK_DELETED_SPAM(5),
    USER_FEEDBACK_BLOCKED_SPAM(6);

    public final int h;

    sfp(int i2) {
        this.h = i2;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
