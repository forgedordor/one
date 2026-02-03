package defpackage;

import com.google.android.apps.aicore.aidl.IDownloadListener;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class soi extends IDownloadListener.Stub {
    final /* synthetic */ smq a;
    final /* synthetic */ kog b;
    final /* synthetic */ sol c;
    final /* synthetic */ ejcr d;

    public soi(sol solVar, ejcr ejcrVar, smq smqVar, kog kogVar) {
        this.d = ejcrVar;
        this.a = smqVar;
        this.b = kogVar;
        this.c = solVar;
    }

    @Override // com.google.android.apps.aicore.aidl.IDownloadListener
    public final void onDownloadCompleted(String str) {
        final ejcr ejcrVar = this.d;
        final smq smqVar = this.a;
        this.c.e.execute(new Runnable() { // from class: sog
            @Override // java.lang.Runnable
            public final void run() {
                ejcrVar.a(smqVar);
            }
        });
        this.b.b(null);
    }

    @Override // com.google.android.apps.aicore.aidl.IDownloadListener
    public final void onDownloadFailed(String str, String str2) {
        final smo smoVar = new smo(1, 0, String.format(Locale.ENGLISH, "Feature %s failed with failure %s.", str, str2), null);
        final ejcr ejcrVar = this.d;
        final smq smqVar = this.a;
        this.c.e.execute(new Runnable() { // from class: soh
            @Override // java.lang.Runnable
            public final void run() {
                ejcrVar.b(smqVar, 0, smoVar);
            }
        });
        this.b.c(smoVar);
    }

    @Override // com.google.android.apps.aicore.aidl.IDownloadListener
    public final void onDownloadProgress(String str, final long j) {
        final ejcr ejcrVar = this.d;
        final smq smqVar = this.a;
        this.c.e.execute(new Runnable() { // from class: sof
            @Override // java.lang.Runnable
            public final void run() {
                ejcrVar.c(smqVar, j);
            }
        });
    }

    @Override // com.google.android.apps.aicore.aidl.IDownloadListener
    public final void onDownloadStarted(String str, final long j) {
        final ejcr ejcrVar = this.d;
        final smq smqVar = this.a;
        this.c.e.execute(new Runnable() { // from class: soe
            @Override // java.lang.Runnable
            public final void run() {
                ejcrVar.d(smqVar, j);
            }
        });
    }
}
