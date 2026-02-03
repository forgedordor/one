package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzmo {
    public static final cqce a = cqce.g("BugleCms", "DeadLetterQueuePersister");
    public final fcyh b;
    public final fcsu c;
    private final aukz d;
    private final cden e;
    private final apqc f;
    private final byeq g;

    public bzmo(byeq byeqVar, aukz aukzVar, cden cdenVar, apqc apqcVar, fcyh fcyhVar, fcsu fcsuVar) {
        byeqVar.getClass();
        aukzVar.getClass();
        cdenVar.getClass();
        apqcVar.getClass();
        fcyhVar.getClass();
        fcsuVar.getClass();
        this.g = byeqVar;
        this.d = aukzVar;
        this.e = cdenVar;
        this.f = apqcVar;
        this.b = fcyhVar;
        this.c = fcsuVar;
    }

    private static final Object b(evsf evsfVar, bzmx[] bzmxVarArr, fdat fdatVar) throws Throwable {
        Object objA;
        try {
            for (bzmx bzmxVar : bzmxVarArr) {
                fdatVar.a(bzmxVar, evsfVar);
            }
            objA = evsfVar.build();
        } catch (Throwable th) {
            objA = fctl.a(th);
        }
        Throwable thC = fctk.c(objA);
        if (thC != null) {
            if (!(thC instanceof bzmw)) {
                throw thC;
            }
            objA = null;
        }
        fctl.b(objA);
        return objA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (r10 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        if (defpackage.fdxs.c(r10, r0) != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.bzmx[] r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzmo.a(bzmx[], fcxy):java.lang.Object");
    }
}
