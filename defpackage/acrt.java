package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.Button;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.common.ListEmptyView;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acrt implements badh, daih, cwvu {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/home/HomeFragmentPeer");
    public final ehac A;
    public final ehbb B;
    public final egpr C;
    public final acuf D;
    public final acuw E;
    public final fcsu F;
    public final eigp G;
    public final fcsu H;
    public final fcsu I;
    public final fcsu J;
    public final fcsu K;
    public final fcsu L;
    public final fcsu M;
    public final fcsu N;
    public final fcsu O;
    public final fcsu P;
    public final fcsu Q;
    public final Optional R;
    public final fcsu S;
    public final fcsu T;
    public final daiw U;
    public final eygg V;
    public final eygg W;
    public final eygg X;
    public final dzpl Y;
    public final dzuc Z;
    public final egps aA;
    public final egps aB;
    public final egps aC;
    public final fcsu aD;
    public final fcsu aE;
    public final fcsu aF;
    public final eygg aG;
    public final fcsu aH;
    public ViewTreeObserver.OnPreDrawListener aI;
    public ViewTreeObserver.OnPreDrawListener aJ;
    public adj aK;
    public cdpg aM;
    boolean aN;
    public acop aO;
    pcw aP;
    public LinearLayoutManager aQ;
    public cpdw aR;
    public eecx aS;
    public boolean aT;
    agzz aY;
    public boolean aZ;
    public final fcsu aa;
    public final fcsu ab;
    public final Optional ac;
    public final acsw ad;
    public final fcsu ae;
    public final fcsu af;
    public final fcsu ag;
    public final fcsu ah;
    public final fcsu ai;
    public final fcsu aj;
    public final fcsu ak;
    public final fcsu al;
    public final efwo am;
    public final fcsu an;
    public final fcsu ao;
    public final fcsu ap;
    public final fcsu aq;
    public final fcsu ar;
    public final aurx as;
    public final fcsu at;
    public final fcsu au;
    public final fcsu av;
    public final agzy aw;
    public final ahaa ax;
    public final egps ay;
    public final egps az;
    public final acom b;
    public final fcsu bA;
    public final arfs bB;
    public final fcsu bC;
    public final addo bD;
    private final fcsu bE;
    private final fcsu bF;
    private final fcsu bG;
    private final fcsu bH;
    private final fcsu bI;
    private final fcsu bJ;
    private final eygg bK;
    private final fcsu bL;
    private final fcsu bM;
    private final fcsu bN;
    private final fcsu bO;
    private final fcsu bP;
    private final fcsu bQ;
    private final eygg bR;
    private final fcsu bS;
    private final fcsu bT;
    private final fcsu bU;
    private final Optional bV;
    private final fcsu bW;
    private final fcsu bX;
    private final fcsu bY;
    private final fcsu bZ;
    public ViewTreeObserver.OnGlobalLayoutListener ba;
    public adcn bc;
    public final fcsu bd;
    public final cpdt be;
    public final ajfx bf;
    public final fcsu bg;
    public final eygg bh;
    public final apnp bi;
    public final apnq bj;
    public final apns bk;
    public final apnr bl;
    public final fcsu bm;
    public final fcsu bn;
    public final fcsu bo;
    public final fcsu bp;
    public final fcsu bq;
    public final fcsu br;
    public final AtomicBoolean bs;
    public final fcsu bt;
    public final fcsu bu;
    public final fcsu bv;
    public final fcsu bw;
    public final fcsu bx;
    public final fcsu by;
    public final fcsu bz;
    public final Activity c;
    private final fcsu ca;
    private final fcsu cb;
    private final fcsu cc;
    private final fcsu cd;
    private final fcsu ce;
    private final fcsu cf;
    private final fcsu cg;
    private MenuItem ch;
    private final tlt ci;
    private final fcsu cj;
    private final eygg ck;
    private final eygg cl;
    private final eygg cm;
    private final fcsu cn;
    private final fcsu co;
    private final fcsu cp;
    private final fcsu cq;
    private final fcsu cr;
    private final fcsu cs;
    final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final crmx k;
    public final fcsu l;
    public final cogw m;
    public final eygg n;
    public final fcsu o;
    public final fcsu p;
    public final eygg q;
    public final acxj r;
    public final acxl s;
    public final adas t;
    public final fcsu u;
    public final fcsu v;
    public final fcsu w;
    public sp x;
    public final eygg y;
    public final eygg z;
    public boolean aL = false;
    public boolean aU = true;
    public boolean aV = false;
    final babw aW = new babw();
    final HashSet aX = new HashSet();
    public boolean bb = false;

    public acrt(efwo efwoVar, acom acomVar, Activity activity, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, Optional optional, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, crmx crmxVar, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, cogw cogwVar, eygg eyggVar, eygg eyggVar2, acxj acxjVar, acxl acxlVar, eygg eyggVar3, eygg eyggVar4, ehac ehacVar, ehbb ehbbVar, egpr egprVar, acuf acufVar, fcsu fcsuVar21, fcsu fcsuVar22, acuw acuwVar, fcsu fcsuVar23, eigp eigpVar, fcsu fcsuVar24, eygg eyggVar5, fcsu fcsuVar25, fcsu fcsuVar26, fcsu fcsuVar27, fcsu fcsuVar28, fcsu fcsuVar29, fcsu fcsuVar30, fcsu fcsuVar31, fcsu fcsuVar32, fcsu fcsuVar33, fcsu fcsuVar34, agzy agzyVar, fcsu fcsuVar35, fcsu fcsuVar36, fcsu fcsuVar37, fcsu fcsuVar38, eygg eyggVar6, ahaa ahaaVar, fcsu fcsuVar39, fcsu fcsuVar40, fcsu fcsuVar41, aurx aurxVar, fcsu fcsuVar42, fcsu fcsuVar43, Optional optional2, fcsu fcsuVar44, fcsu fcsuVar45, daiw daiwVar, final eygg eyggVar7, eygg eyggVar8, eygg eyggVar9, dzpl dzplVar, dzuc dzucVar, fcsu fcsuVar46, fcsu fcsuVar47, Optional optional3, acsw acswVar, addo addoVar, fcsu fcsuVar48, fcsu fcsuVar49, fcsu fcsuVar50, fcsu fcsuVar51, fcsu fcsuVar52, fcsu fcsuVar53, fcsu fcsuVar54, fcsu fcsuVar55, adas adasVar, fcsu fcsuVar56, fcsu fcsuVar57, fcsu fcsuVar58, fcsu fcsuVar59, fcsu fcsuVar60, tlt tltVar, ajfx ajfxVar, fcsu fcsuVar61, fcsu fcsuVar62, fcsu fcsuVar63, fcsu fcsuVar64, eygg eyggVar10, apnp apnpVar, apnq apnqVar, apns apnsVar, apnr apnrVar, fcsu fcsuVar65, fcsu fcsuVar66, fcsu fcsuVar67, fcsu fcsuVar68, fcsu fcsuVar69, AtomicBoolean atomicBoolean, fcsu fcsuVar70, fcsu fcsuVar71, fcsu fcsuVar72, fcsu fcsuVar73, fcsu fcsuVar74, fcsu fcsuVar75, fcsu fcsuVar76, fcsu fcsuVar77, fcsu fcsuVar78, fcsu fcsuVar79, fcsu fcsuVar80, fcsu fcsuVar81, eygg eyggVar11, eygg eyggVar12, fcsu fcsuVar82, eygg eyggVar13, eygg eyggVar14, fcsu fcsuVar83, fcsu fcsuVar84, fcsu fcsuVar85, fcsu fcsuVar86, fcsu fcsuVar87, fcsu fcsuVar88, fcsu fcsuVar89, fcsu fcsuVar90, fcsu fcsuVar91, fcsu fcsuVar92, fcsu fcsuVar93, fcsu fcsuVar94, fcsu fcsuVar95, fcsu fcsuVar96, fcsu fcsuVar97, arfs arfsVar, fcsu fcsuVar98) {
        eieu eieuVarK = eiiy.k("HomeFragment#init");
        try {
            this.am = efwoVar;
            this.b = acomVar;
            this.c = activity;
            this.d = fcsuVar2;
            this.bU = fcsuVar3;
            this.bV = optional;
            this.o = fcsuVar;
            this.bW = fcsuVar4;
            this.bH = fcsuVar5;
            this.ap = fcsuVar6;
            this.aq = fcsuVar7;
            this.e = fcsuVar8;
            this.f = fcsuVar9;
            this.g = fcsuVar10;
            this.h = fcsuVar11;
            this.i = fcsuVar12;
            this.j = fcsuVar13;
            this.k = crmxVar;
            this.l = fcsuVar14;
            this.bX = fcsuVar15;
            this.bY = fcsuVar16;
            this.bZ = fcsuVar17;
            this.ca = fcsuVar18;
            this.cb = fcsuVar19;
            this.bE = fcsuVar20;
            this.m = cogwVar;
            this.n = eyggVar;
            this.q = eyggVar2;
            this.y = eyggVar3;
            this.z = eyggVar4;
            this.A = ehacVar;
            this.B = ehbbVar;
            this.C = egprVar;
            this.D = acufVar;
            this.an = fcsuVar21;
            this.ao = fcsuVar22;
            this.E = acuwVar;
            this.F = fcsuVar23;
            this.G = eigpVar;
            this.bJ = fcsuVar24;
            this.bK = eyggVar5;
            this.H = fcsuVar25;
            this.I = fcsuVar26;
            this.bL = fcsuVar27;
            this.bM = fcsuVar28;
            this.bN = fcsuVar29;
            this.bO = fcsuVar30;
            this.J = fcsuVar31;
            this.K = fcsuVar32;
            this.L = fcsuVar33;
            this.bP = fcsuVar34;
            this.aw = agzyVar;
            this.M = fcsuVar35;
            this.bQ = fcsuVar36;
            this.N = fcsuVar37;
            this.cc = fcsuVar38;
            this.bR = eyggVar6;
            this.ax = ahaaVar;
            this.O = fcsuVar39;
            this.bS = fcsuVar40;
            this.P = fcsuVar41;
            this.as = aurxVar;
            this.bt = fcsuVar42;
            this.Q = fcsuVar43;
            this.R = optional2;
            this.S = fcsuVar44;
            this.T = fcsuVar45;
            this.U = daiwVar;
            this.V = eyggVar7;
            this.W = eyggVar8;
            this.X = eyggVar9;
            this.Y = dzplVar;
            this.Z = dzucVar;
            this.aa = fcsuVar46;
            this.ab = fcsuVar47;
            this.ac = optional3;
            this.ad = acswVar;
            this.bD = addoVar;
            this.bT = fcsuVar48;
            this.ae = fcsuVar49;
            this.af = fcsuVar50;
            this.ag = fcsuVar51;
            this.ah = fcsuVar52;
            this.ai = fcsuVar53;
            this.r = acxjVar;
            this.s = acxlVar;
            this.cd = fcsuVar54;
            this.ce = fcsuVar55;
            this.t = adasVar;
            this.at = fcsuVar56;
            this.au = fcsuVar57;
            this.av = fcsuVar58;
            this.aj = fcsuVar59;
            this.ak = fcsuVar60;
            this.bf = ajfxVar;
            this.cf = fcsuVar61;
            this.cg = fcsuVar62;
            this.ci = tltVar;
            this.bd = fcsuVar63;
            this.bg = fcsuVar64;
            this.bh = eyggVar10;
            this.bi = apnpVar;
            this.bj = apnqVar;
            this.bk = apnsVar;
            this.bl = apnrVar;
            this.bF = fcsuVar65;
            this.al = fcsuVar66;
            this.aD = fcsuVar67;
            this.aE = fcsuVar68;
            this.bo = fcsuVar69;
            this.aF = fcsuVar71;
            this.bs = atomicBoolean;
            this.ar = fcsuVar70;
            this.bp = fcsuVar72;
            this.bq = fcsuVar73;
            this.cj = fcsuVar74;
            this.bn = fcsuVar75;
            this.u = fcsuVar76;
            this.bG = fcsuVar77;
            this.p = fcsuVar78;
            this.br = fcsuVar79;
            this.aH = fcsuVar81;
            this.v = fcsuVar80;
            this.aG = eyggVar11;
            this.cm = eyggVar12;
            this.cn = fcsuVar82;
            this.ck = eyggVar13;
            this.cl = eyggVar14;
            this.bI = fcsuVar83;
            this.co = fcsuVar84;
            this.bm = fcsuVar85;
            this.cp = fcsuVar86;
            this.bu = fcsuVar87;
            this.cq = fcsuVar88;
            this.bv = fcsuVar89;
            this.bw = fcsuVar90;
            this.bx = fcsuVar91;
            this.by = fcsuVar92;
            this.cr = fcsuVar93;
            this.bz = fcsuVar94;
            this.bA = fcsuVar95;
            this.w = fcsuVar96;
            this.cs = fcsuVar97;
            this.bB = arfsVar;
            this.bC = fcsuVar98;
            this.ay = new acqv(this);
            this.az = new acqy(this);
            this.aA = new acrb(this);
            this.aB = new acrc(this);
            this.aC = new acrf(this);
            this.aN = false;
            this.be = new cpdt("enable_ditto_extensions_state", new fdae() { // from class: acqe
                @Override // defpackage.fdae
                public final Object invoke() {
                    eygg eyggVar15 = eyggVar7;
                    boolean z = false;
                    if (((Optional) eyggVar15.b()).isPresent() && ((abdk) ((Optional) eyggVar15.b()).get()).m()) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            });
            eieuVarK.close();
        } finally {
        }
    }

    private final void H(Context context) {
        acif acifVar = (acif) this.bS.b();
        acik acikVar = new acik();
        acikVar.b(elie.BUGLE_ADVANCED_FEEDBACK_SOURCE_OPTIONS_MENU);
        acifVar.b(context, acikVar.a());
    }

    private final void I() {
        ((aijh) this.H.b()).r(this.b.fg(), this.am);
    }

    private final void J() {
        auvh.h(((achu) this.bN.b()).i(this.b.A(), this.am));
    }

    private final void K(int i) {
        ((ains) this.bL.b()).e("Bugle.UI.AvatarMenu.ItemClickEvent", i);
    }

    private final void L() {
        if (this.aM.b()) {
            this.bc.a = !B();
        }
    }

    public static RecyclerView b(acom acomVar) {
        return (RecyclerView) f(acomVar).findViewById(R.id.list);
    }

    public static View c(acom acomVar) {
        return acomVar.N().findViewById(com.google.android.apps.messaging.R.id.conversation_list_not_default_sms_app_view);
    }

    public static View d(acom acomVar) {
        return acomVar.N().findViewById(com.google.android.apps.messaging.R.id.go_to_top_inflated_view);
    }

    public static ViewGroup e(acom acomVar) {
        return (ViewGroup) f(acomVar).findViewById(com.google.android.apps.messaging.R.id.bottom_layout);
    }

    public static ViewGroup f(acom acomVar) {
        return (ViewGroup) acomVar.N().findViewById(com.google.android.apps.messaging.R.id.home_fragment);
    }

    public static LottieAnimationView g(acom acomVar) {
        return (LottieAnimationView) c(acomVar).findViewById(com.google.android.apps.messaging.R.id.default_chat_app_animation);
    }

    public static cwvv k(eg egVar) {
        cwvv cwvvVar = (cwvv) ((cukf) egVar).Q();
        cwvvVar.getClass();
        return cwvvVar;
    }

    public static void v(ListEmptyView listEmptyView, int i) {
        listEmptyView.a.setContentDescription(listEmptyView.getResources().getString(i));
        listEmptyView.b(i);
    }

    public final boolean A() {
        return !C() && ((aidr) this.cp.b()).a() && ((Optional) this.bR.b()).isPresent();
    }

    public final boolean B() {
        return ((cukf) this.b.fg()).Q() instanceof cwvv;
    }

    public final boolean C() {
        return afic.a(this.c, this.ci.a);
    }

    public final boolean D() {
        return this.aQ.K() == 0;
    }

    public final boolean E(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        acom acomVar = this.b;
        Context contextA = acomVar.A();
        if (itemId == com.google.android.apps.messaging.R.id.action_settings) {
            ((aijh) this.H.b()).D(contextA, this.am);
            K(2);
            return true;
        }
        if (itemId == com.google.android.apps.messaging.R.id.action_help_and_feedback) {
            J();
            K(4);
            return true;
        }
        if (itemId == com.google.android.apps.messaging.R.id.action_help) {
            J();
            K(4);
            return true;
        }
        if (itemId == com.google.android.apps.messaging.R.id.action_advanced_feedback) {
            H(contextA);
            K(6);
            return true;
        }
        if (itemId == com.google.android.apps.messaging.R.id.action_show_archived) {
            I();
            return true;
        }
        if (itemId == com.google.android.apps.messaging.R.id.action_show_spam_folder) {
            ((aijh) this.H.b()).M(contextA);
            ((acgu) this.i.b()).a(12);
            return true;
        }
        if (itemId == com.google.android.apps.messaging.R.id.action_mark_all_as_read) {
            ((acsd) this.d.b()).a(this.am);
            ((ains) this.bL.b()).c("Bugle.UI.MarkAllAsRead");
            return true;
        }
        if (itemId == com.google.android.apps.messaging.R.id.action_show_blocked_contacts) {
            ((aijh) this.H.b()).s(contextA);
            ((ains) this.bL.b()).c("Bugle.UI.Blocked");
            return true;
        }
        if (itemId == com.google.android.apps.messaging.R.id.action_zero_state_search) {
            ((daau) this.bM.b()).a(this.am, acomVar.A());
            return true;
        }
        ((cxcb) this.bK.b()).b(itemId, acomVar.fg(), cxcb.a);
        if (this.be.b() && ((abdk) ((Optional) this.V.b()).get()).n(menuItem)) {
            return true;
        }
        if (itemId != com.google.android.apps.messaging.R.id.action_camera) {
            return false;
        }
        return false;
    }

    final void F(int i, SelectedConversation selectedConversation, bajg bajgVar) {
        int i2;
        adaw adawVar = (adaw) this.y.b();
        aisq aisqVar = adawVar.m;
        if (aisqVar != null) {
            aisqVar.b();
            adawVar.m = null;
        }
        ConversationId conversationId = selectedConversation.b;
        this.bf.a(ajfo.l, 0);
        if (((Boolean) vcv.a.e()).booleanValue()) {
            zum zumVar = (zum) this.bT.b();
            ecem.c();
            if (zumVar.c == null) {
                ((ekrd) ((ekrd) zum.a.h()).h("com/google/android/apps/messaging/conversation2/preload/ConversationCachedLoaderImpl", "cancelCurrentLoad", 87, "ConversationCachedLoaderImpl.java")).q("No conversations have started loading");
            } else {
                ekrd ekrdVar = (ekrd) ((ekrd) zum.a.h()).h("com/google/android/apps/messaging/conversation2/preload/ConversationCachedLoaderImpl", "cancelCurrentLoad", 91, "ConversationCachedLoaderImpl.java");
                zul zulVar = zumVar.c;
                zulVar.getClass();
                ekrdVar.t("Cancel loading for conversation %s", zulVar.a.d().b());
                zumVar.a().close();
            }
            ((ekrd) ((ekrd) zum.a.h()).h("com/google/android/apps/messaging/conversation2/preload/ConversationCachedLoaderImpl", "startLoadingConversation", 58, "ConversationCachedLoaderImpl.java")).t("Start loading messages for conversation %s", conversationId.b());
            zumVar.c = new zul(zumVar.b.a(conversationId, ajlm.FOR_DISPLAY));
        }
        MessageIdType messageIdType = bary.a;
        if (selectedConversation.t == akbl.c && (selectedConversation.h || selectedConversation.u)) {
            final cdpf cdpfVar = (cdpf) this.co.b();
            final eg egVarFg = this.b.fg();
            eeji eejiVar = new eeji(egVarFg);
            eejiVar.u(com.google.android.apps.messaging.R.string.rbm_email_trusted_contacts_user_education_title);
            eejiVar.k(com.google.android.apps.messaging.R.string.rbm_email_trusted_contacts_user_education_body);
            eigp eigpVar = cdpfVar.a;
            eejiVar.r(com.google.android.apps.messaging.R.string.ok_action, new eigf(eigpVar, "", "", 0, "TrustedContactsDialog#ShowRbmEmailDisabledEducationDialog#positive", new DialogInterface.OnClickListener() { // from class: cdpd
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                }
            }));
            eejiVar.m(com.google.android.apps.messaging.R.string.learn_more_action, new eigf(eigpVar, "", "", 0, "TrustedContactsDialog#ShowRbmEmailDisabledEducationDialog#negative", new DialogInterface.OnClickListener() { // from class: cdpe
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) throws IOException {
                    eiid.o(egVarFg, new Intent("android.intent.action.VIEW", Uri.parse((String) cdpfVar.b.b())));
                }
            }));
            eejiVar.a();
            return;
        }
        if (!this.aM.b()) {
            int i3 = this.aM.d;
            int i4 = 1;
            if (i3 == 0) {
                i2 = i4;
                ((avmp) this.bJ.b()).A(this.b.fg(), conversationId, messageIdType, bajgVar, Optional.of(this.am), i2);
            } else if (i3 != 1) {
                i4 = 3;
                i2 = i4;
                ((avmp) this.bJ.b()).A(this.b.fg(), conversationId, messageIdType, bajgVar, Optional.of(this.am), i2);
            } else {
                i2 = 2;
                ((avmp) this.bJ.b()).A(this.b.fg(), conversationId, messageIdType, bajgVar, Optional.of(this.am), i2);
            }
        } else if (((Optional) this.aD.b()).isPresent()) {
            this.aO.k(conversationId, bajgVar);
        } else {
            this.aO.j(conversationId, messageIdType, bajgVar);
        }
        ((ajhd) this.bE.b()).o(selectedConversation.a, elka.CONVERSATION_FROM_LIST, i);
        Optional optional = (Optional) this.ck.b();
        if (optional.isPresent() && ((alrj) ((ague) this.cl.b()).a.b()).u(selectedConversation.k, selectedConversation.p).z()) {
            agxy agxyVar = (agxy) optional.get();
            encu encuVar = (encu) encw.a.createBuilder();
            encuVar.getClass();
            envz.b(2, encuVar);
            agxyVar.a(envz.a(encuVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03df A[Catch: all -> 0x04cb, TryCatch #6 {all -> 0x04cb, blocks: (B:98:0x03d4, B:100:0x03df, B:101:0x03e9, B:103:0x03f7, B:115:0x042b, B:114:0x0428, B:116:0x042c, B:118:0x0448, B:119:0x0467, B:121:0x0475, B:122:0x0488, B:124:0x0490, B:126:0x0498, B:128:0x049c, B:129:0x04ae, B:111:0x0423), top: B:157:0x00a5, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03f7 A[Catch: all -> 0x04cb, TRY_LEAVE, TryCatch #6 {all -> 0x04cb, blocks: (B:98:0x03d4, B:100:0x03df, B:101:0x03e9, B:103:0x03f7, B:115:0x042b, B:114:0x0428, B:116:0x042c, B:118:0x0448, B:119:0x0467, B:121:0x0475, B:122:0x0488, B:124:0x0490, B:126:0x0498, B:128:0x049c, B:129:0x04ae, B:111:0x0423), top: B:157:0x00a5, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0448 A[Catch: all -> 0x04cb, TryCatch #6 {all -> 0x04cb, blocks: (B:98:0x03d4, B:100:0x03df, B:101:0x03e9, B:103:0x03f7, B:115:0x042b, B:114:0x0428, B:116:0x042c, B:118:0x0448, B:119:0x0467, B:121:0x0475, B:122:0x0488, B:124:0x0490, B:126:0x0498, B:128:0x049c, B:129:0x04ae, B:111:0x0423), top: B:157:0x00a5, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0475 A[Catch: all -> 0x04cb, TryCatch #6 {all -> 0x04cb, blocks: (B:98:0x03d4, B:100:0x03df, B:101:0x03e9, B:103:0x03f7, B:115:0x042b, B:114:0x0428, B:116:0x042c, B:118:0x0448, B:119:0x0467, B:121:0x0475, B:122:0x0488, B:124:0x0490, B:126:0x0498, B:128:0x049c, B:129:0x04ae, B:111:0x0423), top: B:157:0x00a5, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x049c A[Catch: all -> 0x04cb, TryCatch #6 {all -> 0x04cb, blocks: (B:98:0x03d4, B:100:0x03df, B:101:0x03e9, B:103:0x03f7, B:115:0x042b, B:114:0x0428, B:116:0x042c, B:118:0x0448, B:119:0x0467, B:121:0x0475, B:122:0x0488, B:124:0x0490, B:126:0x0498, B:128:0x049c, B:129:0x04ae, B:111:0x0423), top: B:157:0x00a5, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04ae A[Catch: all -> 0x04cb, TRY_LEAVE, TryCatch #6 {all -> 0x04cb, blocks: (B:98:0x03d4, B:100:0x03df, B:101:0x03e9, B:103:0x03f7, B:115:0x042b, B:114:0x0428, B:116:0x042c, B:118:0x0448, B:119:0x0467, B:121:0x0475, B:122:0x0488, B:124:0x0490, B:126:0x0498, B:128:0x049c, B:129:0x04ae, B:111:0x0423), top: B:157:0x00a5, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[Catch: all -> 0x04d3, TryCatch #1 {all -> 0x04d3, blocks: (B:3:0x0008, B:5:0x0010, B:8:0x0018, B:15:0x0037, B:17:0x003f, B:21:0x004f, B:23:0x0055, B:29:0x009a, B:31:0x00a7, B:33:0x00b4, B:35:0x00ba, B:38:0x00cc, B:37:0x00c8, B:24:0x0075, B:26:0x008f, B:28:0x0097, B:11:0x0026), top: B:147:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075 A[Catch: all -> 0x04d3, TryCatch #1 {all -> 0x04d3, blocks: (B:3:0x0008, B:5:0x0010, B:8:0x0018, B:15:0x0037, B:17:0x003f, B:21:0x004f, B:23:0x0055, B:29:0x009a, B:31:0x00a7, B:33:0x00b4, B:35:0x00ba, B:38:0x00cc, B:37:0x00c8, B:24:0x0075, B:26:0x008f, B:28:0x0097, B:11:0x0026), top: B:147:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7 A[Catch: all -> 0x04d3, TryCatch #1 {all -> 0x04d3, blocks: (B:3:0x0008, B:5:0x0010, B:8:0x0018, B:15:0x0037, B:17:0x003f, B:21:0x004f, B:23:0x0055, B:29:0x009a, B:31:0x00a7, B:33:0x00b4, B:35:0x00ba, B:38:0x00cc, B:37:0x00c8, B:24:0x0075, B:26:0x008f, B:28:0x0097, B:11:0x0026), top: B:147:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8 A[Catch: all -> 0x04d3, TryCatch #1 {all -> 0x04d3, blocks: (B:3:0x0008, B:5:0x0010, B:8:0x0018, B:15:0x0037, B:17:0x003f, B:21:0x004f, B:23:0x0055, B:29:0x009a, B:31:0x00a7, B:33:0x00b4, B:35:0x00ba, B:38:0x00cc, B:37:0x00c8, B:24:0x0075, B:26:0x008f, B:28:0x0097, B:11:0x0026), top: B:147:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(android.view.MenuInflater r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acrt.G(android.view.MenuInflater):void");
    }

    public final int a() {
        return ((acwj) this.q.b()).a();
    }

    public RecyclerView getRecyclerView() {
        return b(this.b);
    }

    public final acrt h() {
        return this.b.H();
    }

    public final acwl i() {
        return (acwl) this.q.b();
    }

    public final acxm j() {
        return (acxm) this.n.b();
    }

    @Override // defpackage.daih
    public final List l() {
        ArrayList arrayList = new ArrayList(1);
        daii daiiVar = new daii(e(this.b));
        acsw acswVar = this.ad;
        if (acswVar.g() != null) {
            View viewG = acswVar.g();
            viewG.getClass();
            arrayList.add(new daii(viewG));
        }
        arrayList.add(daiiVar);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [eygg, java.lang.Object] */
    public final void m() {
        final ArrayList arrayList = new ArrayList();
        if (abxb.b()) {
            ((Optional) this.bW.b()).ifPresent(new Consumer() { // from class: acpb
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    arrayList.add((cytk) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        fcsu fcsuVar = this.cq;
        if (((apve) fcsuVar.b()).a()) {
            fcsu fcsuVar2 = this.cf;
            if (((Optional) fcsuVar2.b()).isPresent()) {
                arrayList.add((agzt) ((Optional) fcsuVar2.b()).get());
            }
        }
        if (((abjz) this.bG.b()).a()) {
            ((Optional) this.bH.b()).ifPresent(new Consumer() { // from class: acpm
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    arrayList.add((absj) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        arrayList.add((agzt) this.cg.b());
        arrayList.add((agzt) this.cd.b());
        arrayList.add((agzt) this.bX.b());
        arrayList.add((agzt) this.bY.b());
        czru czruVar = (czru) this.cb.b();
        eosc eoscVar = (eosc) czruVar.a.b();
        eoscVar.getClass();
        eosc eoscVar2 = (eosc) czruVar.b.b();
        eoscVar2.getClass();
        arrayList.add(new czrt(eoscVar, eoscVar2, czruVar.c));
        czut czutVar = (czut) this.ca.b();
        fcsu fcsuVar3 = czutVar.a;
        fcsu fcsuVar4 = czutVar.b;
        fcsu fcsuVar5 = czutVar.c;
        fcsu fcsuVar6 = czutVar.d;
        fcsu fcsuVar7 = czutVar.e;
        fcsu fcsuVar8 = czutVar.f;
        eosc eoscVar3 = (eosc) czutVar.g.b();
        eoscVar3.getClass();
        eosc eoscVar4 = (eosc) czutVar.h.b();
        eoscVar4.getClass();
        arrayList.add(new czus(fcsuVar3, fcsuVar4, fcsuVar5, fcsuVar6, fcsuVar7, fcsuVar8, eoscVar3, eoscVar4, czutVar.i, czutVar.j, czutVar.k, czutVar.l, czutVar.m, czutVar.n));
        if (cpyl.a() && ((Boolean) ((cczi) cpyl.t.get()).e()).booleanValue()) {
            ((Optional) ((eyig) this.ce).a).ifPresent(new Consumer() { // from class: acpx
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    arrayList.add((tms) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        fcsu fcsuVar9 = this.cf;
        if (((Optional) fcsuVar9.b()).isPresent() && !((apve) fcsuVar.b()).a()) {
            arrayList.add((agzt) ((Optional) fcsuVar9.b()).get());
        }
        if (((apwp) this.cn.b()).a()) {
            arrayList.add((agzt) ((Optional) this.cm.b()).get());
        }
        Stream streamSorted = Collection.EL.stream((Set) this.cc.b()).sorted(Comparator.CC.comparingInt(new ToIntFunction() { // from class: acqf
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((agzt) obj).n();
            }
        }));
        int i = ekgb.d;
        arrayList.addAll((java.util.Collection) streamSorted.collect(ekcv.a));
        cwyo cwyoVar = (cwyo) this.bZ.b();
        acom acomVar = this.b;
        fcsu fcsuVar10 = cwyoVar.a;
        fcsu fcsuVar11 = cwyoVar.b;
        fcsu fcsuVar12 = cwyoVar.c;
        RecyclerView recyclerViewB = b(acomVar);
        cogw cogwVar = (cogw) fcsuVar12.b();
        cogwVar.getClass();
        ?? B = cwyoVar.d.b();
        B.getClass();
        recyclerViewB.getClass();
        arrayList.add(new cwyn(fcsuVar10, fcsuVar11, cogwVar, B, recyclerViewB));
        agzy agzyVar = this.aw;
        ViewGroup viewGroupE = e(acomVar);
        agzyVar.h = (agzt[]) arrayList.toArray(new agzt[arrayList.size()]);
        for (agzt agztVar : agzyVar.h) {
            agztVar.c(agzyVar, viewGroupE);
        }
    }

    public final void n() {
        Toolbar toolbar;
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "HomeFragmentFlogger");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "enterMultiSelectState", 2694, "HomeFragmentPeer.java")).q("enterMultiSelectState");
        if (((arfr) this.cr.b()).a() && (toolbar = this.bD.d) != null) {
            toolbar.setImportantForAccessibility(4);
        }
        cwvw cwvwVar = (cwvw) this.bO.b();
        acrt acrtVarH = h();
        Context context = (Context) cwvwVar.a.b();
        cssx cssxVar = (cssx) cwvwVar.b.b();
        cssxVar.getClass();
        cmum cmumVar = (cmum) cwvwVar.c.b();
        cmumVar.getClass();
        cpiz cpizVar = (cpiz) cwvwVar.d.b();
        cpizVar.getClass();
        Optional optional = (Optional) cwvwVar.e.b();
        optional.getClass();
        fcsu fcsuVar = cwvwVar.f;
        fcsu fcsuVar2 = cwvwVar.g;
        fcsu fcsuVar3 = cwvwVar.h;
        arpr arprVar = (arpr) cwvwVar.i.b();
        arprVar.getClass();
        cwvv cwvvVar = new cwvv(context, cssxVar, cmumVar, cpizVar, optional, acrtVarH, fcsuVar, fcsuVar2, fcsuVar3, arprVar);
        this.aO.l(cwvvVar, this.b.N());
        if (C()) {
            i().Q(acxg.a);
            ((Optional) this.bI.b()).ifPresent(new Consumer() { // from class: acqa
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((ahbg) obj).a();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        i().O(cwvvVar);
        L();
        ((acgu) this.i.b()).a(24);
    }

    public final void o() {
        Toolbar toolbar;
        if (this.b.aF()) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "HomeFragmentFlogger");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "exitMultiSelectState", 2715, "HomeFragmentPeer.java")).q("exitMultiSelectState");
            if (!this.aO.e().isEmpty()) {
                pcw pcwVar = this.aP;
                if (pcwVar != null) {
                    pcwVar.h();
                }
                if (((arfr) this.cr.b()).a() && (toolbar = this.bD.d) != null) {
                    toolbar.setImportantForAccessibility(1);
                }
                if (((arfk) this.cs.b()).a()) {
                    i().O(null);
                }
                this.aO.f();
            }
            if (this.aP == null) {
                eygg eyggVar = this.q;
                ((acwj) eyggVar.b()).u(0, ((acwj) eyggVar.b()).a());
            }
            L();
        }
    }

    public final void p(abwv abwvVar, final Optional optional) {
        switch (abwvVar.ordinal()) {
            case 1:
                if (abxb.a()) {
                    aijh aijhVar = (aijh) this.H.b();
                    acom acomVar = this.b;
                    aijhVar.D(acomVar.A(), this.am);
                } else {
                    ((aijh) this.H.b()).C(this.b.A());
                }
                K(1);
                break;
            case 2:
                J();
                K(3);
                break;
            case 3:
                H(this.b.A());
                K(5);
                break;
            case 4:
                ((Optional) this.bU.b()).ifPresent(new Consumer() { // from class: acpu
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        accl acclVar = (accl) obj;
                        eiju eijuVarG = eiju.g(((egbf) acclVar.a.b()).c((efwo) acclVar.b.b()));
                        ejvr ejvrVar = new ejvr() { // from class: accj
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                return ((egbe) obj2).b().g;
                            }
                        };
                        eoqg eoqgVar = eoqg.a;
                        egpq egpqVar = new egpq(eijuVarG.h(ejvrVar, eoqgVar).h(new ejvr() { // from class: acck
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                return new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", etzq.PRIVACY_ADVISOR_MESSAGES.rz).putExtra("extra.accountName", (String) obj2);
                            }
                        }, eoqgVar));
                        egpo egpoVar = new egpo(null);
                        acrt acrtVar = this.a;
                        acrtVar.C.h(egpqVar, egpoVar, acrtVar.aB);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                K(7);
                break;
            case 5:
                I();
                break;
            case 7:
                ((acsd) this.d.b()).a(this.am);
                break;
            case 8:
                if (abxb.b()) {
                    fcsu fcsuVar = this.I;
                    if (((Optional) fcsuVar.b()).isPresent()) {
                        ((cyqs) ((Optional) fcsuVar.b()).get()).a();
                        break;
                    }
                }
                ((aijh) this.H.b()).z(this.b.A());
                break;
            case 9:
                ((abdk) ((Optional) this.V.b()).get()).g(abgx.STANDALONE);
                break;
            case 10:
                ((Optional) this.cj.b()).ifPresent(new Consumer() { // from class: acpv
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        acrt acrtVar = this.a;
                        ((acdd) obj).a(acrtVar.b, acrtVar.am, optional);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                break;
            case 11:
                ((Optional) this.bn.b()).ifPresent(new Consumer() { // from class: acpw
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ((ahdq) obj).a(this.a.b);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                break;
        }
    }

    @Override // defpackage.cwvu
    public final void q(Iterable iterable, boolean z) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ekfwVar.h(((SelectedConversation) it.next()).a);
        }
        t(ekfwVar.g(), z, elka.CONVERSATION_FROM_LIST);
    }

    public final void s() throws Throwable {
        View viewFindViewById;
        if (!this.aM.b()) {
            acom acomVar = this.b;
            if (acomVar.G() != null) {
                acomVar.fg().invalidateOptionsMenu();
                return;
            }
            return;
        }
        G(null);
        Toolbar toolbar = this.bD.d;
        if (!abxb.a() || toolbar == null || (viewFindViewById = f(this.b).findViewById(com.google.android.apps.messaging.R.id.gk_tooltip_hack)) == null) {
            return;
        }
        toolbar.getLocationOnScreen(new int[2]);
        float[] fArr = {r3[0] + (toolbar.getWidth() * 0.94f), r3[1] + ((toolbar.getHeight() * 3) / 5)};
        viewFindViewById.setX(fArr[0]);
        viewFindViewById.setY(fArr[1]);
    }

    public final void t(ekgb ekgbVar, boolean z, elka elkaVar) {
        if (this.b.I().ag()) {
            return;
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "HomeFragmentFlogger");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "setConversationsArchiveStatus", 2584, "HomeFragmentPeer.java")).I("Set conversation archive status started by user, conversationIds: %s, isToArchive: %s, origin: %s", ekgbVar, Boolean.valueOf(z), elkaVar);
        egpq egpqVar = new egpq(this.D.a(ekgbVar, z ? bvdk.ARCHIVED : bvdk.UNARCHIVED, elkaVar, this.am));
        egpr egprVar = this.C;
        adcj adcjVar = (adcj) adck.a.createBuilder();
        adcjVar.copyOnWrite();
        adck adckVar = (adck) adcjVar.instance;
        adckVar.b |= 1;
        adckVar.c = z;
        adcjVar.copyOnWrite();
        adck adckVar2 = (adck) adcjVar.instance;
        adckVar2.d = elkaVar.u;
        adckVar2.b |= 2;
        egprVar.h(egpqVar, egpo.a(adcjVar.build()), this.aA);
    }

    public final void u() {
        Button button;
        boolean zG = this.k.G();
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "HomeFragmentFlogger");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "setDefaultSmsValueAndUpdateUI", 3328, "HomeFragmentPeer.java")).t("isDefaultSmsApp: %s", Boolean.valueOf(zG));
        if (zG) {
            acom acomVar = this.b;
            if (c(acomVar) != null) {
                c(acomVar).setVisibility(8);
            }
            b(acomVar).setVisibility(0);
            return;
        }
        acom acomVar2 = this.b;
        if (c(acomVar2) == null) {
            ((ViewStub) f(acomVar2).findViewById(com.google.android.apps.messaging.R.id.conversation_list_not_default_sms_app_stub)).inflate();
            button = (Button) c(acomVar2).findViewById(com.google.android.apps.messaging.R.id.set_as_default_button);
            g(acomVar2).g(c(acomVar2).getContext().getString(com.google.android.apps.messaging.R.string.default_chat_app_gm3_json));
            g(acomVar2).d();
            if (dakl.m(acomVar2.A())) {
                g(acomVar2).setVisibility(8);
            }
        } else if (c(acomVar2).getVisibility() == 0) {
            return;
        } else {
            button = (Button) c(acomVar2).findViewById(com.google.android.apps.messaging.R.id.set_as_default_button);
        }
        b(acomVar2).setVisibility(8);
        c(acomVar2).setVisibility(0);
        button.setOnClickListener(((cvjo) this.bF.b()).a(new View.OnClickListener() { // from class: acoz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ekrw ekrwVarH2 = acrt.a.h();
                ekrwVarH2.X(eksq.a, "HomeFragmentFlogger");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "setDefaultSmsValueAndUpdateUI", 3356, "HomeFragmentPeer.java")).q("Set default sms button clicked");
                acrt acrtVar = this.a;
                aijh aijhVar = (aijh) acrtVar.H.b();
                acom acomVar3 = acrtVar.b;
                acomVar3.startActivityForResult(aijhVar.l(acomVar3.fg()), 1);
            }
        }));
        AppBarLayout appBarLayout = this.bD.c;
        if (!A() || appBarLayout == null) {
            return;
        }
        appBarLayout.m(false);
    }

    final void w() {
        if (this.aM.b() && D() && this.b.aI()) {
            ((badi) this.aW.a()).d(true);
        }
    }

    public final void x() {
        MenuItem menuItem = this.ch;
        if (menuItem != null) {
            menuItem.setTitle(com.google.android.apps.messaging.R.string.blocked_destination_list_title);
            this.ch.setVisible(((cpiz) this.bP.b()).c());
        }
    }

    public final void y(ListEmptyView listEmptyView) {
        if (A() && this.aM.b()) {
            listEmptyView.a(8);
            kub kubVar = new kub(-1, -1);
            kubVar.c = 16;
            kubVar.b(new AppBarLayout.ScrollingViewBehavior());
            listEmptyView.setLayoutParams(kubVar);
            return;
        }
        if (dakl.m(this.b.A())) {
            listEmptyView.a(8);
        } else {
            listEmptyView.a(0);
            listEmptyView.c(com.google.android.apps.messaging.R.drawable.ic_messages_noconversations);
        }
    }

    public final void z(boolean z) {
        if (this.c.isDestroyed()) {
            return;
        }
        this.aT = !z;
        if (z && this.k.G()) {
            this.aR.g(0);
        } else {
            this.aR.e();
        }
    }

    @Override // defpackage.badh
    public final /* synthetic */ void r(badi badiVar, Cursor cursor) {
    }
}
