package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.messagecell.MessageCellStatusView;
import com.google.android.libraries.messaging.lighter.ui.messagecell.TimestampHeaderView;
import com.google.android.libraries.messaging.lighter.ui.messagecell.TopLabelView;
import java.security.InvalidParameterException;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxdj extends dwyr {
    public static final /* synthetic */ int j = 0;
    private static final Handler k = new Handler(Looper.getMainLooper());
    public final Map f;
    public final ekgb g;
    int h;
    public final Handler i;
    private dxck l;
    private final dxcq m;
    private final dwje n;
    private final dwpx o;
    private final dvip p;
    private final dviy q;
    private ekgb r;
    private final dxdb s;

    public dxdj(dxck dxckVar, ekgb ekgbVar, dxdb dxdbVar, dxcq dxcqVar, dwje dwjeVar, dwpx dwpxVar, dvip dvipVar, dviy dviyVar) {
        int i;
        super(new dxcs());
        this.f = new EnumMap(dxco.class);
        this.h = -1;
        this.i = new Handler();
        this.l = dxckVar;
        this.s = dxdbVar;
        this.m = dxcqVar;
        this.n = dwjeVar;
        this.o = dwpxVar;
        this.p = dvipVar;
        this.q = dviyVar;
        this.g = ekgbVar;
        int i2 = ((ekoe) ekgbVar).c;
        int i3 = 0;
        while (i3 < i2) {
            dxcl dxclVar = (dxcl) ekgbVar.get(i3);
            Iterator it = dxclVar.a().iterator();
            while (true) {
                i = i3 + 1;
                if (it.hasNext()) {
                    this.f.put((dxco) it.next(), dxclVar);
                }
            }
            i3 = i;
        }
    }

    @Override // defpackage.dwyr
    public final wv F(ViewGroup viewGroup, int i) {
        if (fbfm.h()) {
            int iA = dwyk.a(i);
            int i2 = iA - 1;
            if (iA == 0) {
                throw null;
            }
            switch (i2) {
                case 0:
                    return ((dxcl) this.f.get(dxco.SUGGESTION_LIST)).d();
                case 1:
                    return ((dxcl) this.f.get(dxco.RICH_CARD_BUBBLE)).d();
                case 2:
                    return ((dxcl) this.f.get(dxco.TOMBSTONE_BUBBLE)).d();
                case 3:
                    dxei dxeiVar = new dxei(viewGroup.getContext());
                    return new dxdi(dxeiVar, new dxef(dxeiVar, this.n, this.o, this.p, this.q));
                case 4:
                case 5:
                case 6:
                    dxbx dxbxVar = new dxbx(viewGroup.getContext());
                    dxcj dxcjVarB = this.l.b(dxbxVar, i);
                    dxbxVar.b(dxcjVarB.a);
                    dxbxVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    dxbv dxbvVar = new dxbv(dxbxVar);
                    dxbvVar.d = this.s;
                    return new dxdh(dxbxVar, dxcjVarB, dxbvVar);
                default:
                    throw new IllegalArgumentException(a.g(i, "Unsupported viewType: "));
            }
        }
        if (i < 1024) {
            dxbx dxbxVar2 = new dxbx(viewGroup.getContext());
            dxcj dxcjVarB2 = this.l.b(dxbxVar2, i);
            dxbxVar2.b(dxcjVarB2.a);
            dxbxVar2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            dxbv dxbvVar2 = new dxbv(dxbxVar2);
            dxbvVar2.d = this.s;
            return new dxdh(dxbxVar2, dxcjVarB2, dxbvVar2);
        }
        int i3 = i - 1024;
        dxco dxcoVar = dxco.TYPING_INDICATOR;
        if (i3 == dxcoVar.f) {
            dxei dxeiVar2 = new dxei(viewGroup.getContext());
            return new dxdi(dxeiVar2, new dxef(dxeiVar2, this.n, this.o, this.p, this.q));
        }
        if (i3 == 0) {
            dxcoVar = dxco.MESSAGE_BUBBLE;
        } else if (i3 == 1) {
            dxcoVar = dxco.SUGGESTION_LIST;
        } else if (i3 == 2) {
            dxcoVar = dxco.RICH_CARD_BUBBLE;
        } else if (i3 == 3) {
            dxcoVar = dxco.TOMBSTONE_BUBBLE;
        } else if (i3 != 4) {
            throw new InvalidParameterException("Invalid MessageListCellViewModel type.");
        }
        return ((dxcl) this.f.get(dxcoVar)).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dwyr
    public final void G(wv wvVar, int i) {
        String str;
        dxcp dxcpVar = (dxcp) b(i);
        dxco dxcoVarE = dxcpVar.e();
        View view = wvVar.a;
        view.getContext();
        int iOrdinal = dxcpVar.e().ordinal();
        if (iOrdinal == 0) {
            if (((dwqw) dxcpVar.b().c().c()).h().a() == 3 && ((dwnt) ((dwqw) dxcpVar.b().c().c()).h().b()).a.equals("photos")) {
                dxcpVar.b();
                throw null;
            }
            dxcpVar.b();
            throw null;
        }
        if (iOrdinal == 2) {
            dxcpVar.c();
            throw null;
        }
        if (iOrdinal == 3) {
            dxcpVar.d();
            throw null;
        }
        view.setContentDescription(null);
        int iOrdinal2 = dxcpVar.e().ordinal();
        dxbz dxbzVarD = iOrdinal2 != 0 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : dxcpVar.d() : dxcpVar.c() : dxcpVar.b();
        if (dxcoVarE.equals(dxco.MESSAGE_BUBBLE)) {
            dxdh dxdhVar = (dxdh) wvVar;
            ((dxcd) dxdhVar.s.a).b((dwqw) dxbzVarD.c().c());
            dxbv dxbvVar = dxdhVar.t;
            dxbvVar.b = dxbzVarD;
            dxbx dxbxVar = (dxbx) dxbvVar.a;
            dwxz dwxzVar = dxbxVar.f;
            dxbvVar.c = new dwya(dwxzVar, dxbzVarD.b());
            dwya dwyaVar = dxbvVar.c;
            if (dxbvVar.b != null) {
                dwyaVar.a();
                dxbz dxbzVar = dxbvVar.b;
                if (dxbzVar.c().g()) {
                    dxbxVar.a = (dwqw) dxbzVar.c().c();
                    if (dxbxVar.a.s() - 1 != 0) {
                        ((View) dwxzVar).setVisibility(8);
                        TopLabelView topLabelView = dxbxVar.h;
                        topLabelView.setVisibility(8);
                        str = null;
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                        layoutParams.addRule(true != dvho.a(dxbxVar.getContext()) ? 11 : 9);
                        layoutParams.addRule(3, topLabelView.getId());
                        FrameLayout frameLayout = dxbxVar.g;
                        frameLayout.setLayoutParams(layoutParams);
                        dxbxVar.c.setGravity(8388613);
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                        layoutParams2.addRule(true != dvho.a(dxbxVar.getContext()) ? 7 : 5, frameLayout.getId());
                        layoutParams2.addRule(3, frameLayout.getId());
                        dxbxVar.d.setLayoutParams(layoutParams2);
                    } else {
                        str = null;
                        View view2 = (View) dwxzVar;
                        view2.setVisibility(0);
                        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                        layoutParams3.addRule(!dvho.a(dxbxVar.getContext()) ? 1 : 0, view2.getId());
                        layoutParams3.addRule(3, dxbxVar.h.getId());
                        FrameLayout frameLayout2 = dxbxVar.g;
                        frameLayout2.setLayoutParams(layoutParams3);
                        dxbxVar.c.setGravity(8388611);
                        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                        layoutParams4.addRule(true != dvho.a(dxbxVar.getContext()) ? 5 : 7, frameLayout2.getId());
                        layoutParams4.addRule(3, frameLayout2.getId());
                        dxbxVar.d.setLayoutParams(layoutParams4);
                    }
                    dwpf dwpfVarB = dxbzVar.b();
                    RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams5.addRule(true != dvho.a(dxbxVar.getContext()) ? 5 : 7, dxbxVar.g.getId());
                    TopLabelView topLabelView2 = dxbxVar.h;
                    topLabelView2.setLayoutParams(layoutParams5);
                    if (dwpfVarB.h().g()) {
                        int iB = ((dwqj) dwpfVarB.h().c()).b();
                        if (iB == 0) {
                            topLabelView2.a.setTextAppearance(dxbxVar.i);
                            topLabelView2.a(8);
                        } else if (iB == 1) {
                            topLabelView2.a.setTextAppearance(dxbxVar.j);
                            topLabelView2.a(8);
                        } else if (iB == 2) {
                            topLabelView2.a.setTextAppearance(dxbxVar.k);
                            if (dwpfVarB.i().g()) {
                                topLabelView2.a(0);
                            }
                        }
                    } else {
                        topLabelView2.a.setTextAppearance(dxbxVar.i);
                    }
                    String str2 = (String) dxbzVar.b().i().e("");
                    TextView textView = topLabelView2.a;
                    textView.setText(str2);
                    textView.setContentDescription((CharSequence) dxbzVar.b().e().e(""));
                    int iA = dxbzVar.a();
                    int iS = dxbxVar.a.s();
                    if (iA == 0) {
                        if (iS == 1) {
                            ((View) dwxzVar).setVisibility(0);
                            topLabelView2.setVisibility(0);
                        }
                        dxbxVar.b.d(20.0f, 20.0f, 20.0f, 20.0f);
                    } else if (iA != 1) {
                        if (iA != 2) {
                            if (iS == 1) {
                                ((View) dwxzVar).setVisibility(0);
                                dxbxVar.b.d(4.0f, 20.0f, 20.0f, 20.0f);
                            } else {
                                dxbxVar.b.d(20.0f, 4.0f, 20.0f, 20.0f);
                            }
                            topLabelView2.setVisibility(8);
                        } else {
                            if (iS == 1) {
                                ((View) dwxzVar).setVisibility(4);
                                dxbxVar.b.d(4.0f, 20.0f, 20.0f, 4.0f);
                            } else {
                                dxbxVar.b.d(20.0f, 4.0f, 4.0f, 20.0f);
                            }
                            topLabelView2.setVisibility(8);
                        }
                    } else if (iS == 1) {
                        ((View) dwxzVar).setVisibility(4);
                        topLabelView2.setVisibility(0);
                        dxbxVar.b.d(20.0f, 20.0f, 20.0f, 4.0f);
                    } else {
                        dxbxVar.b.d(20.0f, 20.0f, 4.0f, 20.0f);
                    }
                    MessageCellStatusView messageCellStatusView = dxbxVar.d;
                    messageCellStatusView.a(dxbzVar.d());
                    dwqw dwqwVar = (dwqw) dxbzVar.c().c();
                    messageCellStatusView.d = TimeUnit.MICROSECONDS.toMillis(dwqwVar.d());
                    dwqq dwqqVar = messageCellStatusView.e;
                    dwqq dwqqVarI = dwqwVar.i();
                    messageCellStatusView.e = dwqwVar.i();
                    messageCellStatusView.b(dwqqVar != dwqqVarI ? dwqwVar.r() : str);
                    TimestampHeaderView timestampHeaderView = dxbxVar.e;
                    timestampHeaderView.c = TimeUnit.MICROSECONDS.toMillis(((dwqw) dxbzVar.c().c()).d());
                    if (dxbzVar.c().g()) {
                        if (dxbzVar.e()) {
                            timestampHeaderView.setVisibility(0);
                            timestampHeaderView.b.setText(dxcb.a(timestampHeaderView.c, timestampHeaderView.getContext()));
                        } else {
                            timestampHeaderView.setVisibility(8);
                        }
                    }
                }
            } else {
                dvhv.c("BubbleCellPresenter", "Call presenter.setmessage(message) before calling start()");
            }
        } else if (dxcoVarE.equals(dxco.TYPING_INDICATOR)) {
            dxef dxefVar = ((dxdi) wvVar).s;
            dwwy dwwyVar = dxefVar.c;
            dwwyVar.l(dxefVar);
            dxefVar.b();
            dwwyVar.j(dxefVar);
            ((dxei) dxefVar.b).a = (int) fbfj.a.get().b();
        } else {
            ((dxcl) this.f.get(dxcoVarE)).c();
        }
        if (dxbzVarD == null || !dxbzVarD.c().g()) {
            return;
        }
        dxcq dxcqVar = this.m;
        Object objC = dxbzVarD.c().c();
        dxcq dxcqVar2 = ((dxdc) dxcqVar).a.d;
        if (dxcqVar2 != null) {
            dwqw dwqwVar2 = (dwqw) objC;
            String strR = dwqwVar2.r();
            dxba dxbaVar = ((dxai) dxcqVar2).a;
            if (dxbaVar.c.add(strR)) {
                dwhp dwhpVarB = dxbaVar.b(105);
                dwhpVarB.f(dwqwVar2.s() == 1 ? 155 : 156);
                dwid dwidVar = new dwid();
                dwidVar.d(dwqwVar2.c());
                dwidVar.b(dwqwVar2.j().a().f);
                dwhpVarB.i(dwidVar.a());
                if (dwqwVar2.h().a() == 3) {
                    ekgb ekgbVar = dxbaVar.d;
                    for (int i2 = 0; i2 < ((ekoe) ekgbVar).c; i2++) {
                        dxcn dxcnVar = (dxcn) ekgbVar.get(i2);
                        if (dxcnVar.a().b()) {
                            dxcnVar.c();
                        }
                    }
                }
                dxbaVar.b.b(dwhpVarB.a());
            }
        }
        final Context context = view.getContext();
        if (dvhi.c(context) && ((dwqw) dxbzVarD.c().c()).s() == 1) {
            if (dwqq.INCOMING_RECEIVED.equals(((dwqw) dxbzVarD.c().c()).i())) {
                final String string = context.getString(R.string.new_message_text);
                k.post(new Runnable() { // from class: dxde
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = dxdj.j;
                        dvhi.b(context, string);
                    }
                });
            }
        }
    }

    public final void H() {
        ekgb ekgbVar = this.r;
        if (ekgbVar != null) {
            this.r = ekgb.n(ekgbVar);
            super.c(ekgb.n(ekeh.d(ekgbVar).c(new ejwm() { // from class: dxdf
                @Override // defpackage.ejwm
                public final boolean a(Object obj) {
                    dxco dxcoVarE = ((dxcp) obj).e();
                    return dxcoVarE.equals(dxco.MESSAGE_BUBBLE) || dxcoVarE.equals(dxco.TYPING_INDICATOR) || this.a.f.containsKey(dxcoVarE);
                }
            }).g()));
        }
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void i(wv wvVar) {
        final dwyq dwyqVar = (dwyq) wvVar;
        if (this.h == -1 || dwyqVar.ft() != 0) {
            return;
        }
        dwyqVar.a.postDelayed(new Runnable() { // from class: dxdg
            @Override // java.lang.Runnable
            public final void run() {
                dwyq dwyqVar2 = dwyqVar;
                dxdj dxdjVar = this.a;
                if (dxdjVar.h == dwyqVar2.ft()) {
                    dxdjVar.i.removeCallbacksAndMessages(null);
                    dxdjVar.h = -1;
                    View view = dwyqVar2.a;
                    view.requestFocus();
                    view.sendAccessibilityEvent(8);
                }
            }
        }, 750L);
    }

    @Override // defpackage.dwyr
    public final int l(int i) {
        dxcp dxcpVar = (dxcp) b(i);
        if (!fbfm.h()) {
            if (!dxcpVar.e().equals(dxco.MESSAGE_BUBBLE)) {
                return dxcpVar.e().f + 1024;
            }
            int iA = this.l.a((dwqw) dxcpVar.b().c().c());
            ejwl.l(iA < 1024);
            return iA;
        }
        int iOrdinal = dxcpVar.e().ordinal();
        if (iOrdinal == 0) {
            return this.l.a((dwqw) dxcpVar.b().c().c());
        }
        if (iOrdinal == 1) {
            return 0;
        }
        if (iOrdinal == 2) {
            return 1;
        }
        if (iOrdinal == 3) {
            return 2;
        }
        if (iOrdinal == 4) {
            return 3;
        }
        throw new RuntimeException(null, null);
    }
}
