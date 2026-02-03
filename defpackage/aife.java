package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aife extends aifu {
    private final aifs a;

    public aife(aifs aifsVar) {
        this.a = aifsVar;
    }

    @Override // defpackage.aifu
    public final aifs a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aifu) {
            return this.a.equals(((aifu) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ScheduledMessageEditEvent{dialogParameters=" + this.a.toString() + "}";
    }
}
