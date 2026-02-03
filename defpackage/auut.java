package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auut {
    public final fcyh a;
    private final fcyh b;

    public auut() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auut)) {
            return false;
        }
        auut auutVar = (auut) obj;
        return fdbq.f(this.a, auutVar.a) && fdbq.f(this.b, auutVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CompositionLocalTikTokCoroutineContext(lightweight=" + this.a + ", background=" + this.b + ")";
    }

    public auut(fcyh fcyhVar, fcyh fcyhVar2) {
        this.a = fcyhVar;
        this.b = fcyhVar2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ auut(byte[] bArr) {
        fcyi fcyiVar = fcyi.a;
        this(fcyiVar, fcyiVar);
    }
}
