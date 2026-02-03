package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejmi extends ejmm {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final ekgb e;
    private final ekgb f;
    private final ezor g;

    public ejmi(String str, String str2, String str3, String str4, ekgb ekgbVar, ekgb ekgbVar2, ezor ezorVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = ekgbVar;
        this.f = ekgbVar2;
        this.g = ezorVar;
    }

    @Override // defpackage.ejmm
    public final ekgb a() {
        return this.f;
    }

    @Override // defpackage.ejmm
    public final ekgb b() {
        return this.e;
    }

    @Override // defpackage.ejmm
    public final ezor c() {
        return this.g;
    }

    @Override // defpackage.ejmm
    public final String d() {
        return this.b;
    }

    @Override // defpackage.ejmm
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejmm) {
            ejmm ejmmVar = (ejmm) obj;
            if (this.a.equals(ejmmVar.f()) && this.b.equals(ejmmVar.d()) && this.c.equals(ejmmVar.e()) && this.d.equals(ejmmVar.g()) && ekjz.h(this.e, ejmmVar.b()) && ekjz.h(this.f, ejmmVar.a()) && this.g.equals(ejmmVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ejmm
    public final String f() {
        return this.a;
    }

    @Override // defpackage.ejmm
    public final String g() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        ezor ezorVar = this.g;
        ekgb ekgbVar = this.f;
        return "Entity{text=" + this.a + ", canonicalText=" + this.b + ", categoryHrid=" + this.c + ", type=" + this.d + ", contactAnnotations=" + String.valueOf(this.e) + ", annotations=" + String.valueOf(ekgbVar) + ", amount=" + ezorVar.toString() + "}";
    }
}
