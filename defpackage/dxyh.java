package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxyh extends dxzc {
    private final ejwi a;
    private final ejwi b;

    public dxyh(ejwi ejwiVar, ejwi ejwiVar2) {
        this.a = ejwiVar;
        this.b = ejwiVar2;
    }

    @Override // defpackage.dxzc
    public final ejwi a() {
        return this.a;
    }

    @Override // defpackage.dxzc
    public final ejwi b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxzc) {
            dxzc dxzcVar = (dxzc) obj;
            if (this.a.equals(dxzcVar.a()) && this.b.equals(dxzcVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.b;
        return "DecorationContent{badgeContent=" + String.valueOf(this.a) + ", ringContent=" + String.valueOf(ejwiVar) + "}";
    }
}
