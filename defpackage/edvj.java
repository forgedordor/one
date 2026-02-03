package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.libraries.user.profile.photopicker.picker.intentonly.webview.PhotoPickerWebViewIntentActivity;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edvj extends rtp {
    final /* synthetic */ PhotoPickerWebViewIntentActivity a;

    public edvj(PhotoPickerWebViewIntentActivity photoPickerWebViewIntentActivity) {
        this.a = photoPickerWebViewIntentActivity;
    }

    @Override // defpackage.rua
    public final /* bridge */ /* synthetic */ void b(Object obj, ruk rukVar) throws IOException {
        Bitmap bitmap = (Bitmap) obj;
        try {
            PhotoPickerWebViewIntentActivity photoPickerWebViewIntentActivity = this.a;
            eddo eddoVar = photoPickerWebViewIntentActivity.p;
            Uri uri = null;
            if (eddoVar == null) {
                fdbq.c("bitmapFileSerializer");
                eddoVar = null;
            }
            Uri uri2 = photoPickerWebViewIntentActivity.s;
            if (uri2 == null) {
                fdbq.c("outputUri");
                uri2 = null;
            }
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
            OutputStream outputStreamA = eddoVar.a.a(uri2);
            try {
                bitmap.compress(compressFormat, 100, outputStreamA);
                if (outputStreamA != null) {
                    outputStreamA.close();
                }
                Intent intent = new Intent();
                PhotoPickerWebViewIntentActivity photoPickerWebViewIntentActivity2 = this.a;
                Uri uri3 = photoPickerWebViewIntentActivity2.s;
                if (uri3 == null) {
                    fdbq.c("outputUri");
                } else {
                    uri = uri3;
                }
                intent.setData(uri);
                intent.putExtra("com.google.profile.photopicker.PHOTO_SOURCE", photoPickerWebViewIntentActivity2.t);
                photoPickerWebViewIntentActivity2.setResult(-1, intent);
                photoPickerWebViewIntentActivity2.finish();
            } finally {
            }
        } catch (IOException e) {
            ((ekrd) ((ekrd) PhotoPickerWebViewIntentActivity.o.e()).g(e).h("com/google/android/libraries/user/profile/photopicker/picker/intentonly/webview/PhotoPickerWebViewIntentActivity$glideTarget$1", "onResourceReady", 89, "PhotoPickerWebViewIntentActivity.kt")).q("write to output uri failed");
            PhotoPickerWebViewIntentActivity photoPickerWebViewIntentActivity3 = this.a;
            photoPickerWebViewIntentActivity3.setResult(0);
            photoPickerWebViewIntentActivity3.finish();
        }
    }

    @Override // defpackage.rua
    public final void e(Drawable drawable) {
    }
}
