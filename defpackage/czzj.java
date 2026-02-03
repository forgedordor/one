package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.search.ZeroStateSearchBox;
import com.google.android.apps.messaging.ui.search.homeview.ZeroStateSearchHomeView;
import com.google.android.apps.messaging.ui.search.presenter.ConversationFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.FreeTextFilterDataItem;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchMultipleResultsView;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchResultsView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czzj implements czyu {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/search/ZeroStateSearchFragmentPeer");
    public egps A;
    public ZeroStateSearchBox B;
    public ZeroStateSearchHomeView C;
    public ZeroStateSearchMultipleResultsView D;
    public ZeroStateSearchResultsView E;
    public View F;
    public View G;
    public int H;
    public int I;
    public float J;
    public long K;
    public boolean L;
    public ViewTreeObserver.OnPreDrawListener M;
    public View N;
    public boolean O;
    private final fcsu P;
    private final fcsu Q;
    public final ea b;
    public final dacu c;
    public final avmp d;
    public final daoe e;
    public final cogw f;
    public final dabl g;
    public final eilo h;
    public final ajfo i;
    public final egpr j;
    public final ehbb k;
    public final tlt l;
    public final fcsu m;
    public final fcsu n;
    public final efwo o;
    public final fcsu p;
    public final fcsu q;
    public final fcsu r;
    public final fcsu s;
    public final fcsu t;
    public final fcsu u;
    public final fcsu v;
    public final fcsu w;
    public final fcsu x;
    public final fcsu y;
    public final egps z = new czzh(this);

    public czzj(ea eaVar, dacu dacuVar, avmp avmpVar, daoe daoeVar, cogw cogwVar, dabl dablVar, eilo eiloVar, ajfo ajfoVar, egpr egprVar, tlt tltVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, efwo efwoVar, ehbb ehbbVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14) {
        this.b = eaVar;
        this.c = dacuVar;
        this.d = avmpVar;
        this.e = daoeVar;
        this.f = cogwVar;
        this.g = dablVar;
        this.h = eiloVar;
        this.i = ajfoVar;
        this.j = egprVar;
        this.l = tltVar;
        this.m = fcsuVar;
        this.P = fcsuVar2;
        this.n = fcsuVar3;
        this.o = efwoVar;
        this.k = ehbbVar;
        this.p = fcsuVar4;
        this.q = fcsuVar5;
        this.r = fcsuVar6;
        this.s = fcsuVar7;
        this.t = fcsuVar8;
        this.u = fcsuVar9;
        this.Q = fcsuVar10;
        this.v = fcsuVar11;
        this.w = fcsuVar12;
        this.x = fcsuVar13;
        this.y = fcsuVar14;
    }

    static final void e(View view, WindowInsets windowInsets, int i) {
        View viewFindViewById = view.findViewById(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = windowInsets.getSystemWindowInsetTop();
            viewFindViewById.setLayoutParams(marginLayoutParams);
        }
    }

    final void a(Recipient recipient) {
        this.j.h(new egpq(((ajln) this.P.b()).m(ekgb.r(recipient), null)), new egpo(recipient), this.z);
    }

    final void b(bxwt bxwtVar) {
        dacu dacuVar = this.c;
        ConversationFilterDataItem conversationFilterDataItemM = dacuVar.m();
        conversationFilterDataItemM.getClass();
        ConversationIdType conversationIdType = conversationFilterDataItemM.a().a;
        FreeTextFilterDataItem freeTextFilterDataItemN = dacuVar.n();
        freeTextFilterDataItemN.getClass();
        String str = freeTextFilterDataItemN.a().a;
        MessageIdType messageIdType = bary.a;
        if (!bxwtVar.g().isEmpty()) {
            messageIdType = new MessageIdType(((Long) ekis.j(bxwtVar.g())).longValue());
        }
        try {
            ((afzc) this.Q.b()).h(new agbx(conversationIdType, messageIdType, str, this.l.a));
            dabl dablVar = this.g;
            dablVar.h(6, bxwtVar);
            dablVar.a();
        } catch (afzb e) {
            throw new IllegalArgumentException("navigation target disabled", e);
        }
    }

    final void c(View view, WindowInsets windowInsets, int i, int i2, int i3, int i4) {
        view.findViewById(i3).setPadding(i2, i + this.b.B().getDimensionPixelSize(i4), i2, windowInsets.getSystemWindowInsetBottom());
    }

    final boolean d(View view) {
        if (this.N == view) {
            return false;
        }
        long jMax = Math.max(0L, this.K - this.f.f().toEpochMilli());
        View view2 = this.N;
        ZeroStateSearchMultipleResultsView zeroStateSearchMultipleResultsView = this.D;
        if (view2 == zeroStateSearchMultipleResultsView) {
            zeroStateSearchMultipleResultsView.setOnScrollChangeListener(null);
        } else {
            ZeroStateSearchResultsView zeroStateSearchResultsView = this.E;
            if (view2 == zeroStateSearchResultsView) {
                zeroStateSearchResultsView.C();
            }
        }
        final View view3 = this.N;
        if (view3 != null) {
            if (view3.getAlpha() == 0.0f) {
                view3.setVisibility(8);
            } else {
                view3.animate().alpha(0.0f).setStartDelay(0L).setDuration(this.I).withEndAction(new Runnable() { // from class: czyx
                    @Override // java.lang.Runnable
                    public final void run() {
                        view3.setVisibility(8);
                    }
                });
                jMax = Math.max(jMax, this.I);
            }
        }
        this.N = view;
        if (view == null) {
            return true;
        }
        view.setAlpha(0.0f);
        this.N.setTranslationY(this.J);
        this.N.setVisibility(0);
        this.N.animate().alpha(1.0f).translationY(0.0f).setStartDelay(this.N != null ? jMax : 0L).setDuration(this.H).setInterpolator(new lue()).withEndAction(new Runnable() { // from class: czyy
            @Override // java.lang.Runnable
            public final void run() {
                czzj czzjVar = this.a;
                if (czzjVar.N == czzjVar.C) {
                    ZeroStateSearchBox zeroStateSearchBox = czzjVar.B;
                    ea eaVar = czzjVar.b;
                    zeroStateSearchBox.e(eaVar.G(), czzjVar.C, eaVar.P());
                }
                if (czzjVar.N == czzjVar.G) {
                    ZeroStateSearchBox zeroStateSearchBox2 = czzjVar.B;
                    ea eaVar2 = czzjVar.b;
                    zeroStateSearchBox2.e(eaVar2.G(), czzjVar.G, eaVar2.P());
                }
            }
        });
        View view4 = this.N;
        ZeroStateSearchMultipleResultsView zeroStateSearchMultipleResultsView2 = this.D;
        if (view4 == zeroStateSearchMultipleResultsView2) {
            zeroStateSearchMultipleResultsView2.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: czzc
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view5, int i, int i2, int i3, int i4) {
                    if (i2 != i4) {
                        czzj czzjVar = this.a;
                        czzjVar.e.e(czzjVar.b.z(), view5);
                    }
                }
            });
        } else {
            ZeroStateSearchResultsView zeroStateSearchResultsView2 = this.E;
            if (view4 == zeroStateSearchResultsView2) {
                zeroStateSearchResultsView2.y(new czzg(this));
            }
        }
        View view5 = this.N;
        ZeroStateSearchMultipleResultsView zeroStateSearchMultipleResultsView3 = this.D;
        if (view5 == zeroStateSearchMultipleResultsView3) {
            zeroStateSearchMultipleResultsView3.scrollTo(0, 0);
            return true;
        }
        ZeroStateSearchResultsView zeroStateSearchResultsView3 = this.E;
        if (view5 != zeroStateSearchResultsView3) {
            return true;
        }
        zeroStateSearchResultsView3.aj(0);
        return true;
    }
}
