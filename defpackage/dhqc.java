package defpackage;

import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;
import com.google.android.libraries.abuse.hades.moirai.download.PersephoneSchedulerWorker;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhqc implements dhpv {
    private final dhri a;
    private final dhpl b;
    private final diep c;
    private final dhxa d;
    private final fddf e;

    public dhqc(dhri dhriVar, dhpl dhplVar, diep diepVar, dhxa dhxaVar) {
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

    static /* synthetic */ qav g(dhnv dhnvVar, dhvb dhvbVar, pzs pzsVar, boolean z, long j, int i) {
        boolean z2 = z & ((i & 8) == 0);
        qau qauVar = new qau(z2 ? PersephoneDownloadWorker.class : PersephoneSchedulerWorker.class);
        qauVar.j(pzsVar);
        if (!z2) {
            qauVar.d(dhpw.c("moirai_persephone_scheduled_sync", dhnvVar));
        }
        pzh pzhVar = new pzh();
        pzhVar.a = dhvbVar.d;
        int iA = dhvh.a(dhvbVar.c);
        int i2 = iA != 0 ? iA : 1;
        if ((i & 16) != 0) {
            j = 0;
        }
        pzhVar.c(dhpw.d(i2));
        pzhVar.b = dhvbVar.e;
        qauVar.g(pzhVar.a());
        qauVar.h(j, TimeUnit.MILLISECONDS);
        qauVar.e(TimeUnit.DAYS);
        return (qav) qauVar.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r4.a(r2, r6, r7, true, r9) == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // defpackage.dhpv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dhnv r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof defpackage.dhpz
            if (r3 == 0) goto L19
            r3 = r2
            dhpz r3 = (defpackage.dhpz) r3
            int r4 = r3.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.c = r4
            goto L1e
        L19:
            dhpz r3 = new dhpz
            r3.<init>(r0, r2)
        L1e:
            r9 = r3
            java.lang.Object r2 = r9.a
            fcyl r3 = defpackage.fcyl.a
            int r4 = r9.c
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3f
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            defpackage.fctl.b(r2)
            goto L84
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            dhnv r1 = r9.d
            defpackage.fctl.b(r2)
            goto L4c
        L3f:
            defpackage.fctl.b(r2)
            r9.d = r1
            r9.c = r6
            java.lang.Object r2 = r0.f(r1, r9)
            if (r2 == r3) goto L87
        L4c:
            r10 = r1
            dhpl r1 = r0.b
            pzs r12 = defpackage.dhpw.a(r10)
            java.lang.String r2 = r10.b
            dhvj r1 = r1.b(r2)
            dhri r4 = r0.a
            java.lang.String r2 = "moirai_persephone_sync"
            java.lang.String r2 = defpackage.dhpw.c(r2, r10)
            dhvb r1 = r1.c
            if (r1 != 0) goto L67
            dhvb r1 = defpackage.dhvb.a
        L67:
            r11 = r1
            r11.getClass()
            r14 = 0
            r16 = 16
            r13 = 1
            qav r6 = g(r10, r11, r12, r13, r14, r16)
            pzz r7 = defpackage.pzz.a
            r1 = 0
            r9.d = r1
            r9.c = r5
            r8 = 1
            r5 = r2
            java.lang.Object r1 = r4.a(r5, r6, r7, r8, r9)
            if (r1 != r3) goto L84
            goto L87
        L84:
            fctx r1 = defpackage.fctx.a
            return r1
        L87:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhqc.a(dhnv, fcxy):java.lang.Object");
    }

    @Override // defpackage.dhpv
    public final Object b(dhnv dhnvVar, fcxy fcxyVar) {
        qau qauVar = new qau(PersephoneDownloadWorker.class);
        qauVar.j(dhpw.a(dhnvVar));
        qauVar.e(TimeUnit.DAYS);
        Object objA = this.a.a(dhpw.c("moirai_persephone_sync", dhnvVar), (qav) qauVar.b(), pzz.b, false, fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.dhpv
    public final Object c(dhnv dhnvVar, fcxy fcxyVar) throws Throwable {
        Object objE = e(dhnvVar, fcxyVar);
        return objE == fcyl.a ? objE : fctx.a;
    }

    @Override // defpackage.dhpv
    public final Object d(dhnv dhnvVar, fcxy fcxyVar) throws Throwable {
        Object objF = f(dhnvVar, fcxyVar);
        return objF == fcyl.a ? objF : fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (f(r1, r3) != r4) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0129, code lost:
    
        if (((defpackage.dhpq) r2).a.e(r1) == r4) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c3 -> B:17:0x0053). Please report as a decompilation issue!!! */
    @Override // defpackage.dhpv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.dhnv r24, defpackage.fcxy r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhqc.e(dhnv, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (((defpackage.dhpq) r9).a.a(r8) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.dhnv r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dhqa
            if (r0 == 0) goto L13
            r0 = r9
            dhqa r0 = (defpackage.dhqa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dhqa r0 = new dhqa
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            java.lang.String r6 = "moirai_persephone_scheduled_sync"
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            defpackage.fctl.b(r9)
            goto L78
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            dhnv r8 = r0.d
            defpackage.fctl.b(r9)
            goto L62
        L3d:
            dhnv r8 = r0.d
            defpackage.fctl.b(r9)
            goto L52
        L43:
            defpackage.fctl.b(r9)
            dhri r9 = r7.a
            r0.d = r8
            r0.c = r5
            java.lang.Object r9 = r9.b(r6)
            if (r9 == r1) goto L7b
        L52:
            dhri r9 = r7.a
            java.lang.String r2 = defpackage.dhpw.c(r6, r8)
            r0.d = r8
            r0.c = r4
            java.lang.Object r9 = r9.b(r2)
            if (r9 == r1) goto L7b
        L62:
            dhri r9 = r7.a
            java.lang.String r8 = defpackage.dhpw.c(r6, r8)
            r2 = 0
            r0.d = r2
            r0.c = r3
            dhpq r9 = (defpackage.dhpq) r9
            qbr r9 = r9.a
            qba r8 = r9.a(r8)
            if (r8 != r1) goto L78
            goto L7b
        L78:
            fctx r8 = defpackage.fctx.a
            return r8
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhqc.f(dhnv, fcxy):java.lang.Object");
    }
}
