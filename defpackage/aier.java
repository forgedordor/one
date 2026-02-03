package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aier extends aieu {
    private final aifs a;

    public aier(aifs aifsVar) {
        this.a = aifsVar;
    }

    @Override // defpackage.aieu
    public final aifs a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aieu) {
            return this.a.equals(((aieu) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ScheduledIconClickEvent{dialogParameters=" + this.a.toString() + "}";
    }
}
