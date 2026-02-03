package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dypx extends dyqv {
    public final boolean a;
    public final ekgp b;
    private final ekgp c;

    public dypx(boolean z, ekgp ekgpVar, ekgp ekgpVar2) {
        this.a = z;
        this.b = ekgpVar;
        this.c = ekgpVar2;
    }

    @Override // defpackage.dyqv
    public final ekgp a() {
        return this.b;
    }

    @Override // defpackage.dyqv
    public final ekgp b() {
        return this.c;
    }

    @Override // defpackage.dyqv
    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyqv) {
            dyqv dyqvVar = (dyqv) obj;
            if (this.a == dyqvVar.c() && this.b.equals(dyqvVar.a()) && ekmi.m(this.c, dyqvVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "OneGoogleColorResolver{isLightTheme=" + this.a + ", colorsMap=" + this.b.toString() + ", googleThemedColorsMap=" + ekmi.g(this.c) + "}";
    }
}
