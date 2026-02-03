package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsr implements hnx {
    final /* synthetic */ fr a;
    final /* synthetic */ ea b;
    final /* synthetic */ lsu c;
    final /* synthetic */ fdce d;

    public lsr(fr frVar, ea eaVar, lsu lsuVar, fdce fdceVar) {
        this.a = frVar;
        this.b = eaVar;
        this.c = lsuVar;
        this.d = fdceVar;
    }

    @Override // defpackage.hnx
    public final void a() {
        fr frVar = this.a;
        ea eaVar = this.b;
        this.c.a.b(frVar.d(eaVar));
        if (this.d.a) {
            cg cgVar = new cg(frVar);
            cgVar.o(eaVar);
            cgVar.d();
        } else {
            if (frVar.ag()) {
                return;
            }
            cg cgVar2 = new cg(frVar);
            cgVar2.o(eaVar);
            cgVar2.c();
        }
    }
}
