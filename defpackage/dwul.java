package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwul extends dwvh {
    public final int a;
    public final String b;
    public final ekgb c;

    public dwul(int i, String str, ekgb ekgbVar) {
        this.a = i;
        this.b = str;
        this.c = ekgbVar;
    }

    @Override // defpackage.dwvh
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dwvh
    public final ekgb b() {
        return this.c;
    }

    @Override // defpackage.dwvh
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwvh) {
            dwvh dwvhVar = (dwvh) obj;
            if (this.a == dwvhVar.a() && this.b.equals(dwvhVar.c()) && ekjz.h(this.c, dwvhVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CardCarousel{cardWidth=" + this.a + ", jsonSource=" + this.b + ", cards=" + String.valueOf(this.c) + "}";
    }
}
