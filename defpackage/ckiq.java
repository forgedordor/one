package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckiq extends ckjc {
    public int a;
    private ewrp b;
    private String c;
    private String d;
    private ewlq e;
    private ewlr f;

    @Override // defpackage.ckjc
    public final ckjd a() {
        int i;
        String str;
        String str2;
        ewlq ewlqVar = this.e;
        if (ewlqVar != null) {
            this.f = (ewlr) ewlqVar.build();
        } else if (this.f == null) {
            this.f = (ewlr) ((ewlq) ewlr.a.createBuilder()).build();
        }
        ewrp ewrpVar = this.b;
        if (ewrpVar != null && (i = this.a) != 0 && (str = this.c) != null && (str2 = this.d) != null) {
            return new ckir(ewrpVar, i, str, str2, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" requestState");
        }
        if (this.a == 0) {
            sb.append(" provisioningEngineWorker");
        }
        if (this.c == null) {
            sb.append(" requestId");
        }
        if (this.d == null) {
            sb.append(" provisioningSessionId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ckjc
    public final ewlq b() {
        if (this.e == null) {
            this.e = (ewlq) ewlr.a.createBuilder();
        }
        return this.e;
    }

    @Override // defpackage.ckjc
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null provisioningSessionId");
        }
        this.d = str;
    }

    @Override // defpackage.ckjc
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null requestId");
        }
        this.c = str;
    }

    @Override // defpackage.ckjc
    public final void e(ewrp ewrpVar) {
        if (ewrpVar == null) {
            throw new NullPointerException("Null requestState");
        }
        this.b = ewrpVar;
    }
}
