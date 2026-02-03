package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abjs implements adi {
    final /* synthetic */ abjq a;

    public abjs(abjq abjqVar) {
        this.a = abjqVar;
    }

    @Override // defpackage.adi
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            abjq.a.r("fileDownloadCallback received null uri result; aborting download");
            return;
        }
        abjq abjqVar = this.a;
        fcsu fcsuVar = abjqVar.t;
        if (fcsuVar == null) {
            abjq.a.r("saveAttachmentTaskFactory is null; aborting download");
            return;
        }
        if (abjqVar.D == null) {
            abjq.a.r("fileDownloadUri is null; aborting download");
        }
        if (abjqVar.E == null) {
            abjq.a.r("activeFileDownloadType is null; aborting download");
        }
        srv srvVarA = ((srw) fcsuVar.b()).a("Bugle.Satellite.Attachment.Save.Duration");
        srvVarA.c(abjqVar.D, (Uri) optional.get(), abjqVar.E);
        srvVarA.e(new Void[0]);
    }
}
