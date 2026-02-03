package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amgw implements alza {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/OptimisticBugleMessageRepository");
    public final fcsu a;
    private final fdjx c;
    private final fcsu d;
    private final alza e;

    public amgw(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, alza alzaVar) {
        this.c = fdjxVar;
        this.d = fcsuVar;
        this.a = fcsuVar2;
        this.e = alzaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object af(defpackage.amgw r5, com.google.android.apps.messaging.shared.api.messaging.MessageId r6, j$.util.Optional r7, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r8, int r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.amgt
            if (r0 == 0) goto L13
            r0 = r10
            amgt r0 = (defpackage.amgt) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            amgt r0 = new amgt
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r10)
            goto L7c
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            int r9 = r0.f
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r8 = r0.e
            j$.util.Optional r7 = r0.d
            amgw r5 = r0.c
            defpackage.fctl.b(r10)
            goto L59
        L3e:
            defpackage.fctl.b(r10)
            alza r10 = r5.e
            amdx r10 = (defpackage.amdx) r10
            eiju r6 = r10.ag(r6)
            r0.c = r5
            r0.d = r7
            r0.e = r8
            r0.f = r9
            r0.b = r4
            java.lang.Object r10 = defpackage.fdxs.c(r6, r0)
            if (r10 == r1) goto L81
        L59:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r6 = r7.get()
            ankg r6 = (defpackage.ankg) r6
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = r5.g()
            eiju r5 = r6.c(r5, r8, r10, r9)
            r6 = 0
            r0.c = r6
            r0.d = r6
            r0.e = r6
            r6 = 0
            r0.f = r6
            r0.b = r3
            java.lang.Object r10 = defpackage.fdxs.c(r5, r0)
            if (r10 != r1) goto L7c
            goto L81
        L7c:
            java.lang.Void r10 = (java.lang.Void) r10
            fctx r5 = defpackage.fctx.a
            return r5
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amgw.af(amgw, com.google.android.apps.messaging.shared.api.messaging.MessageId, j$.util.Optional, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ag(defpackage.amgw r5, com.google.android.apps.messaging.shared.api.messaging.MessageId r6, j$.util.Optional r7, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r8, int r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.amgv
            if (r0 == 0) goto L13
            r0 = r10
            amgv r0 = (defpackage.amgv) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            amgv r0 = new amgv
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r10)
            goto L7c
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            int r9 = r0.f
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r8 = r0.e
            j$.util.Optional r7 = r0.d
            amgw r5 = r0.c
            defpackage.fctl.b(r10)
            goto L59
        L3e:
            defpackage.fctl.b(r10)
            alza r10 = r5.e
            amdx r10 = (defpackage.amdx) r10
            eiju r6 = r10.ag(r6)
            r0.c = r5
            r0.d = r7
            r0.e = r8
            r0.f = r9
            r0.b = r4
            java.lang.Object r10 = defpackage.fdxs.c(r6, r0)
            if (r10 == r1) goto L81
        L59:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r6 = r7.get()
            ankg r6 = (defpackage.ankg) r6
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = r5.g()
            eiju r5 = r6.d(r5, r8, r10, r9)
            r6 = 0
            r0.c = r6
            r0.d = r6
            r0.e = r6
            r6 = 0
            r0.f = r6
            r0.b = r3
            java.lang.Object r10 = defpackage.fdxs.c(r5, r0)
            if (r10 != r1) goto L7c
            goto L81
        L7c:
            java.lang.Void r10 = (java.lang.Void) r10
            fctx r5 = defpackage.fctx.a
            return r5
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amgw.ag(amgw, com.google.android.apps.messaging.shared.api.messaging.MessageId, j$.util.Optional, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, int, fcxy):java.lang.Object");
    }

    private final ekgb ah(ekgb ekgbVar) {
        ekrg ekrgVar = b;
        ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/shared/api/messaging/message/OptimisticBugleMessageRepository", "applyAllMutationsOptimistically", 224, "OptimisticBugleMessageRepository.kt")).q("OMv2: Optimistically applying any pending mutations to message list.");
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
        Iterator<E> it = ekgbVar.iterator();
        while (it.hasNext()) {
            ajlt ajltVar = (ajlt) it.next();
            ajltVar.getClass();
            ajlt amgmVar = ajltVar;
            for (anaw anawVar : ((anco) this.a.b()).a(ajltVar.b())) {
                anawVar.getClass();
                ekrd ekrdVar = (ekrd) ekrgVar.h().h("com/google/android/apps/messaging/shared/api/messaging/message/OptimisticBugleMessageRepository", "applyMessageMutationsOptimistically", 194, "OptimisticBugleMessageRepository.kt");
                MessageId messageIdB = ajltVar.b();
                anax anaxVar = anawVar.b;
                ekrdVar.D("OMv2: Applying %s optimistically to message %s.", anaxVar, messageIdB);
                boolean z = true;
                if (anaxVar != anax.a && anaxVar != anax.b) {
                    z = false;
                }
                amgmVar = new amgm(ajltVar, z, anawVar);
            }
            arrayList.add(amgmVar);
        }
        ekgb ekgbVarN = ekgb.n(arrayList);
        ekgbVarN.getClass();
        return ekgbVarN;
    }

    private final void ak(MessageId messageId, anax anaxVar, fdap fdapVar) {
        anco ancoVar = (anco) this.a.b();
        BugleConversationId bugleConversationIdU = U();
        bugleConversationIdU.getClass();
        auvw.k(this.c, null, null, new amgr(fdapVar, this, messageId, ancoVar.e(bugleConversationIdU, messageId, anaxVar), null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object b(defpackage.amgw r4, int r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.amgo
            if (r0 == 0) goto L13
            r0 = r6
            amgo r0 = (defpackage.amgo) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            amgo r0 = new amgo
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            amgw r4 = r0.c
            defpackage.fctl.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.fctl.b(r6)
            alza r6 = r4.e
            eiju r5 = r6.N(r5)
            r0.c = r4
            r0.b = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            ekgb r6 = (defpackage.ekgb) r6
            r6.getClass()
            ekgb r4 = r4.ah(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amgw.b(amgw, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object c(defpackage.amgw r4, int r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.amgq
            if (r0 == 0) goto L13
            r0 = r6
            amgq r0 = (defpackage.amgq) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            amgq r0 = new amgq
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            amgw r4 = r0.c
            defpackage.fctl.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.fctl.b(r6)
            alza r6 = r4.e
            eiju r5 = r6.O(r5)
            r0.c = r4
            r0.b = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            ekgb r6 = (defpackage.ekgb) r6
            r6.getClass()
            ekgb r4 = r4.ah(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amgw.c(amgw, int, fcxy):java.lang.Object");
    }

    @Override // defpackage.ajmh
    public final eiju A(MessageId messageId) {
        return this.e.A(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju B(MessageId messageId) {
        return this.e.B(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju C(MessageId messageId, String str, fhaz fhazVar) {
        return this.e.C(messageId, str, fhazVar);
    }

    @Override // defpackage.ajmh
    public final eiju D(MessageId messageId) {
        return this.e.D(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju E(MessageId messageId) {
        return this.e.E(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju F(MessageId messageId) {
        return this.e.F(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju G(ajmy ajmyVar) {
        return this.e.G(ajmyVar);
    }

    @Override // defpackage.ajmh
    public final eiju H(MessageId messageId) {
        return this.e.H(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju I(MessageId messageId, amvx amvxVar) {
        return this.e.I(messageId, amvxVar);
    }

    @Override // defpackage.ajmh
    public final void J(MessageId messageId) {
        this.e.J(messageId);
    }

    @Override // defpackage.ajmh
    public final void K(MessageId messageId, int i) {
        this.e.K(messageId, i);
    }

    @Override // defpackage.ajmh
    public final void L(ajlt ajltVar, int i) {
        this.e.L(ajltVar, i);
    }

    @Override // defpackage.ajmh
    public final eiju M(MessageId messageId, anhj anhjVar, ckmn ckmnVar, fhaz fhazVar, angn angnVar) {
        return this.e.M(messageId, anhjVar, ckmnVar, fhazVar, angnVar);
    }

    @Override // defpackage.ajmh
    public final eiju N(int i) {
        return auvw.b(new amgn(this), this.c);
    }

    @Override // defpackage.ajmh
    public final eiju O(int i) {
        return auvw.b(new amgp(this, i), this.c);
    }

    @Override // defpackage.ajmh
    public final eiju P() {
        return this.e.P();
    }

    @Override // defpackage.ajmh
    public final void Q(MessageId messageId, int i) throws IOException {
        Throwable th;
        eieu eieuVarH = eiiy.h("MessageRepository#starMessage");
        try {
            MessageIdType messageIdTypeAf = amdx.af(messageId);
            messageIdTypeAf.getClass();
            Optional optional = (Optional) this.d.b();
            if (!optional.isEmpty()) {
                try {
                    ak(messageId, anax.a, new amgs(this, messageId, optional, messageIdTypeAf, i));
                    fczl.a(eieuVarH, null);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    throw th;
                }
            }
            try {
                ((ekrd) b.j().h("com/google/android/apps/messaging/shared/api/messaging/message/OptimisticBugleMessageRepository", "starMessage", 72, "OptimisticBugleMessageRepository.kt")).q("starMessage called when message starring not available");
                fczl.a(eieuVarH, null);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    fczl.a(eieuVarH, th);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // defpackage.ajmh
    public final void R(MessageId messageId, int i) throws IOException {
        Throwable th;
        eieu eieuVarH = eiiy.h("MessageRepository#starMessage");
        try {
            MessageIdType messageIdTypeAf = amdx.af(messageId);
            messageIdTypeAf.getClass();
            Optional optional = (Optional) this.d.b();
            if (!optional.isEmpty()) {
                try {
                    ak(messageId, anax.b, new amgu(this, messageId, optional, messageIdTypeAf, i));
                    fczl.a(eieuVarH, null);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    throw th;
                }
            }
            try {
                ((ekrd) b.j().h("com/google/android/apps/messaging/shared/api/messaging/message/OptimisticBugleMessageRepository", "unstarMessage", 94, "OptimisticBugleMessageRepository.kt")).q("unstarMessage called when message starring not available");
                fczl.a(eieuVarH, null);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    fczl.a(eieuVarH, th);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // defpackage.ajmh
    public final void S() {
        this.e.S();
    }

    @Override // defpackage.ajmh
    public final eiju T(MessageId messageId) {
        return this.e.T(messageId);
    }

    @Override // defpackage.alza
    public final BugleConversationId U() {
        return ((amdx) this.e).k;
    }

    @Override // defpackage.alza
    public final eiju V(String str) {
        return this.e.V(str);
    }

    @Override // defpackage.alza
    public final eiju W(MessageId messageId) {
        return this.e.W(messageId);
    }

    @Override // defpackage.alza
    public final eiju X(ckwl ckwlVar) {
        return this.e.X(ckwlVar);
    }

    @Override // defpackage.alza
    public final eiju Y(Instant instant) {
        return this.e.Y(instant);
    }

    @Override // defpackage.alza
    public final eiju Z(int i) {
        return this.e.Z(i);
    }

    @Override // defpackage.ajmh
    public final ajlu a() {
        return this.e.a();
    }

    @Override // defpackage.alza
    public final eiju aa(aoff aoffVar) {
        return this.e.aa(aoffVar);
    }

    @Override // defpackage.alza
    public final void ab() {
        this.e.ab();
    }

    @Override // defpackage.alza
    public final eiju ac(aoer aoerVar, amvr amvrVar, basd basdVar, Instant instant, MessageId messageId) {
        return this.e.ac(aoerVar, amvrVar, basdVar, instant, messageId);
    }

    @Override // defpackage.ancc
    public final ajly ad(MessageId messageId, Instant instant) {
        throw null;
    }

    @Override // defpackage.ancc
    public final andp ae() {
        throw null;
    }

    @Override // defpackage.ancc
    public final eiju ai(int i, int i2) {
        throw null;
    }

    @Override // defpackage.ancc
    public final Instant aj(MessageId messageId) {
        throw null;
    }

    @Override // defpackage.ankf
    public final void al(ajlx ajlxVar) {
        this.e.al(ajlxVar);
    }

    @Override // defpackage.ancc
    public final void am() {
        this.e.am();
    }

    @Override // defpackage.ancc, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    @Override // defpackage.ajmh
    public final ajlw d() {
        return this.e.d();
    }

    @Override // defpackage.ajmh
    public final ajma e() {
        return this.e.e();
    }

    @Override // defpackage.ajmh
    public final ajmp f() {
        throw null;
    }

    @Override // defpackage.ajmh
    public final ConversationId g() {
        return ((amdx) this.e).k;
    }

    @Override // defpackage.ajmh
    public final anpj h() {
        return this.e.h();
    }

    @Override // defpackage.ajmh
    public final anpj i(MessageId messageId) {
        return this.e.i(messageId);
    }

    @Override // defpackage.ajmh
    public final anpj j() {
        return this.e.j();
    }

    @Override // defpackage.ajmh
    public final anpj k() {
        return this.e.k();
    }

    @Override // defpackage.ajmh
    public final cquc l(ajmg ajmgVar) {
        throw null;
    }

    @Override // defpackage.ajmh
    public final /* synthetic */ eiju m(MessageId messageId, ekgb ekgbVar) {
        return ajmd.a();
    }

    @Override // defpackage.ajmh
    public final eiju n(MessageId messageId, anhj anhjVar, ckmn ckmnVar, fhaz fhazVar) {
        return this.e.n(messageId, anhjVar, ckmnVar, fhazVar);
    }

    @Override // defpackage.ajmh
    public final eiju o(MessageId messageId) {
        return this.e.o(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju p(ekgb ekgbVar) {
        return this.e.p(ekgbVar);
    }

    @Override // defpackage.ajmh
    public final eiju q() {
        return this.e.q();
    }

    @Override // defpackage.ajmh
    public final eiju r(ekgb ekgbVar) {
        return this.e.r(ekgbVar);
    }

    @Override // defpackage.ajmh
    public final eiju s(ekgb ekgbVar, cdyt cdytVar) {
        return this.e.s(ekgbVar, cdytVar);
    }

    @Override // defpackage.ajmh
    public final eiju t(ekgb ekgbVar) {
        return this.e.t(ekgbVar);
    }

    @Override // defpackage.ajmh
    public final eiju u() {
        return this.e.u();
    }

    @Override // defpackage.ajmh
    public final eiju v(MessageId messageId) {
        return this.e.v(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju w() {
        return this.e.w();
    }

    @Override // defpackage.ajmh
    public final eiju x() {
        return this.e.x();
    }

    @Override // defpackage.ajmh
    public final eiju y() {
        return this.e.y();
    }

    @Override // defpackage.ajmh
    public final eiju z() {
        return this.e.z();
    }
}
