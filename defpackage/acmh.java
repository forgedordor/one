package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acmh extends acmk {
    private final acin a;

    public acmh(acin acinVar) {
        this.a = acinVar;
    }

    @Override // defpackage.acmk
    public final acin a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acmk) {
            return this.a.equals(((acmk) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FeedbackDataDetailRequestedEvent{feedbackData=" + this.a.toString() + "}";
    }
}
