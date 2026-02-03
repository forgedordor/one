package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Duration;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrt implements wsb {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/ConversationDraftPersistence");
    public final ConversationId b;
    public final fcyh c;
    public final fcyh d;
    public final Set e;
    public final byeq f;

    public wrt(ConversationId conversationId, fcyh fcyhVar, fcyh fcyhVar2, byeq byeqVar, Set set) {
        conversationId.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        byeqVar.getClass();
        set.getClass();
        this.b = conversationId;
        this.c = fcyhVar;
        this.d = fcyhVar2;
        this.f = byeqVar;
        this.e = set;
    }

    public final bpbj a(fdap fdapVar) {
        String[] strArr = bpcy.a;
        bpbm bpbmVar = new bpbm();
        bpbmVar.c(barn.b(this.b.b()));
        fdapVar.invoke(bpbmVar);
        return bpbmVar.a();
    }

    @Override // defpackage.wsb
    public final Object b(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.c), new wri(null, this), fcxyVar);
    }

    @Override // defpackage.wsb
    public final Object c(fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.d), new wrk(null, this), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.wsb
    public final Object d(vvw vvwVar, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.c), new wrm(null, this, vvwVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.bpbj r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof defpackage.wrq
            if (r2 == 0) goto L17
            r2 = r1
            wrq r2 = (defpackage.wrq) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.e = r3
            goto L1c
        L17:
            wrq r2 = new wrq
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.c
            fcyl r3 = defpackage.fcyl.a
            int r4 = r2.e
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r4 = r2.b
            vvk r6 = r2.f
            java.lang.Object r7 = r2.a
            defpackage.fctl.b(r1)
            goto L49
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            defpackage.fctl.b(r1)
            vvk r6 = new vvk
            r6.<init>()
            java.util.Set r1 = r0.e
            java.util.Iterator r4 = r1.iterator()
            r7 = r20
        L49:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r4.next()
            wsl r1 = (defpackage.wsl) r1
            r2.a = r7
            r2.f = r6
            r2.b = r4
            r2.e = r5
            r8 = r7
            bpbj r8 = (defpackage.bpbj) r8
            java.lang.Object r1 = r1.a(r6, r8, r2)
            if (r1 != r3) goto L49
            return r3
        L67:
            r1 = 3
            r6.h = r1
            short r1 = r6.g
            r1 = r1 | 256(0x100, float:3.59E-43)
            short r2 = (short) r1
            r6.g = r2
            java.lang.String r8 = r6.a
            java.util.List r9 = r6.b
            java.lang.String r10 = r6.c
            boolean r11 = r6.d
            com.google.android.apps.messaging.shared.api.messaging.MessageId r12 = r6.e
            boolean r15 = r6.f
            int r1 = ~r1
            vvw r7 = new vvw
            r1 = r1 & 2047(0x7ff, float:2.868E-42)
            r13 = 0
            r14 = 0
            r16 = 3
            r17 = 0
            r18 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrt.e(bpbj, fcxy):java.lang.Object");
    }

    @Override // defpackage.wsb
    public final Object f(fdjx fdjxVar, fdpl fdplVar, Duration duration) {
        return auvw.k(fdjxVar, this.c, null, new wrp(this, duration, fdplVar, null), 2);
    }
}
