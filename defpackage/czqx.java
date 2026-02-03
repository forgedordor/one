package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czqx {
    private final fcsu a;

    public czqx(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public static Spannable a(String str, String str2, String str3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iLastIndexOf = str.lastIndexOf(str2);
        spannableStringBuilder.setSpan(new URLSpan(str3), iLastIndexOf, str2.length() + iLastIndexOf, 17);
        return spannableStringBuilder;
    }

    public static Spannable b(Context context) {
        String strA = cpef.a(context);
        return a(context.getString(R.string.google_tos_multisim_tooltip_text_v2, strA), strA, context.getString(R.string.learn_more_url, craf.c(context).getLanguage()));
    }

    public static void d(Context context, View view, Spannable spannable, int i) {
        if (view.getRootView().findViewById(R.id.google_tos_tooltip_popup_window) != null) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.google_tos_tooltip_popup_window_view, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.google_tos_tooltip_text);
        textView.setText(spannable);
        eebt.b(textView);
        eebt.c(textView);
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(Math.min(context.getResources().getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth), context.getResources().getDisplayMetrics().widthPixels), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.min(Math.max(view.getTop() - i, context.getResources().getDimensionPixelSize(R.dimen.tooltip_min_height)), context.getResources().getDisplayMetrics().heightPixels), Integer.MIN_VALUE));
        int measuredWidth = viewInflate.getMeasuredWidth();
        int measuredHeight = viewInflate.getMeasuredHeight();
        PopupWindow popupWindow = new PopupWindow(viewInflate);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(false);
        popupWindow.setWidth(measuredWidth);
        popupWindow.setHeight(measuredHeight);
        popupWindow.showAsDropDown(view, (view.getMeasuredWidth() - measuredWidth) / 2, Math.max(-(view.getMeasuredHeight() + measuredHeight + i), -(view.getMeasuredHeight() + ((int) view.getY()))));
    }

    public static final void e(final Context context, final TextView textView) throws Resources.NotFoundException {
        textView.setOnClickListener(new View.OnClickListener() { // from class: czqv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                Context context2 = context;
                czqx.d(context2, textView, czqx.b(context2), context2.getResources().getDimensionPixelSize(R.dimen.multisim_tooltip_bottom_margin));
            }
        });
        Drawable drawable = context.getResources().getDrawable(R.drawable.quantum_gm_ic_info_black_24);
        drawable.setTint(cpds.a(context, R.attr.colorOnSurfaceVariant));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        ley.p(textView, new czqw(context));
    }

    public final void c(Context context, TextView textView) throws Resources.NotFoundException {
        crof crofVarK = ((crny) this.a.b()).k();
        int iD = crofVarK.d() + 1;
        textView.setText(context.getResources().getString(R.string.google_tos_multisim_text, Integer.valueOf(iD), crofVarK.r()));
        e(context, textView);
    }
}
