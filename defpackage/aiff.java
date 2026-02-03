package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aiff extends aify {
    private final String a;

    public aiff(String str) {
        if (str == null) {
            throw new NullPointerException("Null scheduledSendId");
        }
        this.a = str;
    }

    @Override // defpackage.aify
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aify) {
            return this.a.equals(((aify) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ScheduledMessageSendEvent{scheduledSendId=" + this.a + "}";
    }
}
