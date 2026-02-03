package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dajs {
    public static Uri a(String str, Context context) {
        return Uri.parse(str).buildUpon().appendQueryParameter("hl", craf.c(context).getLanguage()).build();
    }

    public static SpannableStringBuilder b(final Context context, final fcsu fcsuVar, final fcsu fcsuVar2, String str, String str2, final cczv cczvVar, final cczv cczvVar2) {
        return e(context, str, str2, new View.OnClickListener() { // from class: dajq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cczv cczvVar3 = cczvVar;
                Context context2 = context;
                if (cczvVar3 != null && !TextUtils.isEmpty((CharSequence) cczvVar3.e())) {
                    ((achu) fcsuVar2.b()).d(context2, (String) cczvVar3.e());
                    return;
                }
                cczv cczvVar4 = cczvVar2;
                if (cczvVar4 == null || TextUtils.isEmpty((CharSequence) cczvVar4.e())) {
                    return;
                }
                ((aijh) fcsuVar.b()).t(context2, (String) cczvVar4.e());
            }
        });
    }

    public static SpannableStringBuilder c(Context context, fcsu fcsuVar, fcsu fcsuVar2, int i, cczv cczvVar, cczv cczvVar2) {
        String strA = cpef.a(context);
        return b(context, fcsuVar, fcsuVar2, context.getString(i, strA), strA, cczvVar, cczvVar2);
    }

    public static SpannableStringBuilder d(Context context, int i) {
        String strA = cpef.a(context);
        return e(context, context.getString(i, strA), strA, null);
    }

    public static SpannableStringBuilder e(Context context, String str, String str2, View.OnClickListener onClickListener) {
        return f(context, str, str2, false, onClickListener);
    }

    public static SpannableStringBuilder f(Context context, String str, String str2, boolean z, View.OnClickListener onClickListener) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        cpef.d(context, spannableStringBuilder, str2, z, onClickListener);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder g(Context context, String str, String str2) {
        return e(context, str, str2, null);
    }

    public static void h(Context context, SpannableStringBuilder spannableStringBuilder, String str, ClickableSpan clickableSpan) {
        cpef.c(context, spannableStringBuilder, str, false, clickableSpan);
    }

    public static SpannableStringBuilder i(Context context, int i) {
        String strA = cpef.a(context);
        return f(context, context.getString(i, strA), strA, true, null);
    }
}
