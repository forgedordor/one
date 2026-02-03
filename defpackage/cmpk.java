package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmpk {
    public final basd a;
    public final String b;
    public final boolean c;
    public final aubq d;
    public final eyga e;

    public cmpk(basd basdVar, String str, boolean z, aubq aubqVar, eyga eygaVar) {
        aubqVar.getClass();
        this.a = basdVar;
        this.b = str;
        this.c = z;
        this.d = aubqVar;
        this.e = eygaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmpk)) {
            return false;
        }
        cmpk cmpkVar = (cmpk) obj;
        return fdbq.f(this.a, cmpkVar.a) && fdbq.f(this.b, cmpkVar.b) && this.c == cmpkVar.c && fdbq.f(this.d, cmpkVar.d) && fdbq.f(this.e, cmpkVar.e);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode();
        eyga eygaVar = this.e;
        return (iHashCode * 31) + (eygaVar == null ? 0 : eygaVar.hashCode());
    }

    public final String toString() {
        return "RcsConverterTextMessage(rcsMessageId=" + this.a + ", messageText=" + this.b + ", isEncrypted=" + this.c + ", selfIdentity=" + this.d + ", customHeaders=" + this.e + ")";
    }
}
