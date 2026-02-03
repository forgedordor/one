package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhej implements fhbn {
    final /* synthetic */ fhei a;

    public fhej(fhei fheiVar) {
        this.a = fheiVar;
    }

    @Override // defpackage.fhbn
    public final void onFailure(fhbk fhbkVar, Throwable th) {
        this.a.setException(th);
    }

    @Override // defpackage.fhbn
    public final void onResponse(fhbk fhbkVar, fhdv fhdvVar) {
        this.a.set(fhdvVar);
    }
}
