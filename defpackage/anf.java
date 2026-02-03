package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anf {
    public ane a = null;
    final /* synthetic */ anm b;

    public anf(anm anmVar) {
        this.b = anmVar;
    }

    public final void a() {
        ane aneVar = this.a;
        if (aneVar != null) {
            aneVar.b.set(true);
            aneVar.a.cancel(true);
        }
        this.a = null;
    }

    public final boolean b() {
        ane aneVar = this.a;
        return (aneVar == null || aneVar.b.get()) ? false : true;
    }
}
