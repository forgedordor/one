package defpackage;

import android.net.Uri;
import com.android.vcard.VCardConstants;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxpe implements eora {
    final /* synthetic */ Uri a;
    final /* synthetic */ bxph b;

    public bxpe(bxph bxphVar, Uri uri) {
        this.a = uri;
        this.b = bxphVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ConcurrentMap concurrentMap = this.b.c.a;
        final Uri uri = this.a;
        bxpo bxpoVar = (bxpo) concurrentMap.remove(uri);
        if (bxpoVar != null) {
            Set<bxqj> set = bxpoVar.b;
            for (final bxqj bxqjVar : set) {
                bxpoVar.c(new Runnable() { // from class: bxpj
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            bxqjVar.a(uri.toString());
                        } catch (RuntimeException e) {
                            bxpo.a.s("Error while calling #onCancel", e);
                        }
                    }
                });
            }
            set.clear();
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ekrd ekrdVar = (ekrd) bxph.a.h();
        ekrz ekrzVar = new ekrz(VCardConstants.PROPERTY_URL, Uri.class, false, false);
        Uri uri = this.a;
        ekrdVar.X(ekrzVar, uri);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader$1", "onFailure", 228, "RichCardMediaDownloadServiceDownloader.java")).q("Failed to cancel download.");
        bxpo bxpoVar = (bxpo) this.b.c.a.remove(uri);
        if (bxpoVar != null) {
            bxpoVar.a(uri, new RuntimeException(th));
        }
    }
}
