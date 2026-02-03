package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.user.profile.photopicker.picker.intentonly.webview.PhotoPickerWebViewIntentActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class edvi implements adi, fdbl {
    final /* synthetic */ PhotoPickerWebViewIntentActivity a;

    public edvi(PhotoPickerWebViewIntentActivity photoPickerWebViewIntentActivity) {
        this.a = photoPickerWebViewIntentActivity;
    }

    @Override // defpackage.adi
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        eddy eddyVar;
        adh adhVar = (adh) obj;
        adhVar.getClass();
        ((ekrd) PhotoPickerWebViewIntentActivity.o.e().h("com/google/android/libraries/user/profile/photopicker/picker/intentonly/webview/PhotoPickerWebViewIntentActivity", "handleActivityResult", 166, "PhotoPickerWebViewIntentActivity.kt")).q("onActivityResult for picker-only webview");
        PhotoPickerWebViewIntentActivity photoPickerWebViewIntentActivity = this.a;
        photoPickerWebViewIntentActivity.u = true;
        Intent intent = adhVar.b;
        String stringExtra = intent != null ? intent.getStringExtra("result.photoUrl") : null;
        if (stringExtra == null) {
            photoPickerWebViewIntentActivity.setResult(0);
            photoPickerWebViewIntentActivity.finish();
            return;
        }
        String stringExtra2 = intent.getStringExtra("result.photoSource");
        if (stringExtra2 == null) {
            stringExtra2 = photoPickerWebViewIntentActivity.t;
        }
        photoPickerWebViewIntentActivity.t = stringExtra2;
        Uri uriA = Uri.parse(stringExtra);
        if (photoPickerWebViewIntentActivity.v) {
            drjk drjkVar = photoPickerWebViewIntentActivity.r;
            if (drjkVar == null) {
                fdbq.c("fifeImageUrlUtil");
                drjkVar = null;
            }
            uriA = drjkVar.a(0, Uri.parse(stringExtra));
        }
        Uri uri = uriA;
        eddy eddyVar2 = photoPickerWebViewIntentActivity.q;
        if (eddyVar2 == null) {
            fdbq.c("imageManager");
            eddyVar = null;
        } else {
            eddyVar = eddyVar2;
        }
        eddyVar.e(photoPickerWebViewIntentActivity, uri, new edea(), photoPickerWebViewIntentActivity.w, photoPickerWebViewIntentActivity.x);
    }

    @Override // defpackage.fdbl
    public final fcsy b() {
        return new fdbo(1, this.a, PhotoPickerWebViewIntentActivity.class, "handleActivityResult", "handleActivityResult(Landroidx/activity/result/ActivityResult;)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof adi) && (obj instanceof fdbl)) {
            return fdbq.f(b(), ((fdbl) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
