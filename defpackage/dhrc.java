package defpackage;

import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhrc implements dhpv {
    private final dhri a;
    private final dhpl b;
    private final diep c;
    private final dhxa d;
    private final fddf e;

    public dhrc(dhri dhriVar, dhpl dhplVar, diep diepVar, dhxa dhxaVar) {
        diepVar.getClass();
        dhxaVar.getClass();
        fdde fddeVar = fddf.a;
        fddeVar.getClass();
        this.a = dhriVar;
        this.b = dhplVar;
        this.c = diepVar;
        this.d = dhxaVar;
        this.e = fddeVar;
    }

    private static final qav h(dhvb dhvbVar, pzs pzsVar, long j) {
        qau qauVar = new qau(PersephoneDownloadWorker.class);
        qauVar.j(pzsVar);
        pzh pzhVar = new pzh();
        pzhVar.a = dhvbVar.d;
        int iA = dhvh.a(dhvbVar.c);
        if (iA == 0) {
            iA = 1;
        }
        pzhVar.c(dhpw.d(iA));
        pzhVar.b = dhvbVar.e;
        qauVar.g(pzhVar.a());
        qauVar.h(j, TimeUnit.MILLISECONDS);
        qauVar.e(TimeUnit.DAYS);
        return (qav) qauVar.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (r1.a(r8, r3, r4, true, r6) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dhpv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dhnv r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dhqy
            if (r0 == 0) goto L13
            r0 = r9
            dhqy r0 = (defpackage.dhqy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dhqy r0 = new dhqy
            r0.<init>(r7, r9)
        L18:
            r6 = r0
            java.lang.Object r9 = r6.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            defpackage.fctl.b(r9)
            goto L79
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            dhnv r8 = r6.d
            defpackage.fctl.b(r9)
            goto L46
        L39:
            defpackage.fctl.b(r9)
            r6.d = r8
            r6.c = r3
            java.lang.Object r9 = r7.f(r8, r6)
            if (r9 == r0) goto L7c
        L46:
            dhpl r9 = r7.b
            java.lang.String r1 = r8.b
            dhvj r9 = r9.b(r1)
            dhri r1 = r7.a
            pzs r3 = defpackage.dhpw.a(r8)
            java.lang.String r4 = "moirai_persephone_sync"
            java.lang.String r8 = defpackage.dhpw.c(r4, r8)
            dhvb r9 = r9.c
            if (r9 != 0) goto L60
            dhvb r9 = defpackage.dhvb.a
        L60:
            r9.getClass()
            r4 = 0
            qav r3 = h(r9, r3, r4)
            pzz r4 = defpackage.pzz.a
            r9 = 0
            r6.d = r9
            r6.c = r2
            r5 = 1
            r2 = r8
            java.lang.Object r8 = r1.a(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L79
            goto L7c
        L79:
            fctx r8 = defpackage.fctx.a
            return r8
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhrc.a(dhnv, fcxy):java.lang.Object");
    }

    @Override // defpackage.dhpv
    public final Object b(dhnv dhnvVar, fcxy fcxyVar) {
        return fctx.a;
    }

    @Override // defpackage.dhpv
    public final Object c(dhnv dhnvVar, fcxy fcxyVar) throws Throwable {
        Object objG = g(dhnvVar, fcxyVar);
        return objG == fcyl.a ? objG : fctx.a;
    }

    @Override // defpackage.dhpv
    public final Object d(dhnv dhnvVar, fcxy fcxyVar) {
        return fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (g(r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dhpv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.dhnv r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dhrb
            if (r0 == 0) goto L13
            r0 = r7
            dhrb r0 = (defpackage.dhrb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dhrb r0 = new dhrb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L51
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            dhnv r6 = r0.d
            defpackage.fctl.b(r7)
            goto L45
        L38:
            defpackage.fctl.b(r7)
            r0.d = r6
            r0.c = r4
            java.lang.Object r7 = r5.f(r6, r0)
            if (r7 == r1) goto L54
        L45:
            r7 = 0
            r0.d = r7
            r0.c = r3
            java.lang.Object r6 = r5.g(r6, r0)
            if (r6 != r1) goto L51
            goto L54
        L51:
            fctx r6 = defpackage.fctx.a
            return r6
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhrc.e(dhnv, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r8.b(r7) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.dhnv r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dhqz
            if (r0 == 0) goto L13
            r0 = r8
            dhqz r0 = (defpackage.dhqz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dhqz r0 = new dhqz
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "moirai_persephone_scheduled_sync"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            defpackage.fctl.b(r8)
            goto L5b
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            dhnv r7 = r0.d
            defpackage.fctl.b(r8)
            goto L49
        L3a:
            defpackage.fctl.b(r8)
            dhri r8 = r6.a
            r0.d = r7
            r0.c = r5
            java.lang.Object r8 = r8.b(r3)
            if (r8 == r1) goto L5e
        L49:
            dhri r8 = r6.a
            java.lang.String r7 = defpackage.dhpw.c(r3, r7)
            r2 = 0
            r0.d = r2
            r0.c = r4
            java.lang.Object r7 = r8.b(r7)
            if (r7 != r1) goto L5b
            goto L5e
        L5b:
            fctx r7 = defpackage.fctx.a
            return r7
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhrc.f(dhnv, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        if (r1.a(r12, r3, r4, false, r6) != r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.dhnv r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.dhra
            if (r0 == 0) goto L13
            r0 = r13
            dhra r0 = (defpackage.dhra) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dhra r0 = new dhra
            r0.<init>(r11, r13)
        L18:
            r6 = r0
            java.lang.Object r13 = r6.b
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L44
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            defpackage.fctl.b(r13)
            goto Ld3
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            long r3 = r6.a
            dhvn r12 = r6.g
            pzs r1 = r6.f
            dhnv r5 = r6.e
            defpackage.fctl.b(r13)
            r7 = r3
            r3 = r13
            r13 = r12
            r12 = r5
            goto L81
        L44:
            defpackage.fctl.b(r13)
            dhpl r13 = r11.b
            java.lang.String r1 = r12.b
            dhvj r13 = r13.b(r1)
            evtg r13 = r13.d
            r13.getClass()
            pzs r1 = defpackage.dhpw.a(r12)
            r4 = 0
            java.lang.Object r13 = defpackage.fcva.Q(r13, r4)
            dhvn r13 = (defpackage.dhvn) r13
            if (r13 == 0) goto Ld3
            evrj r4 = r13.c
            if (r4 != 0) goto L67
            evrj r4 = defpackage.evrj.a
        L67:
            dhxa r5 = r11.d
            long r7 = defpackage.evwy.b(r4)
            dhwz r4 = r5.a(r12)
            r6.e = r12
            r6.f = r1
            r6.g = r13
            r6.a = r7
            r6.d = r3
            java.lang.Object r3 = r4.b(r6)
            if (r3 == r0) goto Ld2
        L81:
            r3.getClass()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            diep r5 = r11.c
            j$.time.Instant r5 = r5.f()
            long r9 = r5.toEpochMilli()
            long r9 = r9 - r3
            long r7 = r7 - r9
            r3 = 0
            long r7 = java.lang.Math.max(r3, r7)
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 <= 0) goto La9
            fddf r3 = r11.e
            long r4 = defpackage.dhpw.a
            long r3 = r3.hw(r4)
            long r3 = r3 + r7
        La9:
            r5 = r1
            dhri r1 = r11.a
            java.lang.String r7 = "moirai_persephone_scheduled_sync"
            java.lang.String r12 = defpackage.dhpw.c(r7, r12)
            dhvb r13 = r13.d
            if (r13 != 0) goto Lb8
            dhvb r13 = defpackage.dhvb.a
        Lb8:
            r13.getClass()
            qav r3 = h(r13, r5, r3)
            pzz r4 = defpackage.pzz.d
            r13 = 0
            r6.e = r13
            r6.f = r13
            r6.g = r13
            r6.d = r2
            r5 = 0
            r2 = r12
            java.lang.Object r12 = r1.a(r2, r3, r4, r5, r6)
            if (r12 != r0) goto Ld3
        Ld2:
            return r0
        Ld3:
            fctx r12 = defpackage.fctx.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhrc.g(dhnv, fcxy):java.lang.Object");
    }
}
