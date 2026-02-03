package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmjw extends fcyz implements fdat {
    int a;
    final /* synthetic */ cmjx b;
    final /* synthetic */ eoaz c;
    Object d;
    Object e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmjw(fcxy fcxyVar, cmjx cmjxVar, eoaz eoazVar) {
        super(2, fcxyVar);
        this.b = cmjxVar;
        this.c = eoazVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmjw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8 A[Catch: all -> 0x0066, TryCatch #1 {all -> 0x0066, blocks: (B:20:0x004c, B:57:0x019e, B:58:0x01ad, B:60:0x01b3, B:61:0x01bf, B:62:0x01c3, B:65:0x01cd, B:66:0x0210, B:68:0x0221, B:70:0x0233, B:71:0x024e, B:72:0x0259, B:73:0x027b, B:75:0x0281, B:76:0x029a, B:24:0x0060, B:38:0x00ce, B:39:0x00e2, B:41:0x00e8, B:43:0x00f7, B:44:0x00fb, B:46:0x0101, B:48:0x0118, B:49:0x0146, B:51:0x014c, B:52:0x015c, B:55:0x017e), top: B:91:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118 A[Catch: all -> 0x0066, TryCatch #1 {all -> 0x0066, blocks: (B:20:0x004c, B:57:0x019e, B:58:0x01ad, B:60:0x01b3, B:61:0x01bf, B:62:0x01c3, B:65:0x01cd, B:66:0x0210, B:68:0x0221, B:70:0x0233, B:71:0x024e, B:72:0x0259, B:73:0x027b, B:75:0x0281, B:76:0x029a, B:24:0x0060, B:38:0x00ce, B:39:0x00e2, B:41:0x00e8, B:43:0x00f7, B:44:0x00fb, B:46:0x0101, B:48:0x0118, B:49:0x0146, B:51:0x014c, B:52:0x015c, B:55:0x017e), top: B:91:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017e A[Catch: all -> 0x0066, TryCatch #1 {all -> 0x0066, blocks: (B:20:0x004c, B:57:0x019e, B:58:0x01ad, B:60:0x01b3, B:61:0x01bf, B:62:0x01c3, B:65:0x01cd, B:66:0x0210, B:68:0x0221, B:70:0x0233, B:71:0x024e, B:72:0x0259, B:73:0x027b, B:75:0x0281, B:76:0x029a, B:24:0x0060, B:38:0x00ce, B:39:0x00e2, B:41:0x00e8, B:43:0x00f7, B:44:0x00fb, B:46:0x0101, B:48:0x0118, B:49:0x0146, B:51:0x014c, B:52:0x015c, B:55:0x017e), top: B:91:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b3 A[Catch: all -> 0x0066, LOOP:0: B:58:0x01ad->B:60:0x01b3, LOOP_END, TryCatch #1 {all -> 0x0066, blocks: (B:20:0x004c, B:57:0x019e, B:58:0x01ad, B:60:0x01b3, B:61:0x01bf, B:62:0x01c3, B:65:0x01cd, B:66:0x0210, B:68:0x0221, B:70:0x0233, B:71:0x024e, B:72:0x0259, B:73:0x027b, B:75:0x0281, B:76:0x029a, B:24:0x0060, B:38:0x00ce, B:39:0x00e2, B:41:0x00e8, B:43:0x00f7, B:44:0x00fb, B:46:0x0101, B:48:0x0118, B:49:0x0146, B:51:0x014c, B:52:0x015c, B:55:0x017e), top: B:91:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cd A[Catch: all -> 0x0066, LOOP:1: B:62:0x01c3->B:65:0x01cd, LOOP_END, TRY_ENTER, TryCatch #1 {all -> 0x0066, blocks: (B:20:0x004c, B:57:0x019e, B:58:0x01ad, B:60:0x01b3, B:61:0x01bf, B:62:0x01c3, B:65:0x01cd, B:66:0x0210, B:68:0x0221, B:70:0x0233, B:71:0x024e, B:72:0x0259, B:73:0x027b, B:75:0x0281, B:76:0x029a, B:24:0x0060, B:38:0x00ce, B:39:0x00e2, B:41:0x00e8, B:43:0x00f7, B:44:0x00fb, B:46:0x0101, B:48:0x0118, B:49:0x0146, B:51:0x014c, B:52:0x015c, B:55:0x017e), top: B:91:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0221 A[Catch: all -> 0x0066, TryCatch #1 {all -> 0x0066, blocks: (B:20:0x004c, B:57:0x019e, B:58:0x01ad, B:60:0x01b3, B:61:0x01bf, B:62:0x01c3, B:65:0x01cd, B:66:0x0210, B:68:0x0221, B:70:0x0233, B:71:0x024e, B:72:0x0259, B:73:0x027b, B:75:0x0281, B:76:0x029a, B:24:0x0060, B:38:0x00ce, B:39:0x00e2, B:41:0x00e8, B:43:0x00f7, B:44:0x00fb, B:46:0x0101, B:48:0x0118, B:49:0x0146, B:51:0x014c, B:52:0x015c, B:55:0x017e), top: B:91:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0281 A[Catch: all -> 0x0066, LOOP:2: B:73:0x027b->B:75:0x0281, LOOP_END, TryCatch #1 {all -> 0x0066, blocks: (B:20:0x004c, B:57:0x019e, B:58:0x01ad, B:60:0x01b3, B:61:0x01bf, B:62:0x01c3, B:65:0x01cd, B:66:0x0210, B:68:0x0221, B:70:0x0233, B:71:0x024e, B:72:0x0259, B:73:0x027b, B:75:0x0281, B:76:0x029a, B:24:0x0060, B:38:0x00ce, B:39:0x00e2, B:41:0x00e8, B:43:0x00f7, B:44:0x00fb, B:46:0x0101, B:48:0x0118, B:49:0x0146, B:51:0x014c, B:52:0x015c, B:55:0x017e), top: B:91:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02d3  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [feav] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmjw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cmjw cmjwVar = new cmjw(fcxyVar, this.b, this.c);
        cmjwVar.f = obj;
        return cmjwVar;
    }
}
