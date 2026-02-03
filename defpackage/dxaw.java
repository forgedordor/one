package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.overlay.OverlayView;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxaw implements dwzm, dwxl {
    public final dvll A;
    public final dvoq B;
    public afeu C;
    private dxbc D;
    private final dvip E;
    private final dviy F;
    private final Map G;
    private final dwwy H;
    private dwwy I;
    private final dwwx J;
    public final View a;
    public final dwpx b;
    public final dviq c;
    public final dwje d;
    public final dxba e;
    public final dxck f;
    public final Handler g;
    public dxcr h;
    public dwzl i;
    public dwzi j;
    public dwzk k;
    public dwzj l;
    public final ejwi m;
    public final dxdo n;
    public final ejwi o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public boolean s;
    dxdw t;
    public dwya u;
    public final dxbt v;
    dxec w;
    public MenuItem.OnMenuItemClickListener x;
    public MenuItem.OnMenuItemClickListener y;
    public final dwza z;

    /* JADX WARN: Multi-variable type inference failed */
    public dxaw(final View view, dwpx dwpxVar, dwje dwjeVar, dvll dvllVar, dvin dvinVar, dviq dviqVar, dvip dvipVar, dviy dviyVar, dvoq dvoqVar, dwhr dwhrVar) {
        int i = dxax.b;
        new SparseArray();
        new ArrayList();
        new ArrayList();
        this.G = ekoj.a;
        this.i = new dwzl() { // from class: dwzx
            @Override // defpackage.dwzl
            public final boolean a() {
                return false;
            }
        };
        this.j = new dwzi() { // from class: dwzy
            @Override // defpackage.dwzi
            public final void a() {
            }
        };
        this.k = new dwzk() { // from class: dwzz
            @Override // defpackage.dwzk
            public final void a(dwje dwjeVar2, dwqw dwqwVar) {
            }
        };
        this.l = new dwzj() { // from class: dxaa
        };
        int i2 = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        ejud ejudVar = ejud.a;
        this.o = ejudVar;
        dvie.b();
        this.p = false;
        this.q = false;
        this.r = false;
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        this.J = new dxar(this);
        int i3 = dxas.a;
        int i4 = dxat.a;
        this.x = new dxau();
        this.y = null;
        int i5 = dxac.a;
        int i6 = dxav.a;
        int i7 = dwzr.a;
        if (!dwjeVar.c().g().contains(dwpxVar.a())) {
            throw new IllegalArgumentException("Conversation owner doesn't belong to the account context");
        }
        this.a = view;
        this.b = dwpxVar;
        this.d = dwjeVar;
        this.A = dvllVar;
        this.c = dviqVar;
        this.E = dvipVar;
        this.F = dviyVar;
        this.B = dvoqVar;
        dxba dxbaVar = new dxba(dwpxVar, dwjeVar, dwhrVar);
        this.e = dxbaVar;
        ((dvop) dviqVar).m(dwjeVar, dwpxVar, new ejwm() { // from class: dvmv
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return ((dwpo) obj).b() == -1;
            }
        }, new ejwm() { // from class: dvmw
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                dvhn.a();
                return System.currentTimeMillis() > ((dwpo) obj).e();
            }
        });
        this.I = dvipVar.a(dwjeVar, dwjeVar.c().f());
        if (dwpxVar.e() == dwpu.ONE_TO_ONE) {
            this.m = ejwi.j(dvipVar.a(dwjeVar, dwpxVar.c()));
        } else {
            this.m = ejudVar;
        }
        this.H = dvoqVar.a(dwpxVar);
        ((dvkp) dvinVar).c(dwjeVar, dwpxVar, ejwr.ALWAYS_FALSE);
        dwza dwzaVar = new dwza(dwjeVar, dwpxVar, dviyVar, view.d());
        this.z = dwzaVar;
        dwzaVar.b = new dwyx() { // from class: dwzs
            /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, dwzn] */
            @Override // defpackage.dwyx
            public final void a(String str) {
                dwxp dwxpVar;
                dxaw dxawVar = this.a;
                ?? r1 = dxawVar.a;
                String strH = r1.h();
                if (strH != null && !strH.equals(str)) {
                    dxawVar.e.c(10023);
                }
                dxawVar.e(str, r1.i(), true);
                r1.n(null);
                r1.m(null);
                if (!fbfm.o() || (dwxpVar = dxawVar.z.c) == null) {
                    return;
                }
                dvjm.a();
                if (fbfm.o()) {
                    dvhh dvhhVar = (dvhh) ((dvhg) dwxpVar).d;
                    CardView cardView = dvhhVar.d;
                    if (cardView.getVisibility() == 0) {
                        cardView.setVisibility(8);
                        dvhhVar.b.setText((CharSequence) null);
                        dvhhVar.c.setText((CharSequence) null);
                        dvhhVar.a.setImageDrawable(null);
                    }
                }
            }
        };
        dxck dxckVar = new dxck(dxbaVar);
        this.f = dxckVar;
        dxdd dxddVar = new dxdd(view.p(), dwpxVar, dwjeVar, dvipVar, dviyVar, dxckVar, ekgbVar);
        this.h = dxddVar;
        dxddVar.e = new dxah(this);
        dxddVar.d = new dxai(dxbaVar);
        ListenableFuture listenableFutureB = dvllVar.b(2);
        ejvr ejvrVar = new ejvr() { // from class: dxaj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                dxaw dxawVar = this.a;
                dxawVar.f.c = zBooleanValue;
                ((dxdd) dxawVar.h).b.H();
                return null;
            }
        };
        eoqg eoqgVar = eoqg.a;
        eooq.f(listenableFutureB, ejvrVar, eoqgVar);
        eooq.f(dvllVar.b(6), new ejvr() { // from class: dxak
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.f.d = ((Boolean) obj).booleanValue();
                return null;
            }
        }, eoqgVar);
        eooq.f(dvllVar.b(3), new ejvr() { // from class: dwzo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                if (bool.booleanValue()) {
                    return null;
                }
                this.a.h.a(dxco.SUGGESTION_LIST);
                return null;
            }
        }, eoqgVar);
        eooq.f(dvllVar.b(5), new ejvr() { // from class: dwzp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                this.a.h.a(dxco.RICH_CARD_BUBBLE);
                return null;
            }
        }, eoqgVar);
        eooq.f(dvllVar.b(11), new ejvr() { // from class: dwzq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.f.e = ((Boolean) obj).booleanValue();
                return null;
            }
        }, eoqgVar);
        dxbg dxbgVar = new dxbg(dwpxVar, this.m, dwjeVar, dviqVar, view.e());
        this.D = dxbgVar;
        dxbgVar.d = new dwzt(this);
        if (fbfm.j()) {
            ((dxbg) this.D).e = new dwzu(this);
        }
        ((dxbg) this.D).c = new dxbb() { // from class: dwzv
        };
        view.a(this);
        view.l(this);
        dxdo dxdoVar = new dxdo(view.g(), this);
        this.n = dxdoVar;
        dxdoVar.e = new dxdk() { // from class: dwzw
            /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, dwzn] */
            @Override // defpackage.dxdk
            public final void a() {
                view.k();
            }
        };
        this.v = new dxbt(view.f());
        this.g = new Handler();
        eooq.f(dvllVar.b(1), new ejvr() { // from class: dxaf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    dvhv.a("ConvPresenter", "USER_INTERFACE_AUTO_BIND disabled, not starting bind");
                    return null;
                }
                dxaw dxawVar = this.a;
                dxawVar.c.d(dxawVar.d);
                dvhv.a("ConvPresenter", "USER_INTERFACE_AUTO_BIND enabled, starting bind");
                return null;
            }
        }, eoqgVar);
    }

    @Override // defpackage.dwxl
    public final void a(dwjr dwjrVar) {
        dxba dxbaVar = this.e;
        dxbaVar.b.b(dxbaVar.b(123).a());
        if (!dwjrVar.d().equals(dwjj.CUSTOM_ACTION)) {
            b(dwjrVar.b());
        }
        if (dwjrVar.g().g()) {
            dwjj dwjjVarE = dwjrVar.e();
            dviq dviqVar = this.c;
            final dwje dwjeVar = this.d;
            final dwpx dwpxVar = this.b;
            dwjj dwjjVar = dwjj.NO_OP_ACTION;
            Object objC = dwjrVar.g().c();
            final String str = (String) dwjrVar.h().e("");
            final ejwi ejwiVarJ = dwjrVar.j();
            final dvop dvopVar = (dvop) dviqVar;
            final dwjl dwjlVar = (dwjl) objC;
            ListenableFuture listenableFutureG = eooq.g(dvopVar.o(dwjeVar, dwpxVar), new eooz() { // from class: dvmo
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    dwpo dwpoVar = (dwpo) obj;
                    evqs evqsVarN = dwpoVar == null ? evqs.b : dwpoVar.n();
                    dvop dvopVar2 = dvopVar;
                    ejwi ejwiVar = ejwiVarJ;
                    String str2 = str;
                    dwjl dwjlVar2 = dwjlVar;
                    dwpx dwpxVar2 = dwpxVar;
                    dwje dwjeVar2 = dwjeVar;
                    dvxe dvxeVarC = dvxf.c();
                    ((dvxa) dvxeVarC).a = "send button or chip clicked event";
                    dvxeVarC.b(dvxj.g);
                    dvxf dvxfVarA = dvxeVarC.a();
                    eypt eyptVarC = dweg.c(dwjlVar2);
                    dwdo dwdoVar = (dwdo) dvopVar2.b;
                    dwgb dwgbVar = new dwgb(dwdoVar.b, dwjeVar2, dwpxVar2, evqsVarN, eyptVarC, ejwiVar, str2);
                    dvyx dvyxVar = dwdoVar.c;
                    dwhp dwhpVarR = dwhq.r();
                    dwhpVarR.g(18);
                    dwhpVarR.n(dwjeVar2.c().f());
                    dwhpVarR.o(dwjeVar2.d().E());
                    dwhpVarR.p(dwgbVar.a);
                    dwhpVarR.d(dwpxVar2);
                    dvyxVar.b(dwhpVarR.a());
                    dwcm dwcmVar = dwdoVar.a;
                    ListenableFuture listenableFutureB = dwcmVar.b(UUID.randomUUID(), dwgbVar, dwcmVar.d.b(), dwjeVar2, dvxfVarA, true);
                    eork.r(listenableFutureB, new dwdn(dwdoVar, dwjeVar2, dwgbVar, dwpxVar2), eoqg.a);
                    return listenableFutureB;
                }
            }, dvopVar.c);
            if (dwjjVarE != dwjjVar) {
                eork.r(listenableFutureG, new dxan(this, dwjrVar), dvhw.a());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, dwzn] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, dwzn] */
    public final void b(final dwji dwjiVar) {
        int iOrdinal = dwjiVar.a().ordinal();
        if (iOrdinal == 1) {
            e(dwjiVar.d().d(), dwjiVar.d().c(), false);
            return;
        }
        if (iOrdinal == 2) {
            ?? r0 = this.a;
            r0.n(dwjiVar.c().c());
            this.z.a.c(dwjiVar.c().d());
            r0.m(dwjiVar.c().d());
            return;
        }
        if (iOrdinal == 4) {
            eooq.f(this.A.b(24), new ejvr() { // from class: dxad
                /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, dwzn] */
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    dxaw dxawVar = this.a;
                    dwji dwjiVar2 = dwjiVar;
                    if (zBooleanValue) {
                        dxawVar.c(dwjiVar2.k());
                        return null;
                    }
                    dxbt dxbtVar = dxawVar.v;
                    String strK = dwjiVar2.k();
                    ?? r02 = dxawVar.a;
                    dxbtVar.a.d(strK, ejwi.j(r02.g()), r02.c());
                    dwyo.c(r02);
                    return null;
                }
            }, eoqg.a);
            return;
        }
        switch (iOrdinal) {
            case 7:
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setData(Uri.parse("tel:".concat(dwjiVar.h())));
                this.a.getContext().startActivity(intent, null);
                break;
            case 8:
                String strJ = dwjiVar.j();
                dviq dviqVar = this.c;
                dwnp dwnpVar = new dwnp(dviqVar.g(this.b, dwlc.a(strJ), strJ, ejwi.j(strJ), ekgp.j(this.G)));
                dwnpVar.c = dwlg.a;
                ((dvop) dviqVar).q(this.d, dwnpVar.a(), true);
                break;
            case 9:
                if (dwjiVar.b().a().g()) {
                    final dxdo dxdoVar = this.n;
                    Object objC = dwjiVar.b().a().c();
                    ?? r3 = this.a;
                    boolean z = r3.b().getHeight() == r3.b().getBottom();
                    OverlayView overlayView = dxdoVar.a;
                    final dwqs dwqsVar = (dwqs) objC;
                    overlayView.b(dwqsVar, z);
                    overlayView.findViewById(R.id.dismiss_button).setOnClickListener(new View.OnClickListener() { // from class: dxdm
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            dwqs dwqsVar2 = dwqsVar;
                            boolean zG = dwqsVar2.c().g();
                            dxdo dxdoVar2 = dxdoVar;
                            if (zG) {
                                dxdoVar2.b.a((dwjr) dwqsVar2.c().c());
                            }
                            dxdoVar2.a();
                        }
                    });
                    overlayView.findViewById(R.id.title).requestFocus();
                    overlayView.findViewById(R.id.title).sendAccessibilityEvent(32768);
                    dxdoVar.c.postDelayed(dxdoVar.d, TimeUnit.SECONDS.toMillis(dwqsVar.b()));
                    break;
                }
                break;
            case 10:
                c(dwjiVar.g().c());
                break;
        }
    }

    public final void c(String str) {
        new aky().a().a(this.a.getContext(), Uri.parse(str));
    }

    public final void d() {
        if (this.w == null) {
            dvhv.a("ConvPresenter", "hideInfoIconTooltip: Cannot hide tooltip because it is null.");
        } else {
            dvhv.a("ConvPresenter", "hideInfoIconTooltip: Hiding InfoIconTooltip");
            this.w.a.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.view.View, dwzn] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.View, dwzn] */
    public final void e(String str, String str2, boolean z) {
        if (this.t != null) {
            this.s = true;
            this.I.l(this.J);
            dxdw dxdwVar = this.t;
            if (dxdwVar != null) {
                this.a.j(dxdwVar);
                this.t = null;
                d();
                this.w = null;
            }
        }
        dviy dviyVar = this.F;
        dwpx dwpxVar = this.b;
        dviyVar.c(dwpxVar);
        if (!TextUtils.isEmpty(str)) {
            ekgi ekgiVar = new ekgi();
            if (!ejwk.c(str2)) {
                evqd evqdVar = (evqd) evqe.a.createBuilder();
                evqdVar.copyOnWrite();
                ((evqe) evqdVar.instance).b = "type.googleapis.com/google.protobuf.StringValue";
                evvg evvgVar = (evvg) evvh.a.createBuilder();
                evvgVar.copyOnWrite();
                evvh evvhVar = (evvh) evvgVar.instance;
                str2.getClass();
                evvhVar.b = str2;
                evqs byteString = ((evvh) evvgVar.build()).toByteString();
                evqdVar.copyOnWrite();
                ((evqe) evqdVar.instance).c = byteString;
                ekgiVar.i("l_act_callback_payload", ((evqe) evqdVar.build()).toByteString());
            }
            ekgiVar.g(this.G);
            dwqw dwqwVarG = this.c.g(dwpxVar, dwlc.a(str), str, ejwi.j(str), ekgiVar.c());
            dxba dxbaVar = this.e;
            dxbaVar.b.b(dxbaVar.b(100).a());
            f(dwqwVarG);
        }
        if (z) {
            ejwi ejwiVarE = this.H.e();
            if (ejwiVarE.g()) {
                ekgb ekgbVar = (ekgb) ejwiVarE.c();
                int size = ekgbVar.size();
                for (int i = 0; i < size; i++) {
                    dwqd dwqdVar = (dwqd) ekgbVar.get(i);
                    this.B.b(dwpxVar, dwqdVar.a().r());
                    f(dwqdVar.a());
                }
            }
        }
        ?? r9 = this.a;
        r9.p().ab.aq(r9.p(), 0);
    }

    public final void f(final dwqw dwqwVar) {
        this.g.post(new Runnable() { // from class: dxag
            @Override // java.lang.Runnable
            public final void run() {
                dvhi.a(this.a.a.getContext(), R.string.sending_message_text);
            }
        });
        dwhw.a().b("MessageSentLatency", dwqwVar);
        dwhw.a().b("MessagePerceivedSentLatency", dwqwVar);
        dwhw.a().b("MessageDeliveredLatency", dwqwVar);
        dwhw.a().b("MessagePerceivedDeliveredLatency", dwqwVar);
        dwqq dwqqVarI = dwqwVar.i();
        dwqq dwqqVar = dwqq.OUTGOING_FAILED_SEND;
        final ejud ejudVar = ejud.a;
        final SettableFuture settableFutureCreate = SettableFuture.create();
        final int i = dwqqVarI == dwqqVar ? 2 : 1;
        dviq dviqVar = this.c;
        final dwje dwjeVar = this.d;
        final dvop dvopVar = (dvop) dviqVar;
        dvopVar.d.execute(new Runnable() { // from class: dvnj
            @Override // java.lang.Runnable
            public final void run() {
                dwqw dwqwVar2 = dwqwVar;
                boolean zEquals = dwqwVar2.i().equals(dwqq.OUTGOING_FAILED_SEND);
                dvop dvopVar2 = dvopVar;
                dwje dwjeVar2 = dwjeVar;
                SettableFuture settableFuture = settableFutureCreate;
                if (zEquals && !dvopVar2.l(dwjeVar2).ae(dwqwVar2.r())) {
                    dvhv.c("LiMsgController", "Tried to resend unstored message.");
                    settableFuture.setException(new InvalidParameterException());
                    return;
                }
                int i2 = i;
                dvyx dvyxVar = dvopVar2.f;
                dwhp dwhpVarR = dwhq.r();
                dwhpVarR.g(9);
                dwhpVarR.n(dwjeVar2.c().f());
                dwhpVarR.o(dwjeVar2.d().E());
                dwhpVarR.p(dwqwVar2.r());
                dwhpVarR.d(dwqwVar2.f());
                dwhpVarR.l(i2);
                dwhpVarR.i(dvjt.a(dwqwVar2));
                dvyxVar.b(dwhpVarR.a());
                settableFuture.set(true);
            }
        });
        eork.r(eooq.g(settableFutureCreate, new eooz() { // from class: dvnk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!Boolean.TRUE.equals((Boolean) obj)) {
                    return eork.i(null);
                }
                final dwqw dwqwVar2 = dwqwVar;
                final dwje dwjeVar2 = dwjeVar;
                final dvop dvopVar2 = dvopVar;
                ListenableFuture listenableFutureQ = dvopVar2.q(dwjeVar2, dwqwVar2, false);
                ListenableFuture listenableFutureG = (dwqwVar2.h().a() == 3 && dvopVar2.q.containsKey(((dwnt) dwqwVar2.h().b()).a)) ? eooq.g(listenableFutureQ, new eooz() { // from class: dvnn
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return ((dwdz) dvopVar2.q.get(((dwnt) dwqwVar2.h().b()).a)).f((dwqw) obj2);
                    }
                }, eoqg.a) : listenableFutureQ;
                final ejwi ejwiVar = ejudVar;
                final int i2 = i;
                eooz eoozVar = new eooz() { // from class: dvno
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final dwqw dwqwVar3 = (dwqw) obj2;
                        dwpx dwpxVarF = dwqwVar3.f();
                        dvop dvopVar3 = dvopVar2;
                        return eooq.g(dvopVar3.o(dwjeVar2, dwpxVarF), new eooz() { // from class: dvnt
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                dwqk dwqkVarG = dwqwVar3.g();
                                dwqkVarG.d(((dwpo) obj3).n());
                                return eork.i(dwqkVarG.a());
                            }
                        }, dvopVar3.c);
                    }
                };
                eosc eoscVar = dvopVar2.c;
                ListenableFuture listenableFutureG2 = eooq.g(listenableFutureG, eoozVar, eoscVar);
                eooz eoozVar2 = new eooz() { // from class: dvnp
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final dwqw dwqwVar3 = (dwqw) obj2;
                        dvxe dvxeVarC = dvxf.c();
                        ((dvxa) dvxeVarC).a = "send message";
                        dvxeVarC.b(dvxj.g);
                        final dvxf dvxfVarA = dvxeVarC.a();
                        final dvop dvopVar3 = dvopVar2;
                        final dwje dwjeVar3 = dwjeVar2;
                        final ejwi ejwiVar2 = ejwiVar;
                        return eork.n(new eooy() { // from class: dvod
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                final dwqw dwqwVar4 = dwqwVar3;
                                final eypt eyptVarD = dwdo.d(dwqwVar4.f());
                                final dwdo dwdoVar = (dwdo) dvopVar3.b;
                                final dwje dwjeVar4 = dwjeVar3;
                                final dvxf dvxfVar = dvxfVarA;
                                return dwdoVar.d.a(new eooy() { // from class: dwdj
                                    @Override // defpackage.eooy
                                    public final ListenableFuture a() {
                                        dwdo dwdoVar2 = dwdoVar;
                                        Context context = dwdoVar2.b;
                                        dwje dwjeVar5 = dwjeVar4;
                                        dwqw dwqwVar5 = dwqwVar4;
                                        eypt eyptVar = eyptVarD;
                                        UUID uuidRandomUUID = UUID.randomUUID();
                                        dwgd dwgdVar = new dwgd(context, dwjeVar5, dwqwVar5, eyptVar, dwdoVar2.e);
                                        dwcm dwcmVar = dwdoVar2.a;
                                        return dwcmVar.b(uuidRandomUUID, dwgdVar, dwcmVar.d.b(), dwjeVar5, dvxfVar, true);
                                    }
                                });
                            }
                        }, dvopVar3.c);
                    }
                };
                eoqg eoqgVar = eoqg.a;
                final ListenableFuture listenableFutureG3 = eooq.g(listenableFutureG2, eoozVar2, eoqgVar);
                eoscVar.submit(new Runnable() { // from class: dvnq
                    @Override // java.lang.Runnable
                    public final void run() {
                        dvop dvopVar3 = dvopVar2;
                        dvip dvipVar = dvopVar3.n;
                        dwje dwjeVar3 = dwjeVar2;
                        dwqw dwqwVar3 = dwqwVar2;
                        dvipVar.a(dwjeVar3, dwqwVar3.e()).g();
                        if (dwqwVar3.f().e() != dwpu.ONE_TO_ONE) {
                            dvopVar3.a(dwjeVar3, dwqwVar3.f()).g();
                        } else {
                            dvopVar3.n.a(dwjeVar3, dwqwVar3.f().c()).g();
                        }
                    }
                });
                final ListenableFuture listenableFutureF = eooh.f(listenableFutureG, Throwable.class, new ejvr() { // from class: dvnr
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return dwqwVar2;
                    }
                }, eoqgVar);
                final ListenableFuture listenableFutureA = eork.b(listenableFutureQ, listenableFutureG3, listenableFutureF).a(new Callable() { // from class: dvns
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws ExecutionException {
                        dwqw dwqwVarA;
                        ExecutionException executionException;
                        dwqk dwqkVarG = ((dwqw) ((eooi) listenableFutureF).q()).g();
                        int i3 = i2;
                        final dvop dvopVar3 = dvopVar2;
                        final dwje dwjeVar3 = dwjeVar2;
                        dwqw dwqwVar3 = dwqwVar2;
                        try {
                            dwqkVarG.n(((Long) ((dvra) eork.q(listenableFutureG3)).a().c()).longValue());
                            dwqkVarG.k(dwqq.OUTGOING_SENT);
                            dwqwVarA = dwqkVarG.a();
                            dvyx dvyxVar = dvopVar3.f;
                            dwhp dwhpVarR = dwhq.r();
                            dwhpVarR.g(10);
                            dwhpVarR.n(dwjeVar3.c().f());
                            dwhpVarR.o(dwjeVar3.d().E());
                            dwhpVarR.p(dwqwVar3.r());
                            dwhpVarR.d(dwqwVar3.f());
                            dwhpVarR.l(i3);
                            dvyxVar.b(dwhpVarR.a());
                            if (dwqwVar3.h().a() == 3) {
                                Map map = dvopVar3.q;
                                if (map.containsKey(((dwnt) dwqwVar3.h().b()).a)) {
                                    ((dwdz) map.get(((dwnt) dwqwVar3.h().b()).a)).d(dwjeVar3, dwqwVar3, dvyxVar);
                                }
                            }
                            dwhw.a().c("MessageSentLatency", dwqwVar3.r());
                            dwht.a().b(dwhu.b, dwqwVar3);
                            executionException = null;
                        } catch (ExecutionException e) {
                            dvhv.d("LiMsgController", "Failed to send message", e);
                            dwhp dwhpVarR2 = dwhq.r();
                            dwhpVarR2.g(11);
                            dwhpVarR2.n(dwjeVar3.c().f());
                            dwhpVarR2.o(dwjeVar3.d().E());
                            dwhpVarR2.p(dwqwVar3.r());
                            dwhpVarR2.d(dwqwVar3.f());
                            dwhpVarR2.l(i3);
                            if (e.getCause() != null && (e.getCause() instanceof dwdc)) {
                                dwhpVarR2.f(10);
                            }
                            dvopVar3.f.b(dwhpVarR2.a());
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            dvhn.a();
                            dwqkVarG.n(timeUnit.toMicros(System.currentTimeMillis()));
                            dwqkVarG.k(dwqq.OUTGOING_FAILED_SEND);
                            dwqwVarA = dwqkVarG.a();
                            executionException = e;
                        }
                        dwnq dwnqVar = (dwnq) dwqwVarA;
                        dvopVar3.l(dwjeVar3).ad(dwqwVarA, dwnqVar.d);
                        dvopVar3.l(dwjeVar3).ab(Arrays.asList(dwqwVarA), dwqq.OUTGOING_SENDING, dwnqVar.g);
                        dvyx dvyxVar2 = dvopVar3.f;
                        dwhp dwhpVarR3 = dwhq.r();
                        dwhpVarR3.g(205);
                        dwhpVarR3.n(dwjeVar3.c().f());
                        dwhpVarR3.o(dwjeVar3.d().E());
                        final dwpx dwpxVar = dwnqVar.c;
                        dwhpVarR3.d(dwpxVar);
                        dvyxVar2.b(dwhpVarR3.a());
                        Runnable runnable = new Runnable() { // from class: dvna
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.lang.Runnable
                            public final void run() {
                                final dvop dvopVar4 = dvopVar3;
                                final dwje dwjeVar4 = dwjeVar3;
                                dwws dwwsVarL = dvopVar4.l(dwjeVar4);
                                final dwpx dwpxVar2 = dwpxVar;
                                dwqq dwqqVar2 = dwqq.INCOMING_RECEIVED;
                                dwqq dwqqVar3 = dwqq.INCOMING_READ;
                                ekgb ekgbVarA = dwwsVarL.A(dwpxVar2, dwqqVar2, dwqqVar3);
                                int size = ekgbVarA.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    String str = (String) ekgbVarA.get(i4);
                                    dwhp dwhpVarR4 = dwhq.r();
                                    dwhpVarR4.g(4);
                                    dwhpVarR4.n(dwjeVar4.c().f());
                                    dwhpVarR4.o(dwjeVar4.d().E());
                                    dwhpVarR4.p(str);
                                    dwhpVarR4.d(dwpxVar2);
                                    dvopVar4.f.b(dwhpVarR4.a());
                                }
                                dvxe dvxeVarC = dvxf.c();
                                ((dvxa) dvxeVarC).a = "message receipt";
                                dvxeVarC.b(dvxj.g);
                                final dvxf dvxfVarA = dvxeVarC.a();
                                dwws dwwsVarL2 = dvopVar4.l(dwjeVar4);
                                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                                dvhn.a();
                                final ekgb ekgbVarX = dwwsVarL2.x(dwpxVar2, dwqqVar3, timeUnit2.toMicros(System.currentTimeMillis() - fbfa.a()));
                                if (ekgbVarX.isEmpty()) {
                                    return;
                                }
                                eork.d(eooq.g(dvopVar4.o(dwjeVar4, dwpxVar2), new eooz() { // from class: dvoj
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj2) {
                                        dwpo dwpoVar = (dwpo) obj2;
                                        evqs evqsVarN = dwpoVar == null ? evqs.b : dwpoVar.n();
                                        dvxf dvxfVar = dvxfVarA;
                                        ekgb ekgbVar = ekgbVarX;
                                        return ((dwdo) dvopVar4.b).c(dwjeVar4, dwpxVar2, evqsVarN, ekgbVar, dvxfVar, true);
                                    }
                                }, dvopVar4.c)).c(new Runnable() { // from class: dvok
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        dvopVar4.l(dwjeVar4).ac(dwpxVar2, ekgbVarX, Arrays.asList(dwqq.INCOMING_READ), dwqq.INCOMING_READ_RECEIPT_SENT);
                                    }
                                }, eoqg.a);
                            }
                        };
                        eosc eoscVar2 = dvopVar3.c;
                        eork.r(eork.l(runnable, eoscVar2), new dvol(dvopVar3, dwjeVar3, dwpxVar), eoscVar2);
                        if (executionException == null) {
                            return null;
                        }
                        throw executionException;
                    }
                }, eoqgVar);
                return eork.d(listenableFutureA).a(new Callable() { // from class: dvnu
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws ExecutionException {
                        try {
                            return null;
                        } catch (ExecutionException e) {
                            dvhv.d("LiMsgController", "Failed to update message status", e);
                            throw e;
                        }
                    }
                }, eoqgVar);
            }
        }, eoqg.a), new dxaq(this, dwqwVar), dvhw.a());
    }
}
