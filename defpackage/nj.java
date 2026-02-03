package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nj extends lfp {
    final /* synthetic */ nk a;
    private boolean b = false;
    private int c = 0;

    public nj(nk nkVar) {
        this.a = nkVar;
    }

    @Override // defpackage.lfp, defpackage.lfo
    public final void a() {
        int i = this.c + 1;
        this.c = i;
        nk nkVar = this.a;
        if (i == nkVar.a.size()) {
            lfo lfoVar = nkVar.b;
            if (lfoVar != null) {
                lfoVar.a();
            }
            this.c = 0;
            this.b = false;
            nkVar.c = false;
        }
    }

    @Override // defpackage.lfp, defpackage.lfo
    public final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        lfo lfoVar = this.a.b;
        if (lfoVar != null) {
            lfoVar.b();
        }
    }
}
