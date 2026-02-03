package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eaok extends easi {
    public final int a;
    public final int b;
    public final int c;

    public eaok(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.easi
    public final int a() {
        return this.c;
    }

    @Override // defpackage.easi
    public final int b() {
        return this.b;
    }

    @Override // defpackage.easi
    public final int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof easi) {
            easi easiVar = (easi) obj;
            if (this.a == easiVar.c() && this.b == easiVar.b() && this.c == easiVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }
}
