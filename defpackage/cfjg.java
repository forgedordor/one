package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfjg extends cfmy {
    public final eoxe a;
    public final ezol b;
    public final bvks c;
    public final eosc d;
    public final evqs e;
    public final ezjj f;
    private final evqs g;

    public cfjg(eoxe eoxeVar, ezol ezolVar, bvks bvksVar, eosc eoscVar, evqs evqsVar, evqs evqsVar2, ezjj ezjjVar) {
        if (eoxeVar == null) {
            throw new NullPointerException("Null dittoChannelRequest");
        }
        this.a = eoxeVar;
        if (ezolVar == null) {
            throw new NullPointerException("Null browserId");
        }
        this.b = ezolVar;
        this.c = bvksVar;
        if (eoscVar == null) {
            throw new NullPointerException("Null executor");
        }
        this.d = eoscVar;
        if (evqsVar == null) {
            throw new NullPointerException("Null requestBytes");
        }
        this.e = evqsVar;
        if (evqsVar2 == null) {
            throw new NullPointerException("Null clientRegistrationId");
        }
        this.g = evqsVar2;
        if (ezjjVar == null) {
            throw new NullPointerException("Null inboxMessage");
        }
        this.f = ezjjVar;
    }

    @Override // defpackage.cfmy
    public final bvks a() {
        return this.c;
    }

    @Override // defpackage.cfmy
    public final eosc b() {
        return this.d;
    }

    @Override // defpackage.cfmy
    public final eoxe c() {
        return this.a;
    }

    @Override // defpackage.cfmy
    public final evqs d() {
        return this.g;
    }

    @Override // defpackage.cfmy
    public final evqs e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cfmy) {
            cfmy cfmyVar = (cfmy) obj;
            if (this.a.equals(cfmyVar.c()) && this.b.equals(cfmyVar.g()) && this.c.equals(cfmyVar.a()) && this.d.equals(cfmyVar.b()) && this.e.equals(cfmyVar.e()) && this.g.equals(cfmyVar.d()) && this.f.equals(cfmyVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cfmy
    public final ezjj f() {
        return this.f;
    }

    @Override // defpackage.cfmy
    @Deprecated
    public final ezol g() {
        return this.b;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        ezjj ezjjVar = this.f;
        evqs evqsVar = this.g;
        evqs evqsVar2 = this.e;
        eosc eoscVar = this.d;
        bvks bvksVar = this.c;
        ezol ezolVar = this.b;
        return "Parameters{dittoChannelRequest=" + this.a.toString() + ", browserId=" + ezolVar.toString() + ", dittoIdContainer=" + bvksVar.toString() + ", executor=" + eoscVar.toString() + ", requestBytes=" + evqsVar2.toString() + ", clientRegistrationId=" + evqsVar.toString() + ", inboxMessage=" + ezjjVar.toString() + "}";
    }
}
