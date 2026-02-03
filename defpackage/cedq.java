package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cedq extends cedt {
    private final eows a;
    private final boolean b;

    public cedq(eows eowsVar, boolean z) {
        if (eowsVar == null) {
            throw new NullPointerException("Null type");
        }
        this.a = eowsVar;
        this.b = z;
    }

    @Override // defpackage.cedt
    public final eows a() {
        return this.a;
    }

    @Override // defpackage.cedt
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cedt) {
            cedt cedtVar = (cedt) obj;
            if (this.a.equals(cedtVar.a()) && this.b == cedtVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ConversationTypeInfo{type=" + this.a.toString() + ", needsRefresh=" + this.b + "}";
    }
}
