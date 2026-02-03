package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jj implements Runnable {
    final /* synthetic */ jz a;

    public jj(jz jzVar) {
        this.a = jzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz jzVar = this.a;
        jzVar.t.showAtLocation(jzVar.s, 55, 0, 0);
        jzVar.E();
        if (!jzVar.N()) {
            jzVar.s.setAlpha(1.0f);
            jzVar.s.setVisibility(0);
            return;
        }
        jzVar.s.setAlpha(0.0f);
        lfn lfnVarE = ley.e(jzVar.s);
        lfnVarE.b(1.0f);
        jzVar.v = lfnVarE;
        jzVar.v.d(new ji(this));
    }
}
