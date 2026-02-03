package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class ehri implements fcsu {
    public final /* synthetic */ ehrj a;
    public final /* synthetic */ fcsu b;

    public /* synthetic */ ehri(ehrj ehrjVar, fcsu fcsuVar) {
        this.a = ehrjVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.fcsu
    public final Object b() {
        eidm eidmVar = this.a.a;
        fcsu fcsuVar = this.b;
        eifp eifpVarA = eidmVar.a("GlideApp.with");
        try {
            eifp eifpVarK = eidc.k();
            try {
                rbv rbvVar = (rbv) fcsuVar.b();
                eifpVarK.close();
                eifpVarA.close();
                return rbvVar;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
