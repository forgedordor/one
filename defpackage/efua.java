package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.setupcompat.internal.TemplateLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efua implements efsy {
    public final TemplateLayout a;

    public efua(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        TextView textViewA;
        TextView textViewA2;
        this.a = templateLayout;
        TypedArray typedArrayObtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, eftq.d, i, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(0);
        if (text != null && (textViewA2 = a()) != null) {
            textViewA2.setText(text);
            TextView textViewA3 = a();
            if (textViewA3 != null) {
                textViewA3.setVisibility(0);
            }
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(1);
        if (colorStateList != null && (textViewA = a()) != null) {
            textViewA.setTextColor(colorStateList);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final TextView a() {
        return (TextView) this.a.g(R.id.sud_layout_subtitle);
    }
}
