package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqm implements wqf, aalp {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/DraftCloser");
    public final ConversationId b;
    public final fdpl c;
    public final ajln d;
    public final wsb e;
    public final wsf f;
    public final wre g;
    private final fdjx h;
    private final wms i;
    private final vts j;
    private final fctc k;

    public wqm(fdjx fdjxVar, ConversationId conversationId, fdpl fdplVar, ajln ajlnVar, wms wmsVar, wsb wsbVar, wsf wsfVar, wre wreVar, vts vtsVar, final fcsu fcsuVar) {
        fdjxVar.getClass();
        conversationId.getClass();
        fdplVar.getClass();
        ajlnVar.getClass();
        wsfVar.getClass();
        wreVar.getClass();
        this.h = fdjxVar;
        this.b = conversationId;
        this.c = fdplVar;
        this.d = ajlnVar;
        this.i = wmsVar;
        this.e = wsbVar;
        this.f = wsfVar;
        this.g = wreVar;
        this.j = vtsVar;
        this.k = fctd.a(new fdae() { // from class: wqg
            @Override // defpackage.fdae
            public final Object invoke() {
                return (Set) fcsuVar.b();
            }
        });
    }

    private final Set c() {
        return (Set) this.k.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.wqf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.wqi
            if (r0 == 0) goto L13
            r0 = r14
            wqi r0 = (defpackage.wqi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wqi r0 = new wqi
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r14)
            goto Lab
        L28:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L30:
            defpackage.fctl.b(r14)
            ekrg r14 = defpackage.wqm.a
            ekrw r2 = r14.h()
            ekrz r4 = defpackage.eksq.a
            java.lang.String r5 = "BugleComposeRow2"
            r2.X(r4, r5)
            ekrd r2 = (defpackage.ekrd) r2
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r6 = r13.b
            ekrz r7 = defpackage.cqnc.t
            r2.X(r7, r6)
            r8 = 66
            java.lang.String r9 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/DraftCloser"
            java.lang.String r10 = "clearForSending"
            java.lang.String r11 = "DraftCloser.kt"
            ekrw r2 = r2.h(r9, r10, r8, r11)
            ekrd r2 = (defpackage.ekrd) r2
            java.util.Set r8 = r13.c()
            java.lang.String r12 = "Draftcloser.clearForSending clearing draft with listeners %s"
            r2.t(r12, r8)
            java.util.Set r2 = r13.c()
            java.util.Iterator r2 = r2.iterator()
        L68:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L78
            java.lang.Object r8 = r2.next()
            wqe r8 = (defpackage.wqe) r8
            r8.a()
            goto L68
        L78:
            ekrw r14 = r14.e()
            r14.X(r4, r5)
            ekrd r14 = (defpackage.ekrd) r14
            r14.X(r7, r6)
            r2 = 76
            ekrw r14 = r14.h(r9, r10, r2, r11)
            ekrd r14 = (defpackage.ekrd) r14
            java.lang.String r2 = "Draftcloser.clearForSending updating mutableDraftState"
            r14.q(r2)
            wre r14 = r13.g
            wqh r2 = new wqh
            r2.<init>()
            r14.c(r2)
            vts r14 = r13.j
            r14.b()
            wsb r14 = r13.e
            r0.c = r3
            java.lang.Object r14 = r14.c(r0)
            if (r14 != r1) goto Lab
            return r1
        Lab:
            fdjx r14 = r13.h
            wqj r0 = new wqj
            r1 = 0
            r0.<init>(r13, r1)
            r2 = 3
            defpackage.auvw.k(r14, r1, r1, r0, r2)
            fctx r14 = defpackage.fctx.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqm.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0111, code lost:
    
        if (defpackage.fdxs.c(r13, r0) == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015b, code lost:
    
        if (defpackage.fdxs.c(r13, r0) != r1) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.vvw r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqm.b(vvw, fcxy):java.lang.Object");
    }

    @Override // defpackage.aalp, java.lang.AutoCloseable
    public final void close() {
        auvw.k(this.h, null, null, new wqk(this, null), 3);
    }
}
