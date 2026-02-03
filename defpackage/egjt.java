package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egjt extends egjs {
    private final egbs b;

    public egjt(egbs egbsVar) {
        this.b = egbsVar;
    }

    @Override // defpackage.egjs
    public final egbs b() {
        return this.b;
    }

    @Override // defpackage.res
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egjs) {
            return this.b.equals(((egjs) obj).b());
        }
        return false;
    }

    @Override // defpackage.res
    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }
}
