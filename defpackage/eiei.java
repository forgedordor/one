package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class eiei implements eifp {
    public final /* synthetic */ eifp a;
    public final /* synthetic */ eifp b;
    public final /* synthetic */ eifn c;

    public /* synthetic */ eiei(eifp eifpVar, eifp eifpVar2, eifn eifnVar) {
        this.a = eifpVar;
        this.b = eifpVar2;
        this.c = eifnVar;
    }

    @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        eifp eifpVar = this.b;
        if (eifpVar != null) {
            eifpVar.close();
        }
        eidc.g(this.c);
    }
}
