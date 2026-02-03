package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejmh extends ejml {
    public ekfw a;
    public ekgb b;
    public ekfw c;
    public ekgb d;
    private String e;
    private String f;
    private String g;
    private String h;
    private ezor i;

    @Override // defpackage.ejml
    public final ejmm a() {
        String str;
        String str2;
        String str3;
        ezor ezorVar;
        ekfw ekfwVar = this.a;
        if (ekfwVar != null) {
            this.b = ekfwVar.g();
        } else if (this.b == null) {
            int i = ekgb.d;
            this.b = ekoe.a;
        }
        ekfw ekfwVar2 = this.c;
        if (ekfwVar2 != null) {
            this.d = ekfwVar2.g();
        } else if (this.d == null) {
            int i2 = ekgb.d;
            this.d = ekoe.a;
        }
        String str4 = this.e;
        if (str4 != null && (str = this.f) != null && (str2 = this.g) != null && (str3 = this.h) != null && (ezorVar = this.i) != null) {
            return new ejmi(str4, str, str2, str3, this.b, this.d, ezorVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" text");
        }
        if (this.f == null) {
            sb.append(" canonicalText");
        }
        if (this.g == null) {
            sb.append(" categoryHrid");
        }
        if (this.h == null) {
            sb.append(" type");
        }
        if (this.i == null) {
            sb.append(" amount");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ejml
    public final ekfw b() {
        if (this.a == null) {
            if (this.b == null) {
                int i = ekgb.d;
                this.a = new ekfw();
            } else {
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                this.a = ekfwVar;
                ekfwVar.j(this.b);
                this.b = null;
            }
        }
        return this.a;
    }

    @Override // defpackage.ejml
    public final void c(ezor ezorVar) {
        if (ezorVar == null) {
            throw new NullPointerException("Null amount");
        }
        this.i = ezorVar;
    }

    @Override // defpackage.ejml
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null canonicalText");
        }
        this.f = str;
    }

    @Override // defpackage.ejml
    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null categoryHrid");
        }
        this.g = str;
    }

    @Override // defpackage.ejml
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.e = str;
    }

    @Override // defpackage.ejml
    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.h = str;
    }
}
