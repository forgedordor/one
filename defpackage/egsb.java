package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egsb extends egsm {
    public final String a;
    public final pzy b;

    public egsb(String str, pzy pzyVar) {
        this.a = str;
        if (pzyVar == null) {
            throw new NullPointerException("Null existingWorkPolicy");
        }
        this.b = pzyVar;
    }

    @Override // defpackage.egsm
    public final pzy a() {
        return this.b;
    }

    @Override // defpackage.egsm
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egsm) {
            egsm egsmVar = (egsm) obj;
            if (this.a.equals(egsmVar.b()) && this.b.equals(egsmVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "UniqueWorkSpec{uniquenessKey=" + this.a + ", existingWorkPolicy=" + this.b.toString() + "}";
    }
}
