package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckio extends ckiz {
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    public int c;
    private ewrp d;
    private String e;
    private String f;
    private String g;
    private ewlg h;
    private ewlp i;

    @Override // defpackage.ckiz
    public final ckja a() {
        int i;
        String str;
        String str2;
        String str3;
        ewlg ewlgVar = this.h;
        if (ewlgVar != null) {
            this.i = (ewlp) ewlgVar.build();
        } else if (this.i == null) {
            this.i = (ewlp) ((ewlg) ewlp.a.createBuilder()).build();
        }
        ewrp ewrpVar = this.d;
        if (ewrpVar != null && (i = this.c) != 0 && (str = this.e) != null && (str2 = this.f) != null && (str3 = this.g) != null) {
            return new ckip(ewrpVar, i, str, str2, str3, this.a, this.i, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" requestState");
        }
        if (this.c == 0) {
            sb.append(" provisioningEngineWorker");
        }
        if (this.e == null) {
            sb.append(" requestId");
        }
        if (this.f == null) {
            sb.append(" provisioningSessionId");
        }
        if (this.g == null) {
            sb.append(" constructedServerUrl");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ckiz
    public final ewlg b() {
        if (this.h == null) {
            this.h = (ewlg) ewlp.a.createBuilder();
        }
        return this.h;
    }

    @Override // defpackage.ckiz
    public final ewrp c() {
        ewrp ewrpVar = this.d;
        if (ewrpVar != null) {
            return ewrpVar;
        }
        throw new IllegalStateException("Property \"requestState\" has not been set");
    }

    @Override // defpackage.ckiz
    public final Optional d() {
        return this.a;
    }

    @Override // defpackage.ckiz
    public final String e() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"provisioningSessionId\" has not been set");
    }

    @Override // defpackage.ckiz
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null constructedServerUrl");
        }
        this.g = str;
    }

    @Override // defpackage.ckiz
    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null provisioningSessionId");
        }
        this.f = str;
    }

    @Override // defpackage.ckiz
    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null requestId");
        }
        this.e = str;
    }

    @Override // defpackage.ckiz
    public final void i(ewrp ewrpVar) {
        if (ewrpVar == null) {
            throw new NullPointerException("Null requestState");
        }
        this.d = ewrpVar;
    }
}
