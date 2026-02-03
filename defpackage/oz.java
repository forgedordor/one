package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oz implements lfo {
    int a;
    final /* synthetic */ pa b;
    private boolean c = false;

    protected oz(pa paVar) {
        this.b = paVar;
    }

    @Override // defpackage.lfo
    public final void a() {
        if (this.c) {
            return;
        }
        pa paVar = this.b;
        paVar.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    @Override // defpackage.lfo
    public final void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.c = false;
    }

    @Override // defpackage.lfo
    public final void c() {
        this.c = true;
    }

    public final void d(lfn lfnVar, int i) {
        this.b.f = lfnVar;
        this.a = i;
    }
}
