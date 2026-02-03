package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahum implements Runnable {
    final /* synthetic */ UUID a;
    final /* synthetic */ aiad b;

    public ahum(UUID uuid, aiad aiadVar) {
        this.a = uuid;
        this.b = aiadVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        btqt btqtVarA = btqy.a();
        btqtVarA.A("RestoreWorkflowSettingsService#addAttachmentFileMetadata");
        UUID uuid = this.a;
        btqtVarA.c(new ahul(uuid));
        btor btorVar = (btor) btqtVarA.b().l();
        if (btorVar == null) {
            throw new ahui(uuid);
        }
        aiad aiadVar = this.b;
        if (!ahwd.x(btorVar)) {
            throw new IllegalStateException(a.h(uuid, "restore execution [", "] already is not active"));
        }
        String[] strArr = btsn.a;
        btrh btrhVar = new btrh();
        btrhVar.f(btorVar.k());
        btrhVar.c(aiadVar);
        btrhVar.d(btsp.b);
        btrhVar.e(btso.a);
        btrhVar.b();
    }
}
