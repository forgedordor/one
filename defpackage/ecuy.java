package defpackage;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.surveys.internal.view.ScrollViewWithSizeCallback;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ecuy extends ecsm {
    public View ag;
    public View ah;
    public View ai;
    public ScrollViewWithSizeCallback aj;
    private TextView d;
    private final ecux e = new ecux(this);
    private boolean ak = false;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.survey_question_with_scrollable_content, viewGroup, false);
        this.ag = viewInflate.findViewById(R.id.survey_question_header_logo_text);
        this.d = (TextView) viewInflate.findViewById(R.id.survey_question_text);
        CharSequence charSequence = bundle != null ? bundle.getCharSequence("QuestionTextFromHtml") : null;
        if (charSequence == null) {
            charSequence = Html.fromHtml(s(), 0);
        }
        this.d.setText(charSequence);
        this.d.setContentDescription(charSequence.toString());
        this.ai = r();
        ScrollViewWithSizeCallback scrollViewWithSizeCallback = (ScrollViewWithSizeCallback) viewInflate.findViewById(R.id.survey_question_scroll_view);
        this.aj = scrollViewWithSizeCallback;
        scrollViewWithSizeCallback.addView(this.ai);
        ScrollViewWithSizeCallback scrollViewWithSizeCallback2 = this.aj;
        ecux ecuxVar = this.e;
        scrollViewWithSizeCallback2.a = ecuxVar;
        if (!this.ak && scrollViewWithSizeCallback2 != null) {
            scrollViewWithSizeCallback2.getViewTreeObserver().addOnScrollChangedListener(ecuxVar);
            this.ak = true;
        }
        ecrq.c((ImageView) viewInflate.findViewById(R.id.survey_prompt_banner_logo), this.c);
        ecvr ecvrVarB = b();
        if (ecvrVarB != null) {
            this.ah = ecvrVarB.b().findViewById(R.id.survey_controls_container);
        }
        ley.r(viewInflate, null);
        return viewInflate;
    }

    public final boolean aV() {
        return (z() == null || this.d == null || this.ag == null || this.ah == null || this.ai == null || this.aj == null) ? false : true;
    }

    @Override // defpackage.ea
    public final void i() {
        ScrollViewWithSizeCallback scrollViewWithSizeCallback;
        if (this.ak && (scrollViewWithSizeCallback = this.aj) != null) {
            scrollViewWithSizeCallback.getViewTreeObserver().removeOnScrollChangedListener(this.e);
            this.ak = false;
        }
        super.i();
    }

    @Override // defpackage.ea
    public void k(Bundle bundle) {
        TextView textView = this.d;
        if (textView != null) {
            bundle.putCharSequence("QuestionTextFromHtml", textView.getText());
        }
    }

    @Override // defpackage.ecsm
    public void p() {
        View view;
        ecsj ecsjVar = ecrz.c;
        if ((!ecrz.b(fblh.c(ecrz.b)) || aV()) && ecse.j(z()) && (view = this.ag) != null) {
            view.requestFocus();
            this.ag.sendAccessibilityEvent(8);
        }
    }

    @Override // defpackage.ecsm
    public final void q(String str) {
        ecsj ecsjVar = ecrz.c;
        if (!ecrz.b(fblh.c(ecrz.b)) || aV()) {
            Spanned spannedFromHtml = Html.fromHtml(str, 0);
            this.d.setText(spannedFromHtml);
            this.d.setContentDescription(spannedFromHtml.toString());
        }
    }

    public abstract View r();

    public abstract String s();
}
