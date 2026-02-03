package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class znu extends owd implements zmp {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSource");
    private final dzuc b;
    private final ajma c;
    private final zog d;
    private final zoa e;
    private final zoj f;
    private final zok g;
    private final znz h;
    private final zmu i = new zmu();
    private final znv j;

    public znu(dzuc dzucVar, ajma ajmaVar, zog zogVar, zoa zoaVar, zoj zojVar, zok zokVar) {
        this.b = dzucVar;
        this.c = ajmaVar;
        this.d = zogVar;
        this.e = zoaVar;
        this.f = zojVar;
        this.g = zokVar;
        this.h = new znz(ajmaVar);
        this.j = new znv(this, zojVar, ajmaVar);
    }

    private final void i(dzub dzubVar) {
        this.b.f(dzubVar, ajfo.a, null, dzua.SUCCESS);
        ((ekrd) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSource", "onPagingDone", 232, "MessageListPagingSource.kt")).q("MessageListPagingSource load complete.");
    }

    private static final void j(ovx ovxVar) {
        ((ekrd) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSource", "logInfo", 374, "MessageListPagingSource.kt")).B("pagingKey: %s, load size: %d", ovxVar.a(), ovxVar.b);
    }

    private static final void k(ovx ovxVar) {
        ((ekrd) a.j().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSource", "logWarn", 378, "MessageListPagingSource.kt")).B("pagingKey: %s, load size: %d", ovxVar.a(), ovxVar.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b5, code lost:
    
        if (r2 != r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ec, code lost:
    
        if (r2 != r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0123, code lost:
    
        if (r2 != r4) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x038c A[Catch: all -> 0x0767, TryCatch #1 {all -> 0x0767, blocks: (B:74:0x02f6, B:76:0x0308, B:78:0x030f, B:81:0x031c, B:82:0x0322, B:84:0x0328, B:86:0x0350, B:88:0x035f, B:90:0x0365, B:92:0x036b, B:94:0x036f, B:100:0x038c, B:102:0x03a2, B:107:0x03b4, B:105:0x03a7, B:109:0x03cb), top: B:267:0x02f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ovx r30, defpackage.fcxy r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.znu.a(ovx, fcxy):java.lang.Object");
    }

    @Override // defpackage.owd
    public final /* bridge */ /* synthetic */ Object b(owe oweVar) {
        Integer num = oweVar.b;
        ajly ajlyVarB = num != null ? this.c.b(num) : null;
        ((ekrd) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSource", "getRefreshKey", 69, "MessageListPagingSource.kt")).D("Refreshing from key %s and and position %d", ajlyVarB, num);
        return ajlyVarB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090 A[Catch: all -> 0x016c, TRY_LEAVE, TryCatch #5 {all -> 0x016c, blocks: (B:38:0x0086, B:40:0x0090, B:44:0x009f, B:47:0x00d1, B:49:0x00e8, B:50:0x0105, B:51:0x011a, B:53:0x0131, B:54:0x014e), top: B:75:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f A[Catch: all -> 0x016c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x016c, blocks: (B:38:0x0086, B:40:0x0090, B:44:0x009f, B:47:0x00d1, B:49:0x00e8, B:50:0x0105, B:51:0x011a, B:53:0x0131, B:54:0x014e), top: B:75:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r13v0, types: [znu] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r15v8, types: [eieu] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    @Override // defpackage.owd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ovx r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.znu.c(ovx, fcxy):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j.close();
    }

    @Override // defpackage.owd
    public final boolean d() {
        return true;
    }
}
