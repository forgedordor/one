package defpackage;

import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbod {
    public static final cqce a = cqce.g("BugleWorkQueue", "WorkQueueWorkerV2");
    public final cogw b;
    public final cazj c;
    public final cbhl d;
    public final cden e;
    public final fcsu f;
    public final byeq g;
    private final cbaz h;
    private final cbfv i;
    private final fdjx j;

    public cbod(byeq byeqVar, cogw cogwVar, cazj cazjVar, cbaz cbazVar, cbhl cbhlVar, cden cdenVar, cbfv cbfvVar, fcsu fcsuVar, fdjx fdjxVar) {
        byeqVar.getClass();
        cogwVar.getClass();
        cazjVar.getClass();
        cbazVar.getClass();
        cbhlVar.getClass();
        cdenVar.getClass();
        cbfvVar.getClass();
        fcsuVar.getClass();
        fdjxVar.getClass();
        this.g = byeqVar;
        this.b = cogwVar;
        this.c = cazjVar;
        this.h = cbazVar;
        this.d = cbhlVar;
        this.e = cdenVar;
        this.i = cbfvVar;
        this.f = fcsuVar;
        this.j = fdjxVar;
    }

    public static final void c(cqds cqdsVar, cbno cbnoVar) {
        cqdsVar.A("queue", cbnoVar.b);
        cqdsVar.y("items", cbnoVar.c.size());
    }

    public static final void d(final List list) {
        String[] strArr = cbfi.a;
        cbew cbewVar = new cbew();
        cbewVar.f("WorkQueueTikTokWorker#deleteItems");
        cbewVar.c(new Function() { // from class: cbne
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List list2 = list;
                cbfh cbfhVar = (cbfh) obj;
                ArrayList arrayList = new ArrayList(fcva.p(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((cbdg) it.next()).m()));
                }
                cbfhVar.d(arrayList);
                return cbfhVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cbewVar.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[PHI: r2 r13 r14 r15
      0x0066: PHI (r2v5 java.lang.Object) = (r2v4 java.lang.Object), (r2v10 java.lang.Object) binds: [B:18:0x0062, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r13v3 java.lang.String) = (r13v2 java.lang.String), (r13v6 java.lang.String) binds: [B:18:0x0062, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r14v3 cbmm) = (r14v2 cbmm), (r14v4 cbmm) binds: [B:18:0x0062, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r15v5 fduj) = (r15v4 fduj), (r15v8 fduj) binds: [B:18:0x0062, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ed -> B:17:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r13, defpackage.cbmm r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbod.a(java.lang.String, cbmm, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(final java.lang.String r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbod.b(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(final java.lang.String r5, final java.lang.Runnable r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cbnw
            if (r0 == 0) goto L13
            r0 = r7
            cbnw r0 = (defpackage.cbnw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbnw r0 = new cbnw
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L4b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r7)
            byeq r7 = r4.g
            cbnb r2 = new cbnb
            r2.<init>()
            java.lang.String r5 = "WorkQueueTikTokWorker::maybeScheduleNextWorkForQueue"
            eiju r5 = r7.a(r5, r2)
            r5.getClass()
            r0.c = r3
            java.lang.Object r7 = defpackage.fdxs.c(r5, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbod.e(java.lang.String, java.lang.Runnable, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:14:0x002e, B:35:0x008a, B:37:0x0090, B:41:0x00ad, B:44:0x00ce, B:24:0x0051, B:32:0x007b, B:29:0x005b), top: B:58:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:14:0x002e, B:35:0x008a, B:37:0x0090, B:41:0x00ad, B:44:0x00ce, B:24:0x0051, B:32:0x007b, B:29:0x005b), top: B:58:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r10, defpackage.cbmm r11, java.lang.Runnable r12, defpackage.fcxy r13) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbod.f(java.lang.String, cbmm, java.lang.Runnable, fcxy):java.lang.Object");
    }
}
