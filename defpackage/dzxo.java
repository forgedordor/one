package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzxo extends dzzg {
    public final Context a;
    public final ejxr b;

    public dzxo(Context context, ejxr ejxrVar) {
        this.a = context;
        this.b = ejxrVar;
    }

    @Override // defpackage.dzzg
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.dzzg
    public final ejxr b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        ejxr ejxrVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzzg) {
            dzzg dzzgVar = (dzzg) obj;
            if (this.a.equals(dzzgVar.a()) && ((ejxrVar = this.b) != null ? ejxrVar.equals(dzzgVar.b()) : dzzgVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        ejxr ejxrVar = this.b;
        return (iHashCode * 1000003) ^ (ejxrVar == null ? 0 : ejxrVar.hashCode());
    }

    public final String toString() {
        ejxr ejxrVar = this.b;
        return "FlagsContext{context=" + this.a.toString() + ", hermeticFileOverrides=" + String.valueOf(ejxrVar) + "}";
    }
}
