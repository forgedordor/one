package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aibm {
    public final boolean a;
    public final boolean b;
    public final enoq c;
    public final UUID d;
    public final aibj e;
    public final dbxl f;

    public aibm(boolean z, boolean z2, enoq enoqVar, UUID uuid, aibj aibjVar, dbxl dbxlVar) {
        aibjVar.getClass();
        this.a = z;
        this.b = z2;
        this.c = enoqVar;
        this.d = uuid;
        this.e = aibjVar;
        this.f = dbxlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aibm)) {
            return false;
        }
        aibm aibmVar = (aibm) obj;
        return this.a == aibmVar.a && this.b == aibmVar.b && this.c == aibmVar.c && fdbq.f(this.d, aibmVar.d) && fdbq.f(this.e, aibmVar.e) && this.f == aibmVar.f;
    }

    public final int hashCode() {
        enoq enoqVar = this.c;
        int iHashCode = enoqVar == null ? 0 : enoqVar.hashCode();
        boolean z = this.a;
        boolean z2 = this.b;
        UUID uuid = this.d;
        int iA = (((((((aibl.a(z) * 31) + aibl.a(z2)) * 31) + iHashCode) * 31) + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.e.hashCode();
        dbxl dbxlVar = this.f;
        return (iA * 31) + (dbxlVar != null ? dbxlVar.hashCode() : 0);
    }

    public final String toString() {
        return "RestoreCustomD2DItemResult(isSuccess=" + this.a + ", shouldLogSuccess=" + this.b + ", failureReason=" + this.c + ", sessionId=" + this.d + ", result=" + this.e + ", source=" + this.f + ")";
    }

    public /* synthetic */ aibm(enoq enoqVar, UUID uuid, aibj aibjVar, dbxl dbxlVar, int i) {
        this(false, (i & 2) != 0, (i & 4) != 0 ? null : enoqVar, uuid, aibjVar, (i & 32) != 0 ? null : dbxlVar);
    }
}
