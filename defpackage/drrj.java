package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drrj implements drrs {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerPopupViewController");
    public final Context b;
    public View.OnClickListener c;
    private PopupWindow d;
    private final boolean e;
    private final View.OnClickListener f = new drri(this);

    public drrj(Context context, boolean z) {
        this.b = context;
        this.e = z;
    }

    @Override // defpackage.drrs
    public final void a() {
        PopupWindow popupWindow = this.d;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // defpackage.drrs
    public final void b() {
        PopupWindow popupWindow = this.d;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.d.dismiss();
    }

    @Override // defpackage.drrs
    public final void c(final View view, View view2, ekgb ekgbVar, final PopupWindow.OnDismissListener onDismissListener, float f, int i, int i2, int i3, int i4, drti drtiVar, CharSequence charSequence) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        View.OnClickListener onClickListener = this.f;
        Context context = this.b;
        final drrf drrfVar = new drrf(context, ekgbVar, onClickListener, (int) (i * f), (int) (i2 * f), f, drtiVar, charSequence);
        View viewB = ley.b(drrfVar, R.id.emoji_picker_popup_view_holder);
        float f2 = iArr[0];
        float width = view.getWidth();
        float fA = drrfVar.a();
        float elevation = viewB.getElevation();
        float fMax = Math.max((f2 + ((width * f) / 2.0f)) - (fA / 2.0f), i3 + elevation);
        if (drrfVar.a() + fMax >= i4) {
            fMax = (i4 - drrfVar.a()) - elevation;
        }
        int i5 = iArr[1];
        int i6 = drrfVar.k;
        int iMax = Math.max(0, i5 - (((((((i6 == 3 || i6 == 4) ? drrfVar.f + 1 : drrfVar.f) * drrfVar.g) + drrfVar.c.getPaddingTop()) + drrfVar.c.getPaddingBottom()) + drrfVar.b.getPaddingTop()) + drrfVar.b.getPaddingBottom()));
        Drawable background = viewB.getBackground();
        if (background == null && (background = context.getDrawable(R.drawable.popup_view_rounded_background)) == null) {
            background = new ColorDrawable(-7829368);
        }
        viewB.setElevation(0.0f);
        viewB.setBackground(null);
        PopupWindow popupWindow = new PopupWindow(drrfVar, -2, -2, this.e);
        this.d = popupWindow;
        popupWindow.setTouchable(drrfVar.isEnabled());
        this.d.setOutsideTouchable(true);
        this.d.setSoftInputMode(32);
        this.d.setBackgroundDrawable(background);
        this.d.setElevation(elevation);
        this.d.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: drrh
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                onDismissListener.onDismiss();
                drjt.a(this.a.b).d(view);
            }
        });
        this.d.setAnimationStyle(R.style.VariantSelectorPopupAnimation);
        if (this.d.isShowing()) {
            PopupWindow popupWindow2 = this.d;
            popupWindow2.update(iArr[0], iArr[1], popupWindow2.getWidth(), this.d.getHeight());
        } else {
            this.d.showAtLocation(view2, 0, (int) fMax, iMax);
        }
        drrfVar.post(new Runnable() { // from class: drrg
            @Override // java.lang.Runnable
            public final void run() {
                drjt.a(this.a.b).d((EmojiView) drrfVar.a.get());
            }
        });
    }
}
