package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxge implements dxga {
    public static final eksp a = eksp.c("GnpSdk");
    public final dxrk b;
    public final fcyh c;
    public final Context d;
    public final Set e;

    public dxge(dxrk dxrkVar, fcyh fcyhVar, Context context, Set set) {
        dxrkVar.getClass();
        fcyhVar.getClass();
        context.getClass();
        set.getClass();
        this.b = dxrkVar;
        this.c = fcyhVar;
        this.d = context;
        this.e = set;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dxhe r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dxgd
            if (r0 == 0) goto L13
            r0 = r6
            dxgd r0 = (defpackage.dxgd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxgd r0 = new dxgd
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            dxrk r6 = r4.b
            dxvi r5 = r5.s()
            r0.c = r3
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 == r1) goto L7b
        L40:
            dxft r6 = (defpackage.dxft) r6
            boolean r5 = r6 instanceof defpackage.dxfx
            if (r5 == 0) goto L67
            dxfx r6 = (defpackage.dxfx) r6
            java.lang.Object r5 = r6.a
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 == r3) goto L5f
            dxfp r5 = new dxfp
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.String r0 = "Failed deleting account"
            r6.<init>(r0)
            r5.<init>(r6)
            return r5
        L5f:
            dxfx r5 = new dxfx
            fctx r6 = defpackage.fctx.a
            r5.<init>(r6)
            return r5
        L67:
            boolean r5 = r6 instanceof defpackage.dxfo
            if (r5 == 0) goto L75
            dxfo r6 = (defpackage.dxfo) r6
            dxfp r5 = new dxfp
            java.lang.String r6 = "Failed deleting account from storage"
            r5.<init>(r6)
            return r5
        L75:
            fctg r5 = new fctg
            r5.<init>()
            throw r5
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxge.a(dxhe, fcxy):java.lang.Object");
    }
}
