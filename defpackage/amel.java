package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amel implements ajmc, ajmr {
    private final ajlq a;
    private final ajmw b;
    private final long c;
    private final anpj d;

    public amel(ajlq ajlqVar, ajmw ajmwVar, long j) {
        ajlqVar.getClass();
        this.a = ajlqVar;
        this.b = ajmwVar;
        this.c = j;
        this.d = null;
    }

    @Override // defpackage.ajmr
    public final ajlq a() {
        return this.a;
    }

    @Override // defpackage.ajmr
    public final ajmw b() {
        return this.b;
    }

    @Override // defpackage.ajmc
    public final int d() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amel)) {
            return false;
        }
        amel amelVar = (amel) obj;
        if (this.a != amelVar.a || !fdbq.f(this.b, amelVar.b) || this.c != amelVar.c) {
            return false;
        }
        anpj anpjVar = amelVar.d;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        long j = this.c;
        return ((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
    }

    public final String toString() {
        return "DefaultUnknownOutgoingMessageProvenance(deliveryStatus=" + this.a + ", readReport=" + this.b + ", timestamp=" + this.c + ", messageDetails=null)";
    }
}
