package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hbq implements ikp {
    private final ikp a;
    private final hox b;
    private final ikd c = new iik((byte[]) null);
    private final ikd d = new iik((byte[]) null);

    public hbq(ikp ikpVar, hox hoxVar) {
        this.a = ikpVar;
        this.b = hoxVar;
    }

    @Override // defpackage.ikp
    public final ijz a(long j, kji kjiVar, kio kioVar) {
        ikd ikdVar = this.c;
        ikdVar.k();
        ikd ikdVar2 = this.d;
        ikdVar2.k();
        ijz ijzVarA = this.a.a(j, kjiVar, kioVar);
        if (ijzVarA instanceof ijw) {
            ikdVar.r(((ijw) ijzVarA).a);
        } else if (ijzVarA instanceof ijy) {
            ikdVar.t(((ijy) ijzVarA).a);
        } else {
            if (!(ijzVarA instanceof ijx)) {
                throw new fctg();
            }
            ikdVar.s(((ijx) ijzVarA).a);
        }
        ikdVar2.q(ikdVar, (ikd) this.b.a(), 2);
        return new ijw(ikdVar2);
    }
}
