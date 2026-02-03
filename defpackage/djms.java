package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djms implements djmy {
    public final djrr a;
    public final String b;
    public final String c;
    public final List d;
    public final fdae e;

    public djms(djrr djrrVar, String str, String str2, List list, fdae fdaeVar) {
        djrrVar.getClass();
        this.a = djrrVar;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = fdaeVar;
    }

    @Override // defpackage.djmy
    public final /* synthetic */ djmy a(boolean z, fdae fdaeVar) {
        return djmg.a(this, z, fdaeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djms)) {
            return false;
        }
        djms djmsVar = (djms) obj;
        return this.a == djmsVar.a && fdbq.f(this.b, djmsVar.b) && fdbq.f(this.c, djmsVar.c) && fdbq.f(this.d, djmsVar.d) && fdbq.f(this.e, djmsVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Secure(icon=" + this.a + ", title=" + this.b + ", body=" + this.c + ", bodyAnnotations=" + this.d + ", onDismissRequest=" + this.e + ")";
    }
}
