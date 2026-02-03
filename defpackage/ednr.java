package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ednr extends AnimatorListenerAdapter {
    final /* synthetic */ Matrix a;
    final /* synthetic */ EditablePhotoView b;

    public ednr(EditablePhotoView editablePhotoView, Matrix matrix) {
        this.a = matrix;
        this.b = editablePhotoView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        EditablePhotoView editablePhotoView = this.b;
        Rect rect = editablePhotoView.c;
        float fCenterX = rect.centerX();
        float fCenterY = rect.centerY();
        Matrix matrix = this.a;
        matrix.postRotate(-90.0f, fCenterX, fCenterY);
        editablePhotoView.b.set(matrix);
        edoa edoaVar = editablePhotoView.q;
        edoaVar.k -= 90.0f;
        editablePhotoView.invalidate();
        editablePhotoView.f();
    }
}
