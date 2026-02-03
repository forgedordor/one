package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccpn implements ccpl {
    private final aubq a;

    public ccpn(aubq aubqVar) {
        this.a = aubqVar;
    }

    @Override // defpackage.ccpl
    public final ccps a() {
        ccpr ccprVar = (ccpr) ccps.a.createBuilder();
        ccprVar.getClass();
        ccpt.b(d(), ccprVar);
        return ccpt.a(ccprVar);
    }

    @Override // defpackage.ccpl
    public final String b() {
        return d();
    }

    @Override // defpackage.ccpl
    public final Object c() {
        return d();
    }

    public final String d() throws ccot {
        String str;
        aubq aubqVar = this.a;
        if (aubqVar == null || (str = aubqVar.d) == null) {
            throw new ccot();
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccpn) && fdbq.f(this.a, ((ccpn) obj).a);
    }

    public final int hashCode() {
        aubq aubqVar = this.a;
        if (aubqVar == null) {
            return 0;
        }
        return aubqVar.hashCode();
    }

    public final String toString() {
        return "MsisdnMlsIdentity(selfChatEndpoint=" + this.a + ")";
    }
}
