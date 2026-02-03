package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
@fcsv
/* loaded from: classes2.dex */
public final class zaa implements yyr {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/ReactionsBarPopupUiAdapterImpl");
    private final ConversationId A;
    private final fdpl B;
    private final arqu C;
    private final fcsu D;
    private final fdpl E;
    private final fdpl F;
    private final AtomicReference G;
    private final List H;
    private final List I;
    private boolean J;
    private zqk K;
    private final yil L;
    public final Context b;
    public final fdjx c;
    public final fdpl d;
    public final zqm e;
    public final ahax f;
    public final zvo g;
    public final fcsu h;
    public final fcsu i;
    public final arxn j;
    public final lwn k;
    public final fcsu l;
    public final dnuy m;
    public final dnvi n;
    public final dnwx o;
    public final fduf p;
    public MessageId q;
    public final abvd r;
    public final angl s;
    public final angl t;
    private final fdjx u;
    private final zvz v;
    private final Map w;
    private final ahay x;
    private final zuf y;
    private final fcsu z;

    public zaa(Context context, fdjx fdjxVar, fdjx fdjxVar2, fdpl fdplVar, yil yilVar, zqm zqmVar, zvz zvzVar, Map map, ahay ahayVar, ahax ahaxVar, zvo zvoVar, zuf zufVar, fcsu fcsuVar, cqdr cqdrVar, fcsu fcsuVar2, ConversationId conversationId, fdpl fdplVar2, arqu arquVar, fcsu fcsuVar3, arxn arxnVar, lwn lwnVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, fcsu fcsuVar4, fcsu fcsuVar5) {
        context.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        yilVar.getClass();
        zqmVar.getClass();
        zvzVar.getClass();
        ahayVar.getClass();
        ahaxVar.getClass();
        zvoVar.getClass();
        zufVar.getClass();
        cqdrVar.getClass();
        conversationId.getClass();
        fdplVar2.getClass();
        fcsuVar3.getClass();
        arxnVar.getClass();
        optional.getClass();
        optional2.getClass();
        optional4.getClass();
        fcsuVar4.getClass();
        this.b = context;
        this.c = fdjxVar;
        this.u = fdjxVar2;
        this.d = fdplVar;
        this.L = yilVar;
        this.e = zqmVar;
        this.v = zvzVar;
        this.w = map;
        this.x = ahayVar;
        this.f = ahaxVar;
        this.g = zvoVar;
        this.y = zufVar;
        this.h = fcsuVar;
        this.z = fcsuVar2;
        this.A = conversationId;
        this.B = fdplVar2;
        this.C = arquVar;
        this.i = fcsuVar3;
        this.j = arxnVar;
        this.k = lwnVar;
        this.l = fcsuVar4;
        this.D = fcsuVar5;
        dnuy dnuyVar = (dnuy) fdct.b(optional3);
        this.m = dnuyVar;
        dnvi dnviVar = (dnvi) fdct.b(optional4);
        this.n = dnviVar;
        this.r = (abvd) fdct.b(optional);
        this.o = (dnwx) fdct.b(optional2);
        fdui fduiVar = new fdui(new yzc(this, null));
        this.E = fduiVar;
        this.F = (!crbf.e() || dnviVar == null || dnuyVar == null) ? new fdui(new yzq(null)) : arquVar.a() ? conversationId instanceof PenpalBotConversationId ? new fdui(new yzk(null)) : fdsn.a(fduiVar, new yzm(this, null)) : fdsn.a(new fdua(fduiVar, fdplVar2, new yzn(null)), new yzp(this, null));
        this.G = new AtomicReference(null);
        this.p = fdvf.a(false);
        angl anglVarA = anhp.a("👍");
        this.s = anglVarA;
        angl anglVarA2 = anhp.a("👎");
        this.t = anglVarA2;
        this.H = fcva.i(anglVarA, anhp.a("❤️"), anhp.a("😂"), anhp.a("😮"), anhp.a("😢"), anhp.a("😡"), anglVarA2);
        this.I = fcva.i(anglVarA, anglVarA2, anhp.a("❤️"), anhp.a("😂"), anhp.a("😮"), anhp.a("😢"), anhp.a("😡"));
        if (crbf.e() && dnviVar != null && fdbq.f(lwnVar.b("has_pending_emotify_result"), true)) {
            auvw.k(fdjxVar, null, null, new yza(this, null), 3);
        }
    }

