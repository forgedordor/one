package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cttd {
    public final boolean a;
    public final boolean b;

    public cttd() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cttd)) {
            return false;
        }
        cttd cttdVar = (cttd) obj;
        return this.a == cttdVar.a && this.b == cttdVar.b;
    }

    public final int hashCode() {
        return (cttc.a(this.a) * 31) + cttc.a(this.b);
    }

    public final String toString() {
        return "Flags(enableStartChatCoolRanchPhase3=" + this.a + ", enableGroupIconOnCreation=" + this.b + ")";
    }

    public cttd(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public /* synthetic */ cttd(byte[] bArr) {
        this(false, false);
    }
}
