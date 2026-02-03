package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyhz extends dyib {
    public final boolean a;

    public dyhz(boolean z) {
        this.a = z;
    }

    @Override // defpackage.dyib
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyib) {
            dyib dyibVar = (dyib) obj;
            if (this.a == dyibVar.a()) {
                dyibVar.b();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "Configuration{showSwitchProfileAction=" + this.a + ", disableDecorationFeatures=false}";
    }

    @Override // defpackage.dyib
    public final void b() {
    }
}
