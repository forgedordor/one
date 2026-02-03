package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecwm extends ecsm {
    private LinearLayout d;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        this.d = (LinearLayout) layoutInflater.inflate(R.layout.survey_thank_you_fragment, viewGroup, false);
        int i = this.m.getInt("DisplayLogoResId", 0);
        ecrq.c((ImageView) this.d.findViewById(R.id.survey_prompt_banner_logo), Integer.valueOf(i));
        TextView textView = (TextView) this.d.findViewById(R.id.survey_question_text);
        Spanned spannedFromHtml = Html.fromHtml(this.b.c, 0);
        textView.setText(spannedFromHtml);
        textView.setContentDescription(spannedFromHtml.toString());
        textView.announceForAccessibility(textView.getContentDescription());
        String strF = ecse.f(this.b.e);
        if (!TextUtils.isEmpty(strF)) {
            TextView textView2 = (TextView) this.d.findViewById(R.id.survey_follow_up_url);
            ecsj ecsjVar = ecrz.c;
            if (fbky.a.get().a(A()) && i == 0 && (textView2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).setMarginStart(B().getDimensionPixelOffset(R.dimen.survey_thank_you_url_start_margin_state_no_icon));
            }
            String string = this.b.d;
            if (TextUtils.isEmpty(string)) {
                string = B().getString(R.string.survey_thank_you_followup_message);
            }
            textView2.setContentDescription(string);
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new ecwl(this, strF), 0, string.length(), 0);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setText(spannableString);
            if (ecse.j(z())) {
                textView2.setClickable(false);
                textView2.setLongClickable(false);
            }
            textView2.setOnTouchListener(new View.OnTouchListener() { // from class: ecwk
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        view.setPressed(true);
                    } else if (motionEvent.getAction() == 1) {
                        view.performClick();
                        view.setPressed(false);
                    }
                    return false;
                }
            });
            textView2.setVisibility(0);
        }
        return this.d;
    }

    @Override // defpackage.ecsm
    public final exoz e() {
        return null;
    }

    @Override // defpackage.ecsm
    public final void f() {
        if (this.d != null) {
            int i = 0;
            while (i < this.d.getChildCount()) {
                View childAt = this.d.getChildAt(i);
                childAt.setAlpha(0.0f);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150L).setStartDelay(i * 80);
            }
        }
    }

    @Override // defpackage.ecsm
    public final void p() {
        b().aZ();
        b().q(true, this);
        if (!TextUtils.isEmpty(ecse.f(this.b.e)) || b() == null) {
            return;
        }
        ecsj ecsjVar = ecrz.c;
        if (ecrz.b(fbkp.a.get().a(ecrz.b))) {
            b().f();
        }
        b().e();
    }

    @Override // defpackage.ecsm
    public final void q(String str) {
    }
}
