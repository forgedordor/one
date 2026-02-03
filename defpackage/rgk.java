package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rgk implements res {
    private final res b;
    private final res c;

    public rgk(res resVar, res resVar2) {
        this.b = resVar;
        this.c = resVar2;
    }

    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.res
    public final boolean equals(Object obj) {
        if (obj instanceof rgk) {
            rgk rgkVar = (rgk) obj;
            if (this.b.equals(rgkVar.b) && this.c.equals(rgkVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.res
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        res resVar = this.c;
        return "DataCacheKey{sourceKey=" + String.valueOf(this.b) + ", signature=" + String.valueOf(resVar) + "}";
    }
}
