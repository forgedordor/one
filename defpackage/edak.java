package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.android.libraries.user.profile.photopicker.art.edit.EditableArtView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edak extends AnimatorListenerAdapter {
    final /* synthetic */ Matrix a;
    final /* synthetic */ float b;
    final /* synthetic */ EditableArtView c;

    public edak(EditableArtView editableArtView, Matrix matrix, float f) {
        this.a = matrix;
        this.b = f;
        this.c = editableArtView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        EditableArtView editableArtView = this.c;
        Rect rect = editableArtView.c;
        float fCenterX = rect.centerX();
        float fCenterY = rect.centerY();
        Matrix matrix = this.a;
        float f = this.b;
        matrix.postRotate(f, fCenterX, fCenterY);
        editableArtView.b.set(matrix);
        editableArtView.s.k += f;
        editableArtView.invalidate();
        editableArtView.s();
    }
}
