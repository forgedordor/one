package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class zl extends lfp {
    final /* synthetic */ int a;
    final /* synthetic */ zm b;
    private boolean c = false;

    public zl(zm zmVar, int i) {
        this.b = zmVar;
        this.a = i;
    }

    @Override // defpackage.lfp, defpackage.lfo
    public final void a() {
        if (this.c) {
            return;
        }
        zm zmVar = this.b;
        zmVar.a.setVisibility(this.a);
    }

    @Override // defpackage.lfp, defpackage.lfo
    public final void b() {
        this.b.a.setVisibility(0);
    }

    @Override // defpackage.lfp, defpackage.lfo
    public final void c() {
        this.c = true;
    }
}
