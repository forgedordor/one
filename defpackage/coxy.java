package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coxy extends eycz {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public final fcsu b;
    public final atir c;
    private final coir d;
    private final long e;
    private final eosc f;

    public coxy(coir coirVar, fcsu fcsuVar, atir atirVar, long j, eosc eoscVar) {
        this.d = coirVar;
        this.b = fcsuVar;
        this.c = atirVar;
        this.e = j;
        this.f = eoscVar;
    }

    @Override // defpackage.eycz
    public final void a(eycv eycvVar) {
        final String str = ((eyct) eycvVar).a;
        str.getClass();
        auvh.h(eijx.f(new Runnable() { // from class: coxx
            @Override // java.lang.Runnable
            public final void run() {
                coxy coxyVar = this.a;
                atjz atjzVar = (atjz) coxyVar.b.b();
                atis atisVar = new atis(str);
                atir atirVar = coxyVar.c;
                if (atjzVar.u(atirVar, atisVar)) {
                    return;
                }
                ((eksl) ((eksl) coxy.a.j()).h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramTransferListener", "onTransferHandleReady", 83, "TachygramTransferListener.java")).D("Failed to update transfer handle in database. Transfer ID: %s. Processing ID: %s", atirVar.a, atirVar.b);
            }
        }, this.f));
    }

    @Override // defpackage.eycz
    public final void b(eycv eycvVar) {
        long jA = eycvVar.a();
        String strD = eycvVar.d();
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(coie.b, strD);
        ekslVar.X(coie.e, Long.valueOf(jA));
        ekrz ekrzVar = coie.f;
        long j = this.e;
        ekslVar.X(ekrzVar, Long.valueOf(j));
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramTransferListener", "onUploadProgress", 105, "TachygramTransferListener.java")).q("Upload progress reported.");
        cohi cohiVar = new cohi();
        cohiVar.b(jA);
        cohiVar.c(j);
        auvh.h(this.d.a(this.c, cohiVar.d()));
    }
}
