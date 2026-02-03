package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dymt extends ConstraintLayout {
    public dymt(Context context, CharSequence charSequence, Drawable drawable) throws Resources.NotFoundException {
        super(context);
        boolean z = true;
        LayoutInflater.from(context).inflate(R.layout.og_tooltip_content, (ViewGroup) this, true);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.og_slim_card_spacing);
        int[] iArr = ley.a;
        setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        CharSequence string = dyrb.a(context) ? context.getString(R.string.og_a11y_close) : null;
        e(R.id.og_tooltip_title, null);
        e(R.id.og_tooltip_detail, charSequence);
        e(R.id.og_tooltip_dismiss_button, string);
        boolean zIsEmpty = TextUtils.isEmpty(null);
        boolean z2 = !zIsEmpty;
        if (drawable != null) {
            ImageView imageView = (ImageView) findViewById(R.id.image);
            kte kteVar = (kte) imageView.getLayoutParams();
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(true != z2 ? R.dimen.og_slim_card_image_size_small : R.dimen.og_slim_card_image_size_large);
            kteVar.height = dimensionPixelSize2;
            kteVar.width = dimensionPixelSize2;
            if (zIsEmpty) {
                z2 = false;
            } else {
                ktp ktpVar = new ktp();
                ktpVar.d(this);
                ktpVar.f(R.id.image, 3, 0, 3);
                ktpVar.f(R.id.image, 4, 0, 4);
                ktpVar.c(this);
                kteVar.H = 0.0f;
                z2 = true;
            }
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
        }
        TextView textView = (TextView) findViewById(R.id.og_tooltip_detail);
        if (z2) {
            textView.setTextAppearance(dypw.d(context, R.attr.ogTextAppearanceBody2));
            textView.setTextColor(dqoc.a(context, R.attr.slimCardDetailWithTitleTextColor));
        } else {
            textView.setTextAppearance(dypw.d(context, R.attr.ogTextAppearanceBody1));
            textView.setTextColor(dqoc.a(context, R.attr.slimCardDetailTextColor));
            z = false;
        }
        String str = String.valueOf(charSequence) + "\n" + context.getString(R.string.og_open_account_and_settings);
        setContentDescription(z ? "null\n".concat(str) : str);
    }

    private final void e(int i, CharSequence charSequence) {
        TextView textView = (TextView) findViewById(i);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
    }
}
