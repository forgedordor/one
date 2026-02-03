package defpackage;

import android.widget.photopicker.EmbeddedPhotoPickerClient;
import android.widget.photopicker.EmbeddedPhotoPickerSession;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmye implements EmbeddedPhotoPickerClient {
    final /* synthetic */ fdap a;
    final /* synthetic */ fdap b;
    final /* synthetic */ fdap c;
    final /* synthetic */ fdap d;
    final /* synthetic */ fdae e;

    public dmye(fdap fdapVar, fdap fdapVar2, fdap fdapVar3, fdap fdapVar4, fdae fdaeVar) {
        this.a = fdapVar;
        this.b = fdapVar2;
        this.c = fdapVar3;
        this.d = fdapVar4;
        this.e = fdaeVar;
    }

    public final void onSelectionComplete() {
        this.e.invoke();
    }

    public final void onSessionError(Throwable th) {
        th.getClass();
        this.b.invoke(th);
    }

    public final void onSessionOpened(EmbeddedPhotoPickerSession embeddedPhotoPickerSession) {
        embeddedPhotoPickerSession.getClass();
        this.a.invoke(embeddedPhotoPickerSession);
    }

    public final void onUriPermissionGranted(List list) {
        list.getClass();
        this.c.invoke(list);
    }

    public final void onUriPermissionRevoked(List list) {
        list.getClass();
        this.d.invoke(list);
    }
}
