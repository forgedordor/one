package defpackage;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ActionMode;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserActivity;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyzj {
    public final GalleryBrowserActivity a;
    public final ea b;
    private final ActionMode.Callback c = new cyzi(this);

    /* compiled from: PG */
    public final class a implements einb {
    }

    public cyzj(ea eaVar) {
        this.b = eaVar;
        this.a = (GalleryBrowserActivity) eaVar.G();
    }

    private final boolean c() {
        return this.a.V().isPresent();
    }

    public final void a() {
        GalleryBrowserActivity galleryBrowserActivity = this.a;
        im imVarK = galleryBrowserActivity.k();
        int iC = ((cyvb) galleryBrowserActivity).n.c(GalleryContentItem.class);
        String quantityString = iC > 0 ? ((Boolean) cyzf.a.e()).booleanValue() ? galleryBrowserActivity.getResources().getQuantityString(R.plurals.mediapicker_gallery_title_selection_alternate, iC, Integer.valueOf(iC)) : galleryBrowserActivity.getResources().getQuantityString(R.plurals.mediapicker_gallery_title_selection, iC, Integer.valueOf(iC)) : galleryBrowserActivity.getResources().getString(R.string.mediapicker_gallery_title);
        int iD = eehg.d(galleryBrowserActivity, iC > 0 ? R.attr.colorPrimaryBrandIcon : android.R.attr.colorControlNormal, "FullscreenGalleryActionBarController");
        if (iC <= 0) {
            if (c()) {
                galleryBrowserActivity.W();
                Drawable drawable = galleryBrowserActivity.getDrawable(R.drawable.quantum_ic_arrow_back_black_24);
                if (imVarK != null) {
                    imVarK.setHomeAsUpIndicator(drawable);
                }
            }
            SpannableString spannableString = new SpannableString(quantityString);
            spannableString.setSpan(new ForegroundColorSpan(iD), 0, spannableString.length(), 18);
            galleryBrowserActivity.setTitle(new SpannableString(quantityString));
            return;
        }
        if (!c()) {
            ActionMode.Callback callback = this.c;
            View view = this.b.Q;
            view.getClass();
            galleryBrowserActivity.ac(callback, view);
            Drawable drawable2 = galleryBrowserActivity.getDrawable(R.drawable.quantum_ic_close_black_24);
            if (imVarK != null) {
                imVarK.setHomeAsUpIndicator(drawable2);
            }
        }
        if (!galleryBrowserActivity.K()) {
            cuke cukeVar = ((cukf) galleryBrowserActivity).p;
            if (cukeVar != null) {
                cukeVar.a = quantityString;
                galleryBrowserActivity.Y();
                return;
            }
            return;
        }
        ActionMode actionMode = ((cukf) galleryBrowserActivity).q;
        if (actionMode == null) {
            return;
        }
        if (quantityString == null) {
            quantityString = "";
        }
        actionMode.setTitle(quantityString);
        galleryBrowserActivity.Y();
    }

    public final boolean b() {
        if (!c()) {
            return false;
        }
        this.a.W();
        return true;
    }
}
