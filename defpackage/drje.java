package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.hats20.view.ScrollViewWithSizeCallback;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class drje extends drim {
    public View ah;
    public View ai;
    public View aj;
    public ScrollViewWithSizeCallback ak;
    private ImageView al;
    private TextView d;
    private final drjd e = new drjd(this);
    private boolean ag = false;

    @Override // defpackage.ea
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.hats_survey_question_with_scrollable_content, viewGroup, false);
        this.ah = viewInflate.findViewById(R.id.hats_lib_survey_question_header_logo_text);
        TextView textView = (TextView) viewInflate.findViewById(R.id.hats_lib_survey_question_text);
        this.d = textView;
        textView.setText(dril.a(s()));
        this.d.setContentDescription(s());
        this.aj = r();
        ScrollViewWithSizeCallback scrollViewWithSizeCallback = (ScrollViewWithSizeCallback) viewInflate.findViewById(R.id.hats_survey_question_scroll_view);
        this.ak = scrollViewWithSizeCallback;
        scrollViewWithSizeCallback.addView(this.aj);
        ScrollViewWithSizeCallback scrollViewWithSizeCallback2 = this.ak;
        drjd drjdVar = this.e;
        scrollViewWithSizeCallback2.a = drjdVar;
        if (!this.ag && scrollViewWithSizeCallback2 != null) {
            scrollViewWithSizeCallback2.getViewTreeObserver().addOnScrollChangedListener(drjdVar);
            this.ag = true;
        }
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.hats_lib_prompt_banner_logo);
        this.al = imageView;
        drij.b(imageView, this.b);
        this.ai = ((eg) viewGroup.getContext()).findViewById(R.id.hats_lib_survey_controls_container);
        return viewInflate;
    }

    @Override // defpackage.drim
    public final String e() {
        return this.d.getText().toString();
    }

    @Override // defpackage.ea
    public final void i() {
        ScrollViewWithSizeCallback scrollViewWithSizeCallback;
        if (this.ag && (scrollViewWithSizeCallback = this.ak) != null) {
            scrollViewWithSizeCallback.getViewTreeObserver().removeOnScrollChangedListener(this.e);
            this.ag = false;
        }
        super.i();
    }

    @Override // defpackage.drim
    public final void q(String str) {
        this.d.setText(dril.a(str));
        this.d.setContentDescription(s());
    }

    public abstract View r();

    public abstract String s();
}
