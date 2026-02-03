package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vzo {
    public final boolean a;
    public final waa b;

    public vzo(boolean z, waa waaVar) {
        this.a = z;
        this.b = waaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzo)) {
            return false;
        }
        vzo vzoVar = (vzo) obj;
        return this.a == vzoVar.a && fdbq.f(this.b, vzoVar.b);
    }

    public final int hashCode() {
        waa waaVar = this.b;
        return ((true != this.a ? 1237 : 1231) * 31) + (waaVar == null ? 0 : waaVar.hashCode());
    }

    public final String toString() {
        return "SimpleMessagePropertiesTextData(lengthRequiresMms=" + this.a + ", textCounterData=" + this.b + ")";
    }
}
