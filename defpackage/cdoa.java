package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdoa extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/kids/handler/ParentAllowlistUpdateHandler");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final cdmo f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final egzh k;
    public final dzuc l;
    public final aptm m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final eygg q;
    private final fcsu r;

    public cdoa(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, cdmo cdmoVar, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, egzh egzhVar, fcsu fcsuVar11, dzuc dzucVar, eygg eyggVar, aptm aptmVar, fcsu fcsuVar12, aptl aptlVar, akbs akbsVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        cdmoVar.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        egzhVar.getClass();
        fcsuVar11.getClass();
        dzucVar.getClass();
        eyggVar.getClass();
        aptmVar.getClass();
        fcsuVar12.getClass();
        aptlVar.getClass();
        akbsVar.getClass();
        this.n = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.e = fcsuVar5;
        this.f = cdmoVar;
        this.g = fcsuVar6;
        this.h = fcsuVar7;
        this.i = fcsuVar8;
        this.o = fcsuVar9;
        this.j = fcsuVar10;
        this.k = egzhVar;
        this.p = fcsuVar11;
        this.l = dzucVar;
        this.q = eyggVar;
        this.m = aptmVar;
        this.r = fcsuVar12;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        fcsu fcsuVar = this.o;
        caxz caxzVarL = caya.l();
        Object objB = fcsuVar.b();
        objB.getClass();
        caxzVarL.g(((Number) objB).longValue());
        caxzVarL.b(caze.WORKMANAGER_ONLY);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("ParentAllowlistUpdateHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = cdmq.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        cdmq cdmqVar = (cdmq) evuhVar;
        cdmqVar.getClass();
        Object objB = this.n.b();
        objB.getClass();
        return auvw.c((fdjx) objB, fcyi.a, fdjz.a, new cdnv(this, cdmqVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.util.Map r7, java.util.Set r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.cdnm
            if (r0 == 0) goto L13
            r0 = r9
            cdnm r0 = (defpackage.cdnm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdnm r0 = new cdnm
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r9)
            goto L7b
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.fctl.b(r9)
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r2 = 10
            int r2 = defpackage.fcva.p(r8, r2)
            int r2 = defpackage.fcwa.a(r2)
            r4 = 16
            int r2 = defpackage.fddu.f(r2, r4)
            r9.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
        L4b:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r8.next()
            r4 = r2
            alqm r4 = (defpackage.alqm) r4
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            java.lang.Object r4 = j$.util.Map.EL.getOrDefault(r7, r4, r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.booleanValue()
            r9.put(r2, r4)
            goto L4b
        L6a:
            fcsu r7 = r6.r
            java.lang.Object r7 = r7.b()
            cdml r7 = (defpackage.cdml) r7
            r0.c = r3
            java.lang.Object r9 = r7.a(r9, r0)
            if (r9 != r1) goto L7b
            return r1
        L7b:
            akbk r9 = (defpackage.akbk) r9
            akbj r7 = new akbj
            r7.<init>(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdoa.k(java.util.Map, java.util.Set, fcxy):java.lang.Object");
    }

    public final Object l(fcxy fcxyVar) {
        Object objB = this.c.b();
        objB.getClass();
        Object objA = eicj.a((fcyh) objB, new cdnr(this, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r10.a() != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        r9 = r2;
        r2 = r5;
        r5 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.cdnl r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.cdns
            if (r0 == 0) goto L13
            r0 = r10
            cdns r0 = (defpackage.cdns) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            cdns r0 = new cdns
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.e
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.c
            java.lang.Object r2 = r0.b
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r10)
            goto L5b
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.d
            java.lang.Object r2 = r0.c
            java.lang.Object r5 = r0.b
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r10)
            goto L84
        L44:
            defpackage.fctl.b(r10)
            java.util.Set r5 = r9.a
            java.util.Map r9 = r9.b
            java.util.Set r2 = r9.keySet()
            eygg r9 = r8.q
            java.lang.Object r9 = r9.b()
            java.util.Set r9 = (java.util.Set) r9
            java.util.Iterator r9 = r9.iterator()
        L5b:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto La5
            java.lang.Object r10 = r9.next()
            cdoc r10 = (defpackage.cdoc) r10
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L80
            defpackage.fcva.ao(r5)
            r0.a = r5
            r0.b = r2
            r0.c = r9
            r0.d = r10
            r0.g = r4
            java.lang.Object r6 = r10.a()
            if (r6 == r1) goto La0
        L80:
            r6 = r5
            r5 = r2
            r2 = r9
            r9 = r10
        L84:
            boolean r10 = r5.isEmpty()
            if (r10 != 0) goto La1
            java.util.List r10 = defpackage.fcva.ao(r5)
            r0.a = r6
            r0.b = r5
            r0.c = r2
            r7 = 0
            r0.d = r7
            r0.g = r3
            java.lang.Object r9 = r9.b(r10)
            if (r9 == r1) goto La0
            goto La1
        La0:
            return r1
        La1:
            r9 = r2
            r2 = r5
            r5 = r6
            goto L5b
        La5:
            fctx r9 = defpackage.fctx.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdoa.m(cdnl, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008e -> B:17:0x0055). Please report as a decompilation issue!!! */
    @defpackage.fcsv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.util.Set r8, java.util.Set r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.cdnt
            if (r0 == 0) goto L13
            r0 = r10
            cdnt r0 = (defpackage.cdnt) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            cdnt r0 = new cdnt
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.e
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r8 = r0.c
            java.lang.Object r9 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r10)
            goto L55
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.d
            java.lang.Object r9 = r0.c
            java.lang.Object r2 = r0.b
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r10)
            goto L79
        L44:
            defpackage.fctl.b(r10)
            eygg r10 = r7.q
            java.lang.Object r10 = r10.b()
            java.util.Set r10 = (java.util.Set) r10
            java.util.Iterator r10 = r10.iterator()
            r2 = r8
            r8 = r10
        L55:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L93
            java.lang.Object r10 = r8.next()
            cdoc r10 = (defpackage.cdoc) r10
            defpackage.fcva.ao(r9)
            r0.a = r2
            r0.b = r9
            r0.c = r8
            r0.d = r10
            r0.g = r4
            java.lang.Object r5 = r10.a()
            if (r5 != r1) goto L75
            goto L92
        L75:
            r5 = r2
            r2 = r9
            r9 = r8
            r8 = r10
        L79:
            java.util.List r10 = defpackage.fcva.ao(r5)
            r0.a = r5
            r0.b = r2
            r0.c = r9
            r6 = 0
            r0.d = r6
            r0.g = r3
            java.lang.Object r8 = r8.b(r10)
            if (r8 == r1) goto L92
            r8 = r9
            r9 = r2
            r2 = r5
            goto L55
        L92:
            return r1
        L93:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdoa.n(java.util.Set, java.util.Set, fcxy):java.lang.Object");
    }

    public final Object o(cdnl cdnlVar, fcxy fcxyVar) {
        Object objB = this.c.b();
        objB.getClass();
        Object objA = eicj.a((fcyh) objB, new cdnu(this, cdnlVar, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public final Object p(cdnl cdnlVar, fcxy fcxyVar) {
        Object objB = this.c.b();
        objB.getClass();
        Object objA = eicj.a((fcyh) objB, new cdnz(this, cdnlVar, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public final void q(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ConversationIdType conversationIdType = (ConversationIdType) it.next();
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleTrustedContacts");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(cqnc.S, "ParentAllowlistUpdateHandler");
            ekrdVar.X(cqnc.s, conversationIdType);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/kids/handler/ParentAllowlistUpdateHandler", "cancelDisallowedConversationsNotification", 654, "ParentAllowlistUpdateHandler.kt")).t("Conversation is disallowed. Canceling IM notification.", conversationIdType.a());
            ((cgpi) this.p.b()).a(conversationIdType);
        }
    }

    public final void r(dzub dzubVar, dzfh dzfhVar, dzua dzuaVar) {
        this.l.f(dzubVar, dzfhVar, null, dzuaVar);
    }
}
