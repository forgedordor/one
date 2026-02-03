package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.time.Instant;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ymr implements yly {
    public final Context a;
    public final yvs b;
    public final afzc c;
    public final fcsu d;
    public final Optional e;
    public final aprc f;
    public final Optional g;
    public final Optional h;
    public final ynd i;
    public final apqq j;
    public final apql k;
    public final arvu l;
    private final efwo m;
    private final cqjk n;
    private final cssf o;
    private final cphv p;
    private final fcsu q;
    private final fcsu r;
    private final Conversation s;
    private final fcsu t;

    public ymr(efwo efwoVar, cqjk cqjkVar, Context context, cssf cssfVar, cphv cphvVar, yvs yvsVar, afzc afzcVar, fcsu fcsuVar, fcsu fcsuVar2, Optional optional, aprc aprcVar, Optional optional2, Optional optional3, ynd yndVar, fcsu fcsuVar3, apqq apqqVar, Conversation conversation, apql apqlVar, fcsu fcsuVar4, arvu arvuVar) {
        efwoVar.getClass();
        cqjkVar.getClass();
        context.getClass();
        cssfVar.getClass();
        afzcVar.getClass();
        fcsuVar.getClass();
        aprcVar.getClass();
        yndVar.getClass();
        fcsuVar3.getClass();
        conversation.getClass();
        apqlVar.getClass();
        fcsuVar4.getClass();
        arvuVar.getClass();
        this.m = efwoVar;
        this.n = cqjkVar;
        this.a = context;
        this.o = cssfVar;
        this.p = cphvVar;
        this.b = yvsVar;
        this.c = afzcVar;
        this.d = fcsuVar;
        this.q = fcsuVar2;
        this.e = optional;
        this.f = aprcVar;
        this.g = optional2;
        this.h = optional3;
        this.i = yndVar;
        this.r = fcsuVar3;
        this.j = apqqVar;
        this.s = conversation;
        this.k = apqlVar;
        this.t = fcsuVar4;
        this.l = arvuVar;
    }

    public static final boolean i(fctc fctcVar) {
        return ((Boolean) fctcVar.a()).booleanValue();
    }

    static /* synthetic */ void k(ymr ymrVar, List list, ajlt ajltVar, boolean z, anlb anlbVar) {
        if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && (z || (((Boolean) ((cczi) crbf.aE.get()).e()).booleanValue() && ajltVar.x()))) {
            list.add(new dkkx(djrr.dS, anlbVar != null ? ymrVar.p(anlbVar, ajltVar) : null, 2));
            return;
        }
        if (ajltVar.w()) {
            list.add(new dkkx(djrr.cj, anlbVar != null ? ymrVar.p(anlbVar, ajltVar) : null, 2));
        } else {
            if (!ymrVar.f.a() || ajltVar.w()) {
                return;
            }
            list.add(new dkkx(djrr.ck, anlbVar != null ? ymrVar.p(anlbVar, ajltVar) : null, 2));
        }
    }

    public static final fdpl m(ymx ymxVar) {
        return anov.a(ymxVar.a().m());
    }

    public static final djrr n(ajlq ajlqVar) {
        int iOrdinal = ajlqVar.ordinal();
        if (iOrdinal == 0) {
            return djrr.ef;
        }
        if (iOrdinal == 1) {
            return djrr.eg;
        }
        if (iOrdinal == 2) {
            return djrr.dZ;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return djrr.ee;
    }

    public static final djrr o(ajlt ajltVar) {
        if (!(ajltVar.d() instanceof ajmq)) {
            return null;
        }
        ajmc ajmcVarD = ajltVar.d();
        ajmcVarD.getClass();
        ajlq ajlqVarA = ((ajmr) ajmcVarD).a();
        ajlqVarA.getClass();
        return n(ajlqVarA);
    }

    private final String p(anlb anlbVar, ajlt ajltVar) {
        if (anlbVar.b() == 2) {
            return "error";
        }
        if (s() && ykm.u(ajltVar)) {
            return "error";
        }
        return null;
    }

    private final String q(String str, ajlt ajltVar, boolean z) {
        return z ? this.a.getString(R.string.message_status_not_sent_satellite_group) : !(ajltVar.g() instanceof amwf) ? this.a.getString(R.string.message_status_not_sent_satellite_media) : str;
    }

    private final void r(List list, ajlt ajltVar, anlb anlbVar) {
        list.add(new dkkx(djrr.aZ, p(anlbVar, ajltVar), 2));
    }

    private final boolean s() {
        return ((cljh) ((cliy) this.r.b()).h().c()).c();
    }

    public final dklq a(ResolvedRecipient resolvedRecipient) {
        return new dklq(new dkrk(((cphz) this.q.b()).c(resolvedRecipient), null, 0, 0, 0.0f, null, 62), new dklp((int) ((Number) this.t.b()).longValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dkly b(defpackage.ymx r14, final boolean r15, final boolean r16, final boolean r17, boolean r18, final java.util.List r19, final defpackage.anlb r20, final boolean r21) {
        /*
            r13 = this;
            ajlt r1 = r14.a()
            aprc r0 = r13.f
            boolean r0 = r0.a()
            r11 = 0
            r12 = 1
            if (r0 == 0) goto L12
            if (r18 == 0) goto L12
            r6 = r12
            goto L13
        L12:
            r6 = r11
        L13:
            if (r21 == 0) goto L4a
            if (r6 != 0) goto L4a
            boolean r0 = defpackage.ykm.v(r20)
            if (r0 != 0) goto L4a
            boolean r0 = defpackage.ykm.k(r20)
            if (r0 != 0) goto L4a
            boolean r0 = defpackage.ykm.r(r1)
            if (r0 == 0) goto L41
            boolean r0 = defpackage.ykm.s(r1)
            if (r0 == 0) goto L41
            if (r15 == 0) goto L41
            apql r0 = r13.k
            boolean r0 = r0.a()
            if (r0 == 0) goto L4a
            djrr r0 = o(r1)
            djrr r2 = defpackage.djrr.ee
            if (r0 == r2) goto L4a
        L41:
            boolean r0 = defpackage.ykm.x(r1)
            if (r0 == 0) goto L48
            goto L4a
        L48:
            r9 = r11
            goto L4b
        L4a:
            r9 = r12
        L4b:
            ymd r0 = new ymd
            r3 = r13
            r4 = r15
            r8 = r16
            r7 = r17
            r10 = r19
            r2 = r20
            r5 = r21
            r0.<init>()
            if (r6 == 0) goto L60
        L5e:
            r14 = r12
            goto L95
        L60:
            r1.getClass()
            boolean r15 = r1 instanceof defpackage.ajmy
            if (r15 != 0) goto L7f
            boolean r15 = defpackage.ykm.r(r1)
            if (r15 == 0) goto L7f
            ajmc r15 = r1.d()
            r15.getClass()
            ajmr r15 = (defpackage.ajmr) r15
            ajlq r15 = r15.a()
            ajlq r2 = defpackage.ajlq.ERROR
            if (r15 != r2) goto L7f
            goto L5e
        L7f:
            boolean r15 = defpackage.ykm.u(r1)
            if (r15 != 0) goto L5e
            boolean r15 = defpackage.ykm.i(r20)
            if (r15 == 0) goto L8c
            goto L5e
        L8c:
            boolean r14 = r14.e()
            if (r14 == 0) goto L94
            r14 = 2
            goto L95
        L94:
            r14 = 3
        L95:
            dkkv r15 = new dkkv
            dklx r1 = new dklx
            r2 = 6
            r1.<init>(r12, r11, r11, r2)
            r2 = 1000(0x3e8, double:4.94E-321)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r15.<init>(r0, r14, r1, r2)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ymr.b(ymx, boolean, boolean, boolean, boolean, java.util.List, anlb, boolean):dkly");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.aoer r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.ymq
            if (r0 == 0) goto L13
            r0 = r11
            ymq r0 = (defpackage.ymq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ymq r0 = new ymq
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r10 = r0.a
            defpackage.fctl.b(r11)
            goto L4c
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            defpackage.fctl.b(r11)
            fcsu r11 = r9.q
            java.lang.Object r11 = r11.b()
            cphz r11 = (defpackage.cphz) r11
            efwo r2 = r9.m
            j$.util.Optional r2 = j$.util.Optional.of(r2)
            r0.a = r10
            r0.d = r3
            java.lang.Object r11 = r11.d(r2, r10, r3, r0)
            if (r11 == r1) goto L8b
        L4c:
            dkpf r11 = (defpackage.dkpf) r11
            if (r11 != 0) goto L66
            dkpf r0 = new dkpf
            android.net.Uri r1 = r10.c()
            cphv r10 = r9.p
            java.lang.String r3 = defpackage.cphv.b(r10)
            r5 = 0
            r6 = 26
            r2 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r2 = r0
            goto L67
        L66:
            r2 = r11
        L67:
            dklq r10 = new dklq
            dkrk r1 = new dkrk
            r7 = 0
            r8 = 62
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            fcsu r11 = r9.t
            dklp r0 = new dklp
            java.lang.Object r11 = r11.b()
            java.lang.Number r11 = (java.lang.Number) r11
            long r2 = r11.longValue()
            int r11 = (int) r2
            r0.<init>(r11)
            r10.<init>(r1, r0)
            return r10
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ymr.c(aoer, fcxy):java.lang.Object");
    }

    public final String d(String str) {
        return aqbw.a() ? cssf.a(str) : this.o.d(str);
    }

    public final String e(ajlt ajltVar) {
        Instant instantO;
        if (ykm.u(ajltVar)) {
            return null;
        }
        if (!((Boolean) this.d.b()).booleanValue() || (instantO = ykm.c(ajltVar)) == null) {
            instantO = ajltVar.o();
        }
        return this.n.d(instantO.toEpochMilli()).toString();
    }

    public final List f(ResolvedRecipient resolvedRecipient) {
        String strX = resolvedRecipient.x(true);
        strX.getClass();
        String strD = d(strX);
        strD.getClass();
        List listI = fcva.i(new dklv(strD, null, null, false, ymk.a(resolvedRecipient), null, true, false, 174));
        String strY = resolvedRecipient.y();
        if (strY != null) {
            String strD2 = d(strY);
            strD2.getClass();
            listI.add(new dklv(chsk.a(strD2), null, null, false, ymk.a(resolvedRecipient), null, true, true, 38));
        }
        return listI;
    }

    public final void g(List list, ajlt ajltVar, boolean z, boolean z2) {
        aoer aoerVarB;
        if (z) {
            ajmc ajmcVarD = ajltVar.d();
            if (ajmcVarD instanceof ajmq) {
                aoerVarB = ((ajmq) ajmcVarD).c();
            } else if (!(ajmcVarD instanceof ajlr)) {
                return;
            } else {
                aoerVarB = ((ajlr) ajmcVarD).b();
            }
            String strQ = aoerVarB.q();
            int iA = aoerVarB.a();
            int color = iA == 0 ? this.a.getColor(R.color.sim_icon_text_color) : dlst.a(this.a, iA);
            if (z2) {
                list.add(new dkkw(null));
            }
            list.add(new dklv(strQ, null, null, false, null, Integer.valueOf(color), false, false, 222));
        }
    }

    public final void h(List list, final ajlt ajltVar, boolean z, boolean z2, final anlb anlbVar) throws Resources.NotFoundException {
        String strQ;
        if (anlbVar != null) {
            String strA = anlbVar.a();
            if (s()) {
                if (!ykm.u(ajltVar) || z2 || !(ajltVar.g() instanceof amwf)) {
                    if (ykm.u(ajltVar)) {
                        r(list, ajltVar, anlbVar);
                        strQ = q(strA, ajltVar, z2);
                    } else if (strA == null) {
                        strA = null;
                    } else if (ykm.j(ajltVar)) {
                        r(list, ajltVar, anlbVar);
                        strQ = q(strA, ajltVar, z2);
                    } else if (z) {
                        list.add(new dkkw(null));
                    }
                    strA = strQ;
                }
                if (strA == null) {
                    return;
                }
            } else {
                if (strA == null) {
                    return;
                }
                if (ykm.k(anlbVar)) {
                    r(list, ajltVar, anlbVar);
                } else if (z) {
                    list.add(new dkkw(null));
                }
            }
            String str = strA;
            if (ykm.h(anlbVar)) {
                String string = this.a.getResources().getString(R.string.message_metatext_premium_sms_options);
                string.getClass();
                list.add(new dklv(string, null, null, false, p(anlbVar, ajltVar), null, false, false, 238));
            } else {
                list.add(new dklv(str, null, null, false, p(anlbVar, ajltVar), null, false, false, 238));
            }
            if (ykm.g(anlbVar)) {
                String string2 = this.a.getResources().getString(R.string.message_metatext_resend);
                string2.getClass();
                list.add(new dklv(string2, new fdae() { // from class: yme
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        this.a.b.a(ajltVar, anlbVar);
                        return fctx.a;
                    }
                }, null, false, p(anlbVar, ajltVar), null, false, false, 236));
                return;
            }
            if (j() || !ykm.i(anlbVar) || (ajltVar.g() instanceof amsv)) {
                return;
            }
            String string3 = this.a.getResources().getString(R.string.message_metatext_check_options);
            string3.getClass();
            list.add(new dklv(string3, new fdae() { // from class: ymf
                @Override // defpackage.fdae
                public final Object invoke() {
                    this.a.b.a(ajltVar, anlbVar);
                    return fctx.a;
                }
            }, null, false, p(anlbVar, ajltVar), null, false, false, 236));
        }
    }

    public final boolean j() {
        return this.s.d() instanceof EmergencySosConversationId;
    }
}
