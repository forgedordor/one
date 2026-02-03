package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctnr extends owd {
    private static final cqce a = cqce.g("BugleContacts", "ContactListPagingSource");
    private final dzuc b;
    private final ajoy c;
    private final fdap d;
    private final ajox e;

    public ctnr(dzuc dzucVar, ajoy ajoyVar, fdap fdapVar) {
        this.b = dzucVar;
        this.c = ajoyVar;
        this.d = fdapVar;
        ajox ajoxVarA = ajoyVar.a();
        ajoxVarA.getClass();
        this.e = ajoxVarA;
    }

    private static final cqbd a(ovx ovxVar) {
        cqbd cqbdVarC = a.c();
        cqbdVarC.A("pagingKey", ovxVar.a());
        cqbdVarC.y("size", ovxVar.b);
        return cqbdVarC;
    }

    @Override // defpackage.owd
    public final /* bridge */ /* synthetic */ Object b(owe oweVar) {
        Integer num = oweVar.b;
        ajow ajowVarA = num != null ? this.e.a(num) : null;
        cqbd cqbdVarC = a.c();
        Objects.toString(ajowVarA);
        cqbdVarC.I("Refreshing from key ".concat(String.valueOf(ajowVarA)));
        cqbdVarC.r();
        return ajowVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c A[Catch: all -> 0x00ac, Exception -> 0x00b0, TryCatch #0 {Exception -> 0x00b0, blocks: (B:53:0x010f, B:54:0x0114, B:56:0x011c, B:58:0x0132, B:60:0x0138, B:62:0x0147, B:63:0x01ac, B:68:0x01ba, B:46:0x00de, B:35:0x00a6), top: B:104:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0138 A[Catch: all -> 0x00ac, Exception -> 0x00b0, TryCatch #0 {Exception -> 0x00b0, blocks: (B:53:0x010f, B:54:0x0114, B:56:0x011c, B:58:0x0132, B:60:0x0138, B:62:0x0147, B:63:0x01ac, B:68:0x01ba, B:46:0x00de, B:35:0x00a6), top: B:104:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ovx] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v4, types: [dzub] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v1, types: [dzuc] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v8, types: [eieu] */
    @Override // defpackage.owd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ovx r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctnr.c(ovx, fcxy):java.lang.Object");
    }

    @Override // defpackage.owd
    public final boolean d() {
        return true;
    }
}
