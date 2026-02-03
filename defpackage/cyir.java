package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyir {
    public final dqsy a;
    private final Context b;
    private final fcyh c;

    public cyir(dqsy dqsyVar, Context context, fcyh fcyhVar) {
        dqsyVar.getClass();
        context.getClass();
        fcyhVar.getClass();
        this.a = dqsyVar;
        this.b = context;
        this.c = fcyhVar;
    }

    public static final List b(String str, fdap fdapVar) {
        cyio cyioVar = new cyio(str);
        fdapVar.invoke(cyioVar);
        return fcva.ao(cyioVar.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cyiq
            if (r0 == 0) goto L13
            r0 = r6
            cyiq r0 = (defpackage.cyiq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cyiq r0 = new cyiq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            fcyh r6 = r5.c
            fcyh r6 = defpackage.eicg.a(r6)
            cyip r2 = new cyip
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdin.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            android.content.Context r6 = r5.b
            java.lang.String r0 = "Inserted successfully"
            r1 = 0
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r0, r1)
            r6.show()
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyir.a(fcxy):java.lang.Object");
    }
}
