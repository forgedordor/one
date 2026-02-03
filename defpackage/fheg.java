package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fheg implements fhbn {
    final /* synthetic */ fhei a;

    public fheg(fhei fheiVar) {
        this.a = fheiVar;
    }

    @Override // defpackage.fhbn
    public final void onFailure(fhbk fhbkVar, Throwable th) {
        this.a.setException(th);
    }

    @Override // defpackage.fhbn
    public final void onResponse(fhbk fhbkVar, fhdv fhdvVar) {
        if (fhdvVar.c()) {
            this.a.set(fhdvVar.b);
        } else {
            this.a.setException(new fhem(fhdvVar));
        }
    }
}
