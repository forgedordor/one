package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aifc extends aifn {
    private final aifs a;

    public aifc(aifs aifsVar) {
        this.a = aifsVar;
    }

    @Override // defpackage.aifn
    public final aifs a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aifn) {
            return this.a.equals(((aifn) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ScheduledMessageDeleteEvent{dialogParameters=" + this.a.toString() + "}";
    }
}
