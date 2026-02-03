package defpackage;

import android.content.Context;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svu implements aoof {
    public static final eksp a = eksp.c("BugleVmt");
    public final fcyh b;
    public final Context c;
    public final sxm d;
    public final sux e;
    public final bxlc f;
    public final fcsu g;
    public final fcsu h;
    private final fcyh i;

    public svu(fcyh fcyhVar, fcyh fcyhVar2, Context context, sxm sxmVar, sux suxVar, bxlc bxlcVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fcyhVar.getClass();
        fcyhVar2.getClass();
        context.getClass();
        bxlcVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.i = fcyhVar;
        this.b = fcyhVar2;
        this.c = context;
        this.d = sxmVar;
        this.e = suxVar;
        this.f = bxlcVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Locale r7, defpackage.fcxy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.svn
            if (r0 == 0) goto L13
            r0 = r8
            svn r0 = (defpackage.svn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            svn r0 = new svn
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Locale r7 = r0.d
            defpackage.fctl.b(r8)
            goto L62
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.fctl.b(r8)
            sux r8 = r6.e
            r0.d = r7
            r0.c = r3
            boolean r2 = r8.a()
            r4 = 0
            if (r2 == 0) goto L51
            fcyh r2 = r8.g
            fcyh r2 = defpackage.eicg.a(r2)
            sup r5 = new sup
            r5.<init>(r4, r8)
            java.lang.Object r8 = defpackage.fdin.a(r2, r5, r0)
            goto L60
        L51:
            fcyh r2 = r8.e
            fcyh r2 = defpackage.eicg.a(r2)
            sus r5 = new sus
            r5.<init>(r4, r8)
            java.lang.Object r8 = defpackage.fdin.a(r2, r5, r0)
        L60:
            if (r8 == r1) goto L76
        L62:
            java.util.Map r8 = (java.util.Map) r8
            boolean r0 = r8.containsKey(r7)
            if (r0 == 0) goto L6f
            java.lang.Object r7 = defpackage.fcwa.e(r8, r7)
            return r7
        L6f:
            aonx r8 = new aonx
            r0 = -1
            r8.<init>(r7, r0, r3)
            return r8
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svu.a(java.util.Locale, fcxy):java.lang.Object");
    }

    @Override // defpackage.aoof
    public final Object b(aoog aoogVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.i), new svo(null, this, aoogVar), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6, defpackage.fcxy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.svr
            if (r0 == 0) goto L13
            r0 = r7
            svr r0 = (defpackage.svr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            svr r0 = new svr
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L5a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            ejxr r7 = defpackage.stu.c
            java.lang.Object r7 = r7.get()
            cczi r7 = (defpackage.cczi) r7
            java.lang.Object r7 = r7.e()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5e
            fcyh r7 = r5.b
            fcyh r7 = defpackage.eicg.a(r7)
            svq r2 = new svq
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)
            if (r7 == r1) goto L5d
        L5a:
            java.util.Locale r7 = (java.util.Locale) r7
            goto L64
        L5d:
            return r1
        L5e:
            android.content.Context r6 = r5.c
            java.util.Locale r7 = defpackage.craf.c(r6)
        L64:
            cczv r6 = defpackage.stt.c
            java.lang.Object r6 = r6.e()
            stq r6 = (defpackage.stq) r6
            evub r6 = r6.b
            java.util.Map r6 = j$.util.DesugarCollections.unmodifiableMap(r6)
            r6.getClass()
            java.lang.String r0 = r7.toLanguageTag()
            boolean r0 = r6.containsKey(r0)
            if (r0 == 0) goto La6
            java.lang.String r0 = r7.toLanguageTag()
            java.lang.Object r6 = defpackage.fcwa.e(r6, r0)
            java.lang.String r6 = (java.lang.String) r6
            java.util.Locale r6 = java.util.Locale.forLanguageTag(r6)
            r6.getClass()
            eksp r0 = defpackage.svu.a
            ekrw r0 = r0.h()
            eksl r0 = (defpackage.eksl) r0
            java.lang.String r7 = r7.toLanguageTag()
            java.lang.String r1 = r6.toLanguageTag()
            java.lang.String r2 = "Language %s has been replaced with %s."
            r0.D(r2, r7, r1)
            return r6
        La6:
            java.util.Locale r6 = defpackage.nh$$ExternalSyntheticApiModelOutline0.m(r7)
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svu.c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, fcxy):java.lang.Object");
    }

    public final Object d(aonp aonpVar, aoog aoogVar, Locale locale, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.b), new svs(null, this, aoogVar, aonpVar, locale), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
