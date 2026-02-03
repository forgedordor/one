package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egyc extends egzs {
    public final egyi a;
    public final Object b;
    public final ehar c;
    public final long d;
    public final egzt e;
    public final int f;

    public egyc(egyi egyiVar, Object obj, ehar eharVar, long j, int i, egzt egztVar) {
        this.a = egyiVar;
        if (obj == null) {
            throw new NullPointerException("Null contentKey");
        }
        this.b = obj;
        this.c = eharVar;
        this.d = j;
        this.f = i;
        this.e = egztVar;
    }

    @Override // defpackage.egzs
    public final long a() {
        return this.d;
    }

    @Override // defpackage.egzs
    public final egyi b() {
        return this.a;
    }

    @Override // defpackage.egzs
    public final egzt c() {
        return this.e;
    }

    @Override // defpackage.egzs
    public final ehar d() {
        return this.c;
    }

    @Override // defpackage.egzs
    public final Object e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egzs) {
            egzs egzsVar = (egzs) obj;
            if (this.a.equals(egzsVar.b()) && this.b.equals(egzsVar.e()) && this.c.equals(egzsVar.d()) && this.d == egzsVar.a() && this.f == egzsVar.f() && this.e.equals(egzsVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.egzs
    public final int f() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        int i = this.f;
        ehar eharVar = this.c;
        Object obj = this.b;
        String string = this.a.toString();
        String string2 = obj.toString();
        String string3 = eharVar.toString();
        String str = i != 1 ? i != 2 ? "SUBSCRIBE" : "FORCE_REFRESH" : "UNDEFINED";
        return "SubscribeCallState{dataSource=" + string + ", contentKey=" + string2 + ", tolerance=" + string3 + ", index=" + this.d + ", subscribeCallType=" + str + ", subscribeSequenceState=" + this.e.toString() + "}";
    }
}
