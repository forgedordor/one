package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvqk extends dvqx {
    private int a;
    private ejwi b;
    private ejwi c;
    private byte d;

    public dvqk() {
        ejud ejudVar = ejud.a;
        this.b = ejudVar;
        this.c = ejudVar;
    }

    @Override // defpackage.dvqx
    public final dvqy a() {
        if (this.d == 1) {
            return new dvql(this.a, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties: status");
    }

    @Override // defpackage.dvqx
    public final void b(dwju dwjuVar) {
        this.c = ejwi.j(dwjuVar);
    }

    @Override // defpackage.dvqx
    public final void c(int i) {
        this.a = i;
        this.d = (byte) 1;
    }

    @Override // defpackage.dvqx
    public final void d(dwje dwjeVar) {
        this.b = ejwi.j(dwjeVar);
    }
}
