package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.banner.HomeBannerView;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxj extends vo implements actw {
    public final Optional a;
    private final fcsu d;

    public acxj(Optional optional, fcsu fcsuVar) {
        this.a = optional;
        this.d = fcsuVar;
    }

    @Override // defpackage.vo
    public final int a() {
        Optional optional = this.a;
        if (optional.isEmpty()) {
            return 0;
        }
        actg actgVar = (actg) optional.get();
        return (actgVar.h && actgVar.g) ? 1 : 0;
    }

    @Override // defpackage.actw
    public final void b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            ejwl.a(1 == a());
            s(0);
        } else if (i2 != 1) {
            ejwl.a(1 == a());
            q(0);
        } else {
            ejwl.a(1 == (a() ^ 1));
            y(0);
        }
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return 2;
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        Optional optional = this.a;
        optional.isPresent();
        ejwl.m(true, "Tried to create prefix ViewHolder when no home banner host was present");
        return new acwi(LayoutInflater.from(viewGroup.getContext()).inflate(true != ((asgt) ((actg) optional.get()).d.b()).a() ? R.layout.banner_view_v3 : R.layout.banner_view_coolranch, viewGroup, false));
    }

    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        int i2 = ekgb.d;
        z(wvVar, i, ekoe.a);
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        return 2147483646L;
    }

    @Override // defpackage.vo
    public final void z(wv wvVar, int i, List list) {
        if (i >= a()) {
            return;
        }
        Optional optional = this.a;
        optional.isPresent();
        eifp eifpVarA = ((eidm) this.d.b()).a("ConversationListPrefixAdapter#onBindViewHolder");
        try {
            Object obj = optional.get();
            View view = wvVar.a;
            if (((actg) obj).h) {
                final acua acuaVarH = ((HomeBannerView) view).H();
                final actn actnVar = ((actg) obj).e;
                actnVar.k();
                acuaVarH.c.setImageResource(actnVar.a());
                Button button = acuaVarH.g;
                button.setText(actnVar.f());
                eigp eigpVar = acuaVarH.a;
                button.setOnClickListener(new eifs(eigpVar, "com/google/android/apps/messaging/home/banner/HomeBannerViewPeer", "bindData", 66, "HomeBannerViewPeer#onNegativeButtonClick", new View.OnClickListener() { // from class: acty
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        actnVar.c().a(acuaVarH.b, view2);
                    }
                }));
                if (actnVar.h() != null) {
                    TextView textView = acuaVarH.d;
                    textView.setText(actnVar.h());
                    textView.setVisibility(0);
                } else {
                    acuaVarH.d.setVisibility(8);
                }
                if (actnVar.e() != null) {
                    TextView textView2 = acuaVarH.e;
                    textView2.setText(actnVar.e());
                    textView2.setVisibility(0);
                } else {
                    acuaVarH.e.setVisibility(8);
                }
                if (actnVar.g() != null) {
                    Button button2 = acuaVarH.f;
                    button2.setText(actnVar.g());
                    button2.setOnClickListener(new eifs(eigpVar, "com/google/android/apps/messaging/home/banner/HomeBannerViewPeer", "bindData", 86, "HomeBannerViewPeer#onPositiveButtonClick", new View.OnClickListener() { // from class: actz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            actm actmVarD = actnVar.d();
                            actmVarD.getClass();
                            actmVarD.a(acuaVarH.b, view2);
                        }
                    }));
                    button2.setVisibility(0);
                } else {
                    acuaVarH.f.setVisibility(8);
                }
                actnVar.b().n();
            }
            eifpVarA.close();
        } finally {
        }
    }
}
