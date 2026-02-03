package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmf extends dwjk {
    private ejwi a;
    private ejwi b;
    private ejwi c;
    private ejwi d;
    private long e;
    private dwji f;
    private dwji g;
    private byte h;

    public dwmf() {
        ejud ejudVar = ejud.a;
        this.a = ejudVar;
        this.b = ejudVar;
        this.c = ejudVar;
        this.d = ejudVar;
    }

    @Override // defpackage.dwjk
    public final dwjr a() {
        dwji dwjiVar;
        dwji dwjiVar2;
        if (this.h == 1 && (dwjiVar = this.f) != null && (dwjiVar2 = this.g) != null) {
            return new dwmg(this.a, this.b, this.c, this.d, this.e, dwjiVar, dwjiVar2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == 0) {
            sb.append(" actionTriggeredLogId");
        }
        if (this.f == null) {
            sb.append(" actionPayload");
        }
        if (this.g == null) {
            sb.append(" eventCallbackFailureActionPayload");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwjk
    public final void b(dwji dwjiVar) {
        this.f = dwjiVar;
    }

    @Override // defpackage.dwjk
    public final void c(long j) {
        this.e = j;
        this.h = (byte) 1;
    }

    @Override // defpackage.dwjk
    public final void g(dwjl dwjlVar) {
        this.d = ejwi.j(dwjlVar);
    }

    @Override // defpackage.dwjk
    public final void h(dwji dwjiVar) {
        this.g = dwjiVar;
    }

    @Override // defpackage.dwjk
    public final void j(String str) {
        this.c = ejwi.j(str);
    }

    @Override // defpackage.dwjk
    public final void k(String str) {
        this.b = ejwi.j(str);
    }

    @Override // defpackage.dwjk
    public final void o(String str) {
        this.a = ejwi.j(str);
    }
}
