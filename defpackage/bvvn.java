package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvvn implements bvva {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl");
    private static final ekrz k = new ekrz("e2ee_update_reason", bwvi.class, false, false);
    public final fdjx b;
    public final fcyh c;
    public final fcsu d;
    public final fcsu e;
    public final aubq f;
    public final ConversationIdType g;
    public final bagx h;
    public final bade i;
    public final AtomicReference j;
    private final cogw l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final bvus r;
    private final fcsu s;

    public bvvn(cogw cogwVar, fdjx fdjxVar, fcyh fcyhVar, fcyh fcyhVar2, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, bvus bvusVar, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, aubq aubqVar, ConversationIdType conversationIdType) {
        cogwVar.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        bvusVar.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        aubqVar.getClass();
        conversationIdType.getClass();
        this.l = cogwVar;
        this.b = fdjxVar;
        this.c = fcyhVar;
        this.m = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.n = fcsuVar4;
        this.o = fcsuVar5;
        this.p = fcsuVar6;
        this.q = fcsuVar7;
        this.r = bvusVar;
        this.s = fcsuVar10;
        this.f = aubqVar;
        this.g = conversationIdType;
        this.h = ((bagy) fcsuVar8.b()).a(aubqVar, conversationIdType);
        this.i = ((badf) fcsuVar9.b()).a(aubqVar);
        this.j = new AtomicReference();
    }

    @fcsv
    private final Object k(aubq aubqVar, bkvw bkvwVar, fcxy fcxyVar) throws Throwable {
        String strH;
        if (!bkvwVar.j() || (strH = bkvwVar.h()) == null) {
            Object objJ = j(bwvi.DOWNGRADE_REMOTE_REGISTRATION_MISSING, fcxyVar);
            if (objJ == fcyl.a) {
                return objJ;
            }
        } else {
            ekhy ekhyVar = new ekhy();
            ekhyVar.b(aubqVar, strH);
            ekib ekibVarA = ekhyVar.a();
            ekibVarA.getClass();
            Object objH = h(ekibVarA, fcxyVar);
            if (objH == fcyl.a) {
                return objH;
            }
        }
        return fctx.a;
    }

    private final void l(int i, ConversationIdType conversationIdType) {
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleE2eeEtouffee");
        ((ekrd) d((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl", "startTimerForRemoteInstanceProcessing", 531, "ConversationE2eeStatusImpl.kt")).r("starting etouffee action timer, remoteInstancesToDownload: %d", i);
        this.j.set(((aipo) this.o.b()).j(i, conversationIdType.toString()));
    }

    @Override // defpackage.bvva
    public final eiju a() {
        return auvw.c(this.b, fcyi.a, fdjz.a, new bvvm(this, null));
    }

    @Override // defpackage.bvva
    public final eiju b(ekgb ekgbVar) {
        ekgbVar.getClass();
        if (((bvur) this.e.b()).h() && !ekgbVar.isEmpty()) {
            this.r.f(ekgbVar, this.g);
        }
        return a();
    }

    public final ekib c(final Set set) {
        final ekhy ekhyVar = new ekhy();
        if (set.isEmpty()) {
            return null;
        }
        final ekgp ekgpVar = (ekgp) Collection.EL.stream(set).collect(ekcv.a(new celm(), Function$CC.identity()));
        final HashSet hashSet = new HashSet();
        bkwz bkwzVarA = bkxc.a();
        bkwzVarA.A("RemoteInstanceDatabaseOperations#verifyAllParticipantsSupportGroupE2eeAndSetDevicesForScytaleSetupChatEndpoint");
        bkwzVarA.c(new Function() { // from class: celk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bkxb bkxbVar = (bkxb) obj;
                bkxbVar.c((Iterable) Collection.EL.stream(set).map(new celm()).collect(ekcv.b));
                return bkxbVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bkwzVarA.b().E().forEach(new Consumer() { // from class: cell
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                bkvw bkvwVar = (bkvw) obj;
                aubq aubqVar = (aubq) ekgpVar.get(bkvwVar.g());
                if (bkvwVar.k() && bkvwVar.j() && aubqVar != null) {
                    ekhy ekhyVar2 = ekhyVar;
                    hashSet.add(aubqVar);
                    ekhyVar2.b(aubqVar, bkvwVar.h());
                } else {
                    cqbd cqbdVarC = celq.a.c();
                    cqbdVarC.I("No group encryption support for at least one participant.");
                    cqbdVarC.M("participant", bkvwVar.g());
                    cqbdVarC.r();
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (hashSet.equals(set)) {
            return ekhyVar.a();
        }
        return null;
    }

    public final ekrd d(ekrd ekrdVar) {
        ekrdVar.X(cqnc.I, this.f.d);
        ekrdVar.X(cqnc.s, this.g);
        return ekrdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        if (k(r9, r10, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d4, code lost:
    
        if (j(r9, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.aubq r9, defpackage.elyd r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.bvvf
            if (r0 == 0) goto L13
            r0 = r11
            bvvf r0 = (defpackage.bvvf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bvvf r0 = new bvvf
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 4
            r4 = 3
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L40
            r9 = 2
            if (r2 == r9) goto L3a
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            goto L35
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            defpackage.fctl.b(r11)
            goto Ld7
        L3a:
            defpackage.fctl.b(r11)
            fctx r9 = defpackage.fctx.a
            return r9
        L40:
            aubq r9 = r0.d
            defpackage.fctl.b(r11)
            goto L5f
        L46:
            defpackage.fctl.b(r11)
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r11 = r8.g
            r8.l(r5, r11)
            bagx r11 = r8.h
            ekph r2 = new ekph
            r2.<init>(r9)
            r0.d = r9
            r0.c = r5
            java.lang.Object r11 = r11.a(r2, r10, r0)
            if (r11 == r1) goto Lda
        L5f:
            qap r11 = (defpackage.qap) r11
            qam r10 = new qam
            r10.<init>()
            boolean r10 = defpackage.fdbq.f(r11, r10)
            java.lang.String r11 = "downloadAndProcessRemoteInstanceData"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl"
            java.lang.String r5 = "BugleE2eeEtouffee"
            java.lang.String r6 = "ConversationE2eeStatusImpl.kt"
            if (r10 == 0) goto L92
            ekrg r10 = defpackage.bvvn.a
            ekrw r10 = r10.j()
            ekrz r7 = defpackage.eksq.a
            r10.X(r7, r5)
            ekrd r10 = (defpackage.ekrd) r10
            ekrd r10 = r8.d(r10)
            r7 = 286(0x11e, float:4.01E-43)
            ekrw r10 = r10.h(r2, r11, r7, r6)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r7 = "Failure when downloading fresh remote instance data, using existing instead"
            r10.q(r7)
        L92:
            fcsu r10 = r8.s
            java.lang.Object r10 = r10.b()
            aoou r10 = (defpackage.aoou) r10
            bkvw r10 = defpackage.bvvd.a(r9)
            r7 = 0
            if (r10 == 0) goto Lac
            r0.d = r7
            r0.c = r4
            java.lang.Object r9 = r8.k(r9, r10, r0)
            if (r9 != r1) goto Ld7
            goto Lda
        Lac:
            ekrg r9 = defpackage.bvvn.a
            ekrw r9 = r9.h()
            ekrz r10 = defpackage.eksq.a
            r9.X(r10, r5)
            ekrd r9 = (defpackage.ekrd) r9
            ekrd r9 = r8.d(r9)
            r10 = 298(0x12a, float:4.18E-43)
            ekrw r9 = r9.h(r2, r11, r10, r6)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r10 = "No remote registrations, taking down encryption"
            r9.q(r10)
            bwvi r9 = defpackage.bwvi.DOWNGRADE_REMOTE_REGISTRATION_MISSING
            r0.d = r7
            r0.c = r3
            java.lang.Object r9 = r8.j(r9, r0)
            if (r9 != r1) goto Ld7
            goto Lda
        Ld7:
            fctx r9 = defpackage.fctx.a
            return r9
        Lda:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvvn.e(aubq, elyd, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f2, code lost:
    
        if (e(r14, r2, r0) == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0141, code lost:
    
        if (e(r14, r2, r0) == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0178, code lost:
    
        if (k(r14, r2, r0) == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0185, code lost:
    
        if (j(r14, r0) == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0265, code lost:
    
        if (r14 == r1) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvvn.f(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (j(r0, r1) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0132, code lost:
    
        if (i(r0, r1) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0152, code lost:
    
        if (j(r0, r1) == r2) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r15, defpackage.bajf r16, java.util.Set r17, defpackage.fcxy r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvvn.g(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, bajf, java.util.Set, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.ekib r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.bvvi
            if (r0 == 0) goto L13
            r0 = r9
            bvvi r0 = (defpackage.bvvi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bvvi r0 = new bvvi
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "setupScytaleSessions"
            java.lang.String r4 = "BugleE2eeEtouffee"
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L2e
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L2c
            goto Lba
        L2c:
            r8 = move-exception
            goto L90
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            defpackage.fctl.b(r9)
            bagx r9 = r7.h     // Catch: java.lang.Throwable -> L2c
            r0.c = r5     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r8.A()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L6f
            ekrg r8 = defpackage.bwfq.a     // Catch: java.lang.Throwable -> L2c
            ekrw r8 = r8.j()     // Catch: java.lang.Throwable -> L2c
            ekrz r0 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L2c
            r8.X(r0, r4)     // Catch: java.lang.Throwable -> L2c
            ekrd r8 = (defpackage.ekrd) r8     // Catch: java.lang.Throwable -> L2c
            ekrz r0 = defpackage.cqnc.H     // Catch: java.lang.Throwable -> L2c
            bwfq r9 = (defpackage.bwfq) r9     // Catch: java.lang.Throwable -> L2c
            aubq r9 = r9.l     // Catch: java.lang.Throwable -> L2c
            java.lang.String r9 = r9.d     // Catch: java.lang.Throwable -> L2c
            r8.X(r0, r9)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r9 = "com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSessionSetupImpl"
            java.lang.String r0 = "EtouffeeSessionSetupImpl.kt"
            r2 = 115(0x73, float:1.61E-43)
            ekrw r8 = r8.h(r9, r3, r2, r0)     // Catch: java.lang.Throwable -> L2c
            ekrd r8 = (defpackage.ekrd) r8     // Catch: java.lang.Throwable -> L2c
            java.lang.String r9 = "No remote user registrations to set up."
            r8.q(r9)     // Catch: java.lang.Throwable -> L2c
            fctx r8 = defpackage.fctx.a     // Catch: java.lang.Throwable -> L2c
            goto L8d
        L6f:
            r2 = r9
            bwfq r2 = (defpackage.bwfq) r2     // Catch: java.lang.Throwable -> L2c
            fcyh r2 = r2.i     // Catch: java.lang.Throwable -> L2c
            fcyh r2 = defpackage.eicg.a(r2)     // Catch: java.lang.Throwable -> L2c
            bwfk r5 = new bwfk     // Catch: java.lang.Throwable -> L2c
            bwfq r9 = (defpackage.bwfq) r9     // Catch: java.lang.Throwable -> L2c
            r6 = 0
            r5.<init>(r6, r9, r8)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r8 = defpackage.fdin.a(r2, r5, r0)     // Catch: java.lang.Throwable -> L2c
            if (r8 == r1) goto L88
            fctx r8 = defpackage.fctx.a     // Catch: java.lang.Throwable -> L2c
        L88:
            if (r8 != r1) goto L8b
            goto L8d
        L8b:
            fctx r8 = defpackage.fctx.a     // Catch: java.lang.Throwable -> L2c
        L8d:
            if (r8 != r1) goto Lba
            return r1
        L90:
            ekrg r9 = defpackage.bvvn.a
            ekrw r9 = r9.j()
            ekrz r0 = defpackage.eksq.a
            r9.X(r0, r4)
            ekrd r9 = (defpackage.ekrd) r9
            ekrd r9 = r7.d(r9)
            ekrw r9 = r9.g(r8)
            r0 = 509(0x1fd, float:7.13E-43)
            java.lang.String r1 = "ConversationE2eeStatusImpl.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl"
            ekrw r9 = r9.h(r2, r3, r0, r1)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r0 = "Failed to setup remote instance session"
            r9.q(r0)
            boolean r9 = r8 instanceof java.util.concurrent.CancellationException
            if (r9 != 0) goto Lbd
        Lba:
            fctx r8 = defpackage.fctx.a
            return r8
        Lbd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvvn.h(ekib, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if (h((defpackage.ekib) r9, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.ekib r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.bvvk
            if (r0 == 0) goto L13
            r0 = r10
            bvvk r0 = (defpackage.bvvk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bvvk r0 = new bvvk
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L42
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            defpackage.fctl.b(r10)
            goto L9c
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            java.lang.Object r9 = r0.a
            defpackage.fctl.b(r10)
            goto L87
        L3c:
            java.lang.Object r9 = r0.a
            defpackage.fctl.b(r10)
            goto L70
        L42:
            defpackage.fctl.b(r10)
            fcsu r10 = r8.q
            java.lang.Object r10 = r10.b()
            cexn r10 = (defpackage.cexn) r10
            aubq r2 = r8.f
            java.lang.String r2 = r2.d
            cexm r10 = r10.a(r2)
            cmfo r10 = r10.b
            eiju r10 = r10.h()
            cexd r2 = new cexd
            r2.<init>()
            eoqg r7 = defpackage.eoqg.a
            eiju r10 = r10.h(r2, r7)
            r0.a = r9
            r0.d = r6
            java.lang.Object r10 = defpackage.fdxs.c(r10, r0)
            if (r10 == r1) goto Ld9
        L70:
            fcyh r2 = r8.c
            j$.util.Optional r10 = (j$.util.Optional) r10
            fcyh r2 = defpackage.eicg.a(r2)
            bvvj r6 = new bvvj
            r6.<init>(r3, r10, r8)
            r0.a = r9
            r0.d = r5
            java.lang.Object r10 = defpackage.fdin.a(r2, r6, r0)
            if (r10 == r1) goto Ld9
        L87:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L9f
            r0.a = r3
            r0.d = r4
            ekib r9 = (defpackage.ekib) r9
            java.lang.Object r9 = r8.h(r9, r0)
            if (r9 != r1) goto L9c
            goto Ld9
        L9c:
            fctx r9 = defpackage.fctx.a
            return r9
        L9f:
            ekrg r9 = defpackage.bvvn.a
            ekrw r9 = r9.h()
            ekrz r10 = defpackage.eksq.a
            java.lang.String r0 = "BugleE2eeEtouffee"
            r9.X(r10, r0)
            ekrd r9 = (defpackage.ekrd) r9
            ekrd r9 = r8.d(r9)
            r10 = 394(0x18a, float:5.52E-43)
            java.lang.String r0 = "ConversationE2eeStatusImpl.kt"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl"
            java.lang.String r2 = "skipEtouffeeSetupIfCapsNotSynced"
            ekrw r9 = r9.h(r1, r2, r10, r0)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r10 = "etouffee configs not in sync, skipping etouffee setup"
            r9.q(r10)
            fcsu r9 = r8.n
            java.lang.Object r9 = r9.b()
            ains r9 = (defpackage.ains) r9
            bwvi r10 = defpackage.bwvi.SKIP_UPGRADE_FLAG_AND_BACKEND_NOT_SYNCED
            int r10 = r10.u
            java.lang.String r0 = "Bugle.Etouffee.Conversation.Encryption.Update"
            r9.e(r0, r10)
            fctx r9 = defpackage.fctx.a
            return r9
        Ld9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvvn.i(ekib, fcxy):java.lang.Object");
    }

    public final Object j(bwvi bwviVar, fcxy fcxyVar) {
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleE2eeEtouffee");
        ekrd ekrdVarD = d((ekrd) ekrwVarE);
        ekrdVarD.X(k, bwviVar);
        ((ekrd) ekrdVarD.h("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl", "takedownEncryptionForConversation", 519, "ConversationE2eeStatusImpl.kt")).q("Disabling Etouffee for conversation draft");
        Object objB = this.h.b(0, bwviVar, fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }
}
