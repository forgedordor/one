package defpackage;

import android.net.Uri;
import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxpf implements eora {
    final /* synthetic */ Uri a;

    public bxpf(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ekrd ekrdVar = (ekrd) bxph.a.h();
        ekrdVar.X(new ekrz(VCardConstants.PROPERTY_URL, Uri.class, false, false), this.a);
        ekrdVar.X(new ekrz("destination", Uri.class, false, false), (Uri) obj);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader$2", "onSuccess", 305, "RichCardMediaDownloadServiceDownloader.java")).q("RBM media has been downloaded.");
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ekrd ekrdVar = (ekrd) ((ekrd) bxph.a.j()).g(th);
        ekrdVar.X(new ekrz(VCardConstants.PROPERTY_URL, Uri.class, false, false), this.a);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader$2", "onFailure", 314, "RichCardMediaDownloadServiceDownloader.java")).q("RBM media has not been downloaded.");
    }
}
