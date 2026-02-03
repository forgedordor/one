package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edwn implements edwq {
    public final String a;
    public final Object b;
    public final String c;
    public final etvj d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public edwn(String str, Object obj, String str2, etvj etvjVar, boolean z, boolean z2, boolean z3, boolean z4) {
        etvjVar.getClass();
        this.a = str;
        this.b = obj;
        this.c = str2;
        this.d = etvjVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    public static /* synthetic */ edwn a(edwn edwnVar, etvj etvjVar, boolean z, boolean z2, int i) {
        String str = (i & 1) != 0 ? edwnVar.a : null;
        Object obj = (i & 2) != 0 ? edwnVar.b : null;
        String str2 = (i & 4) != 0 ? edwnVar.c : null;
        if ((i & 8) != 0) {
            etvjVar = edwnVar.d;
        }
        etvj etvjVar2 = etvjVar;
        if ((i & 16) != 0) {
            z = edwnVar.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = edwnVar.f;
        }
        boolean z4 = edwnVar.g;
        str.getClass();
        obj.getClass();
        str2.getClass();
        etvjVar2.getClass();
        return new edwn(str, obj, str2, etvjVar2, z3, z2, z4, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edwn)) {
            return false;
        }
        edwn edwnVar = (edwn) obj;
        return fdbq.f(this.a, edwnVar.a) && fdbq.f(this.b, edwnVar.b) && fdbq.f(this.c, edwnVar.c) && this.d == edwnVar.d && this.e == edwnVar.e && this.f == edwnVar.f && this.g == edwnVar.g && this.h == edwnVar.h;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        boolean z = this.h;
        boolean z2 = this.g;
        return (((((((iHashCode * 31) + edwm.a(this.e)) * 31) + edwm.a(this.f)) * 31) + edwm.a(z2)) * 31) + edwm.a(z);
    }

    public final String toString() {
        return "Ready(name=" + this.a + ", avatarGlideModel=" + this.b + ", accountName=" + this.c + ", infoMessage=" + this.d + ", hasAnyGooglePhotos=" + this.e + ", locked=" + this.f + ", isDefaultPhoto=" + this.g + ", remoteStateLoadDone=" + this.h + ")";
    }
}
