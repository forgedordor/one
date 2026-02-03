package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.setupcompat.internal.TemplateLayout;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efue implements efsy {
    public final TemplateLayout a;
    public float c;
    public float d;
    public int e;
    private float g;
    public boolean b = false;
    final ArrayList f = new ArrayList();

    public efue(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        TextView textViewA;
        TextView textViewA2;
        this.a = templateLayout;
        TypedArray typedArrayObtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, efrm.c, i, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(4);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(5);
        typedArrayObtainStyledAttributes.recycle();
        if (a() != null) {
            a().getTextSize();
            a().getLineHeight();
        }
        c();
        if (text != null && (textViewA2 = a()) != null) {
            if (this.b) {
                b(textViewA2);
            }
            textViewA2.setText(text);
        }
        if (colorStateList == null || (textViewA = a()) == null) {
            return;
        }
        textViewA.setTextColor(colorStateList);
    }

    public final TextView a() {
        return (TextView) this.a.g(R.id.suc_layout_title);
    }

    public final void b(TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setTextSize(0, this.g);
        textView.getTextSize();
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setLineHeight(Math.round(this.d + this.g));
            textView.getLineHeight();
        }
        textView.setMaxLines(6);
        efud efudVar = new efud(this, textView);
        textView.getViewTreeObserver().addOnPreDrawListener(efudVar);
        this.f.add(efudVar);
    }

    public final void c() {
        TemplateLayout templateLayout = this.a;
        Context context = templateLayout.getContext();
        if (!efuo.c(templateLayout)) {
            this.b = false;
            return;
        }
        efsj efsjVarH = efsj.h(context);
        efsh efshVar = efsh.CONFIG_HEADER_AUTO_SIZE_ENABLED;
        if (efsjVarH.t(efshVar)) {
            this.b = efsj.h(context).l(context, efshVar, this.b);
        }
        if (this.b) {
            Context context2 = templateLayout.getContext();
            efsj efsjVarH2 = efsj.h(context2);
            efsh efshVar2 = efsh.CONFIG_HEADER_AUTO_SIZE_MAX_TEXT_SIZE;
            if (efsjVarH2.t(efshVar2)) {
                this.g = efsj.h(context2).a(context2, efshVar2);
            }
            efsj efsjVarH3 = efsj.h(context2);
            efsh efshVar3 = efsh.CONFIG_HEADER_AUTO_SIZE_MIN_TEXT_SIZE;
            if (efsjVarH3.t(efshVar3)) {
                this.c = efsj.h(context2).a(context2, efshVar3);
            }
            efsj efsjVarH4 = efsj.h(context2);
            efsh efshVar4 = efsh.CONFIG_HEADER_AUTO_SIZE_LINE_SPACING_EXTRA;
            if (efsjVarH4.t(efshVar4)) {
                this.d = efsj.h(context2).a(context2, efshVar4);
            }
            efsj efsjVarH5 = efsj.h(context2);
            efsh efshVar5 = efsh.CONFIG_HEADER_AUTO_SIZE_MAX_LINE_OF_MAX_SIZE;
            if (efsjVarH5.t(efshVar5)) {
                this.e = efsj.h(context2).d(context2, efshVar5, 0);
            }
            if (this.e > 0) {
                float f = this.c;
                if (f > 0.0f && this.g >= f) {
                    return;
                }
            }
            Log.w("HeaderMixin", "Invalid configs, disable auto text size.");
            this.b = false;
        }
    }
}
