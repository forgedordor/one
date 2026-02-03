package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.libraries.user.profile.photopicker.art.edit.EditableArtView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edaj extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ EditableArtView a;

    public edaj(EditableArtView editableArtView) {
        this.a = editableArtView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            EditableArtView editableArtView = this.a;
            if (!editableArtView.n) {
                editableArtView.t.a(dsvg.b(), editableArtView);
            }
        }
        this.a.n = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        EditableArtView editableArtView = this.a;
        if (!editableArtView.u.isInProgress() && !editableArtView.l) {
            if (!editableArtView.p && editableArtView.x != 1) {
                Rect rect = editableArtView.c;
                Rect rect2 = new Rect(rect);
                int i = editableArtView.x;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                switch (i2) {
                    case 1:
                        int iMin = (int) Math.min(rect.right - motionEvent2.getX(), rect.bottom - motionEvent2.getY());
                        rect2.left = rect.right - iMin;
                        rect2.top = rect.bottom - iMin;
                        break;
                    case 2:
                        int iMin2 = (int) Math.min(rect.right - motionEvent2.getX(), motionEvent2.getY() - rect.top);
                        rect2.left = rect.right - iMin2;
                        rect2.bottom = rect.top + iMin2;
                        break;
                    case 3:
                        int iMin3 = (int) Math.min(motionEvent2.getX() - rect.left, rect.bottom - motionEvent2.getY());
                        rect2.right = rect.left + iMin3;
                        rect2.top = rect.bottom - iMin3;
                        break;
                    case 4:
                        int iMin4 = (int) Math.min(motionEvent2.getX() - rect.left, motionEvent2.getY() - rect.top);
                        rect2.right = rect.left + iMin4;
                        rect2.bottom = rect.top + iMin4;
                        break;
                    case 5:
                        int x = (int) (rect.left - motionEvent2.getX());
                        rect2.left = rect.left - x;
                        int i3 = x / 2;
                        rect2.top = rect.top - i3;
                        rect2.bottom = rect.bottom + i3;
                        break;
                    case 6:
                        int x2 = (int) (rect.right - motionEvent2.getX());
                        rect2.right = rect.right - x2;
                        int i4 = x2 / 2;
                        rect2.top = rect.top + i4;
                        rect2.bottom = rect.bottom - i4;
                        break;
                    case 7:
                        int y = (int) (rect.top - motionEvent2.getY());
                        rect2.top = rect.top - y;
                        int i5 = y / 2;
                        rect2.left = rect.left - i5;
                        rect2.right = rect.right + i5;
                        break;
                    case 8:
                        int y2 = (int) (rect.bottom - motionEvent2.getY());
                        rect2.bottom = rect.bottom - y2;
                        int i6 = y2 / 2;
                        rect2.left = rect.left + i6;
                        rect2.right = rect.right - i6;
                        break;
                }
                if (rect2.width() > rect.width()) {
                    if ((editableArtView.r.width() * rect.width()) / rect2.width() > rect.width()) {
                        editableArtView.f(rect2);
                        editableArtView.r();
                    } else {
                        editableArtView.o(editableArtView.m, rect.centerX(), rect.centerY());
                        editableArtView.d.set(rect);
                        editableArtView.f.set(editableArtView.e);
                    }
                } else if (rect2.width() > rect.width() / 4) {
                    if ((editableArtView.r.width() * rect.width()) / rect2.width() < rect.width() * fbgs.a()) {
                        editableArtView.d.set(rect2);
                        Path path = editableArtView.f;
                        path.reset();
                        path.addCircle(r12.centerX(), r12.centerY(), r12.width() / 2.0f, Path.Direction.CCW);
                        editableArtView.invalidate();
                    }
                }
            } else if (Math.abs(motionEvent2.getEventTime() - editableArtView.o) > fbgv.b()) {
                editableArtView.p = true;
                float f3 = -f;
                float f4 = -f2;
                RectF rectF = editableArtView.r;
                rectF.set(editableArtView.q);
                Matrix matrix = editableArtView.b;
                matrix.mapRect(rectF);
                Rect rect3 = editableArtView.c;
                float f5 = rect3.left;
                float f6 = rect3.right;
                float f7 = rectF.left;
                float f8 = rectF.right;
                float f9 = f6 - f5;
                float fMax = f8 - f7 < f9 ? f5 + ((f9 - (f8 + f7)) / 2.0f) : Math.max(f6 - f8, Math.min(f5 - f7, f3));
                float f10 = rect3.top;
                float f11 = rect3.bottom;
                float f12 = rectF.top;
                float f13 = rectF.bottom;
                float f14 = f11 - f10;
                matrix.postTranslate(fMax, f13 - f12 < f14 ? f10 + ((f14 - (f13 + f12)) / 2.0f) : Math.max(f11 - f13, Math.min(f10 - f12, f4)));
                editableArtView.invalidate();
                editableArtView.s();
            }
        }
        return true;
    }
}
