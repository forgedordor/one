package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dwja extends dwrn {
    public final ekgb a;
    private final int b;
    private final int c;

    public dwja(int i, int i2, ekgb ekgbVar) {
        this.b = i;
        this.c = i2;
        this.a = ekgbVar;
    }

    @Override // defpackage.dwrn
    public final int a() {
        return this.c;
    }

    @Override // defpackage.dwrn
    public final int b() {
        return this.b;
    }

    @Override // defpackage.dwrn
    public final ekgb c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwrn) {
            dwrn dwrnVar = (dwrn) obj;
            if (this.b == dwrnVar.b() && this.c == dwrnVar.a() && ekjz.h(this.a, dwrnVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "FormattedTextSpan{startIndex=" + this.b + ", endIndex=" + this.c + ", textStyles=" + this.a.toString() + "}";
    }
}
