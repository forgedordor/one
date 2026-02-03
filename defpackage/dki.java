package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dki {
    private final Context a;
    private final kio b;
    private final long c;
    private final egc d;

    public dki(Context context, kio kioVar, long j, egc egcVar) {
        this.a = context;
        this.b = kioVar;
        this.c = j;
        this.d = egcVar;
    }

    public final dop a() {
        return new dkh(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fdbq.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        dki dkiVar = (dki) obj;
        if (!fdbq.f(this.a, dkiVar.a) || !fdbq.f(this.b, dkiVar.b)) {
            return false;
        }
        long j = this.c;
        long j2 = dkiVar.c;
        long j3 = ije.a;
        return fcts.a(j, j2) && fdbq.f(this.d, dkiVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        long j = ije.a;
        return (((iHashCode * 31) + fctr.a(this.c)) * 31) + this.d.hashCode();
    }
}
