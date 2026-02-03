package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cooz extends copa {
    private final atav a;

    public cooz(atav atavVar) {
        this.a = atavVar;
    }

    @Override // defpackage.cosu
    public final int b() {
        return 2;
    }

    @Override // defpackage.copa, defpackage.cosu
    public final atav c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cosu) {
            cosu cosuVar = (cosu) obj;
            if (cosuVar.b() == 2 && this.a.equals(cosuVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageCoreDataOrWorkQueueResult{workQueueResult=" + this.a.toString() + "}";
    }
}
