package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeys extends eeyg {
    public final int a;

    public eeys(int i) {
        this.a = i;
    }

    @Override // defpackage.eeyg
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eeyg) {
            eeyg eeygVar = (eeyg) obj;
            if (this.a == eeygVar.a()) {
                eeygVar.c();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.a + ", allowAssetPackDeletion=false}";
    }

    @Override // defpackage.eeyg
    public final void c() {
    }
}
