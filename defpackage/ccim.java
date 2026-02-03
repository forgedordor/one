package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccim {
    public final evqs a;
    public final aubx b;
    public final eyga c;

    public ccim(evqs evqsVar, aubx aubxVar, eyga eygaVar) {
        this.a = evqsVar;
        this.b = aubxVar;
        this.c = eygaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccim)) {
            return false;
        }
        ccim ccimVar = (ccim) obj;
        return fdbq.f(this.a, ccimVar.a) && fdbq.f(this.b, ccimVar.b) && fdbq.f(this.c, ccimVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ParsedCpimPayload(messageContent=" + this.a + ", contentType=" + this.b + ", customCpimHeaders=" + this.c + ")";
    }
}
