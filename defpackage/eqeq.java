package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqeq {
    public final String a;
    public final ezol b;
    public final ezol c;
    public final eqep d;
    public final ekgb e;
    public final ezol f;
    public final eqcz g;
    public final int h;

    public eqeq(String str, ezol ezolVar, ezol ezolVar2, eqep eqepVar, int i, ekgb ekgbVar, ezol ezolVar3, eqcz eqczVar) {
        str.getClass();
        ezolVar.getClass();
        ezolVar2.getClass();
        eqepVar.getClass();
        if (i == 0) {
            throw null;
        }
        ekgbVar.getClass();
        this.a = str;
        this.b = ezolVar;
        this.c = ezolVar2;
        this.d = eqepVar;
        this.h = i;
        this.e = ekgbVar;
        this.f = ezolVar3;
        this.g = eqczVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqeq)) {
            return false;
        }
        eqeq eqeqVar = (eqeq) obj;
        return fdbq.f(this.a, eqeqVar.a) && fdbq.f(this.b, eqeqVar.b) && fdbq.f(this.c, eqeqVar.c) && this.d == eqeqVar.d && this.h == eqeqVar.h && fdbq.f(this.e, eqeqVar.e) && fdbq.f(this.f, eqeqVar.f) && fdbq.f(this.g, eqeqVar.g);
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.h) * 31) + this.e.hashCode();
        ezol ezolVar = this.f;
        int iHashCode2 = ((iHashCode * 31) + (ezolVar == null ? 0 : ezolVar.hashCode())) * 31;
        eqcz eqczVar = this.g;
        return iHashCode2 + (eqczVar != null ? eqczVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageMetadata(messageId=");
        sb.append(this.a);
        sb.append(", senderId=");
        sb.append(this.b);
        sb.append(", recipientId=");
        sb.append(this.c);
        sb.append(", messageType=");
        sb.append(this.d);
        sb.append(", messagePriority=");
        int i = this.h;
        sb.append((Object) (i != 1 ? i != 2 ? "NORMAL" : "HIGH" : "UNKNOWN"));
        sb.append(", headers=");
        sb.append(this.e);
        sb.append(", groupContext=");
        sb.append(this.f);
        sb.append(", traceId=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
