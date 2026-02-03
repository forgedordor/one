package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwvf extends dwwm {
    private final dwwj a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final boolean f;

    public dwvf(dwwj dwwjVar, int i, int i2, int i3, int i4, boolean z) {
        this.a = dwwjVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = z;
    }

    @Override // defpackage.dwwm
    public final int a() {
        return this.e;
    }

    @Override // defpackage.dwwm
    public final int b() {
        return this.d;
    }

    @Override // defpackage.dwwm
    public final int c() {
        return this.b;
    }

    @Override // defpackage.dwwm
    public final int d() {
        return this.c;
    }

    @Override // defpackage.dwwm
    public final dwwj e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwwm) {
            dwwm dwwmVar = (dwwm) obj;
            if (this.a.equals(dwwmVar.e()) && this.b == dwwmVar.c() && this.c == dwwmVar.d() && this.d == dwwmVar.b() && this.e == dwwmVar.a() && this.f == dwwmVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dwwm
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = true != this.f ? 1237 : 1231;
        int i2 = this.b;
        int i3 = ((iHashCode * 1000003) ^ i2) * 1000003;
        return ((((((i3 ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ i;
    }

    public final String toString() {
        return "UiElement{element=" + String.valueOf(this.a) + ", paddingStart=" + this.b + ", paddingTop=" + this.c + ", paddingEnd=" + this.d + ", paddingBottom=" + this.e + ", useIncomingOutgoingColors=" + this.f + "}";
    }
}
