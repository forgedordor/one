package defpackage;

import com.google.android.libraries.user.profile.photopicker.picker.intentonly.webview.PhotoPickerWebViewIntentActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edvk implements rti {
    final /* synthetic */ PhotoPickerWebViewIntentActivity a;

    public edvk(PhotoPickerWebViewIntentActivity photoPickerWebViewIntentActivity) {
        this.a = photoPickerWebViewIntentActivity;
    }

    @Override // defpackage.rti
    public final boolean a(rhs rhsVar, Object obj, rua ruaVar, boolean z) {
        ruaVar.getClass();
        ((ekrd) ((ekrd) PhotoPickerWebViewIntentActivity.o.e()).g(rhsVar).h("com/google/android/libraries/user/profile/photopicker/picker/intentonly/webview/PhotoPickerWebViewIntentActivity$requestListener$1", "onLoadFailed", 106, "PhotoPickerWebViewIntentActivity.kt")).q("loading bitmap failed");
        PhotoPickerWebViewIntentActivity photoPickerWebViewIntentActivity = this.a;
        photoPickerWebViewIntentActivity.setResult(0);
        photoPickerWebViewIntentActivity.finish();
        return false;
    }

    @Override // defpackage.rti
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2, rua ruaVar, reb rebVar, boolean z) {
        obj2.getClass();
        rebVar.getClass();
        return false;
    }
}
