package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwur extends dwvn {
    public final int a;
    public final float b;

    public dwur(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.dwvn
    public final float a() {
        return this.b;
    }

    @Override // defpackage.dwvn
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwvn) {
            dwvn dwvnVar = (dwvn) obj;
            if (this.a == dwvnVar.b() && Float.floatToIntBits(this.b) == Float.floatToIntBits(dwvnVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "HorizontalLine{lineColor=" + this.a + ", lineWidth=" + this.b + "}";
    }
}
