package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vvo implements vvp, dlti {
    public final vvl a;
    public final doig b;
    public final Uri c;
    public final Long d;
    public final dltc e;
    private final Object f;

    public vvo(vvl vvlVar, doig doigVar, Uri uri, Long l, dltc dltcVar) {
        uri.getClass();
        this.a = vvlVar;
        this.b = doigVar;
        this.c = uri;
        this.d = l;
        this.e = dltcVar;
        String string = uri.toString();
        string.getClass();
        this.f = string;
    }

    @Override // defpackage.vvs
    public final vvl a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvo)) {
            return false;
        }
        vvo vvoVar = (vvo) obj;
        return fdbq.f(this.a, vvoVar.a) && fdbq.f(this.b, vvoVar.b) && fdbq.f(this.c, vvoVar.c) && fdbq.f(this.d, vvoVar.d) && fdbq.f(this.e, vvoVar.e);
    }

    @Override // defpackage.dlti
    public final Object fp() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        Long l = this.d;
        return (((iHashCode * 31) + (l == null ? 0 : l.hashCode())) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Unresolved(instanceId=" + this.a + ", mediaType=" + this.b + ", uri=" + cqcy.d(this.c) + ", sizeBytes=" + this.d + ", source=" + this.e + ")";
    }
}
