package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhcl implements fhbn {
    final /* synthetic */ fdis a;

    public fhcl(fdis fdisVar) {
        this.a = fdisVar;
    }

    @Override // defpackage.fhbn
    public final void onFailure(fhbk fhbkVar, Throwable th) {
        this.a.w(fctl.a(th));
    }

    @Override // defpackage.fhbn
    public final void onResponse(fhbk fhbkVar, fhdv fhdvVar) {
        this.a.w(fhdvVar);
    }
}
