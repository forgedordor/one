package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Size;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yvq implements aalp {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter");
    public static final dltb b = dltb.a;
    public final agdt A;
    private final zgh B;
    private final fcsu C;
    private final vmg D;
    private final aqkf E;
    private final apql F;
    private final aqkb G;
    private final cqmb H;
    private final ytd I;
    private final arlz J;
    private final whw K;
    public final Context c;
    public final fdjx d;
    public final fcyh e;
    public final Conversation f;
    public final ajmh g;
    public final fcsu h;
    public final afzc i;
    public final arma j;
    public final fcsu k;
    public final xuz l;
    public final xvb m;
    public final aqzm n;
    public final xva o;
    public final ahax p;
    public final Optional q;
    public final vvj r;
    public final aqhi s;
    public final fctc t;
    public final Set u;
    public final ConcurrentHashMap v;
    public final fdap w;
    public final fdav x;
    public final fdap y;
    public final fdap z;

    public yvq(Context context, final fdjx fdjxVar, fcyh fcyhVar, Conversation conversation, ajmh ajmhVar, fcsu fcsuVar, afzc afzcVar, whw whwVar, agdt agdtVar, arma armaVar, fcsu fcsuVar2, zgh zghVar, xuz xuzVar, final fcsu fcsuVar3, fcsu fcsuVar4, xvb xvbVar, vmg vmgVar, aqzm aqzmVar, xva xvaVar, ahax ahaxVar, Optional optional, aqkf aqkfVar, apql apqlVar, vuc vucVar, aqkb aqkbVar, cqmb cqmbVar, ytd ytdVar, vvj vvjVar, arlz arlzVar, aqhi aqhiVar) {
        context.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        conversation.getClass();
        ajmhVar.getClass();
        fcsuVar.getClass();
        afzcVar.getClass();
        whwVar.getClass();
        armaVar.getClass();
        xuzVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        vmgVar.getClass();
        aqzmVar.getClass();
        xvaVar.getClass();
        ahaxVar.getClass();
        apqlVar.getClass();
        vucVar.getClass();
        cqmbVar.getClass();
        vvjVar.getClass();
        this.c = context;
        this.d = fdjxVar;
        this.e = fcyhVar;
        this.f = conversation;
        this.g = ajmhVar;
        this.h = fcsuVar;
        this.i = afzcVar;
        this.K = whwVar;
        this.A = agdtVar;
        this.j = armaVar;
        this.k = fcsuVar2;
        this.B = zghVar;
        this.l = xuzVar;
        this.C = fcsuVar4;
        this.m = xvbVar;
        this.D = vmgVar;
        this.n = aqzmVar;
        this.o = xvaVar;
        this.p = ahaxVar;
        this.q = optional;
        this.E = aqkfVar;
        this.F = apqlVar;
        this.G = aqkbVar;
        this.H = cqmbVar;
        this.I = ytdVar;
        this.r = vvjVar;
        this.J = arlzVar;
        this.s = aqhiVar;
        this.t = fctd.a(new fdae() { // from class: yul
            @Override // defpackage.fdae
            public final Object invoke() {
                return (ahnv) fcsuVar3.b();
            }
        });
        this.u = new LinkedHashSet();
        this.v = new ConcurrentHashMap();
        auvw.k(fdjxVar, null, null, new yuy(this, null), 3);
        this.w = auxh.a(new yvo(vmgVar), 1000L, fdjxVar);
        final yva yvaVar = new yva(this);
        final fdci fdciVar = new fdci();
        this.x = new fdav() { // from class: auww
            @Override // defpackage.fdav
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                fdci fdciVar2 = fdciVar;
                if (fdciVar2.a == null) {
                    fdciVar2.a = auvw.k(fdjxVar, null, null, new auxf(yvaVar, obj, obj2, obj3, obj4, fdciVar2, null), 3);
                }
                return fctx.a;
            }
        };
        this.y = auxh.a(new yvm(this), 1000L, fdjxVar);
        this.z = auxh.a(new yvk(this), 1000L, fdjxVar);
    }

    public final djtg a(djtq djtqVar, final ytz ytzVar) {
        amvx amvxVarH;
        int iOrdinal;
        if (crtr.e() && !this.q.isEmpty() && ytzVar.e) {
            amwm amwmVar = ytzVar.g;
            if ((amwmVar instanceof amvy) && (amvxVarH = ((amvy) amwmVar).h()) != null && (iOrdinal = amvxVarH.ordinal()) != 0 && iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return new djtr(djtqVar, false, new fdae() { // from class: yux
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            yvq yvqVar = this.a;
                            auvw.k(yvqVar.d, null, null, new yvg(yvqVar, ytzVar, null), 3);
                            return fctx.a;
                        }
                    }, null, null, 26);
                }
                if (iOrdinal == 3) {
                    return new djtr(djtqVar, false, null, this.c.getString(R.string.spatula_warning), new fdae() { // from class: yub
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            yvq yvqVar = this.a;
                            auvw.k(yvqVar.d, null, null, new yvh(yvqVar, ytzVar, null), 3);
                            return fctx.a;
                        }
                    }, 6);
                }
                if (iOrdinal == 4) {
                    return new djtr(djtqVar, false, null, this.c.getString(R.string.spatula_warning), new fdae() { // from class: yuc
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            final yvq yvqVar = this.a;
                            final ytz ytzVar2 = ytzVar;
                            yvqVar.p.e(new fdap() { // from class: yup
                                /* JADX WARN: Type inference failed for: r1v1, types: [aaef, java.lang.Object] */
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj) {
                                    final ahat ahatVar = (ahat) obj;
                                    ahatVar.getClass();
                                    final yvq yvqVar2 = yvqVar;
                                    ?? r1 = yvqVar2.q.get();
                                    fdae fdaeVar = new fdae() { // from class: yuv
                                        @Override // defpackage.fdae
                                        public final Object invoke() {
                                            ahatVar.a();
                                            return fctx.a;
                                        }
                                    };
                                    final ytz ytzVar3 = ytzVar2;
                                    return r1.b(new aaee(fdaeVar, new fdae() { // from class: yuw
                                        @Override // defpackage.fdae
                                        public final Object invoke() {
                                            yvq yvqVar3 = yvqVar2;
                                            auvw.k(yvqVar3.d, null, null, new yvi(yvqVar3, ytzVar3, null), 3);
                                            ahatVar.a();
                                            return fctx.a;
                                        }
                                    }, ytzVar3.d));
                                }
                            });
                            return fctx.a;
                        }
                    }, 6);
                }
                if (iOrdinal == 5) {
                    return new djtr(djtqVar, true, null, null, null, 28);
                }
                throw new fctg();
            }
        }
        return djtqVar;
    }

    public final void b(aggc aggcVar, vvl vvlVar) {
        String str = aggcVar.a;
        doig doigVarA = dohx.a(str);
        if (doigVarA == null) {
            return;
        }
        whw whwVar = this.K;
        if (vvlVar == null) {
            vvlVar = vuc.a();
        }
        Uri uri = aggcVar.b;
        whwVar.a(new vvo(vvlVar, doigVarA, uri, null, b));
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleImage");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter", "processMediaViewerResult", 633, "ImageBubbleUiAdapter.kt")).D("Draft attachment added with uri: %s media type: %s", uri, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final auyl c(final ytz ytzVar) {
        djts djtsVar;
        boolean z;
        dlhm dlhmVar;
        ytz ytzVar2;
        String str;
        ekrz ekrzVar;
        auyl auxqVar;
        fdvc auxsVar;
        dlhy dlhyVarL;
        dlhy dlhyVar;
        amwm amwmVar = ytzVar.g;
        final Uri uriE = amwmVar.e();
        ajlt ajltVar = ytzVar.a;
        MessageId messageIdB = ajltVar.b();
        Size sizeF = amwmVar.f();
        List listG = fcva.g(sizeF.getWidth() == 0 ? null : Integer.valueOf(sizeF.getWidth()), sizeF.getHeight() == 0 ? null : Integer.valueOf(sizeF.getHeight()));
        Integer num = (Integer) listG.get(0);
        Integer num2 = (Integer) listG.get(1);
        if (le.j(amwmVar.b())) {
            int iA = dlss.a((int) ((Number) this.C.b()).longValue());
            if (num == null || num2 == null) {
                Integer numValueOf = Integer.valueOf(iA);
                djtsVar = new djts(numValueOf, numValueOf);
            } else {
                djtsVar = new djts(Integer.valueOf(iA), Integer.valueOf((int) (iA * (num2.intValue() / num.intValue()))));
            }
        } else {
            djtsVar = new djts(num, num2);
        }
        Uri uri = ytzVar.c;
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar2 = eksq.a;
        ekrwVarH.X(ekrzVar2, "BugleImage");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.c, messageIdB);
        ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter", "createUiDataFlow", 223, "ImageBubbleUiAdapter.kt");
        ekri ekriVarA = cqcy.a(uriE);
        Integer num3 = djtsVar.a;
        Integer num4 = djtsVar.b;
        ekrdVar2.J("Create image bubble for uri=%s, previewUri=%s, %sx%s", ekriVarA, uri, num3, num4);
        final amyb amybVarFm = amwmVar.fm();
        Uri uriE2 = fdbq.f(uriE, amwmVar.c()) ? amwmVar.e() : null;
        String str2 = amwmVar.l() == null ? ytzVar.i : null;
        boolean z2 = ytzVar.h;
        String strL = amwmVar.l();
        if (strL != null) {
            dlhmVar = new dlhm(strL, null, true, false, ytzVar.i, z2, ytzVar.b, null, false, null, null, null, false, true, null, null, false, true, false, 3079958);
            z = z2;
        } else {
            z = z2;
            dlhmVar = null;
        }
        int i = (amwmVar.b().equals("image/gif") || (amwmVar.f().getWidth() == amwmVar.f().getHeight() && amwmVar.f().getWidth() < 600)) ? 1 : 3;
        yuz yuzVar = new yuz(this, ytzVar);
        boolean z3 = ytzVar.f;
        dker dkerVar = new dker(z3, ((eoth) ((aqjj) this.E).a.b()).a("bugle.enable_media_box_size_calculator_fix") && this.F.a(), this.G.a(), true, this.J.a());
        Context context = this.c;
        String string = context.getString(R.string.message_bubble_failure_image);
        string.getClass();
        String string2 = context.getString(R.string.message_bubble_manual_download);
        string2.getClass();
        String str3 = "com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter";
        int i2 = 0;
        Uri uri2 = uriE2;
        Context context2 = context;
        final djtq djtqVar = new djtq(uriE, uri, uri2, yuzVar, null, djtf.e, string, string2, false, dkerVar, str2, z, num3, num4, dlhmVar, i, new fdae() { // from class: yun
            /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
            @Override // defpackage.fdae
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    r7 = this;
                    ekrg r0 = defpackage.yvq.a
                    ekrw r0 = r0.h()
                    ekrz r1 = defpackage.eksq.a
                    java.lang.String r2 = "BugleImage"
                    r0.X(r1, r2)
                    r1 = 261(0x105, float:3.66E-43)
                    java.lang.String r2 = "ImageBubbleUiAdapter.kt"
                    java.lang.String r3 = "com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter"
                    java.lang.String r4 = "createUiDataFlow$lambda$4"
                    ekrw r0 = r0.h(r3, r4, r1, r2)
                    ekrd r0 = (defpackage.ekrd) r0
                    android.net.Uri r1 = r1
                    java.lang.String r2 = "Clicked on image with uri: %s"
                    ekri r3 = defpackage.cqcy.a(r1)
                    r0.t(r2, r3)
                    amyb r0 = r2
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L33
                    boolean r0 = r0.f()
                    if (r0 != r3) goto L33
                    goto L71
                L33:
                    ytz r0 = r4
                    boolean r4 = defpackage.crtr.e()
                    if (r4 == 0) goto L51
                    amwm r4 = r0.g
                    boolean r5 = r4 instanceof defpackage.amvy
                    r6 = 0
                    if (r5 == 0) goto L45
                    amvy r4 = (defpackage.amvy) r4
                    goto L46
                L45:
                    r4 = r6
                L46:
                    if (r4 == 0) goto L4c
                    amvx r6 = r4.h()
                L4c:
                    amvx r4 = defpackage.amvx.PROCESSING
                    if (r6 != r4) goto L51
                    goto L71
                L51:
                    android.net.Uri r2 = android.net.Uri.EMPTY
                    boolean r2 = defpackage.fdbq.f(r1, r2)
                    if (r2 == 0) goto L5a
                    goto L70
                L5a:
                    yvq r2 = r3
                    ajlt r4 = r0.a
                    amwm r0 = r0.g
                    java.util.List r5 = defpackage.fcva.b(r4)
                    java.lang.String r0 = r0.b()
                    r0.getClass()
                    fdav r2 = r2.x
                    r2.a(r4, r5, r1, r0)
                L70:
                    r2 = r3
                L71:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.yun.invoke():java.lang.Object");
            }
        }, new fdae() { // from class: yuo
            @Override // defpackage.fdae
            public final Object invoke() {
                yvq yvqVar = this.a;
                ajmh ajmhVar = yvqVar.g;
                ajlt ajltVar2 = ytzVar.a;
                ajmhVar.L(ajltVar2, 2);
                if (yvqVar.n.a() && ykm.s(ajltVar2)) {
                    ajmhVar.L(ajltVar2, 6);
                }
                return fctx.a;
            }
        });
        Uri uri3 = djtqVar.a;
        if (fdbq.f(uri3, Uri.EMPTY) && djtqVar.b == null) {
            final MessageId messageIdB2 = ajltVar.b();
            if (amybVarFm == null) {
                ekrw ekrwVarE = ekrgVar.e();
                ekrwVarE.X(ekrzVar2, "BugleImage");
                ((ekrd) ekrwVarE.h(str3, "getNotDisplayableUiData", 464, "ImageBubbleUiAdapter.kt")).D("Image bubble with messageId = %s is in %s state", messageIdB2.a(), djtqVar.f);
                return new auxq(new fdae() { // from class: yud
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return djtqVar;
                    }
                });
            }
            final fduf fdufVarA = fdvf.a(djtqVar);
            if (amybVarFm.g()) {
                final djtq djtqVarR = djtq.r(djtqVar, null, djtf.b, null, null, false, null, new fdae() { // from class: yue
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        this.a.y.invoke(messageIdB2);
                        return true;
                    }
                }, new fdae() { // from class: yuf
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return fctx.a;
                    }
                }, 65503);
                if (!this.u.contains(messageIdB2)) {
                    djtqVarR = djtq.r(djtqVar, null, djtf.a, null, null, false, null, null, new fdae() { // from class: yua
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            djtq djtqVar2 = djtqVarR;
                            yvq yvqVar = this.a;
                            auvw.k(yvqVar.d, yvqVar.e, null, new yvp(fdufVarA, messageIdB2, djtqVar2, yvqVar, null), 2);
                            return fctx.a;
                        }
                    }, 131039);
                }
                fdufVarA.f(djtqVarR);
            } else if (!amybVarFm.f()) {
                djtf djtfVar = djtf.b;
                String string3 = context2.getString(R.string.message_bubble_retry_download);
                string3.getClass();
                fdufVarA.f(djtq.r(djtqVar, null, djtfVar, null, string3, false, null, new fdae() { // from class: yug
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        this.a.y.invoke(messageIdB2);
                        return true;
                    }
                }, new fdae() { // from class: yuh
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return fctx.a;
                    }
                }, 65375));
            } else if (!dhhi.a(context2)) {
                djtf djtfVar2 = djtf.c;
                String string4 = context2.getString(R.string.message_bubble_no_network);
                string4.getClass();
                String string5 = context2.getString(R.string.message_bubble_cancel_download);
                string5.getClass();
                fdufVarA.f(djtq.r(djtqVar, null, djtfVar2, string4, string5, false, null, new fdae() { // from class: yui
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        this.a.z.invoke(messageIdB2);
                        return true;
                    }
                }, null, 196383));
            } else if (amybVarFm.e()) {
                djtf djtfVar3 = djtf.d;
                String string6 = context2.getString(R.string.message_bubble_downloading);
                string6.getClass();
                String string7 = context2.getString(R.string.message_bubble_cancel_download);
                string7.getClass();
                fdufVarA.f(djtq.r(djtqVar, null, djtfVar3, string6, string7, false, null, new fdae() { // from class: yuj
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        this.a.z.invoke(messageIdB2);
                        return true;
                    }
                }, null, 196383));
            } else {
                djtf djtfVar4 = djtf.b;
                String string8 = context2.getString(R.string.message_bubble_downloading);
                string8.getClass();
                String string9 = context2.getString(R.string.message_bubble_cancel_download);
                string9.getClass();
                final djtq djtqVarR2 = djtq.r(djtqVar, null, djtfVar4, string8, string9, false, null, new fdae() { // from class: yuk
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        this.a.z.invoke(messageIdB2);
                        return true;
                    }
                }, new fdae() { // from class: yum
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return fctx.a;
                    }
                }, 65311);
                if (!this.u.contains(messageIdB2)) {
                    djtf djtfVar5 = djtf.a;
                    String string10 = context2.getString(R.string.message_bubble_cancel_download);
                    string10.getClass();
                    djtqVarR2 = djtq.r(djtqVar, null, djtfVar5, null, string10, false, null, null, new fdae() { // from class: yua
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            djtq djtqVar2 = djtqVarR2;
                            yvq yvqVar = this.a;
                            auvw.k(yvqVar.d, yvqVar.e, null, new yvp(fdufVarA, messageIdB2, djtqVar2, yvqVar, null), 2);
                            return fctx.a;
                        }
                    }, 130911);
                }
                fdufVarA.f(djtqVarR2);
            }
            ekrw ekrwVarE2 = ekrgVar.e();
            ekrwVarE2.X(ekrzVar2, "BugleImage");
            ((ekrd) ekrwVarE2.h(str3, "getNotDisplayableUiData", 560, "ImageBubbleUiAdapter.kt")).D("Image bubble with messageId = %s is in %s state without progressBarOverlay", messageIdB2.a(), ((djtq) fdufVarA.c()).f);
            return auyp.a(fdufVarA);
        }
        fdjx fdjxVar = this.d;
        this.u.remove(ajltVar.b());
        fcsu fcsuVar = this.h;
        ajlt ajltVar2 = ajltVar;
        auyl auylVarB = ((yya) fcsuVar.b()).b(fdjxVar, new yxg(ajltVar2));
        if (auylVarB == null) {
            auylVarB = new auxq(new fdae() { // from class: yus
                @Override // defpackage.fdae
                public final Object invoke() {
                    return null;
                }
            });
        }
        final String strR = ajltVar2.r();
        if (strR != null) {
            cqmb cqmbVar = this.H;
            if (cqmbVar.f() && strR.length() != 0 && cqmbVar.g(strR)) {
                ytzVar2 = ytzVar;
                str = "ImageBubbleUiAdapter.kt";
                auxqVar = this.I.a(new ysx(new amwf() { // from class: yuq
                    @Override // defpackage.amwf
                    public final /* synthetic */ ekgb a() {
                        int i3 = ekgb.d;
                        return ekoe.a;
                    }

                    @Override // defpackage.amwf, defpackage.amvr
                    public final /* synthetic */ String b() {
                        return "text/plain";
                    }

                    @Override // defpackage.amwf
                    public final String c() {
                        return strR;
                    }
                }, z, ytzVar2.i, z3, new fdae() { // from class: ysw
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return fctx.a;
                    }
                }, ykm.t(ajltVar2), ytzVar2.b, false, null, null));
                ekrzVar = ekrzVar2;
            } else {
                ytzVar2 = ytzVar;
                str = "ImageBubbleUiAdapter.kt";
                ekrzVar = ekrzVar2;
                auxqVar = this.B.a(fdjxVar, new zfd(new amwf() { // from class: yur
                    @Override // defpackage.amwf
                    public final /* synthetic */ ekgb a() {
                        int i3 = ekgb.d;
                        return ekoe.a;
                    }

                    @Override // defpackage.amwf, defpackage.amvr
                    public final /* synthetic */ String b() {
                        return "text/plain";
                    }

                    @Override // defpackage.amwf
                    public final String c() {
                        return strR;
                    }
                }, z, ytzVar2.b, ytzVar2.i, z3, false, ykm.t(ajltVar2), ajltVar2 instanceof ajmy, ykm.n(ajltVar2), ykm.y(ajltVar2), ykm.z(ajltVar2), ykm.l(ajltVar2), ykm.m(ajltVar2), null, null, null, null, false, null, ajltVar2.b(), null, null, false, 16228384));
            }
        } else {
            ytzVar2 = ytzVar;
            str = "ImageBubbleUiAdapter.kt";
            ekrzVar = ekrzVar2;
            auxqVar = new auxq(new fdae() { // from class: yut
                @Override // defpackage.fdae
                public final Object invoke() {
                    return null;
                }
            });
        }
        if (uri3 != null) {
            ConcurrentHashMap concurrentHashMap = this.v;
            Object obj = concurrentHashMap.get(uri3);
            Object obj2 = obj;
            if (obj == null) {
                fduf fdufVarA2 = fdvf.a(false);
                Object objPutIfAbsent = concurrentHashMap.putIfAbsent(uri3, fdufVarA2);
                obj2 = fdufVarA2;
                if (objPutIfAbsent != null) {
                    obj2 = objPutIfAbsent;
                }
            }
            auxsVar = (fdvc) obj2;
        } else {
            auxsVar = new auxs(new fdae() { // from class: yuu
                @Override // defpackage.fdae
                public final Object invoke() {
                    return false;
                }
            });
        }
        auyl auylVarA = auyp.a(auxsVar);
        Object obj3 = "BugleImage";
        int i3 = 3;
        boolean z4 = true;
        auyl[] auylVarArr = {auylVarB, auxqVar, auylVarA};
        int i4 = 0;
        while (i4 < i3) {
            auyl auylVar = auylVarArr[i4];
            if (auylVar != null && !(auylVar instanceof auxq)) {
                int i5 = i2;
                auyl[] auylVarArr2 = (auyl[]) fcur.K(auylVarArr).toArray(new auyl[i5]);
                ajlt ajltVar3 = ajltVar2;
                Context context3 = context2;
                String str4 = str3;
                djtq djtqVar2 = djtqVar;
                ytz ytzVar3 = ytzVar2;
                String str5 = str;
                boolean z5 = z4;
                Object obj4 = obj3;
                ekrz ekrzVar3 = ekrzVar;
                yve yveVar = new yve((fdpl[]) Arrays.copyOf(auylVarArr2, auylVarArr2.length), auylVarArr, ajltVar3, djtqVar2, this, ytzVar3);
                auyl[] auylVarArr3 = auylVarArr;
                ArrayList arrayList = new ArrayList(i3);
                while (i5 < i3) {
                    auyl auylVar2 = auylVarArr3[i5];
                    arrayList.add(auylVar2 != null ? auylVar2.b() : null);
                    i5++;
                    i3 = 3;
                }
                Object[] array = arrayList.toArray(new Object[0]);
                Object obj5 = array[0];
                Object obj6 = array[z5 ? 1 : 0];
                boolean zBooleanValue = ((Boolean) array[2]).booleanValue();
                dlhy dlhyVar2 = (dlhy) obj6;
                dknh dknhVarC = (dknh) obj5;
                ekrw ekrwVarE3 = ekrgVar.e();
                ekrwVarE3.X(ekrzVar3, obj4);
                ((ekrd) ekrwVarE3.h(str4, "getDisplayableUiData", 419, str5)).D("Image bubble with messageId = %s is in %s state", ajltVar3.b().a(), djtqVar2.f);
                if (zBooleanValue) {
                    dknhVarC = ((yya) fcsuVar.b()).c(new yxg(ajltVar3), context3.getString(R.string.message_bubble_save_to_device), new yvf(this, ajltVar3));
                }
                dknh dknhVar = dknhVarC;
                if (dlhyVar2 == null) {
                    dlhyVar = null;
                } else {
                    if (dlhyVar2 instanceof dlhm) {
                        dlhyVarL = dlhm.l((dlhm) dlhyVar2, null, null, null, null, null, true, true, 3080191);
                    } else {
                        if (!(dlhyVar2 instanceof djpa)) {
                            throw new IllegalStateException("Caption flow emits a value with unsupported type");
                        }
                        dlhyVarL = djpa.l((djpa) dlhyVar2, null, z5, z5, 385023);
                    }
                    dlhyVar = dlhyVarL;
                }
                return auyp.b(yveVar, a(djtq.r(djtqVar2, dknhVar, null, null, null, zBooleanValue, dlhyVar, null, null, 245487), ytzVar3));
            }
            i4++;
            ytzVar2 = ytzVar2;
            str3 = str3;
            ekrzVar = ekrzVar;
            obj3 = obj3;
            i2 = i2;
            context2 = context2;
            z4 = z4;
            djtqVar = djtqVar;
            i3 = 3;
            ajltVar2 = ajltVar2;
            str = str;
            auylVarArr = auylVarArr;
        }
        return new auxq(new yvb(auylVarArr, ajltVar2, djtqVar, this, ytzVar2));
    }

    @Override // defpackage.aalp, java.lang.AutoCloseable
    public final void close() {
        this.v.clear();
    }
}
