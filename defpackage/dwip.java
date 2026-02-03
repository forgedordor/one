package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwip extends dwpg {
    private String a;
    private String b;
    private dwpj c;
    private ejwi d;

    public dwip() {
        this.d = ejud.a;
    }

    @Override // defpackage.dwpg
    public final dwpk a() {
        String str;
        dwpj dwpjVar;
        String str2 = this.a;
        if (str2 != null && (str = this.b) != null && (dwpjVar = this.c) != null) {
            return new dwmy(str2, str, dwpjVar, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" id");
        }
        if (this.b == null) {
            sb.append(" tachyonAppName");
        }
        if (this.c == null) {
            sb.append(" type");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwpg
    public final void b(String str) {
        this.d = ejwi.i(str);
    }

    @Override // defpackage.dwpg
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
    }

    @Override // defpackage.dwpg
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null tachyonAppName");
        }
        this.b = str;
    }

    @Override // defpackage.dwpg
    public final void e(dwpj dwpjVar) {
        if (dwpjVar == null) {
            throw new NullPointerException("Null type");
        }
        this.c = dwpjVar;
    }

    public dwip(dwpk dwpkVar) {
        this.d = ejud.a;
        this.a = dwpkVar.d();
        this.b = dwpkVar.e();
        this.c = dwpkVar.b();
        this.d = dwpkVar.c();
    }
}
