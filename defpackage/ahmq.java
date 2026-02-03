package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahmq implements ccqw {
    final /* synthetic */ ahmz a;

    public ahmq(ahmz ahmzVar) {
        this.a = ahmzVar;
    }

    @Override // defpackage.ccqw
    public final ccqx a(String str, cccv cccvVar, cfre cfreVar, evqs evqsVar, Instant instant, ccqv ccqvVar) {
        ahnh ahnhVar = this.a.a.a;
        cenj cenjVar = (cenj) ahnhVar.tf.b();
        eyik eyikVar = ahnhVar.tO;
        ahkn ahknVar = ahnhVar.a;
        ehtz ehtzVar = (ehtz) ahknVar.en.b();
        ehuj ehujVar = (ehuj) ahknVar.eo.b();
        esmm esmmVar = (esmm) ahnhVar.tZ.b();
        ejud ejudVar = ejud.a;
        ahnhVar.mJ();
        return new ccqx(cenjVar, new ccqr(ccrd.a(eyikVar, ehtzVar, ehujVar, esmmVar, ejudVar), ahnhVar.hK()), (ccrj) ahnhVar.uc.b(), str, cccvVar, cfreVar, evqsVar, instant, ccqvVar);
    }
}
