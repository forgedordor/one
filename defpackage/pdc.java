package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pdc implements Runnable {
    final /* synthetic */ pdf a;

    public pdc(pdf pdfVar) {
        this.a = pdfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pdf pdfVar = this.a;
        pde pdeVar = pdfVar.a;
        int iA = (int) (pdeVar.a() * 0.125f);
        int iA2 = pdfVar.d.y <= iA ? pdfVar.d.y - iA : pdfVar.d.y >= pdeVar.a() - iA ? (pdfVar.d.y - pdeVar.a()) + iA : 0;
        if (iA2 == 0) {
            return;
        }
        if (!pdfVar.e) {
            if (Math.abs(pdfVar.c.y - pdfVar.d.y) < ((int) (pdeVar.a() * 0.125f * 0.25f))) {
                return;
            }
        }
        pdfVar.e = true;
        if (iA2 <= iA) {
            iA = iA2;
        }
        float fA = pdeVar.a();
        int iSignum = (int) Math.signum(iA);
        int iPow = (int) (iSignum * 70 * ((float) Math.pow(Math.min(1.0f, Math.abs(iA) / ((int) (fA * 0.125f))), 10.0d)));
        ((pdd) pdeVar).a.aI(0, iPow == 0 ? iSignum : iPow, -1, -1, null);
        Runnable runnable = pdfVar.b;
        pdeVar.b(runnable);
        pdeVar.c(runnable);
    }
}
