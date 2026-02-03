package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqcg extends eqcm {
    private String a;
    private String b;
    private ekgi c;
    private ekgp d;

    @Override // defpackage.eqcm
    public final ekgi a() {
        if (this.c == null) {
            this.c = new ekgi();
        }
        return this.c;
    }

    @Override // defpackage.eqcm
    public final eqcn b() {
        String str;
        ekgi ekgiVar = this.c;
        if (ekgiVar != null) {
            this.d = ekgiVar.c();
        } else if (this.d == null) {
            this.d = ekoj.a;
        }
        String str2 = this.a;
        if (str2 != null && (str = this.b) != null) {
            return new eqch(str2, str, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" type");
        }
        if (this.b == null) {
            sb.append(" subType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eqcm
    public final String c() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"subType\" has not been set");
    }

    @Override // defpackage.eqcm
    public final String d() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"type\" has not been set");
    }

    @Override // defpackage.eqcm
    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null subType");
        }
        this.b = str;
    }

    @Override // defpackage.eqcm
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.a = str;
    }
}
