package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.ScaleGestureDetector;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ednp extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    final /* synthetic */ EditablePhotoView a;

    public ednp(EditablePhotoView editablePhotoView) {
        this.a = editablePhotoView;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        EditablePhotoView editablePhotoView = this.a;
        float fA = editablePhotoView.a() * scaleGestureDetector.getScaleFactor();
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        float fMin = Math.min(Math.max(fA, editablePhotoView.i), editablePhotoView.j) / editablePhotoView.a();
        Matrix matrix = editablePhotoView.b;
        matrix.postScale(fMin, fMin, focusX, focusY);
        RectF rectF = editablePhotoView.p;
        rectF.set(editablePhotoView.o);
        matrix.mapRect(rectF);
        Rect rect = editablePhotoView.c;
        float f = rect.left;
        float f2 = rect.right;
        float f3 = rectF.left;
        float f4 = rectF.right;
        float f5 = f2 - f;
        float f6 = 0.0f;
        float f7 = f4 - f3 < f5 ? f + ((f5 - (f4 + f3)) / 2.0f) : f3 > f ? f - f3 : f4 < f2 ? f2 - f4 : 0.0f;
        float f8 = rect.top;
        float f9 = rect.bottom;
        float f10 = rectF.top;
        float f11 = rectF.bottom;
        float f12 = f9 - f8;
        if (f11 - f10 < f12) {
            f6 = f8 + ((f12 - (f11 + f10)) / 2.0f);
        } else if (f10 > f8) {
            f6 = f8 - f10;
        } else if (f11 < f9) {
            f6 = f9 - f11;
        }
        matrix.postTranslate(f7, f6);
        editablePhotoView.invalidate();
        editablePhotoView.f();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        EditablePhotoView editablePhotoView = this.a;
        editablePhotoView.h = editablePhotoView.g == 2;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        EditablePhotoView editablePhotoView = this.a;
        boolean z = editablePhotoView.h;
        editablePhotoView.k = !z;
        if (z) {
            editablePhotoView.r.a(dsvg.d(), editablePhotoView);
        } else {
            editablePhotoView.r.a(new dsve(22).a(), editablePhotoView);
        }
        editablePhotoView.setContentDescription(editablePhotoView.getResources().getString(R.string.op3_edit_photo_a11y_label, Float.valueOf(fbgv.j() ? editablePhotoView.b() : editablePhotoView.a())));
    }
}
