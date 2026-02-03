package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmcv extends cmcw {
    private final clpq a;

    public cmcv(clpq clpqVar) {
        if (clpqVar == null) {
            throw new NullPointerException("Null bindData");
        }
        this.a = clpqVar;
    }

    @Override // defpackage.cmcw
    public final clpq a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cmcw) {
            return this.a.equals(((cmcw) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ScheduledMessageData{bindData=" + this.a.toString() + "}";
    }
}
