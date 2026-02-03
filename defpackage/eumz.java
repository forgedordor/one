package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Property;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eumz implements eund {
    public final eumy a;
    public final View b;
    public ekgb c;
    boolean d;
    public final View.OnLayoutChangeListener e;
    public final Comparator f;
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private ekgb i;

    public eumz(View view) {
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        this.c = ekgbVar;
        this.i = ekgbVar;
        this.d = true;
        this.e = new eumb(this);
        this.f = new eumc();
        Context context = view.getContext();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, (context.getResources().getConfiguration().uiMode & 48) == 16 ? R.style.Theme_TextClassifier_FloatingToolbar_Light : R.style.Theme_TextClassifier_FloatingToolbar);
        View rootView = view.getRootView();
        this.b = rootView;
        this.a = new eumy(contextThemeWrapper, rootView, new eumd(this));
    }

    static AnimatorSet a(View view, int i, Animator.AnimatorListener animatorListener) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i);
        animatorSet.addListener(animatorListener);
        return animatorSet;
    }

    static View b(Context context, eunc euncVar, int i, boolean z) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.floating_popup_menu_button, (ViewGroup) null);
        if (euncVar != null) {
            h(viewInflate, euncVar, i, z);
        }
        return viewInflate;
    }

    static void h(View view, eunc euncVar, int i, boolean z) {
        TextView textView = (TextView) view.findViewById(R.id.floating_toolbar_menu_item_text);
        textView.setEllipsize(null);
        if (TextUtils.isEmpty(euncVar.h())) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(euncVar.h());
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.floating_toolbar_menu_item_image);
        if (euncVar.e() == null || !z) {
            imageView.setVisibility(8);
            if (textView != null) {
                textView.setPaddingRelative(0, 0, 0, 0);
            }
        } else {
            imageView.setVisibility(0);
            imageView.setImageDrawable(euncVar.e());
            if (textView != null) {
                textView.setPaddingRelative(i, 0, 0, 0);
            }
        }
        CharSequence charSequenceG = euncVar.g();
        if (TextUtils.isEmpty(charSequenceG)) {
            view.setContentDescription(euncVar.h());
        } else {
            view.setContentDescription(charSequenceG);
        }
    }

    @Override // defpackage.eund
    public final void c() {
        f();
        this.a.d();
        this.d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00e6 A[EDGE_INSN: B:101:0x00e6->B:29:0x00e6 BREAK  A[LOOP:1: B:21:0x00c3->B:105:0x00c3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eumz.d():void");
    }

    @Override // defpackage.eund
    public final void e(Rect rect) {
        this.g.set(rect);
    }

    public final void f() {
        this.b.removeOnLayoutChangeListener(this.e);
    }

    @Override // defpackage.eund
    public final void g() throws Resources.NotFoundException {
        if (this.a.s()) {
            d();
        }
    }

    @Override // defpackage.eund
    public final boolean i() {
        return this.a.s();
    }
}
