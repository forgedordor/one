package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhjo implements ebla {
    private static final dhip a = new dhip("PAccesNetworkInfoMessageFilter");
    private final dfyu b;
    private final int c;

    public dhjo(int i, dfyu dfyuVar) {
        this.c = i;
        this.b = dfyuVar;
    }

    private static final void b(ebqq ebqqVar, String str) {
        try {
            ebqqVar.q(ebql.g("P-Access-Network-Info", str));
        } catch (Exception e) {
            dhja.j(e, a, "Exception while adding Access Info Header", new Object[0]);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0105  */
    @Override // defpackage.ebla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.ebqq r10) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhjo.a(ebqq):void");
    }
}
