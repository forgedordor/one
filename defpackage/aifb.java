package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aifb extends aifm {
    private final String a;

    public aifb(String str) {
        if (str == null) {
            throw new NullPointerException("Null scheduledSendId");
        }
        this.a = str;
    }

    @Override // defpackage.aifm
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aifm) {
            return this.a.equals(((aifm) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ScheduledMessageDeleteConfirmedEvent{scheduledSendId=" + this.a + "}";
    }
}
