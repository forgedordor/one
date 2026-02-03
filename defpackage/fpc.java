package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpc implements ijh {
    final /* synthetic */ fpd a;

    public fpc(fpd fpdVar) {
        this.a = fpdVar;
    }

    @Override // defpackage.ijh
    public final long a() {
        fpd fpdVar = this.a;
        long jA = fpdVar.c.a();
        if (jA == 16) {
            fsb fsbVar = (fsb) jbe.a(fpdVar, fsd.a);
            if (fsbVar != null) {
                long j = fsbVar.a;
                if (j != 16) {
                    return j;
                }
            }
            jA = ((ije) jbe.a(fpdVar, C0001for.a)).i;
            boolean zM = ((fod) jbe.a(fpdVar, fof.a)).m();
            float fA = ijg.a(jA);
            if (!zM && fA < 0.5d) {
                return ije.d;
            }
        }
        return jA;
    }
}
