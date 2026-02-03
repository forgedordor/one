package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akgi implements akfu {
    public final fdjx a;
    public final bbmo b;
    public final BugleConversationId c;
    public final anpj d;
    public cquc e;
    public final cqtq f;
    private final fdjx g;
    private final cqtp h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;

    public akgi(fdjx fdjxVar, fdjx fdjxVar2, cqtp cqtpVar, bbmo bbmoVar, fcsu fcsuVar, fcsu fcsuVar2, BugleConversationId bugleConversationId, anpj anpjVar, fcsu fcsuVar3) {
        this.g = fdjxVar;
        this.a = fdjxVar2;
        this.h = cqtpVar;
        this.b = bbmoVar;
        this.i = fcsuVar;
        this.j = fcsuVar2;
        this.c = bugleConversationId;
        this.d = anpjVar;
        this.k = fcsuVar3;
        this.f = cqtpVar.a(new akgc(this));
    }

    public static final bpov j(final ConversationIdType conversationIdType) {
        String[] strArr = bpoz.a;
        bpow bpowVar = new bpow(bpoz.a);
        bpowVar.A("loadPenpalState");
        bpowVar.k(new bpox((bpoy) new Function() { // from class: akfv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpoy bpoyVar = (bpoy) obj;
                bpoyVar.ap(new dqpj("gemini.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
                return bpoyVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bpoy())));
        return bpowVar.b();
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.f.a(new cqtk() { // from class: akfx
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "PenpalObservableSupplier::register", "PenpalObservableSupplier::callback", "PenpalObservableSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ eiju b() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final eiju d() {
        return auvw.c(this.g, fcyi.a, fdjz.a, new akgg(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (r8 != r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8, defpackage.aoer r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.akfz
            if (r0 == 0) goto L13
            r0 = r10
            akfz r0 = (defpackage.akfz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            akfz r0 = new akfz
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            defpackage.fctl.b(r10)
            fctk r10 = (defpackage.fctk) r10
            java.lang.Object r8 = r10.a
            goto L6e
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.a
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r9 = r0.e
            defpackage.fctl.b(r10)
            goto L60
        L3f:
            defpackage.fctl.b(r10)
            fcsu r10 = r7.i
            java.lang.Object r10 = r10.b()
            j$.util.Optional r10 = (j$.util.Optional) r10
            java.lang.Object r10 = r10.get()
            cgst r10 = (defpackage.cgst) r10
            r0.e = r8
            r0.a = r10
            r0.d = r4
            java.lang.Object r9 = r7.f(r9, r0)
            if (r9 == r1) goto L74
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L60:
            axcm r10 = (defpackage.axcm) r10
            r0.e = r5
            r0.a = r5
            r0.d = r3
            java.lang.Object r8 = r8.b(r10, r9, r0)
            if (r8 == r1) goto L74
        L6e:
            boolean r9 = r8 instanceof defpackage.fctj
            if (r9 == 0) goto L73
            return r5
        L73:
            return r8
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akgi.e(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, aoer, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.aoer r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.akga
            if (r0 == 0) goto L13
            r0 = r6
            akga r0 = (defpackage.akga) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akga r0 = new akga
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L5f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            j$.util.Optional r5 = r5.o()
            java.lang.Object r5 = r5.get()
            alqm r5 = (defpackage.alqm) r5
            java.lang.String r5 = r5.o()
            fcsu r6 = r4.j
            java.lang.Object r6 = r6.b()
            asqx r6 = (defpackage.asqx) r6
            aubq r5 = r6.c(r5)
            fcsu r6 = r4.k
            java.lang.Object r6 = r6.b()
            awxo r6 = (defpackage.awxo) r6
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 == r1) goto L70
        L5f:
            awxn r6 = (defpackage.awxn) r6
            if (r6 == 0) goto L68
            axcm r5 = r6.b()
            return r5
        L68:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "My identity not found while retrieving MyIdentityToken"
            r5.<init>(r6)
            throw r5
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akgi.f(aoer, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.akgd
            if (r0 == 0) goto L13
            r0 = r5
            akgd r0 = (defpackage.akgd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akgd r0 = new akgd
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            anpj r5 = r4.d
            eiju r5 = r5.b()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 == r1) goto L7a
        L40:
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L55
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L55
        L53:
            r3 = r1
            goto L75
        L55:
            java.util.Iterator r5 = r5.iterator()
        L59:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r5.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r0 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r0
            alqm r0 = r0.g()
            java.lang.String r0 = r0.o()
            java.lang.String r2 = "+18339913448"
            boolean r0 = defpackage.fdbq.f(r0, r2)
            if (r0 == 0) goto L59
        L75:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akgi.g(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5, types: [aoer] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r17v0, types: [akgi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r18, defpackage.aoer r19, int r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akgi.h(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, aoer, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.bpov r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.akgh
            if (r0 == 0) goto L13
            r0 = r6
            akgh r0 = (defpackage.akgh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akgh r0 = new akgh
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            eiju r5 = r5.x()
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 == r1) goto L5c
        L41:
            r6.getClass()
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = defpackage.fcva.Y(r6)
            bpod r5 = (defpackage.bpod) r5
            if (r5 == 0) goto L56
            java.lang.String r6 = "desired_gemini_state"
            r5.aA(r3, r6)
            boolean r5 = r5.b
            goto L57
        L56:
            r5 = 0
        L57:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akgi.i(bpov, fcxy):java.lang.Object");
    }
}
