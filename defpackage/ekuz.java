package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ekuz extends ekty {
    private final ekux a;
    private final ekvf b;
    private final ekuy c;
    private final ektx d;

    public ekuz() {
        ekux ekuxVar = (ekux) p(ekux.class, "flogger.backend_factory");
        this.a = ekuxVar == null ? ekva.a : ekuxVar;
        ekvf ekvfVar = (ekvf) p(ekvf.class, "flogger.logging_context");
        this.b = ekvfVar == null ? ekvp.a : ekvfVar;
        ekuy ekuyVar = (ekuy) p(ekuy.class, "flogger.clock");
        this.c = ekuyVar == null ? ekve.a : ekuyVar;
        this.d = ekvd.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object p(java.lang.Class r17, java.lang.String r18) throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekuz.p(java.lang.Class, java.lang.String):java.lang.Object");
    }

    @Override // defpackage.ekty
    protected final long c() {
        return this.c.a();
    }

    @Override // defpackage.ekty
    protected final ekta e(String str) {
        return this.a.a(str);
    }

    @Override // defpackage.ekty
    protected final ektx h() {
        return this.d;
    }

    @Override // defpackage.ekty
    protected final ekvf j() {
        return this.b;
    }

    @Override // defpackage.ekty
    protected final String m() {
        return "Platform: " + getClass().getName() + "\nBackendFactory: " + this.a.toString() + "\nClock: " + this.c.toString() + "\nContextDataProvider: " + String.valueOf(this.b) + "\nLogCallerFinder: Default stack-based caller finder\n";
    }
}
