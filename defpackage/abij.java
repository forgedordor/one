package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.dittosatellite.gaia.gaiapairingsignin.GpWebTabletExpressSignInTopView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abij {
    public static final cczi a = cdag.g(cdag.b, "gp_tablet_esi_top_view_learn_more_url", "https://support.google.com/messages/answer/7611075");
    public final fcsu b;
    public final fcsu c;
    public final fdjx d;
    private final GpWebTabletExpressSignInTopView e;
    private final fcsu f;
    private final eigp g;

    /* JADX WARN: Multi-variable type inference failed */
    public abij(GpWebTabletExpressSignInTopView gpWebTabletExpressSignInTopView, fcsu fcsuVar, fcsu fcsuVar2, eigp eigpVar, fcsu fcsuVar3, fdjx fdjxVar) {
        fcsuVar2.getClass();
        eigpVar.getClass();
        fcsuVar3.getClass();
        fdjxVar.getClass();
        this.e = gpWebTabletExpressSignInTopView;
        this.f = fcsuVar;
        this.b = fcsuVar2;
        this.g = eigpVar;
        this.c = fcsuVar3;
        this.d = fdjxVar;
        final Context context = gpWebTabletExpressSignInTopView.getContext();
        TextView textView = (TextView) gpWebTabletExpressSignInTopView.findViewById(R.id.how_it_works_link);
        textView.setOnClickListener(new eifs(eigpVar, "", "", 0, "GpWebTabletExpressSignInTopViewPeer#clickHowItWorks", new View.OnClickListener() { // from class: abif
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((aijh) this.a.b.b()).t(context, (String) abij.a.e());
            }
        }));
        ScrollView scrollView = (ScrollView) gpWebTabletExpressSignInTopView.findViewById(R.id.scroll_view);
        scrollView.addOnLayoutChangeListener(new abig(scrollView, textView));
        Activity activity = (Activity) fcsuVar.b();
        if (activity instanceof abi) {
            ((abi) activity).c().b((lvj) activity, new abii(this, activity));
        }
    }
}
