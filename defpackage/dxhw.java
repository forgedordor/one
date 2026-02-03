package defpackage;

import android.content.Context;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxhw implements dxht {
    public static final eksp a = eksp.c("GnpSdk");
    public final Context b;
    public final Map c;
    public final dxgk d;
    public final eygg e;
    private final fcyh f;

    public dxhw(Context context, Map map, dxgk dxgkVar, eygg eyggVar, fcyh fcyhVar) {
        context.getClass();
        eyggVar.getClass();
        fcyhVar.getClass();
        this.b = context;
        this.c = map;
        this.d = dxgkVar;
        this.e = eyggVar;
        this.f = fcyhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [eicw] */
    @Override // defpackage.dxht
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.pzs r7, int r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.dxhu
            if (r0 == 0) goto L13
            r0 = r9
            dxhu r0 = (defpackage.dxhu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxhu r0 = new dxhu
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            eicw r7 = r0.d
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L2a
            goto L57
        L2a:
            r8 = move-exception
            goto L64
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.fctl.b(r9)
            eifn r9 = defpackage.eidc.c()
            eieo r2 = defpackage.eieo.a
            defpackage.eidc.g(r2)
            eicw r2 = new eicw
            r2.<init>()
            fcyh r9 = r6.f     // Catch: java.lang.Throwable -> L61
            dxhv r5 = new dxhv     // Catch: java.lang.Throwable -> L61
            r5.<init>(r6, r7, r8, r3)     // Catch: java.lang.Throwable -> L61
            r0.d = r2     // Catch: java.lang.Throwable -> L61
            r0.c = r4     // Catch: java.lang.Throwable -> L61
            java.lang.Object r9 = defpackage.fdin.a(r9, r5, r0)     // Catch: java.lang.Throwable -> L61
            if (r9 == r1) goto L60
            r7 = r2
        L57:
            qap r9 = (defpackage.qap) r9     // Catch: java.lang.Throwable -> L2a
            defpackage.fczl.a(r7, r3)
            r9.getClass()
            return r9
        L60:
            return r1
        L61:
            r7 = move-exception
            r8 = r7
            r7 = r2
        L64:
            throw r8     // Catch: java.lang.Throwable -> L65
        L65:
            r9 = move-exception
            defpackage.fczl.a(r7, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxhw.a(pzs, int, fcxy):java.lang.Object");
    }
}
