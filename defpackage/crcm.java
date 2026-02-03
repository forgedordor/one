package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crcm implements crbi {
    public final fcsu a;
    public final fcsu b;
    public final fcyh c;
    public final fdjx d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    private final fcyh h;
    private final fdjx i;

    public crcm(fcsu fcsuVar, fcsu fcsuVar2, fcyh fcyhVar, fcyh fcyhVar2, fdjx fdjxVar, fdjx fdjxVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcyhVar;
        this.h = fcyhVar2;
        this.d = fdjxVar;
        this.i = fdjxVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
    }

    @Override // defpackage.crbi
    public final eiju a(MessageIdType messageIdType, ConversationIdType conversationIdType, ezgd ezgdVar, elpn elpnVar) {
        messageIdType.getClass();
        conversationIdType.getClass();
        ezgdVar.getClass();
        elpnVar.getClass();
        return auvw.c(this.i, fcyi.a, fdjz.a, new crbt(this, messageIdType, conversationIdType, ezgdVar, elpnVar, null));
    }

    @Override // defpackage.crbi
    public final eiju b(boolean z, MessageCoreData messageCoreData, elny elnyVar) {
        elnyVar.getClass();
        return auvw.c(this.i, fcyi.a, fdjz.a, new crbv(this, z, messageCoreData, elnyVar, null));
    }

    @Override // defpackage.crbi
    public final eiju c(MessageCoreData messageCoreData, elny elnyVar) {
        elnyVar.getClass();
        return auvw.c(this.i, fcyi.a, fdjz.a, new crcb(this, messageCoreData, elnyVar, null));
    }

    @Override // defpackage.crbi
    public final eiju d(ConversationIdType conversationIdType, long j, elny elnyVar) {
        conversationIdType.getClass();
        elnyVar.getClass();
        return auvw.c(this.d, fcyi.a, fdjz.a, new crca(this, conversationIdType, j, elnyVar, null));
    }

    @Override // defpackage.crbi
    public final eiju e(SuggestionData suggestionData, elqn elqnVar, eyzv eyzvVar, boolean z, float f, Boolean bool, Boolean bool2) {
        suggestionData.getClass();
        elqnVar.getClass();
        eyzvVar.getClass();
        return auvw.c(this.i, fcyi.a, fdjz.a, new crcf(this, suggestionData, elqnVar, eyzvVar, z, f, bool, bool2, null));
    }

    @Override // defpackage.crbi
    public final Object f(String str, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.h), new crbp(null, this, str), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.crbi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r11, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r12, defpackage.ezgd r13, defpackage.elpn r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.crbs
            if (r0 == 0) goto L13
            r0 = r15
            crbs r0 = (defpackage.crbs) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            crbs r0 = new crbs
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.f
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L61
            if (r2 == r4) goto L4a
            if (r2 != r3) goto L42
            java.lang.Object r11 = r0.e
            java.lang.Object r12 = r0.d
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r0.c
            elpn r13 = (defpackage.elpn) r13
            java.lang.Object r14 = r0.b
            ezgd r14 = (defpackage.ezgd) r14
            java.lang.Object r0 = r0.a
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r0 = (com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType) r0
            defpackage.fctl.b(r15)
            r3 = r11
            r6 = r12
            r9 = r13
            r8 = r14
            r7 = r0
            goto Laf
        L42:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L4a:
            java.lang.Object r11 = r0.d
            r14 = r11
            elpn r14 = (defpackage.elpn) r14
            java.lang.Object r11 = r0.c
            r13 = r11
            ezgd r13 = (defpackage.ezgd) r13
            java.lang.Object r11 = r0.b
            r12 = r11
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r12 = (com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType) r12
            java.lang.Object r11 = r0.a
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r11 = (com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType) r11
            defpackage.fctl.b(r15)
            goto L80
        L61:
            defpackage.fctl.b(r15)
            fcyh r15 = r10.c
            fcyh r15 = defpackage.eicg.a(r15)
            crbr r2 = new crbr
            r5 = 0
            r2.<init>(r5, r10, r11)
            r0.a = r11
            r0.b = r12
            r0.c = r13
            r0.d = r14
            r0.h = r4
            java.lang.Object r15 = defpackage.fdin.a(r15, r2, r0)
            if (r15 == r1) goto Lba
        L80:
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r15 = (com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData) r15
            if (r15 != 0) goto L87
            fctx r11 = defpackage.fctx.a
            return r11
        L87:
            fcsu r2 = r10.g
            java.lang.String r15 = defpackage.crbh.c(r15)
            java.lang.Object r2 = r2.b()
            crcp r2 = (defpackage.crcp) r2
            fdkf r11 = r10.p(r11)
            r0.a = r12
            r0.b = r13
            r0.c = r14
            r0.d = r15
            r0.e = r2
            r0.h = r3
            java.lang.Object r11 = r11.c(r0)
            if (r11 == r1) goto Lba
            r7 = r12
            r8 = r13
            r9 = r14
            r6 = r15
            r3 = r2
            r15 = r11
        Laf:
            r4 = r15
            emig r4 = (defpackage.emig) r4
            eyzv r5 = defpackage.eyzv.CONVERSATION_VIEW
            r3.b(r4, r5, r6, r7, r8, r9)
            fctx r11 = defpackage.fctx.a
            return r11
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crcm.g(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, ezgd, elpn, fcxy):java.lang.Object");
    }

    @Override // defpackage.crbi
    public final Object h(SuggestionData suggestionData, elqn elqnVar, eyzv eyzvVar, boolean z, float f, Boolean bool, Boolean bool2, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.h), new crcc(null, suggestionData, this, eyzvVar, elqnVar, z, f, bool, bool2), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.crbi
    public final Object i(final aldl aldlVar, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.h), new crcg(null, this, barn.b(aldlVar.c), (long) aldlVar.f, new fdap() { // from class: crbj
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Uri uri = (Uri) obj;
                uri.getClass();
                evtg evtgVar = aldlVar.d;
                evtgVar.getClass();
                boolean z = false;
                if (!evtgVar.isEmpty()) {
                    Iterator<E> it = evtgVar.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (fdbq.f((String) it.next(), uri.toString())) {
                            z = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }), fcxyVar);
        fcyl fcylVar = fcyl.a;
        if (objA != fcylVar) {
            objA = fctx.a;
        }
        return objA == fcylVar ? objA : fctx.a;
    }

    @Override // defpackage.crbi
    public final void j(MessageIdType messageIdType, ConversationIdType conversationIdType, ezgd ezgdVar, elpn elpnVar) {
        elpnVar.getClass();
        auvw.k(this.i, null, null, new crbo(this, messageIdType, conversationIdType, ezgdVar, null), 3);
    }

    @Override // defpackage.crbi
    public final Object k(Long l, boolean z, ConversationIdType conversationIdType, ezah ezahVar, elpn elpnVar) {
        l.longValue();
        ((crcp) this.g.b()).a(z ? emig.REPLY : emig.CONTINUATION, eyzv.CONVERSATION_VIEW, crbh.b(l.longValue()), conversationIdType, ezahVar, elpnVar);
        return fctx.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.crbi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crcm.l(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, fcxy):java.lang.Object");
    }

    @Override // defpackage.crbi
    public final /* synthetic */ eiju m(SuggestionData suggestionData, elqn elqnVar, eyzv eyzvVar) {
        suggestionData.getClass();
        elqnVar.getClass();
        eyzvVar.getClass();
        return e(suggestionData, elqnVar, eyzvVar, false, -1.0f, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.crbn
            if (r0 == 0) goto L13
            r0 = r7
            crbn r0 = (defpackage.crbn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            crbn r0 = new crbn
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L46
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            fcyh r7 = r5.c
            fcyh r7 = defpackage.eicg.a(r7)
            crbm r2 = new crbm
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)
            if (r7 == r1) goto L78
        L46:
            java.util.List r7 = (java.util.List) r7
            cczv r6 = defpackage.crbf.e
            java.lang.Object r6 = r6.e()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L77
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r7.iterator()
        L5f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r0 = r7.next()
            r1 = r0
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData r1 = (com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData) r1
            boolean r1 = defpackage.bbfa.c(r1)
            if (r1 == 0) goto L5f
            r6.add(r0)
            goto L5f
        L76:
            return r6
        L77:
            return r7
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crcm.n(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, fcxy):java.lang.Object");
    }

    public final fdkf o(MessageCoreData messageCoreData) {
        if (!((Boolean) ((cczi) crbf.ae.get()).e()).booleanValue()) {
            int i = ekgb.d;
            return fdje.a(ekoe.a);
        }
        crif crifVar = (crif) this.b.b();
        fdjx fdjxVar = this.d;
        fcyi fcyiVar = fcyi.a;
        return fdin.b(fdjxVar, eicg.a(fcyiVar), fdjz.a, new crbk(null, crifVar, messageCoreData));
    }

    public final fdkf p(MessageIdType messageIdType) {
        crbb crbbVar = (crbb) this.e.b();
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        return fdin.b(this.d, eicg.a(fcyiVar), fdjzVar, new crbl(null, crbbVar, this, messageIdType));
    }
}
