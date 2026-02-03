package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clhq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/conversation/EmergencyConversationOperations");
    public final avpc b;
    public final fcsu c;
    public final avnh d;
    public final cogw e;
    private final fcyh f;
    private final anuh g;
    private final fcsu h;

    public clhq(fcyh fcyhVar, anuh anuhVar, fcsu fcsuVar, avpc avpcVar, fcsu fcsuVar2, avnh avnhVar, cogw cogwVar) {
        fcyhVar.getClass();
        anuhVar.getClass();
        fcsuVar.getClass();
        avpcVar.getClass();
        fcsuVar2.getClass();
        avnhVar.getClass();
        cogwVar.getClass();
        this.f = fcyhVar;
        this.g = anuhVar;
        this.h = fcsuVar;
        this.b = avpcVar;
        this.c = fcsuVar2;
        this.d = avnhVar;
        this.e = cogwVar;
    }

    public static final boolean f(alqm alqmVar) {
        return alpd.a(alqmVar.n());
    }

    private static final boolean g(clod clodVar) {
        cloc clocVarB = cloc.b(clodVar.c);
        if (clocVarB == null) {
            clocVarB = cloc.UNRECOGNIZED;
        }
        return clocVarB == cloc.SESSION_STATUS_DEMO;
    }

    private static final boolean h(alqm alqmVar) {
        return alpd.b(alqmVar.n());
    }

    public final ParticipantsTable.BindData a(alqm alqmVar) {
        alqmVar.getClass();
        if (!alqmVar.B()) {
            throw new IllegalArgumentException("Only satellite identities are supported");
        }
        ParticipantsTable.BindData bindDataA = this.g.a(alqmVar);
        ((bbca) this.h.b()).i(bindDataA);
        bindDataA.getClass();
        return bindDataA;
    }

    public final Object b(int i, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.f), new clhm(null, this, i), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public final Object c(fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.f), new clhn(null, this), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public final Object d(fcxy fcxyVar) {
        Object objB = b(9, fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.alqm r4, defpackage.clod r5, defpackage.fcxy r6) {
        /*
            r3 = this;
            boolean r0 = r4.B()
            if (r0 == 0) goto L58
            boolean r0 = f(r4)
            if (r0 != 0) goto L21
            boolean r0 = h(r4)
            if (r0 == 0) goto L19
            boolean r0 = g(r5)
            if (r0 == 0) goto L19
            goto L21
        L19:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Emergency demo conversation is supported only when the active session is in demo mode"
            r4.<init>(r5)
            throw r4
        L21:
            boolean r0 = f(r4)
            r1 = 0
            if (r0 == 0) goto L37
            int r0 = r5.c
            cloc r0 = defpackage.cloc.b(r0)
            if (r0 != 0) goto L32
            cloc r0 = defpackage.cloc.UNRECOGNIZED
        L32:
            cloc r2 = defpackage.cloc.SESSION_STATUS_EMERGENCY
            if (r0 != r2) goto L37
            goto L47
        L37:
            boolean r0 = h(r4)
            r2 = 9
            if (r0 == 0) goto L46
            boolean r5 = g(r5)
            if (r5 == 0) goto L46
            goto L47
        L46:
            r1 = r2
        L47:
            fcyh r5 = r3.f
            fcyh r5 = defpackage.eicg.a(r5)
            clho r0 = new clho
            r2 = 0
            r0.<init>(r2, r3, r4, r1)
            java.lang.Object r4 = defpackage.fdin.a(r5, r0, r6)
            return r4
        L58:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Only satellite identities are supported"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clhq.e(alqm, clod, fcxy):java.lang.Object");
    }
}
