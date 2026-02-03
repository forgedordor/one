package defpackage;

import com.google.android.apps.aicore.aidl.IDownloadListener2;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sod extends IDownloadListener2.Stub {
    final /* synthetic */ smq a;
    final /* synthetic */ kog b;
    final /* synthetic */ sol c;
    final /* synthetic */ ejcr d;

    public sod(sol solVar, ejcr ejcrVar, smq smqVar, kog kogVar) {
        this.d = ejcrVar;
        this.a = smqVar;
        this.b = kogVar;
        this.c = solVar;
    }

    @Override // com.google.android.apps.aicore.aidl.IDownloadListener2
    public final void onDownloadCompleted(String str) {
        final ejcr ejcrVar = this.d;
        final smq smqVar = this.a;
        this.c.e.execute(new Runnable() { // from class: sob
            @Override // java.lang.Runnable
            public final void run() {
                ejcrVar.a(smqVar);
            }
        });
        this.b.b(null);
    }

    @Override // com.google.android.apps.aicore.aidl.IDownloadListener2
    public final void onDownloadFailed(String str, final int i, String str2) {
        final smo smoVar = new smo(1, i == 1 ? 501 : 0, String.format(Locale.ENGLISH, "Feature %s failed with failure status %d and error %s.", str, Integer.valueOf(i), str2), null);
        final ejcr ejcrVar = this.d;
        final smq smqVar = this.a;
        this.c.e.execute(new Runnable() { // from class: snz
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i != 1 ? 0 : 1;
                ejcrVar.b(smqVar, i2, smoVar);
            }
        });
        this.b.c(smoVar);
    }

    @Override // com.google.android.apps.aicore.aidl.IDownloadListener2
    public final void onDownloadProgress(String str, final long j) {
        final ejcr ejcrVar = this.d;
        final smq smqVar = this.a;
        this.c.e.execute(new Runnable() { // from class: soc
            @Override // java.lang.Runnable
            public final void run() {
                ejcrVar.c(smqVar, j);
            }
        });
    }

    @Override // com.google.android.apps.aicore.aidl.IDownloadListener2
    public final void onDownloadStarted(String str, final long j) {
        final ejcr ejcrVar = this.d;
        final smq smqVar = this.a;
        this.c.e.execute(new Runnable() { // from class: soa
            @Override // java.lang.Runnable
            public final void run() {
                ejcrVar.d(smqVar, j);
            }
        });
    }
}
