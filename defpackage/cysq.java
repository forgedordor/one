package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.gaia.promo.GppExpressSignInTopView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cysq {
    public static final cczi a = cdag.g(cdag.b, "gpp_esi_top_view_learn_more_url", "https://support.google.com/messages/answer/7611075");

    public cysq(GppExpressSignInTopView gppExpressSignInTopView, final fcsu fcsuVar, eigp eigpVar) {
        final Context context = gppExpressSignInTopView.getContext();
        TextView textView = (TextView) gppExpressSignInTopView.findViewById(R.id.how_it_works_link);
        String str = "com/google/android/apps/messaging/ui/gaia/promo/GppExpressSignInTopViewPeer";
        textView.setOnClickListener(new eifs(eigpVar, str, "<init>", 44, "GppExpressSignInTopViewPeer#clickHowItWorks", new View.OnClickListener() { // from class: cyso
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cczi ccziVar = cysq.a;
                ((aijh) fcsuVar.b()).t(context, (String) cysq.a.e());
            }
        }));
        ScrollView scrollView = (ScrollView) gppExpressSignInTopView.findViewById(R.id.scroll_view);
        scrollView.addOnLayoutChangeListener(new cysp(scrollView, textView));
    }
}
