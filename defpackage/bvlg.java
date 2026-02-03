package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvlg {
    public final boolean a;
    public final boolean b;
    public final int c;

    public bvlg(int i, boolean z, boolean z2) {
        this.c = i;
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvlg)) {
            return false;
        }
        bvlg bvlgVar = (bvlg) obj;
        return this.c == bvlgVar.c && this.a == bvlgVar.a && this.b == bvlgVar.b;
    }

    public final int hashCode() {
        return (((this.c * 31) + bvlf.a(this.a)) * 31) + bvlf.a(this.b);
    }

    public final String toString() {
        return "DevicePairingInfo(devicePairingPage=" + ((Object) bvms.a(this.c)) + ", autoTurnOnGaiaPairing=" + this.a + ", hasGaiaPairingEnabled=" + this.b + ")";
    }
}
