package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwim extends dwje {
    public final long a;
    public final dwjh b;
    public final evqs c;
    public final dwjd d;

    public dwim(long j, dwjh dwjhVar, evqs evqsVar, dwjd dwjdVar) {
        this.a = j;
        if (dwjhVar == null) {
            throw new NullPointerException("Null accountUsers");
        }
        this.b = dwjhVar;
        if (evqsVar == null) {
            throw new NullPointerException("Null serverRegistrationId");
        }
        this.c = evqsVar;
        if (dwjdVar == null) {
            throw new NullPointerException("Null serverRegistrationStatus");
        }
        this.d = dwjdVar;
    }

    @Override // defpackage.dwje
    public final long a() {
        return this.a;
    }

    @Override // defpackage.dwje
    public final dwjd b() {
        return this.d;
    }

    @Override // defpackage.dwje
    public final dwjh c() {
        return this.b;
    }

    @Override // defpackage.dwje
    public final evqs d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwje) {
            dwje dwjeVar = (dwje) obj;
            if (this.a == dwjeVar.a() && this.b.equals(dwjeVar.c()) && this.c.equals(dwjeVar.d()) && this.d.equals(dwjeVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        dwjd dwjdVar = this.d;
        evqs evqsVar = this.c;
        return "AccountContext{registrationId=" + this.a + ", accountUsers=" + this.b.toString() + ", serverRegistrationId=" + evqsVar.toString() + ", serverRegistrationStatus=" + dwjdVar.toString() + "}";
    }
}
