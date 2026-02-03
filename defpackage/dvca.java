package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvca implements dvbf {
    public static final dvbr a = new dvbr();
    public final afp b;
    public final dvcp c;
    private final fdjx d;
    private final feav e = new feaz();
    private final Set f = new css((byte[]) null);

    public dvca(afp afpVar, afp afpVar2, fdjx fdjxVar) {
        this.b = afpVar;
        this.d = fdjxVar;
        this.c = new dvcp(afpVar2, afpVar, fdjxVar);
    }

    private final void h(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            afv afvVar = (afv) it.next();
            if (this.f.contains(afvVar.m()) && afvVar.g("g3attrinfo") == null) {
                throw new IllegalArgumentException("Document is missing the 'g3attrinfo' document property.");
            }
        }
    }

    @Override // defpackage.dvbf
    public final ListenableFuture a(agh aghVar) {
        aghVar.getClass();
        return fdxs.b(this.d, fcyi.a, fdjz.a, new dvbw(this, aghVar, null));
    }

    @Override // defpackage.dvbf
    public final ListenableFuture b(agj agjVar) {
        agjVar.getClass();
        return this.b.d(agjVar);
    }

    @Override // defpackage.dvbf
    public final ListenableFuture c(dvbn dvbnVar) {
        return fdxs.b(this.d, fcyi.a, fdjz.a, new dvby(this, dvbnVar, null));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.dvbf
    public final ListenableFuture d(agu aguVar) {
        return this.b.g(aguVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.agh r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dvbv
            if (r0 == 0) goto L13
            r0 = r8
            dvbv r0 = (defpackage.dvbv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dvbv r0 = new dvbv
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            agh r7 = r0.d
            defpackage.fctl.b(r8)
            goto L7d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            feaz r7 = r0.e
            agh r2 = r0.d
            defpackage.fctl.b(r8)
            r8 = r7
            r7 = r2
            goto L53
        L3f:
            defpackage.fctl.b(r8)
            feav r8 = r6.e
            r0.d = r7
            r2 = r8
            feaz r2 = (defpackage.feaz) r2
            r0.e = r2
            r0.c = r5
            java.lang.Object r2 = r8.b(r0)
            if (r2 == r1) goto L99
        L53:
            java.util.List r2 = r7.a()     // Catch: java.lang.Throwable -> L94
            r2.getClass()     // Catch: java.lang.Throwable -> L94
            r6.h(r2)     // Catch: java.lang.Throwable -> L94
            java.util.List r2 = r7.b()     // Catch: java.lang.Throwable -> L94
            r2.getClass()     // Catch: java.lang.Throwable -> L94
            r6.h(r2)     // Catch: java.lang.Throwable -> L94
            r8.d()
            afp r8 = r6.b
            com.google.common.util.concurrent.ListenableFuture r8 = r8.c(r7)
            r0.d = r7
            r0.e = r3
            r0.c = r4
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)
            if (r8 != r1) goto L7d
            goto L99
        L7d:
            dvcp r0 = r6.c
            aet r8 = (defpackage.aet) r8
            r8.getClass()
            r7.getClass()
            dvcg r1 = new dvcg
            r1.<init>(r0, r7, r8, r3)
            fdjx r7 = r0.b
            eizx r0 = r0.c
            defpackage.ejaa.a(r7, r0, r1)
            return r8
        L94:
            r7 = move-exception
            r8.d()
            throw r7
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvca.e(agh, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.dvbn r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dvbx
            if (r0 == 0) goto L13
            r0 = r8
            dvbx r0 = (defpackage.dvbx) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dvbx r0 = new dvbx
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.a
            agz r7 = (defpackage.agz) r7
            dvbn r0 = r0.e
            defpackage.fctl.b(r8)
            goto L74
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.a
            agw r7 = (defpackage.agw) r7
            dvbn r2 = r0.e
            defpackage.fctl.b(r8)
            goto L5d
        L42:
            defpackage.fctl.b(r8)
            agw r8 = r7.a
            afp r2 = r6.b
            com.google.common.util.concurrent.ListenableFuture r2 = r2.e(r8)
            r0.e = r7
            r0.a = r8
            r0.d = r4
            java.lang.Object r2 = defpackage.fdxs.c(r2, r0)
            if (r2 == r1) goto L8a
            r5 = r2
            r2 = r7
            r7 = r8
            r8 = r5
        L5d:
            agz r8 = (defpackage.agz) r8
            java.util.Set r7 = r7.f()
            r7.getClass()
            r0.e = r2
            r0.a = r8
            r0.d = r3
            java.lang.Object r7 = r6.g(r7, r0)
            if (r7 == r1) goto L8a
            r7 = r8
            r0 = r2
        L74:
            dvcp r8 = r6.c
            r7.getClass()
            r0.getClass()
            dvch r1 = new dvch
            r2 = 0
            r1.<init>(r8, r0, r7, r2)
            fdjx r0 = r8.b
            eizx r8 = r8.c
            defpackage.ejaa.a(r0, r8, r1)
            return r7
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvca.f(dvbn, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.Set r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dvbz
            if (r0 == 0) goto L13
            r0 = r7
            dvbz r0 = (defpackage.dvbz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dvbz r0 = new dvbz
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            feaz r6 = r0.e
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r7)
            r7 = r6
            r6 = r0
            goto L49
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.fctl.b(r7)
            feav r7 = r5.e
            r0.a = r6
            r2 = r7
            feaz r2 = (defpackage.feaz) r2
            r0.e = r2
            r0.d = r3
            java.lang.Object r0 = r7.b(r0)
            if (r0 == r1) goto L8f
        L49:
            java.util.Set r0 = r5.f     // Catch: java.lang.Throwable -> L8a
            r0.clear()     // Catch: java.lang.Throwable -> L8a
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L8a
        L52:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L84
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L8a
            afo r1 = (defpackage.afo) r1     // Catch: java.lang.Throwable -> L8a
            java.util.List r2 = r1.b()     // Catch: java.lang.Throwable -> L8a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L8a
        L66:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L8a
            if (r3 == 0) goto L52
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L8a
            afl r3 = (defpackage.afl) r3     // Catch: java.lang.Throwable -> L8a
            java.lang.String r3 = r3.g()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r4 = "g3attrinfo"
            boolean r3 = defpackage.fdbq.f(r3, r4)     // Catch: java.lang.Throwable -> L8a
            if (r3 == 0) goto L66
            java.lang.String r1 = r1.a     // Catch: java.lang.Throwable -> L8a
            r0.add(r1)     // Catch: java.lang.Throwable -> L8a
            goto L52
        L84:
            r7.d()
            fctx r6 = defpackage.fctx.a
            return r6
        L8a:
            r6 = move-exception
            r7.d()
            throw r6
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvca.g(java.util.Set, fcxy):java.lang.Object");
    }
}
