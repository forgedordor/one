package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwab extends dway {
    public ejwi a;
    public ejwi b;
    public ejwi c;
    public ejwi d;
    public ejwi e;
    private String f;
    private ejwi g;
    private ejwi h;
    private String i;
    private ekgp j;
    private ekgb k;
    private ekgb l;

    public dwab() {
        ejud ejudVar = ejud.a;
        this.a = ejudVar;
        this.g = ejudVar;
        this.h = ejudVar;
        this.b = ejudVar;
        this.c = ejudVar;
        this.d = ejudVar;
        this.e = ejudVar;
    }

    @Override // defpackage.dway
    public final dwaz a() {
        String str;
        ekgp ekgpVar;
        ekgb ekgbVar;
        ekgb ekgbVar2;
        String str2 = this.f;
        if (str2 != null && (str = this.i) != null && (ekgpVar = this.j) != null && (ekgbVar = this.k) != null && (ekgbVar2 = this.l) != null) {
            return new dwac(str2, this.a, this.g, this.h, str, this.b, ekgpVar, ekgbVar, ekgbVar2, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" name");
        }
        if (this.i == null) {
            sb.append(" contentType");
        }
        if (this.j == null) {
            sb.append(" metadata");
        }
        if (this.k == null) {
            sb.append(" menuItems");
        }
        if (this.l == null) {
            sb.append(" toolbarButtons");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dway
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentType");
        }
        this.i = str;
    }

    @Override // defpackage.dway
    public final void c(String str) {
        this.g = ejwi.j(str);
    }

    @Override // defpackage.dway
    public final void d(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null menuItems");
        }
        this.k = ekgbVar;
    }

    @Override // defpackage.dway
    public final void e(Map map) {
        this.j = ekgp.j(map);
    }

    @Override // defpackage.dway
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f = str;
    }

    @Override // defpackage.dway
    public final void g(byte[] bArr) {
        this.h = ejwi.j(bArr);
    }

    @Override // defpackage.dway
    public final void h(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null toolbarButtons");
        }
        this.l = ekgbVar;
    }
}
