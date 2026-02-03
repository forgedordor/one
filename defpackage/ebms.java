package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebms extends ebni {
    public final boolean a;
    public final boolean b;
    public final ebmr c;
    public final ejwi d;

    public ebms(boolean z, boolean z2, ebmr ebmrVar, ejwi ejwiVar) {
        this.a = z;
        this.b = z2;
        if (ebmrVar == null) {
            throw new NullPointerException("Null transportProtocol");
        }
        this.c = ebmrVar;
        this.d = ejwiVar;
    }

    @Override // defpackage.ebni
    public final ebmr a() {
        return this.c;
    }

    @Override // defpackage.ebni
    public final ejwi b() {
        return this.d;
    }

    @Override // defpackage.ebni
    public final boolean c() {
        return this.a;
    }

    @Override // defpackage.ebni
    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebni) {
            ebni ebniVar = (ebni) obj;
            if (this.a == ebniVar.c() && this.b == ebniVar.d() && this.c.equals(ebniVar.a()) && this.d.equals(ebniVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.d;
        return "DiscoverySpec{forceIPv4=" + this.a + ", preferIPv6=" + this.b + ", transportProtocol=" + this.c.toString() + ", logPrefix=" + ejwiVar.toString() + "}";
    }
}
