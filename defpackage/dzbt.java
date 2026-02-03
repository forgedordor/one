package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzbt extends dzde {
    public final dzcx a;
    public final dzcx b;
    public final dzcx c;
    public final int d;

    public dzbt(dzcx dzcxVar, dzcx dzcxVar2, dzcx dzcxVar3, int i) {
        this.a = dzcxVar;
        this.b = dzcxVar2;
        this.c = dzcxVar3;
        this.d = i;
    }

    @Override // defpackage.dzde
    public final int a() {
        return this.d;
    }

    @Override // defpackage.dzde
    public final dzcx b() {
        return this.b;
    }

    @Override // defpackage.dzde
    public final dzcx c() {
        return this.c;
    }

    @Override // defpackage.dzde
    public final dzcx d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzde) {
            dzde dzdeVar = (dzde) obj;
            if (this.a.equals(dzdeVar.d()) && this.b.equals(dzdeVar.b()) && this.c.equals(dzdeVar.c()) && this.d == dzdeVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final String toString() {
        dzcx dzcxVar = this.c;
        dzcx dzcxVar2 = this.b;
        return "ViewProviders{headerViewProvider=" + this.a.toString() + ", contentViewProvider=" + dzcxVar2.toString() + ", footerViewProvider=" + dzcxVar.toString() + ", title=" + this.d + "}";
    }
}
