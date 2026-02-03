package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyez extends dygm {
    public final int a;
    public final int b;
    public final int c;

    public dyez(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.dygm
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dygm
    public final int b() {
        return this.b;
    }

    @Override // defpackage.dygm
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dygm) {
            dygm dygmVar = (dygm) obj;
            if (this.a == dygmVar.a() && this.b == dygmVar.b() && this.c == dygmVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "CardVisualElementsInfo{cardCellId=" + this.a + ", cardMainActionId=" + this.b + ", cardSecondaryActionId=" + this.c + "}";
    }
}
