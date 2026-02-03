package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caim {
    public static final cqce a = cqce.g("BugleCms", "CmsConversationRestoreBcmProxy");
    public final avpc b;
    public final dqsn c;
    public final byox d;
    public final cajh e;
    public final byyp f;
    public final fdjx g;
    public final avmr h;
    public final cicm i;
    public final cogw j;
    private final alrj k;
    private final fcsu l;
    private final bzwj m;
    private final ains n;

    public caim(avpc avpcVar, alrj alrjVar, fcsu fcsuVar, dqsn dqsnVar, bzwj bzwjVar, byox byoxVar, cajh cajhVar, byyp byypVar, fdjx fdjxVar, avmr avmrVar, cicm cicmVar, ains ainsVar, cogw cogwVar) {
        avpcVar.getClass();
        alrjVar.getClass();
        fcsuVar.getClass();
        dqsnVar.getClass();
        fdjxVar.getClass();
        avmrVar.getClass();
        cicmVar.getClass();
        ainsVar.getClass();
        cogwVar.getClass();
        this.b = avpcVar;
        this.k = alrjVar;
        this.l = fcsuVar;
        this.c = dqsnVar;
        this.m = bzwjVar;
        this.d = byoxVar;
        this.e = cajhVar;
        this.f = byypVar;
        this.g = fdjxVar;
        this.h = avmrVar;
        this.i = cicmVar;
        this.n = ainsVar;
        this.j = cogwVar;
    }

    public static final void k(cicq cicqVar, bojh bojhVar) {
        cicqVar.q(true);
        cicqVar.p(false);
        if (bojhVar.ae() != null) {
            cicqVar.u(bojhVar.ae());
        }
        if (bojhVar.ad() != null) {
            cicqVar.s(bojhVar.ad());
        }
        cicqVar.v(bojhVar.n());
        cicqVar.w(emaf.UNKNOWN_TRIGGER_SOURCE);
        if (bojhVar.H() == bvdp.NAME_IS_MANUAL) {
            cicqVar.n(bojhVar.Y());
        }
        if (bojhVar.af() != null) {
            cicqVar.y(bojhVar.af());
        }
        if (bojhVar.L() != null) {
            cicqVar.t(bojhVar.L());
        }
    }

    public final ConversationIdType a(Optional optional, final bojh bojhVar, final epjf epjfVar, final long j, final cppd cppdVar, final String str, final boolean z) {
        final fdap fdapVar = new fdap() { // from class: caie
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                final bojh bojhVar2 = (bojh) obj;
                final caim caimVar = this.a;
                final bojh bojhVar3 = bojhVar;
                final epjf epjfVar2 = epjfVar;
                final long j2 = j;
                caimVar.c.d("CmsConversationRestoreBcmProxy#restoreMergeNonRcsGroupConversation", new Runnable() { // from class: cahz
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConversationIdType conversationIdTypeC = bojhVar2.C();
                        conversationIdTypeC.getClass();
                        caim caimVar2 = caimVar;
                        caimVar2.j(bojhVar3, epjfVar2, conversationIdTypeC);
                        caimVar2.h(j2);
                    }
                });
                return bojhVar2.C();
            }
        };
        Object objOrElseGet = optional.map(new Function() { // from class: caif
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: caig
            @Override // java.util.function.Supplier
            public final Object get() {
                final caim caimVar = this.a;
                caimVar.i();
                final bojh bojhVar2 = bojhVar;
                final cppd cppdVar2 = cppdVar;
                final String str2 = str;
                final boolean z2 = z;
                ejxr ejxrVar = new ejxr() { // from class: caic
                    @Override // defpackage.ejxr
                    public final Object get() {
                        caim caimVar2 = caimVar;
                        caimVar2.c.i();
                        bojh bojhVar3 = bojhVar2;
                        cppd cppdVar3 = cppdVar2;
                        String str3 = str2;
                        ConversationIdType conversationIdTypeA = byox.a(bojhVar3, str3);
                        byox.d(cppdVar3, conversationIdTypeA);
                        if (z2 && cpyl.a()) {
                            cajh cajhVar = caimVar2.e;
                            epjf epjfVarE = cppdVar3.e();
                            epjfVarE.getClass();
                            String string = conversationIdTypeA.toString();
                            string.getClass();
                            cajhVar.b(epjfVarE, string, str3, 3);
                        }
                        caimVar2.d.c(conversationIdTypeA, bojhVar3);
                        return conversationIdTypeA;
                    }
                };
                dqsn dqsnVar = caimVar.c;
                ConversationIdType conversationIdType = (ConversationIdType) dqsnVar.c("CmsConversationRestoreBcmProxy#restoreNewNonRcsGroupConversation", ejxrVar);
                byox.b(conversationIdType);
                if (bojhVar2.N().c()) {
                    dqsnVar.i();
                    ecem.b();
                    cqce cqceVar = caim.a;
                    cqbd cqbdVarD = cqceVar.d();
                    cqbdVarD.I("Associating restored conversation with telephony");
                    cqbdVarD.c(conversationIdType);
                    cqbdVarD.r();
                    cnqj cnqjVarB = caimVar.h.b(bojhVar2);
                    cqbd cqbdVarC = cqceVar.c();
                    cqbdVarC.I("Associated restored conversation with Telephony Thread ID");
                    cqbdVarC.n(cnqjVarB);
                    cqbdVarC.c(conversationIdType);
                    cqbdVarC.r();
                }
                return conversationIdType;
            }
        });
        ConversationIdType conversationIdType = (ConversationIdType) objOrElseGet;
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("Restored CMS Conversation to Bugle");
        cqbdVarC.A("cmsId", str);
        cqbdVarC.c(conversationIdType);
        cqbdVarC.r();
        objOrElseGet.getClass();
        return conversationIdType;
    }

    public final ConversationIdType b(final cicq cicqVar, cppd cppdVar, final bojh bojhVar, boolean z) {
        final long jA = this.j.a();
        cicqVar.j(false);
        final cpeb cpebVarC = this.i.c(cicqVar.D());
        final epjf epjfVarE = (z && cpyl.a()) ? cppdVar.e() : epjf.a;
        Object objC = this.c.c("CmsConversationRestoreBcmProxy#restoreRcsGroupConversation", new ejxr() { // from class: caia
            @Override // defpackage.ejxr
            public final Object get() {
                cpeb cpebVarC2;
                cpeb cpebVar = cpebVarC;
                caim caimVar = this;
                if (cpebVar == null) {
                    cicq cicqVar2 = cicqVar;
                    caimVar.i();
                    caim.a.p("Creating a new RCS Group Conversation in BugleDB.");
                    cicm cicmVar = caimVar.i;
                    cicqVar2.j(true);
                    cpebVarC2 = cicmVar.c(cicqVar2.D());
                    cpebVarC2.getClass();
                } else {
                    cqbd cqbdVarA = caim.a.a();
                    cqbdVarA.I("Matched existing RCS Group Conversation");
                    cqbdVarA.c(cpebVar.a());
                    cqbdVarA.r();
                    cpebVarC2 = cpebVar;
                }
                bojh bojhVar2 = bojhVar;
                if (bojhVar2.N().c()) {
                    avmr avmrVar = caimVar.h;
                    bojl bojlVarF = bojhVar2.F();
                    bojlVarF.B(cpebVarC2.a());
                    avmrVar.b(bojlVarF.a());
                }
                epjf epjfVar = epjfVarE;
                epjfVar.getClass();
                caimVar.j(bojhVar2, epjfVar, cpebVarC2.a());
                if (cpebVar != null) {
                    caimVar.h(jA);
                }
                return cpebVarC2.a();
            }
        });
        objC.getClass();
        return (ConversationIdType) objC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ekgb c(cppd cppdVar) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekqh it = cppdVar.c().iterator();
        it.getClass();
        while (it.hasNext()) {
            long jK = ((bohm) it.next()).k();
            ParticipantsTable.BindData bindDataB = ((bbca) this.l.b()).b(String.valueOf(jK));
            if (bindDataB == null) {
                throw new cajp(a.A(jK, "Restore for participant ", " failed"));
            }
            alqm alqmVarQ = this.k.q(bindDataB);
            if (alqmVarQ.x(true)) {
                throw new cajo("Normalized destination for participant " + bindDataB.R() + " is not restored properly");
            }
            ekfwVar.h(alqmVarQ);
        }
        ekgb ekgbVarG = ekfwVar.g();
        ekgbVarG.getClass();
        return ekgbVarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.cicq r7, defpackage.bojh r8, defpackage.cppd r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.caih
            if (r0 == 0) goto L13
            r0 = r10
            caih r0 = (defpackage.caih) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            caih r0 = new caih
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ciai r7 = r0.e
            ciai r8 = r0.d
            defpackage.fctl.b(r10)
            goto L9d
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.fctl.b(r10)
            k(r7, r8)
            ekgb r8 = r9.c()
            r8.getClass()
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r2 = defpackage.fcva.p(r8, r10)
            r9.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
        L4f:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r8.next()
            bohm r2 = (defpackage.bohm) r2
            long r4 = r2.k()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r9.add(r2)
            goto L4f
        L68:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r10 = defpackage.fcva.p(r9, r10)
            r8.<init>(r10)
            java.util.Iterator r9 = r9.iterator()
        L75:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L8d
            java.lang.Object r10 = r9.next()
            java.lang.Number r10 = (java.lang.Number) r10
            long r4 = r10.longValue()
            java.lang.String r10 = java.lang.String.valueOf(r4)
            r8.add(r10)
            goto L75
        L8d:
            r9 = r7
            ciai r9 = (defpackage.ciai) r9
            r0.d = r9
            r0.e = r9
            r0.c = r3
            java.lang.Object r10 = r6.e(r8, r0)
            if (r10 == r1) goto La3
            r8 = r7
        L9d:
            java.util.List r10 = (java.util.List) r10
            r7.r(r10)
            return r8
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caim.d(cicq, bojh, cppd, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(final java.util.List r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.caii
            if (r0 == 0) goto L13
            r0 = r6
            caii r0 = (defpackage.caii) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            caii r0 = new caii
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L57
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            bsbo r6 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.e()
            java.lang.String r2 = "CmsConversationRestoreBcmProxy#loadParticipants"
            r6.A(r2)
            caid r2 = new caid
            r2.<init>()
            r6.h(r2)
            bsbm r5 = r6.b()
            eiju r5 = r5.x()
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caim.e(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.bojh r10, defpackage.cppd r11, java.lang.String r12, boolean r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r14 instanceof defpackage.caik
            if (r0 == 0) goto L13
            r0 = r14
            caik r0 = (defpackage.caik) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            caik r0 = new caik
            r0.<init>(r9, r14)
        L18:
            java.lang.Object r14 = r0.d
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            long r10 = r0.c
            boolean r13 = r0.b
            java.lang.String r12 = r0.g
            cppr r1 = r0.h
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r14)
            r4 = r10
            r10 = r0
            r6 = r1
        L33:
            r7 = r12
            r8 = r13
            goto L68
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            defpackage.fctl.b(r14)
            cogw r14 = r9.j
            long r4 = r14.a()
            ekgb r14 = r9.c(r11)
            avpc r2 = r9.b
            eiju r14 = r2.k(r14)
            r0.a = r10
            r2 = r11
            cppr r2 = (defpackage.cppr) r2
            r0.h = r2
            r0.g = r12
            r0.b = r13
            r0.c = r4
            r0.f = r3
            java.lang.Object r14 = defpackage.fdxs.c(r14, r0)
            if (r14 == r1) goto L8a
            r6 = r11
            goto L33
        L68:
            r1 = r14
            j$.util.Optional r1 = (j$.util.Optional) r1
            if (r8 == 0) goto L78
            boolean r11 = defpackage.cpyl.a()
            if (r11 == 0) goto L78
            epjf r11 = r6.e()
            goto L7a
        L78:
            epjf r11 = defpackage.epjf.a
        L7a:
            r3 = r11
            r1.getClass()
            r3.getClass()
            r2 = r10
            bojh r2 = (defpackage.bojh) r2
            r0 = r9
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r10 = r0.a(r1, r2, r3, r4, r6, r7, r8)
            return r10
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caim.f(bojh, cppd, java.lang.String, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.bojh r6, defpackage.cppd r7, boolean r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.cail
            if (r0 == 0) goto L13
            r0 = r9
            cail r0 = (defpackage.cail) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cail r0 = new cail
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r8 = r0.b
            java.lang.Object r6 = r0.a
            cppr r7 = r0.f
            defpackage.fctl.b(r9)
            goto L66
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.fctl.b(r9)
            bojl r9 = r6.F()
            byyp r2 = r5.f
            java.lang.String r4 = r6.S()
            java.lang.String r6 = r2.a(r6, r4)
            r9.ak(r6)
            bojh r6 = r9.a()
            cicq r9 = defpackage.cicr.w()
            r6.getClass()
            r2 = r7
            cppr r2 = (defpackage.cppr) r2
            r0.f = r2
            r0.a = r6
            r0.b = r8
            r0.e = r3
            java.lang.Object r9 = r5.d(r9, r6, r7, r0)
            if (r9 != r1) goto L66
            return r1
        L66:
            cicq r9 = (defpackage.cicq) r9
            cicq r9 = r9.C()
            r6.getClass()
            bojh r6 = (defpackage.bojh) r6
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6 = r5.b(r9, r7, r6, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caim.g(bojh, cppd, boolean, fcxy):java.lang.Object");
    }

    public final void h(long j) {
        this.n.g("Bugle.Cms.Restore.Conversation.DuplicateSearchDuration", this.j.a() - j);
    }

    public final void i() {
        this.n.e("Bugle.Cms.Restore.Conversation.Outcome", 5);
    }

    public final void j(bojh bojhVar, epjf epjfVar, ConversationIdType conversationIdType) {
        this.m.a(bojhVar, epjfVar, conversationIdType);
        this.d.c(conversationIdType, bojhVar);
    }
}
