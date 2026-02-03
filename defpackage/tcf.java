package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.backup.g1.GoogleOneRestoreService;
import com.google.android.libraries.subscriptions.restore.IG1Restore;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcf extends IG1Restore.Stub {
    final /* synthetic */ GoogleOneRestoreService a;

    public tcf(GoogleOneRestoreService googleOneRestoreService) {
        this.a = googleOneRestoreService;
    }

    @Override // com.google.android.libraries.subscriptions.restore.IG1Restore
    public final int requestRestore(Uri uri, Uri uri2, Uri uri3) throws Exception {
        GoogleOneRestoreService googleOneRestoreService = this.a;
        googleOneRestoreService.c.c("Bugle.Backup.G1.RestoreIntent.Counts");
        try {
            int iRequestRestore = googleOneRestoreService.b.requestRestore(uri, uri2, uri3);
            if (iRequestRestore != 0) {
                return iRequestRestore;
            }
            googleOneRestoreService.c.c("Bugle.Backup.G1.RestoreSuccess.Counts");
            ((cmqf) googleOneRestoreService.d.b()).k(enqq.GOOGLE_ONE_RESTORE);
            return 0;
        } catch (Exception e) {
            if (e instanceof SecurityException) {
                throw e;
            }
            ekrw ekrwVarI = GoogleOneRestoreService.a.i();
            ekrwVarI.X(eksq.a, "BugleBackup");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/backup/g1/GoogleOneRestoreService$IG1RestoreWrapper", "requestRestore", 54, "GoogleOneRestoreService.java")).t("Error in restoring G1 backup:%s", e);
            return 1;
        }
    }
}
