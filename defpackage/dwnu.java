package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwnu extends dwqr {
    private ejwi a;
    private ejwi b;
    private ejwi c;
    private ejwi d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private ejwi i;
    private int j;
    private byte k;

    public dwnu() {
        ejud ejudVar = ejud.a;
        this.a = ejudVar;
        this.b = ejudVar;
        this.c = ejudVar;
        this.d = ejudVar;
        this.i = ejudVar;
    }

    @Override // defpackage.dwqr
    public final dwqs a() {
        if (this.k == 31) {
            return new dwnv(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.k & 1) == 0) {
            sb.append(" timeToLiveSec");
        }
        if ((this.k & 2) == 0) {
            sb.append(" hideSnippetInConversationList");
        }
        if ((this.k & 4) == 0) {
            sb.append(" hideDismissButton");
        }
        if ((this.k & 8) == 0) {
            sb.append(" dismissibleByTappingOutside");
        }
        if ((this.k & 16) == 0) {
            sb.append(" overlayStyle");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwqr
    public final void b(dwjr dwjrVar) {
        this.a = ejwi.j(dwjrVar);
    }

    @Override // defpackage.dwqr
    public final void c(boolean z) {
        this.h = z;
        this.k = (byte) (this.k | 8);
    }

    @Override // defpackage.dwqr
    public final void d(evqs evqsVar) {
        this.b = ejwi.j(evqsVar);
    }

    @Override // defpackage.dwqr
    public final void e(String str) {
        this.d = ejwi.j(str);
    }

    @Override // defpackage.dwqr
    public final void f(int i) {
        this.i = ejwi.j(Integer.valueOf(i));
    }

    @Override // defpackage.dwqr
    public final void g(boolean z) {
        this.g = z;
        this.k = (byte) (this.k | 4);
    }

    @Override // defpackage.dwqr
    public final void h(boolean z) {
        this.f = z;
        this.k = (byte) (this.k | 2);
    }

    @Override // defpackage.dwqr
    public final void i(dwqf dwqfVar) {
        this.c = ejwi.j(dwqfVar);
    }

    @Override // defpackage.dwqr
    public final void j(int i) {
        this.j = i;
        this.k = (byte) (this.k | 16);
    }

    @Override // defpackage.dwqr
    public final void k(int i) {
        this.e = i;
        this.k = (byte) (this.k | 1);
    }
}
