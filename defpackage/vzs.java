package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzs implements vzu {
    private final waa a;

    public vzs() {
        this((byte[]) null);
    }

    @Override // defpackage.vzu
    public final waa a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vzs) && fdbq.f(this.a, ((vzs) obj).a);
    }

    public final int hashCode() {
        waa waaVar = this.a;
        if (waaVar == null) {
            return 0;
        }
        return waaVar.hashCode();
    }

    public final String toString() {
        return "MASS_SMS(textCounterData=" + this.a + ")";
    }

    public vzs(waa waaVar) {
        this.a = waaVar;
    }

    public /* synthetic */ vzs(byte[] bArr) {
        this((waa) null);
    }
}
