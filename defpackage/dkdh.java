package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkdh implements djvp {
    public final String a;
    public final djrr b;
    public final boolean d;
    public final fdae e;
    public final String c = null;
    public final boolean f = true;

    public dkdh(String str, djrr djrrVar, boolean z, fdae fdaeVar) {
        this.a = str;
        this.b = djrrVar;
        this.d = z;
        this.e = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkdh)) {
            return false;
        }
        dkdh dkdhVar = (dkdh) obj;
        if (!fdbq.f(this.a, dkdhVar.a) || this.b != dkdhVar.b) {
            return false;
        }
        String str = dkdhVar.c;
        if (!fdbq.f(null, null) || this.d != dkdhVar.d || !fdbq.f(this.e, dkdhVar.e)) {
            return false;
        }
        boolean z = dkdhVar.f;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        djrr djrrVar = this.b;
        return ((((((iHashCode + (djrrVar == null ? 0 : djrrVar.hashCode())) * 961) + dkdg.a(this.d)) * 31) + this.e.hashCode()) * 31) + dkdg.a(true);
    }

    public final String toString() {
        return "SwitchListItemUiData(title=" + this.a + ", icon=" + this.b + ", subtitle=null, isChecked=" + this.d + ", onToggle=" + this.e + ", isEnabled=true)";
    }
}
