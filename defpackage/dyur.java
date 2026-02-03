package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyur extends dyut {
    public final Runnable a;
    private final ekgb b;

    public dyur(ekgb ekgbVar, Runnable runnable) {
        this.b = ekgbVar;
        this.a = runnable;
    }

    @Override // defpackage.dyut, defpackage.dyuj
    public final ekgb a() {
        return this.b;
    }

    @Override // defpackage.dyut, defpackage.dyuj
    public final Runnable b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyut) {
            dyut dyutVar = (dyut) obj;
            if (ekjz.h(this.b, dyutVar.a()) && this.a.equals(dyutVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        Runnable runnable = this.a;
        return "CustomCancelableFeatureImpl{possibleCancelStringList=" + this.b.toString() + ", onCancel=" + runnable.toString() + "}";
    }
}
