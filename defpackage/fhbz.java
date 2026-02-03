package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhbz implements fhbn {
    final /* synthetic */ fhbn a;
    final /* synthetic */ fhca b;

    public fhbz(fhca fhcaVar, fhbn fhbnVar) {
        this.a = fhbnVar;
        this.b = fhcaVar;
    }

    @Override // defpackage.fhbn
    public final void onFailure(fhbk fhbkVar, final Throwable th) {
        final fhbn fhbnVar = this.a;
        this.b.a.execute(new Runnable() { // from class: fhby
            @Override // java.lang.Runnable
            public final void run() {
                fhbnVar.onFailure(this.a.b, th);
            }
        });
    }

    @Override // defpackage.fhbn
    public final void onResponse(fhbk fhbkVar, final fhdv fhdvVar) {
        final fhbn fhbnVar = this.a;
        this.b.a.execute(new Runnable() { // from class: fhbx
            @Override // java.lang.Runnable
            public final void run() {
                fhbn fhbnVar2 = fhbnVar;
                fhca fhcaVar = this.a.b;
                if (fhcaVar.b.e()) {
                    fhbnVar2.onFailure(fhcaVar, new IOException("Canceled"));
                } else {
                    fhbnVar2.onResponse(fhcaVar, fhdvVar);
                }
            }
        });
    }
}
