package defpackage;

import com.google.android.gms.droidguard.internal.IDroidGuardHandle;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcro extends dcsf {
    public final IDroidGuardHandle a;
    private final dcqw b;

    public dcro(IDroidGuardHandle iDroidGuardHandle, dcqw dcqwVar) {
        if (iDroidGuardHandle == null) {
            throw new NullPointerException("Null handle");
        }
        this.a = iDroidGuardHandle;
        this.b = dcqwVar;
    }

    @Override // defpackage.dcsf
    public final IDroidGuardHandle a() {
        return this.a;
    }

    @Override // defpackage.dcsf
    public final dcqw b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        dcqw dcqwVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dcsf) {
            dcsf dcsfVar = (dcsf) obj;
            if (this.a.equals(dcsfVar.a()) && ((dcqwVar = this.b) != null ? dcqwVar.equals(dcsfVar.b()) : dcsfVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        dcqw dcqwVar = this.b;
        return (iHashCode * 1000003) ^ (dcqwVar == null ? 0 : dcqwVar.hashCode());
    }

    public final String toString() {
        dcqw dcqwVar = this.b;
        return "InitializedHandle{handle=" + this.a.toString() + ", appSideVmProcess=" + String.valueOf(dcqwVar) + "}";
    }
}
