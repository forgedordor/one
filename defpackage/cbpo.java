package defpackage;

import androidx.car.app.model.Alert;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbpo extends cayv {
    public static final cqce a = cqce.g("BugleDataModel", "StartHeavyWorkWorkHandler");
    public final Set b;
    public final cbor c;
    public final cbph d;
    public final cbaz e;
    public final cazj f;
    private final fdjx g;
    private final byeq h;

    public cbpo(fdjx fdjxVar, Set set, cbor cborVar, cbph cbphVar, cbaz cbazVar, byeq byeqVar, cazj cazjVar) {
        fdjxVar.getClass();
        set.getClass();
        cborVar.getClass();
        cbphVar.getClass();
        cbazVar.getClass();
        byeqVar.getClass();
        cazjVar.getClass();
        this.g = fdjxVar;
        this.b = set;
        this.c = cborVar;
        this.d = cbphVar;
        this.e = cbazVar;
        this.h = byeqVar;
        this.f = cazjVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.e(true);
        caxzVarL.c(Alert.DURATION_SHOW_INDEFINITELY);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("StartHeavyWorkWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = evrl.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final String f() {
        return "heavy_work";
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        return auvw.c(this.g, fcyi.a, fdjz.a, new cbpm(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (defpackage.fdxs.c((com.google.common.util.concurrent.ListenableFuture) r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.cbpl
            if (r0 == 0) goto L13
            r0 = r7
            cbpl r0 = (defpackage.cbpl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbpl r0 = new cbpl
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L5f
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            defpackage.fctl.b(r7)
            goto L51
        L36:
            defpackage.fctl.b(r7)
            byeq r7 = r6.h
            cbpk r2 = new cbpk
            r2.<init>()
            java.lang.String r5 = "StartHeavyWorkWorkHandler#kickOffFirstQueuedHeavyWorkOperation"
            eiju r7 = r7.a(r5, r2)
            r7.getClass()
            r0.c = r4
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 == r1) goto L62
        L51:
            r7.getClass()
            com.google.common.util.concurrent.ListenableFuture r7 = (com.google.common.util.concurrent.ListenableFuture) r7
            r0.c = r3
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 != r1) goto L5f
            goto L62
        L5f:
            fctx r7 = defpackage.fctx.a
            return r7
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbpo.k(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [cbpj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005e -> B:19:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.cbpn
            if (r0 == 0) goto L13
            r0 = r8
            cbpn r0 = (defpackage.cbpn) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cbpn r0 = new cbpn
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.a
            ekfx r4 = r0.e
            defpackage.fctl.b(r8)     // Catch: java.lang.Exception -> L2b
            goto L41
        L2b:
            r8 = move-exception
            goto L5e
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            defpackage.fctl.b(r8)
            java.util.Set r8 = r7.b
            ekon r8 = (defpackage.ekon) r8
            ekqg r8 = r8.listIterator()
            r4 = r8
        L41:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L76
            java.lang.Object r8 = r4.next()
            r2 = r8
            cbpj r2 = (defpackage.cbpj) r2
            r8 = r4
            ekfx r8 = (defpackage.ekfx) r8     // Catch: java.lang.Exception -> L2b
            r0.e = r8     // Catch: java.lang.Exception -> L2b
            r0.a = r2     // Catch: java.lang.Exception -> L2b
            r0.d = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r8 = r2.c()     // Catch: java.lang.Exception -> L2b
            if (r8 != r1) goto L41
            return r1
        L5e:
            cqce r5 = defpackage.cbpo.a
            cqbd r5 = r5.b()
            java.lang.String r6 = "Could not unpause agent"
            r5.I(r6)
            java.lang.String r6 = "agent"
            java.lang.String r2 = r2.a()
            r5.A(r6, r2)
            r5.s(r8)
            goto L41
        L76:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbpo.l(fcxy):java.lang.Object");
    }
}
