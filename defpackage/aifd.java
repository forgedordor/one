package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aifd extends aift {
    private final aifs a;

    public aifd(aifs aifsVar) {
        this.a = aifsVar;
    }

    @Override // defpackage.aift
    public final aifs a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aift) {
            return this.a.equals(((aift) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ScheduledMessageEditConfirmedEvent{dialogParameters=" + this.a.toString() + "}";
    }
}
