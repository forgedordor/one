package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chtk {
    private static final ekrg f = ekrg.c("com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider");
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcyh d;
    public final fdjx e;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcyh k;

    public chtk(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcyh fcyhVar, fcyh fcyhVar2, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar;
        this.g = fcsuVar2;
        this.b = fcsuVar3;
        this.h = fcsuVar4;
        this.c = fcsuVar5;
        this.i = fcsuVar6;
        this.j = fcsuVar7;
        this.d = fcyhVar;
        this.k = fcyhVar2;
        this.e = fdjxVar;
    }

    public final aubq a(int i) {
        ekrg ekrgVar = f;
        ekrw ekrwVarE = ekrgVar.e();
        ekrz ekrzVar = eksq.a;
        ekrwVarE.X(ekrzVar, "Bugle");
        ekrd ekrdVar = (ekrd) ekrwVarE;
        ekrz ekrzVar2 = cqnc.w;
        Integer numValueOf = Integer.valueOf(i);
        ekrdVar.X(ekrzVar2, numValueOf);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider", "getLocalIdentityOrNull", 90, "RcsLocalIdentityProvider.kt")).q("Attempt to get self identity.");
        dggq.a(i);
        dggk dggkVarB = ((dghj) this.a.b()).b(i);
        if (dggkVarB == null) {
            chsp chspVar = (chsp) this.h.b();
            auvw.k(chspVar.d, null, null, new chso(chspVar, i, null), 3);
        }
        if (dggkVarB == null) {
            return null;
        }
        aubq aubqVarC = ((asqx) this.c.b()).c(dggkVarB.a);
        aubqVarC.getClass();
        ekrw ekrwVarE2 = ekrgVar.e();
        ekrwVarE2.X(ekrzVar, "Bugle");
        ekrd ekrdVar2 = (ekrd) ekrwVarE2;
        ekrdVar2.X(ekrzVar2, numValueOf);
        ekrdVar2.X(cqnc.I, aubqVarC.d);
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider", "getLocalIdentityOrNull", 99, "RcsLocalIdentityProvider.kt")).q("Retrieved phone number for given sub id.");
        return aubqVarC;
    }

    public final aubq b(int i) {
        aubq aubqVarA = a(i);
        if (aubqVarA != null) {
            return aubqVarA;
        }
        throw new chsq(i);
    }

    public final eiju c() {
        return auvw.c(this.e, fcyi.a, fdjz.a, new chsw(this, null));
    }

    public final eiju d(SelfIdentityId selfIdentityId) {
        selfIdentityId.getClass();
        return auvw.c(this.e, fcyi.a, fdjz.a, new chsx(this, selfIdentityId, null));
    }

    public final eiju e(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        return auvw.c(this.e, fcyi.a, fdjz.a, new chsy(this, conversationIdType, null));
    }

    public final eiju f(int i) {
        return auvw.c(this.e, fcyi.a, fdjz.a, new chtf(this, i, null));
    }

    public final eiju g(int i) {
        return auvw.c(this.e, fcyi.a, fdjz.a, new chth(this, i, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.chsv
            if (r0 == 0) goto L13
            r0 = r5
            chsv r0 = (defpackage.chsv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chsv r0 = new chsv
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fcsu r5 = r4.a
            java.lang.Object r5 = r5.b()
            dghj r5 = (defpackage.dghj) r5
            r0.c = r3
            java.lang.Object r5 = r5.j(r0)
            if (r5 == r1) goto L72
        L42:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.fcva.p(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L53:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r5.next()
            dggk r1 = (defpackage.dggk) r1
            fcsu r2 = r4.c
            java.lang.Object r2 = r2.b()
            asqx r2 = (defpackage.asqx) r2
            java.lang.String r1 = r1.a
            aubq r1 = r2.c(r1)
            r0.add(r1)
            goto L53
        L71:
            return r0
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chtk.h(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v0, types: [chtk] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.aoer r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.chtd
            if (r0 == 0) goto L13
            r0 = r6
            chtd r0 = (defpackage.chtd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chtd r0 = new chtd
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            aubq r5 = r0.d
            defpackage.fctl.b(r6)
            fctk r6 = (defpackage.fctk) r6
            java.lang.Object r6 = r6.a
            goto L62
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.fctl.b(r6)
            if (r5 == 0) goto L79
            j$.util.Optional r5 = r5.o()
            chst r6 = new chst
            r6.<init>()
            chsu r2 = new chsu
            r2.<init>()
            j$.util.Optional r5 = r5.flatMap(r2)
            r5.getClass()
            java.lang.Object r5 = defpackage.fdct.b(r5)
            aubq r5 = (defpackage.aubq) r5
            if (r5 == 0) goto L73
            r0.d = r5
            r0.c = r3
            r6 = 2
            java.lang.Object r6 = r4.n(r5, r6, r0)
            if (r6 == r1) goto L72
        L62:
            boolean r0 = defpackage.fctk.d(r6)
            if (r0 == 0) goto L6d
            dggr r6 = (defpackage.dggr) r6
            int r6 = r6.a
            goto L6e
        L6d:
            r5 = r6
        L6e:
            defpackage.fctl.b(r5)
            return r5
        L72:
            return r1
        L73:
            chtp r5 = new chtp
            r5.<init>()
            throw r5
        L79:
            ekrg r5 = defpackage.chtk.f
            ekrw r5 = r5.j()
            ekrz r6 = defpackage.eksq.a
            java.lang.String r0 = "Bugle"
            r5.X(r6, r0)
            ekrd r5 = (defpackage.ekrd) r5
            eksk r6 = defpackage.eksk.MEDIUM
            r5.Z(r6)
            r6 = 251(0xfb, float:3.52E-43)
            java.lang.String r0 = "RcsLocalIdentityProvider.kt"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider"
            java.lang.String r2 = "getLocalIdentityFromSelfIdentityOrThrow"
            ekrw r5 = r5.h(r1, r2, r6, r0)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r6 = "Active self identity is not set in the conversation."
            r5.q(r6)
            chtp r5 = new chtp
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chtk.i(aoer, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.chte
            if (r0 == 0) goto L13
            r0 = r6
            chte r0 = (defpackage.chte) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chte r0 = new chte
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r6)
            fctk r6 = (defpackage.fctk) r6
            java.lang.Object r5 = r6.a
            goto L3e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.fctl.b(r6)
            r0.c = r3
            java.lang.Object r5 = r4.k(r5, r3, r0)
            if (r5 == r1) goto L44
        L3e:
            boolean r6 = r5 instanceof defpackage.fctj
            if (r6 == 0) goto L43
            r5 = 0
        L43:
            return r5
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chtk.j(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7, int r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.chsz
            if (r0 == 0) goto L13
            r0 = r9
            chsz r0 = (defpackage.chsz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chsz r0 = new chsz
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r3) goto L2f
            defpackage.fctl.b(r9)
            fctk r9 = (defpackage.fctk) r9
            java.lang.Object r7 = r9.a
            return r7
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            int r8 = r0.e
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7 = r0.d
            defpackage.fctl.b(r9)
            goto L59
        L3f:
            defpackage.fctl.b(r9)
            fcyh r9 = r6.k
            fcyh r9 = defpackage.eicg.a(r9)
            chta r2 = new chta
            r2.<init>(r4, r6, r7)
            r0.d = r7
            r0.e = r8
            r0.c = r5
            java.lang.Object r9 = defpackage.fdin.a(r9, r2, r0)
            if (r9 == r1) goto Lb0
        L59:
            bojh r9 = (defpackage.bojh) r9
            if (r9 == 0) goto L62
            java.lang.String r9 = r9.T()
            goto L63
        L62:
            r9 = r4
        L63:
            if (r9 != 0) goto L9d
            if (r8 != r5) goto L93
            ekrg r8 = defpackage.chtk.f
            ekrw r8 = r8.j()
            ekrz r9 = defpackage.eksq.a
            java.lang.String r0 = "Bugle"
            r8.X(r9, r0)
            ekrd r8 = (defpackage.ekrd) r8
            eksk r9 = defpackage.eksk.MEDIUM
            r8.Z(r9)
            ekrz r9 = defpackage.cqnc.s
            r8.X(r9, r7)
            r7 = 238(0xee, float:3.34E-43)
            java.lang.String r9 = "RcsLocalIdentityProvider.kt"
            java.lang.String r0 = "com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider"
            java.lang.String r1 = "getLocalIdentityFromConversationId-0E7RQCE"
            ekrw r7 = r8.h(r0, r1, r7, r9)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r8 = "Active self identity is not set in the conversation."
            r7.q(r8)
        L93:
            chtl r7 = new chtl
            r7.<init>()
            java.lang.Object r7 = defpackage.fctl.a(r7)
            return r7
        L9d:
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r7 = defpackage.aofa.b(r9)
            r0.d = r4
            r9 = 0
            r0.e = r9
            r0.c = r3
            java.lang.Object r7 = r6.m(r7, r8, r0)
            if (r7 != r1) goto Laf
            goto Lb0
        Laf:
            return r7
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chtk.k(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.aoer r6, int r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.chtb
            if (r0 == 0) goto L13
            r0 = r8
            chtb r0 = (defpackage.chtb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chtb r0 = new chtb
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            aubq r6 = r0.d
            defpackage.fctl.b(r8)
            fctk r8 = (defpackage.fctk) r8
            java.lang.Object r7 = r8.a
            goto La0
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.fctl.b(r8)
            j$.util.Optional r8 = r6.o()
            chsr r2 = new chsr
            r2.<init>()
            chss r4 = new chss
            r4.<init>()
            j$.util.Optional r8 = r8.flatMap(r4)
            r8.getClass()
            java.lang.Object r8 = defpackage.fdct.b(r8)
            aubq r8 = (defpackage.aubq) r8
            if (r8 != 0) goto L95
            if (r7 != r3) goto L8b
            ekrg r7 = defpackage.chtk.f
            ekrw r7 = r7.j()
            ekrz r8 = defpackage.eksq.a
            java.lang.String r0 = "Bugle"
            r7.X(r8, r0)
            ekrd r7 = (defpackage.ekrd) r7
            eksk r8 = defpackage.eksk.MEDIUM
            r7.Z(r8)
            ekrz r8 = defpackage.cqnc.p
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r6 = r6.h()
            java.lang.String r6 = r6.b()
            r7.X(r8, r6)
            r6 = 277(0x115, float:3.88E-43)
            java.lang.String r8 = "RcsLocalIdentityProvider.kt"
            java.lang.String r0 = "com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider"
            java.lang.String r1 = "getLocalIdentityFromSelfIdentity-0E7RQCE"
            ekrw r6 = r7.h(r0, r1, r6, r8)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r7 = "Self identity does not contain any chat endpoint."
            r6.q(r7)
        L8b:
            chtp r6 = new chtp
            r6.<init>()
            java.lang.Object r6 = defpackage.fctl.a(r6)
            return r6
        L95:
            r0.d = r8
            r0.c = r3
            java.lang.Object r7 = r5.n(r8, r7, r0)
            if (r7 == r1) goto Lac
            r6 = r8
        La0:
            boolean r8 = defpackage.fctk.d(r7)
            if (r8 == 0) goto Lab
            dggr r7 = (defpackage.dggr) r7
            int r7 = r7.a
            return r6
        Lab:
            return r7
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chtk.l(aoer, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r6, int r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.chtc
            if (r0 == 0) goto L13
            r0 = r8
            chtc r0 = (defpackage.chtc) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            chtc r0 = new chtc
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.fctl.b(r8)
            fctk r8 = (defpackage.fctk) r8
            java.lang.Object r6 = r8.a
            return r6
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            int r7 = r0.e
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r8)
            goto L5d
        L3e:
            defpackage.fctl.b(r8)
            fcsu r8 = r5.g
            java.lang.Object r8 = r8.b()
            aofc r8 = (defpackage.aofc) r8
            eiju r8 = r8.e(r6)
            fdkf r8 = defpackage.auvw.e(r8)
            r0.a = r6
            r0.e = r7
            r0.d = r4
            java.lang.Object r8 = r8.c(r0)
            if (r8 == r1) goto Lb6
        L5d:
            r8.getClass()
            j$.util.Optional r8 = (j$.util.Optional) r8
            java.lang.Object r8 = defpackage.fdct.b(r8)
            aoer r8 = (defpackage.aoer) r8
            if (r8 != 0) goto La6
            if (r7 != r4) goto L9c
            ekrg r7 = defpackage.chtk.f
            ekrw r7 = r7.j()
            ekrz r8 = defpackage.eksq.a
            java.lang.String r0 = "Bugle"
            r7.X(r8, r0)
            ekrd r7 = (defpackage.ekrd) r7
            eksk r8 = defpackage.eksk.MEDIUM
            r7.Z(r8)
            ekrz r8 = defpackage.cqnc.p
            java.lang.String r6 = r6.b()
            r7.X(r8, r6)
            r6 = 159(0x9f, float:2.23E-43)
            java.lang.String r8 = "RcsLocalIdentityProvider.kt"
            java.lang.String r0 = "com/google/android/apps/messaging/shared/provisioning/RcsLocalIdentityProvider"
            java.lang.String r1 = "getLocalIdentityFromSelfIdentityId-0E7RQCE"
            ekrw r6 = r7.h(r0, r1, r6, r8)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r7 = "Self identity does not exist for the given id."
            r6.q(r7)
        L9c:
            chtq r6 = new chtq
            r6.<init>()
            java.lang.Object r6 = defpackage.fctl.a(r6)
            return r6
        La6:
            r6 = 0
            r0.a = r6
            r6 = 0
            r0.e = r6
            r0.d = r3
            java.lang.Object r6 = r5.l(r8, r7, r0)
            if (r6 != r1) goto Lb5
            goto Lb6
        Lb5:
            return r6
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chtk.m(com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.aubq r9, int r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chtk.n(aubq, int, fcxy):java.lang.Object");
    }
}
