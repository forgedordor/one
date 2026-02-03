package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxnz implements dxni {
    private static final eksp d = eksp.c("GnpSdk");
    public final dxqr a;
    public final diep b;
    public final fcsu c;
    private final fcyh e;
    private final fcyh f;
    private final dxtx g;
    private final Context h;
    private final dxsc i;
    private final dxpd j;
    private final dxpd k;

    public dxnz(dxqr dxqrVar, dxsc dxscVar, dxpd dxpdVar, dxpd dxpdVar2, fcyh fcyhVar, fcyh fcyhVar2, dxtx dxtxVar, Context context, diep diepVar, fcsu fcsuVar) {
        dxqrVar.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        dxtxVar.getClass();
        context.getClass();
        diepVar.getClass();
        fcsuVar.getClass();
        this.a = dxqrVar;
        this.i = dxscVar;
        this.j = dxpdVar;
        this.k = dxpdVar2;
        this.e = fcyhVar;
        this.f = fcyhVar2;
        this.g = dxtxVar;
        this.h = context;
        this.b = diepVar;
        this.c = fcsuVar;
    }

    private static final boolean f(List list, dxhe dxheVar) {
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (fdbq.f(((evfx) it.next()).h, String.valueOf(dxheVar.e()))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.dxni
    public final Object a(List list, Map map, dxnq dxnqVar, String str, int i, dxnj dxnjVar, dxha dxhaVar, evjz evjzVar, String str2, fcxy fcxyVar) {
        return fdin.a(this.f, new dxnv(this, list, map, dxnqVar, dxhaVar, evjzVar, i, dxnjVar, str, str2, null), fcxyVar);
    }

    @Override // defpackage.dxni
    public final Object b(List list, Map map, String str, evfy evfyVar, fcxy fcxyVar) {
        return fdin.a(this.e, new dxnx(list, this, str, evfyVar, map, null), fcxyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x05a5, code lost:
    
        if (defpackage.fctx.a != r8) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c9, code lost:
    
        ((defpackage.eksl) defpackage.dxnz.d.i()).q("Couldn't find registration result id match.");
        r29.g.d(r29.h.getPackageName(), "MISSING_ID");
        r4 = new defpackage.dxfp(new java.lang.IllegalArgumentException("Couldn't find registration result id match."), 27);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v0, types: [dxnz] */
    /* JADX WARN: Type inference failed for: r2v19, types: [dxft] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v84 */
    /* JADX WARN: Type inference failed for: r6v85, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v89 */
    /* JADX WARN: Type inference failed for: r7v35, types: [dxps] */
    /* JADX WARN: Type inference failed for: r7v39, types: [dxpt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r30, java.util.Map r31, defpackage.dxnq r32, defpackage.dxha r33, long r34, defpackage.evjz r36, defpackage.fcxy r37) {
        /*
            Method dump skipped, instructions count: 1638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxnz.c(java.util.List, java.util.Map, dxnq, dxha, long, evjz, fcxy):java.lang.Object");
    }

    public final dxpd d(dxha dxhaVar) {
        if (dxhaVar.a()) {
            return this.j;
        }
        if (dxhaVar.b()) {
            return this.k;
        }
        throw new IllegalStateException("targetType is not supported");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.dxha r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dxny
            if (r0 == 0) goto L13
            r0 = r6
            dxny r0 = (defpackage.dxny) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxny r0 = new dxny
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r0 = r0.c
            if (r0 == 0) goto L3a
            r5 = 1
            if (r0 != r5) goto L32
            defpackage.fctl.b(r6)     // Catch: java.lang.Exception -> L25
            goto L40
        L25:
            r5 = move-exception
            eksp r6 = defpackage.dxnz.d
            ekrw r6 = r6.j()
            java.lang.String r0 = "Failed to report registration results"
            defpackage.a.N(r6, r0, r5)
            goto L40
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            defpackage.fctl.b(r6)
            r5.a()
        L40:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxnz.e(dxha, fcxy):java.lang.Object");
    }
}
