package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eipx extends eipz {
    private final Object a;

    public eipx(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.eipz
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eipz) {
            eipz eipzVar = (eipz) obj;
            eipzVar.b();
            Object obj2 = this.a;
            if (obj2 != null ? obj2.equals(eipzVar.a()) : eipzVar.a() == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return (obj == null ? 0 : obj.hashCode()) ^ 385623362;
    }

    public final String toString() {
        return "ExecutionResult{startDictation=false, output=" + String.valueOf(this.a) + "}";
    }

    @Override // defpackage.eipz
    public final void b() {
    }
}
