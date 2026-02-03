package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuos {
    public static final egyj a = new egyb("CHAT_IDENTITY_SETTINGS_SELECTION_DATASERVICE_KEY");
    public final fdjx b;
    private final Context c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;

    public cuos(Context context, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        context.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.c = context;
        this.b = fdjxVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
    }

    private final cupi b(String str, String str2, String str3, int i) {
        Intent intentK = ((aijh) this.d.b()).k(this.c, i, str2);
        intentK.getClass();
        return new cupi(str, str2, str3, intentK);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cuor
            if (r0 == 0) goto L13
            r0 = r6
            cuor r0 = (defpackage.cuor) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuor r0 = new cuor
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L4d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            fcsu r6 = r5.e
            java.lang.Object r6 = r6.b()
            aofc r6 = (defpackage.aofc) r6
            anpj r6 = r6.a()
            eiju r6 = r6.b()
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 == r1) goto Le3
        L4d:
            ekgb r6 = (defpackage.ekgb) r6
            r6.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.fcva.p(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L61:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lb7
            java.lang.Object r1 = r6.next()
            aoer r1 = (defpackage.aoer) r1
            r1.getClass()
            java.lang.String r2 = r1.p()
            if (r2 == 0) goto L7c
            int r3 = r2.length()
            if (r3 != 0) goto L88
        L7c:
            android.content.Context r2 = r5.c
            r3 = 2132087558(0x7f151306, float:1.9815375E38)
            java.lang.String r2 = r2.getString(r3)
            r2.getClass()
        L88:
            java.lang.String r3 = r1.q()
            int r3 = r3.length()
            if (r3 != 0) goto L9f
            android.content.Context r3 = r5.c
            r4 = 2132087557(0x7f151305, float:1.9815373E38)
            java.lang.String r3 = r3.getString(r4)
            r3.getClass()
            goto La3
        L9f:
            java.lang.String r3 = r1.q()
        La3:
            int r4 = r1.b()
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r1 = r1.h()
            java.lang.String r1 = r1.b()
            cupi r1 = r5.b(r1, r3, r2, r4)
            r0.add(r1)
            goto L61
        Lb7:
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto Le2
            android.content.Context r6 = r5.c
            r0 = 2132082889(0x7f1500c9, float:1.9805905E38)
            java.lang.String r6 = r6.getString(r0)
            r6.getClass()
            fcsu r0 = r5.f
            java.lang.Object r0 = r0.b()
            crny r0 = (defpackage.crny) r0
            int r0 = r0.f()
            java.lang.String r1 = ""
            java.lang.String r2 = "0"
            cupi r6 = r5.b(r2, r6, r1, r0)
            java.util.List r6 = defpackage.fcva.b(r6)
            return r6
        Le2:
            return r0
        Le3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuos.a(fcxy):java.lang.Object");
    }
}
