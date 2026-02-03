package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ednq extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ EditablePhotoView a;

    public ednq(EditablePhotoView editablePhotoView) {
        this.a = editablePhotoView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            EditablePhotoView editablePhotoView = this.a;
            if (!editablePhotoView.k) {
                editablePhotoView.r.a(dsvg.b(), editablePhotoView);
            }
        }
        this.a.k = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        EditablePhotoView editablePhotoView = this.a;
        if (!editablePhotoView.s.isInProgress() && !editablePhotoView.h && Math.abs(motionEvent2.getEventTime() - editablePhotoView.l) > fbgv.b()) {
            editablePhotoView.n = true;
            float f3 = -f;
            float f4 = -f2;
            RectF rectF = editablePhotoView.p;
            rectF.set(editablePhotoView.o);
            Matrix matrix = editablePhotoView.b;
            matrix.mapRect(rectF);
            Rect rect = editablePhotoView.c;
            float f5 = rect.left;
            float f6 = rect.right;
            float f7 = rectF.left;
            float f8 = rectF.right;
            float f9 = f6 - f5;
            float fMax = f8 - f7 < f9 ? f5 + ((f9 - (f8 + f7)) / 2.0f) : Math.max(f6 - f8, Math.min(f5 - f7, f3));
            float f10 = rect.top;
            float f11 = rect.bottom;
            float f12 = rectF.top;
            float f13 = rectF.bottom;
            float f14 = f11 - f10;
            matrix.postTranslate(fMax, f13 - f12 < f14 ? f10 + ((f14 - (f13 + f12)) / 2.0f) : Math.max(f11 - f13, Math.min(f10 - f12, f4)));
            editablePhotoView.invalidate();
            editablePhotoView.f();
        }
        return true;
    }
}
