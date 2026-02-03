package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmtf extends cmtr {
    private final Object a;
    private final cmtq b;

    public cmtf(Object obj, cmtq cmtqVar) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.a = obj;
        if (cmtqVar == null) {
            throw new NullPointerException("Null carrierConfigSource");
        }
        this.b = cmtqVar;
    }

    @Override // defpackage.cmtr
    public final cmtq a() {
        return this.b;
    }

    @Override // defpackage.cmtr
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cmtr) {
            cmtr cmtrVar = (cmtr) obj;
            if (this.a.equals(cmtrVar.b()) && this.b.equals(cmtrVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        cmtq cmtqVar = this.b;
        return "CarrierConfigValueInfo{value=" + this.a.toString() + ", carrierConfigSource=" + cmtqVar.toString() + "}";
    }
}
