package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egye extends egzw {
    public final long a;
    public final egzv b;
    public final boolean c;
    public final ejwi d;
    public final ejwi e;

    public egye(long j, egzv egzvVar, boolean z, ejwi ejwiVar, ejwi ejwiVar2) {
        this.a = j;
        if (egzvVar == null) {
            throw new NullPointerException("Null callbacks");
        }
        this.b = egzvVar;
        this.c = z;
        this.d = ejwiVar;
        this.e = ejwiVar2;
    }

    @Override // defpackage.egzw
    public final long a() {
        return this.a;
    }

    @Override // defpackage.egzw
    public final egzv b() {
        return this.b;
    }

    @Override // defpackage.egzw
    public final ejwi c() {
        return this.e;
    }

    @Override // defpackage.egzw
    public final ejwi d() {
        return this.d;
    }

    @Override // defpackage.egzw
    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egzw) {
            egzw egzwVar = (egzw) obj;
            if (this.a == egzwVar.a() && this.b.equals(egzwVar.b()) && this.c == egzwVar.e() && this.d.equals(egzwVar.d()) && this.e.equals(egzwVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.e;
        ejwi ejwiVar2 = this.d;
        return "SubscriptionCallbacksState{index=" + this.a + ", callbacks=" + this.b.toString() + ", openBackgroundFetch=" + this.c + ", maybeTopicData=" + ejwiVar2.toString() + ", maybeInstanceData=" + ejwiVar.toString() + "}";
    }
}
