package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yss implements ysa {
    private static final ekrg f = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/content/MessageBubbleContentUiAdapterImpl");
    private final ytd A;
    private final cqmb B;
    private final aqvj C;
    private final arvu D;
    public final Context a;
    public final fdjx b;
    public final fdjx c;
    public final ajmh d;
    public final aqkb e;
    private final you g;
    private final yns h;
    private final yvq i;
    private final yxf j;
    private final zgh k;
    private final yol l;
    private final zih m;
    private final zdm n;
    private final yrw o;
    private final zds p;
    private final eygg q;
    private final zce r;
    private final fcsu s;
    private final fcsu t;
    private final ytj u;
    private final zcj v;
    private final apwf w;
    private final apql x;
    private final cliy y;
    private final fcsu z;

    public yss(Context context, fdjx fdjxVar, fdjx fdjxVar2, ajmh ajmhVar, you youVar, yns ynsVar, yvq yvqVar, yxf yxfVar, zgh zghVar, yol yolVar, zih zihVar, zdm zdmVar, yrw yrwVar, zds zdsVar, eygg eyggVar, zce zceVar, fcsu fcsuVar, fcsu fcsuVar2, ytj ytjVar, zcj zcjVar, fcsu fcsuVar3, apwf apwfVar, apql apqlVar, cliy cliyVar, fcsu fcsuVar4, ytd ytdVar, cqmb cqmbVar, aqvj aqvjVar, aqkb aqkbVar, arvu arvuVar, aqvp aqvpVar) {
        context.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        ajmhVar.getClass();
        youVar.getClass();
        yvqVar.getClass();
        zihVar.getClass();
        eyggVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        apqlVar.getClass();
        cliyVar.getClass();
        fcsuVar4.getClass();
        cqmbVar.getClass();
        arvuVar.getClass();
        aqvpVar.getClass();
        this.a = context;
        this.b = fdjxVar;
        this.c = fdjxVar2;
        this.d = ajmhVar;
        this.g = youVar;
        this.h = ynsVar;
        this.i = yvqVar;
        this.j = yxfVar;
        this.k = zghVar;
        this.l = yolVar;
        this.m = zihVar;
        this.n = zdmVar;
        this.o = yrwVar;
        this.p = zdsVar;
        this.q = eyggVar;
        this.r = zceVar;
        this.s = fcsuVar;
        this.t = fcsuVar2;
        this.u = ytjVar;
        this.v = zcjVar;
        this.w = apwfVar;
        this.x = apqlVar;
        this.y = cliyVar;
        this.z = fcsuVar4;
        this.A = ytdVar;
        this.B = cqmbVar;
        this.C = aqvjVar;
        this.e = aqkbVar;
        this.D = arvuVar;
    }

    private static final boolean e(amwm amwmVar) {
        String strB = amwmVar.b();
        strB.getClass();
        return fdgn.t(strB, "image");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // defpackage.ysa
    public final defpackage.auyl a(defpackage.fdjx r43, defpackage.yrz r44) {
        /*
            Method dump skipped, instructions count: 2241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yss.a(fdjx, yrz):auyl");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        if (defpackage.fdxs.c(r10, r0) != r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ajlt r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ysp
            if (r0 == 0) goto L13
            r0 = r10
            ysp r0 = (defpackage.ysp) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ysp r0 = new ysp
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r9 = r0.a
            defpackage.fctl.b(r10)
            goto La7
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r9 = r0.a
            defpackage.fctl.b(r10)
            goto L6f
        L3b:
            defpackage.fctl.b(r10)
            int r10 = r9.C()
            if (r10 != r4) goto L45
            goto Lb3
        L45:
            eygg r10 = r8.q
            java.lang.Object r10 = r10.b()
            aiul r10 = (defpackage.aiul) r10
            ecjh r10 = r10.a
            com.google.common.util.concurrent.ListenableFuture r10 = r10.a()
            aitp r2 = new aitp
            r2.<init>()
            eoqg r5 = defpackage.eoqg.a
            com.google.common.util.concurrent.ListenableFuture r10 = defpackage.eika.j(r10, r2, r5)
            eiju r10 = defpackage.eiju.g(r10)
            r10.getClass()
            r0.a = r9
            r0.d = r4
            java.lang.Object r10 = defpackage.fdxs.c(r10, r0)
            if (r10 == r1) goto Lb6
        L6f:
            java.lang.Long r10 = (java.lang.Long) r10
            long r4 = defpackage.ykm.a(r9)
            long r6 = r10.longValue()
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 >= 0) goto Lb3
            eygg r10 = r8.q
            java.lang.Object r10 = r10.b()
            aiul r10 = (defpackage.aiul) r10
            ecjh r10 = r10.a
            aiuc r2 = new aiuc
            r2.<init>()
            ejvr r2 = defpackage.eiid.a(r2)
            eoqg r4 = defpackage.eoqg.a
            com.google.common.util.concurrent.ListenableFuture r10 = r10.b(r2, r4)
            eiju r10 = defpackage.eiju.g(r10)
            r10.getClass()
            r0.a = r9
            r0.d = r3
            java.lang.Object r10 = defpackage.fdxs.c(r10, r0)
            if (r10 == r1) goto Lb6
        La7:
            boolean r9 = defpackage.ykm.r(r9)
            if (r9 == 0) goto Lb0
            cwmw r9 = defpackage.cwmw.c
            return r9
        Lb0:
            cwmw r9 = defpackage.cwmw.b
            return r9
        Lb3:
            cwmw r9 = defpackage.cwmw.a
            return r9
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yss.b(ajlt, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ajlt r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ysr
            if (r0 == 0) goto L13
            r0 = r6
            ysr r0 = (defpackage.ysr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ysr r0 = new ysr
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            r0.c = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 == r1) goto L72
        L3a:
            cwmw r6 = (defpackage.cwmw) r6
            cwmw r5 = defpackage.cwmw.b
            if (r6 != r5) goto L56
            fcsu r5 = r4.s
            java.lang.Object r5 = r5.b()
            cwmv r5 = (defpackage.cwmv) r5
            fcsu r5 = r5.a
            java.lang.Object r5 = r5.b()
            ains r5 = (defpackage.ains) r5
            java.lang.String r6 = "Bugle.MessageAnimatedEmojis.Received.Count"
            r5.c(r6)
            goto L6f
        L56:
            cwmw r5 = defpackage.cwmw.c
            if (r6 != r5) goto L6f
            fcsu r5 = r4.s
            java.lang.Object r5 = r5.b()
            cwmv r5 = (defpackage.cwmv) r5
            fcsu r5 = r5.a
            java.lang.Object r5 = r5.b()
            ains r5 = (defpackage.ains) r5
            java.lang.String r6 = "Bugle.MessageAnimatedEmojis.Sent.Count"
            r5.c(r6)
        L6f:
            fctx r5 = defpackage.fctx.a
            return r5
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yss.c(ajlt, fcxy):java.lang.Object");
    }

    public final void d(MessageId messageId) {
        auvw.k(this.b, null, null, new ysq(this, messageId, null), 3);
    }
}
