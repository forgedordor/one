package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fgzw extends fgzh {
    private static final long serialVersionUID = -18595042501413L;
    protected fgyu a;

    protected fgzw() {
    }

    @Override // defpackage.fgzh
    public final String a() {
        return this.a.toString();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = new fgyu(fgxcVar);
    }

    @Override // defpackage.fgzh
    public void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        this.a.h(fgxeVar, null, z);
    }
}
