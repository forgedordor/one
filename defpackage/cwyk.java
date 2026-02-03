package defpackage;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwyk extends ClickableSpan {
    final /* synthetic */ Context a;
    final /* synthetic */ cwyl b;

    public cwyk(cwyl cwylVar, Context context) {
        this.a = context;
        this.b = cwylVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Context context = this.a;
        TextView textView = this.b.d;
        String strA = cpef.a(context);
        czqx.d(context, textView, czqx.a(context.getString(R.string.google_tos_chat_features_tooltip_v2, strA), strA, context.getString(R.string.google_tos_chat_features_learn_more_url, craf.c(context).getLanguage())), context.getResources().getDimensionPixelSize(R.dimen.chat_features_tooltip_bottom_margin));
    }
}
