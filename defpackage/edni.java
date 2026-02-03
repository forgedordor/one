package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.user.profile.photopicker.edit.EditActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edni extends rtp {
    final /* synthetic */ EditActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edni(EditActivity editActivity, int i, int i2) {
        super(i, i2);
        this.a = editActivity;
    }

    @Override // defpackage.rtp, defpackage.rua
    public final void a(Drawable drawable) {
        EditActivity editActivity = this.a;
        editActivity.A.c();
        editActivity.D();
        editActivity.B();
        editActivity.C.g();
        editActivity.C.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    @Override // defpackage.rua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void b(java.lang.Object r8, defpackage.ruk r9) throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            com.google.android.libraries.user.profile.photopicker.edit.EditActivity r9 = r7.a
            com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView r0 = r9.A
            android.graphics.drawable.Drawable r1 = r0.a
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L42
            r5 = 0
            r1.setCallback(r5)
            android.graphics.drawable.Drawable r1 = r0.a
            boolean r5 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r5 == 0) goto L20
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.Bitmap r1 = r1.getBitmap()
            if (r8 != r1) goto L20
            goto L62
        L20:
            android.graphics.drawable.Drawable r1 = r0.a
            int r1 = r1.getIntrinsicWidth()
            int r5 = r8.getWidth()
            if (r1 != r5) goto L3b
            android.graphics.drawable.Drawable r1 = r0.a
            int r1 = r1.getIntrinsicHeight()
            int r5 = r8.getHeight()
            if (r1 == r5) goto L39
            goto L3b
        L39:
            r1 = r4
            goto L3c
        L3b:
            r1 = r3
        L3c:
            r0.i = r2
            r0.c()
            goto L43
        L42:
            r1 = r4
        L43:
            android.graphics.drawable.Drawable r5 = r0.a
            if (r5 != 0) goto L57
            android.graphics.drawable.BitmapDrawable r5 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r6 = r0.getResources()
            r5.<init>(r6, r8)
            r0.a = r5
            android.graphics.drawable.Drawable r8 = r0.a
            r8.setCallback(r0)
        L57:
            r0.d(r1)
            r0.requestLayout()
            r0.invalidate()
            r0.f = r3
        L62:
            com.google.android.material.progressindicator.LinearProgressIndicator r8 = r9.B
            r0 = 8
            r8.setVisibility(r0)
            com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView r8 = r9.C
            r8.setVisibility(r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior r8 = r9.D
            r0 = 3
            r8.E(r0)
            com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView r8 = r9.A
            r8.setVisibility(r4)
            com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView r8 = r9.A
            float r8 = r8.getAlpha()
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 != 0) goto L9b
            com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView r8 = r9.A
            android.view.ViewPropertyAnimator r8 = r8.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r8 = r8.alpha(r0)
            lud r0 = new lud
            r0.<init>()
            android.view.ViewPropertyAnimator r8 = r8.setInterpolator(r0)
            r8.start()
        L9b:
            edod r8 = r9.x
            lvy r8 = r8.h
            ednh r0 = new ednh
            r0.<init>()
            r8.f(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edni.b(java.lang.Object, ruk):void");
    }

    @Override // defpackage.rua
    public final void e(Drawable drawable) {
        EditActivity editActivity = this.a;
        editActivity.A.c();
        editActivity.D();
        editActivity.B();
    }

    @Override // defpackage.rtp, defpackage.rua
    public final void f(Drawable drawable) throws Resources.NotFoundException {
        EditActivity editActivity = this.a;
        editActivity.D();
        editActivity.B.setVisibility(0);
        editActivity.D.E(5);
        editActivity.A.setVisibility(8);
    }
}