    private final String m(String str, boolean z) {
        String string = this.b.getString(true != z ? R.string.reaction_selection_content_description : R.string.selected_reaction_selection_content_description, str);
        string.getClass();
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(fduf fdufVar, MessageId messageId, Long l, anho anhoVar, anhj anhjVar, boolean z, boolean z2, boolean z3) {
        anhj anhjVar2 = anhoVar != null ? anhoVar.a : null;
        ckmc ckmcVar = anhjVar2 == null ? ckmc.ADD_REACTION : fdbq.f(anhjVar2, anhjVar) ? ckmc.REMOVE_REACTION : ckmc.REPLACE_REACTION;
        ckmn ckmnVar = z2 ? ckmn.CUSTOM_REACTION_PICKER : ckmn.REACTION_BAR;
        fhaz fhazVarA = cqdr.a();
        if (fcwm.d(ckmc.ADD_REACTION, ckmc.REPLACE_REACTION).contains(ckmcVar)) {
            zuf zufVar = this.y;
            fhazVarA.getClass();
            zufVar.a(fhazVarA);
        }
        this.g.d(ckmcVar, ckmnVar, l);
        if (z3) {
            h();
        } else {
            g(fdufVar, false, l);
            this.e.b();
        }
        fhazVarA.getClass();
        o(ckmcVar, messageId, anhjVar, ckmnVar, fhazVarA, anhoVar != null ? anhoVar.b : null, z);
    }

    private final void o(ckmc ckmcVar, MessageId messageId, anhj anhjVar, ckmn ckmnVar, fhaz fhazVar, angn angnVar, boolean z) {
        auvw.k(this.u, null, null, new yzy(ckmcVar, (ajmh) this.z.b(), messageId, anhjVar, ckmnVar, fhazVar, angnVar, this, null), 3);
        if (ckmcVar != ckmc.REMOVE_REACTION) {
            auvw.k(this.c, null, null, new yzz(z, anhjVar, this, null), 3);
        }
    }

    @Override // defpackage.yyr
    public final auyl a(yyq yyqVar) {
        zqk zqkVar = yyqVar.c;
        if (zqkVar.a && zqkVar.b == zqx.b && zqkVar.d) {
            if (zqkVar != this.K) {
                this.J = false;
                this.K = zqkVar;
            }
            fduf fdufVarA = fdvf.a(Boolean.valueOf(this.J));
            zvz zvzVar = this.v;
            ajlt ajltVar = yyqVar.a;
            fdpl fdplVarA = zvzVar.a(ajltVar, ckmx.a());
            Long lQ = ajltVar.q();
            fdce fdceVar = new fdce();
            fdceVar.a = fdbq.f(this.q, ajltVar.b());
            this.q = ajltVar.b();
            ahay ahayVar = this.x;
            yil yilVar = this.L;
            fdpl fdplVar = this.F;
            fdpl fdplVar2 = this.E;
            fdpl fdplVar3 = this.B;
            return auyp.b(auyf.b(fdplVarA, fdufVarA, ahayVar.f(), yilVar.d, fdplVar, fdplVar2, fdplVar3, new yzb(this, yyqVar, fdufVarA, lQ, fdceVar, null)), null);
        }
        MessageId messageId = this.q;
        ajlt ajltVar2 = yyqVar.a;
        if (fdbq.f(messageId, ajltVar2.b())) {
            this.q = null;
        }
        if (((Boolean) this.l.b()).booleanValue()) {
            if (yyqVar.e && (ajltVar2.g() instanceof amvy)) {
                fdpl fdplVarA2 = this.v.a(ajltVar2, ckmx.a());
                Long lQ2 = ajltVar2.q();
                if (!fdbq.f(ajltVar2.b(), this.G.getAndSet(ajltVar2.b()))) {
                    this.p.f(false);
                }
                fduf fdufVar = this.p;
                fduf fdufVar2 = ((zqi) this.D.b()).e;
                ahay ahayVar2 = this.x;
                yil yilVar2 = this.L;
                fdpl fdplVar4 = this.E;
                fdpl fdplVar5 = this.B;
                return auyp.b(auyf.b(fdufVar, fdufVar2, fdplVarA2, ahayVar2.f(), yilVar2.d, fdplVar4, fdplVar5, new yzh(this, yyqVar, lQ2, null)), null);
            }
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleReactions");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            ekrdVar.X(cqnc.c, ajltVar2.b());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/ReactionsBarPopupUiAdapterImpl", "createUiDataFlow", 262, "ReactionsBarPopupUiAdapterImpl.kt")).q("Reaction bar not auto revealed because the message is not a latest incoming photo/video");
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [dkxy] */
    public final dkny b(final yyq yyqVar, final fduf fdufVar, final Long l, final anho anhoVar, Integer num, int i, boolean z, final boolean z2, final boolean z3) {
        Context context;
        dkya dkyaVar;
        final zaa zaaVar = this;
        Context context2 = zaaVar.b;
        final ajlt ajltVar = yyqVar.a;
        final MessageId messageIdB = ajltVar.b();
        List listF = zaaVar.f(ajltVar);
        boolean z4 = false;
        if (context2.getResources().getBoolean(R.bool.use_smaller_reactions_bar)) {
            listF = listF.subList(0, listF.size() - 1);
        }
        ArrayList arrayList = new ArrayList(fcva.p(listF, 10));
        Iterator it = listF.iterator();
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (!it.hasNext()) {
                dkzd dkzdVar = new dkzd(arrayList, num, new fdae() { // from class: yyv
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ajlt ajltVar2 = yyqVar.a;
                        final MessageId messageIdB2 = ajltVar2.b();
                        boolean z5 = false;
                        if (crbf.e() && !z2) {
                            z5 = true;
                        }
                        final boolean z6 = z5;
                        final boolean z7 = z3;
                        final anho anhoVar2 = anhoVar;
                        final Long l2 = l;
                        final fduf fdufVar2 = fdufVar;
                        final zaa zaaVar2 = this.a;
                        final boolean zB = yji.b(ajltVar2);
                        zaaVar2.g.b(l2);
                        zaaVar2.f.e(new fdap() { // from class: yyu
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) {
                                ahat ahatVar = (ahat) obj;
                                ahatVar.getClass();
                                return new aaam(new hxd(1106880446, true, new yzv(zaaVar2, fdufVar2, messageIdB2, l2, anhoVar2, zB, z7, ahatVar, z6)));
                            }
                        });
                        return fctx.a;
                    }
                }, new dkzc(crbf.e() && z && !z2), new fdae() { // from class: yyw
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        final MessageId messageIdB2 = yyqVar.a.b();
                        final zaa zaaVar2 = this.a;
                        abvd abvdVar = zaaVar2.r;
                        if (abvdVar != null) {
                            abvdVar.a(dnwy.a);
                        }
                        final boolean z5 = z3;
                        final fduf fdufVar2 = fdufVar;
                        final Long l2 = l;
                        zaaVar2.f.e(new fdap() { // from class: yyy
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) {
                                ahat ahatVar = (ahat) obj;
                                ahatVar.getClass();
                                return new aaam(new hxd(-590531645, true, new yzg(ahatVar, zaaVar2, l2, messageIdB2, fdufVar2, z5)));
                            }
                        });
                        return fctx.a;
                    }
                });
                zqy zqyVar = yyqVar.c.c;
                int i4 = zqyVar != null ? zqyVar.a : 0;
                int iOrdinal = yyqVar.b.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        i3 = 2;
                        if (iOrdinal != 2) {
                            throw new fctg();
                        }
                    } else {
                        i3 = 3;
                    }
                }
                return new dkny(dkzdVar, new dknx(i4, i, i3), new fdae() { // from class: yyx
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        boolean z5 = z3;
                        zaa zaaVar2 = this;
                        if (z5) {
                            zaaVar2.h();
                        } else {
                            zaaVar2.g(fdufVar, true, l);
                        }
                        return fctx.a;
                    }
                });
            }
            Object next = it.next();
            int i5 = i2 + 1;
            if (i2 < 0) {
                fcva.m();
            }
            final anhj anhjVar = (anhj) next;
            boolean z5 = (num == null || num.intValue() != i2) ? z4 : true;
            if (anhjVar instanceof angl) {
                Object obj = zaaVar.w.get(((angl) anhjVar).a);
                obj.getClass();
                yyb yybVar = (yyb) obj;
                qrz qrzVar = yybVar.a;
                String string = context2.getString(yybVar.b);
                string.getClass();
                context = context2;
                dkyaVar = new dkxy(qrzVar, zaaVar.m(string, z5), new fdae() { // from class: yys
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        this.a.n(fdufVar, messageIdB, l, anhoVar, anhjVar, yji.b(ajltVar), false, z3);
                        return fctx.a;
                    }
                });
            } else {
                context = context2;
                if (!(anhjVar instanceof angp)) {
                    throw new fctg();
                }
                angp angpVar = (angp) anhjVar;
                dkyaVar = new dkya(angpVar.b(), zaaVar.m(angpVar.b(), z5), new fdae() { // from class: yyt
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        this.a.n(fdufVar, messageIdB, l, anhoVar, anhjVar, yji.b(ajltVar), false, z3);
                        return fctx.a;
                    }
                });
            }
            arrayList.add(dkyaVar);
            z4 = false;
            zaaVar = this;
            i2 = i5;
            context2 = context;
        }
    }

    public final Integer c(anhj anhjVar, ajlt ajltVar) {
        int iG = fcva.G(f(ajltVar), anhjVar);
        if (iG == -1) {
            return null;
        }
        return Integer.valueOf(iG);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.yyq r7, defpackage.fcxy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.yzi
            if (r0 == 0) goto L13
            r0 = r8
            yzi r0 = (defpackage.yzi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yzi r0 = new yzi
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yyq r7 = r0.d
            defpackage.fctl.b(r8)
            goto L6e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yyq r7 = r0.d
            defpackage.fctl.b(r8)
            goto L53
        L3b:
            defpackage.fctl.b(r8)
            arxn r8 = r6.j
            boolean r8 = r8.a()
            if (r8 == 0) goto L61
            fdpl r8 = r6.d
            r0.d = r7
            r0.c = r4
            java.lang.Object r8 = defpackage.fdtc.a(r8, r0)
            if (r8 != r1) goto L53
            goto L6d
        L53:
            aoer r8 = (defpackage.aoer) r8
            if (r8 == 0) goto L60
            angr r7 = r7.d
            if (r7 == 0) goto L60
            anho r7 = r7.c(r8)
            return r7
        L60:
            return r5
        L61:
            fdpl r8 = r6.d
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = defpackage.fdtc.a(r8, r0)
            if (r8 != r1) goto L6e
        L6d:
            return r1
        L6e:
            aoer r8 = (defpackage.aoer) r8
            if (r8 == 0) goto L7b
            angr r7 = r7.d
            if (r7 == 0) goto L7b
            anhj r7 = r7.b(r8)
            goto L7c
        L7b:
            r7 = r5
        L7c:
            if (r7 != 0) goto L7f
            return r5
        L7f:
            anho r8 = new anho
            r8.<init>(r7, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zaa.d(yyq, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.adh r10, com.google.android.apps.messaging.shared.api.messaging.MessageId r11, defpackage.fdae r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.yzj
            if (r0 == 0) goto L13
            r0 = r13
            yzj r0 = (defpackage.yzj) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            yzj r0 = new yzj
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.d
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r10 = r0.c
            java.lang.Object r11 = r0.b
            java.lang.Object r12 = r0.a
            defpackage.fctl.b(r13)
            r8 = r12
            r12 = r11
            r11 = r8
            goto L68
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            defpackage.fctl.b(r13)
            android.content.Intent r13 = r10.b
            r2 = 0
            if (r13 == 0) goto L52
            int r10 = r10.a
            r4 = -1
            if (r10 != r4) goto L46
            goto L47
        L46:
            r13 = r2
        L47:
            if (r13 == 0) goto L52
            java.lang.String r10 = "resultKey"
            android.os.Parcelable r10 = r13.getParcelableExtra(r10)
            android.net.Uri r10 = (android.net.Uri) r10
            goto L53
        L52:
            r10 = r2
        L53:
            if (r10 == 0) goto La6
            dnvi r13 = r9.n
            if (r13 == 0) goto L6b
            r0.a = r11
            r0.b = r12
            r0.c = r10
            r0.f = r3
            java.lang.Object r13 = r13.b(r10, r0)
            if (r13 != r1) goto L68
            return r1
        L68:
            r2 = r13
            dnvg r2 = (defpackage.dnvg) r2
        L6b:
            r8 = r2
            r2 = r11
            r11 = r8
            if (r11 == 0) goto L92
            ckmc r1 = defpackage.ckmc.ADD_REACTION
            angp r3 = defpackage.anhp.b(r11)
            ckmn r4 = defpackage.ckmn.EMOTIFY_CREATION
            fhaz r5 = defpackage.cqdr.a()
            r5.getClass()
            r6 = 0
            r7 = 0
            r0 = r9
            r0.o(r1, r2, r3, r4, r5, r6, r7)
            abvd r10 = r0.r
            if (r10 == 0) goto L8e
            dnww r11 = defpackage.dnww.c
            r10.d(r11)
        L8e:
            r12.invoke()
            goto Lb0
        L92:
            r0 = r9
            java.util.Objects.toString(r10)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Can't create sticker from "
            java.lang.String r10 = r12.concat(r10)
            r11.<init>(r10)
            throw r11
        La6:
            r0 = r9
            abvd r10 = r0.r
            if (r10 == 0) goto Lb0
            dnww r11 = defpackage.dnww.a
            r10.d(r11)
        Lb0:
            dnwx r10 = r0.o
            if (r10 == 0) goto Lb7
            r10.a()
        Lb7:
            fctx r10 = defpackage.fctx.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zaa.e(adh, com.google.android.apps.messaging.shared.api.messaging.MessageId, fdae, fcxy):java.lang.Object");
    }

    public final List f(ajlt ajltVar) {
        return (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && yji.b(ajltVar)) ? this.I : this.H;
    }

    public final void g(fduf fdufVar, boolean z, Long l) {
        if (z) {
            this.g.e(l);
        }
        fdufVar.f(true);
        this.J = true;
    }

    public final void h() {
        this.p.f(true);
    }

    public final boolean i(yyq yyqVar, boolean z, boolean z2, dktt dkttVar, fduf fdufVar, boolean z3) {
        String str = true != z3 ? "displayed on select" : "auto revealed";
        ajlt ajltVar = yyqVar.a;
        MessageId messageIdB = ajltVar.b();
        if (z) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleReactions");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            ekrdVar.X(cqnc.c, messageIdB);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/ReactionsBarPopupUiAdapterImpl", "shouldDisplay", 455, "ReactionsBarPopupUiAdapterImpl.kt")).t("Reaction bar not %s because it is in a dismissed state", str);
            return false;
        }
        if (dkttVar == null || (dkttVar instanceof aaam)) {
            if (z2) {
                return true;
            }
            ekrw ekrwVarE2 = a.e();
            ekrwVarE2.X(eksq.a, "BugleReactions");
            ekrd ekrdVar2 = (ekrd) ekrwVarE2;
            ekrdVar2.X(cqnc.c, messageIdB);
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/ReactionsBarPopupUiAdapterImpl", "shouldDisplay", 480, "ReactionsBarPopupUiAdapterImpl.kt")).t("Reaction bar not %s because reacting to the selected message is not allowed", str);
            return false;
        }
        if (!z3) {
            g(fdufVar, false, ajltVar.q());
            ekrw ekrwVarE3 = a.e();
            ekrwVarE3.X(eksq.a, "BugleReactions");
            ((ekrd) ekrwVarE3.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/ReactionsBarPopupUiAdapterImpl", "shouldDisplay", 466, "ReactionsBarPopupUiAdapterImpl.kt")).q("Reaction bar not displayed because another popup is open");
        }
        ekrw ekrwVarE4 = a.e();
        ekrwVarE4.X(eksq.a, "BugleReactions");
        ekrd ekrdVar3 = (ekrd) ekrwVarE4;
        ekrdVar3.X(cqnc.c, messageIdB);
        ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/ReactionsBarPopupUiAdapterImpl", "shouldDisplay", 471, "ReactionsBarPopupUiAdapterImpl.kt")).t("Reaction bar not %s because another popup is open", str);
        return false;
    }
}
