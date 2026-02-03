package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aglr {
    public final cogw a;
    public final fcsu b;
    public final fcsu c;
    private final fcyh d;
    private final byeq e;

    public aglr(fcyh fcyhVar, fdjx fdjxVar, byeq byeqVar, cogw cogwVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fcyhVar.getClass();
        fdjxVar.getClass();
        byeqVar.getClass();
        cogwVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.d = fcyhVar;
        this.e = byeqVar;
        this.a = cogwVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(j$.time.MonthDay r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.aglm
            if (r0 == 0) goto L13
            r0 = r7
            aglm r0 = (defpackage.aglm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aglm r0 = new aglm
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            fcyh r7 = r5.d
            fcyh r7 = defpackage.eicg.a(r7)
            agll r2 = new agll
            r4 = 0
            r2.<init>(r4, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aglr.a(j$.time.MonthDay, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(final java.util.Map r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.aglo
            if (r0 == 0) goto L13
            r0 = r8
            aglo r0 = (defpackage.aglo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aglo r0 = new aglo
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            eieu r7 = r0.d
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L55
        L29:
            r8 = move-exception
            goto L61
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.fctl.b(r8)
            java.lang.String r8 = "BirthdaySyncDataStorage#insertBirthdays"
            eieu r2 = defpackage.eiiy.h(r8)
            byeq r4 = r6.e     // Catch: java.lang.Throwable -> L5e
            agld r5 = new agld     // Catch: java.lang.Throwable -> L5e
            r5.<init>()     // Catch: java.lang.Throwable -> L5e
            eiju r7 = r4.a(r8, r5)     // Catch: java.lang.Throwable -> L5e
            r7.getClass()     // Catch: java.lang.Throwable -> L5e
            r0.d = r2     // Catch: java.lang.Throwable -> L5e
            r0.c = r3     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r8 = defpackage.fdxs.c(r7, r0)     // Catch: java.lang.Throwable -> L5e
            if (r8 == r1) goto L5d
            r7 = r2
        L55:
            r8.getClass()     // Catch: java.lang.Throwable -> L29
            r0 = 0
            defpackage.fczl.a(r7, r0)
            return r8
        L5d:
            return r1
        L5e:
            r7 = move-exception
            r8 = r7
            r7 = r2
        L61:
            throw r8     // Catch: java.lang.Throwable -> L62
        L62:
            r0 = move-exception
            defpackage.fczl.a(r7, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aglr.b(java.util.Map, fcxy):java.lang.Object");
    }

    public final Object c(ConversationIdType conversationIdType, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.d), new aglp(null, aukf.CONVERSATION_CLASSIFICATION_TYPE_SAVE_BIRTHDAY, conversationIdType), fcxyVar);
        fcyl fcylVar = fcyl.a;
        if (objA != fcylVar) {
            objA = fctx.a;
        }
        return objA == fcylVar ? objA : fctx.a;
    }
}
