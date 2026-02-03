package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfte extends dgym {
    final /* synthetic */ dftf a;

    public dfte(dftf dftfVar) {
        this.a = dftfVar;
    }

    @Override // defpackage.dgym, defpackage.dgwh
    public final void k() {
        dftf dftfVar = this.a;
        dftfVar.a.aU(this);
        efcb efcbVar = new efcb();
        efcbVar.b(dftfVar.b);
        efcbVar.c(MessagingResult.d);
        dftfVar.set(efcbVar.a());
    }
}
