package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dynh extends dyni {
    public final boolean a = true;
    public final ejwi b;

    public dynh(boolean z, ejwi ejwiVar) {
        this.b = ejwiVar;
    }

    @Override // defpackage.dyjc
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.dyjc
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyni) {
            dyni dyniVar = (dyni) obj;
            dyniVar.b();
            if (this.b.equals(dyniVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 375623332;
    }

    public final String toString() {
        return "UseWithoutAnAccountActionImpl{showForUnicorn=true, availabilityChecker=" + String.valueOf(this.b) + "}";
    }
}
