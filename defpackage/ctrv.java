package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctrv extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctsy b;
    final /* synthetic */ List c;
    Object d;
    Object e;
    Object f;
    int g;
    int h;
    final /* synthetic */ cudx i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctrv(fcxy fcxyVar, ctsy ctsyVar, List list, cudx cudxVar) {
        super(2, fcxyVar);
        this.b = ctsyVar;
        this.c = list;
        this.i = cudxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctrv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x011c, code lost:
    
        if (r15 != r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022e, code lost:
    
        if (r15 == r0) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:4:0x0014, B:27:0x005d], limit reached: 122 */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108 A[Catch: all -> 0x004e, TryCatch #4 {all -> 0x004e, blocks: (B:9:0x0026, B:95:0x0231, B:92:0x020b, B:100:0x0240, B:12:0x0035, B:68:0x0176, B:63:0x014c, B:65:0x0152, B:71:0x0182, B:72:0x018b, B:74:0x0191, B:76:0x01a3, B:77:0x01a7, B:79:0x01ae, B:80:0x01bb, B:82:0x01c1, B:84:0x01d0, B:85:0x01d4, B:86:0x01e3, B:88:0x01e9, B:90:0x0203, B:70:0x017e, B:15:0x003f, B:51:0x011e, B:53:0x0122, B:57:0x012d, B:60:0x0135, B:62:0x013f, B:78:0x01ac, B:18:0x0049, B:43:0x0104, B:45:0x0108, B:47:0x010e, B:49:0x0114), top: B:110:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012d A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #4 {all -> 0x004e, blocks: (B:9:0x0026, B:95:0x0231, B:92:0x020b, B:100:0x0240, B:12:0x0035, B:68:0x0176, B:63:0x014c, B:65:0x0152, B:71:0x0182, B:72:0x018b, B:74:0x0191, B:76:0x01a3, B:77:0x01a7, B:79:0x01ae, B:80:0x01bb, B:82:0x01c1, B:84:0x01d0, B:85:0x01d4, B:86:0x01e3, B:88:0x01e9, B:90:0x0203, B:70:0x017e, B:15:0x003f, B:51:0x011e, B:53:0x0122, B:57:0x012d, B:60:0x0135, B:62:0x013f, B:78:0x01ac, B:18:0x0049, B:43:0x0104, B:45:0x0108, B:47:0x010e, B:49:0x0114), top: B:110:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0135 A[Catch: all -> 0x004e, TRY_ENTER, TryCatch #4 {all -> 0x004e, blocks: (B:9:0x0026, B:95:0x0231, B:92:0x020b, B:100:0x0240, B:12:0x0035, B:68:0x0176, B:63:0x014c, B:65:0x0152, B:71:0x0182, B:72:0x018b, B:74:0x0191, B:76:0x01a3, B:77:0x01a7, B:79:0x01ae, B:80:0x01bb, B:82:0x01c1, B:84:0x01d0, B:85:0x01d4, B:86:0x01e3, B:88:0x01e9, B:90:0x0203, B:70:0x017e, B:15:0x003f, B:51:0x011e, B:53:0x0122, B:57:0x012d, B:60:0x0135, B:62:0x013f, B:78:0x01ac, B:18:0x0049, B:43:0x0104, B:45:0x0108, B:47:0x010e, B:49:0x0114), top: B:110:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152 A[Catch: all -> 0x004e, TryCatch #4 {all -> 0x004e, blocks: (B:9:0x0026, B:95:0x0231, B:92:0x020b, B:100:0x0240, B:12:0x0035, B:68:0x0176, B:63:0x014c, B:65:0x0152, B:71:0x0182, B:72:0x018b, B:74:0x0191, B:76:0x01a3, B:77:0x01a7, B:79:0x01ae, B:80:0x01bb, B:82:0x01c1, B:84:0x01d0, B:85:0x01d4, B:86:0x01e3, B:88:0x01e9, B:90:0x0203, B:70:0x017e, B:15:0x003f, B:51:0x011e, B:53:0x0122, B:57:0x012d, B:60:0x0135, B:62:0x013f, B:78:0x01ac, B:18:0x0049, B:43:0x0104, B:45:0x0108, B:47:0x010e, B:49:0x0114), top: B:110:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017e A[Catch: all -> 0x004e, TryCatch #4 {all -> 0x004e, blocks: (B:9:0x0026, B:95:0x0231, B:92:0x020b, B:100:0x0240, B:12:0x0035, B:68:0x0176, B:63:0x014c, B:65:0x0152, B:71:0x0182, B:72:0x018b, B:74:0x0191, B:76:0x01a3, B:77:0x01a7, B:79:0x01ae, B:80:0x01bb, B:82:0x01c1, B:84:0x01d0, B:85:0x01d4, B:86:0x01e3, B:88:0x01e9, B:90:0x0203, B:70:0x017e, B:15:0x003f, B:51:0x011e, B:53:0x0122, B:57:0x012d, B:60:0x0135, B:62:0x013f, B:78:0x01ac, B:18:0x0049, B:43:0x0104, B:45:0x0108, B:47:0x010e, B:49:0x0114), top: B:110:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0182 A[Catch: all -> 0x004e, TryCatch #4 {all -> 0x004e, blocks: (B:9:0x0026, B:95:0x0231, B:92:0x020b, B:100:0x0240, B:12:0x0035, B:68:0x0176, B:63:0x014c, B:65:0x0152, B:71:0x0182, B:72:0x018b, B:74:0x0191, B:76:0x01a3, B:77:0x01a7, B:79:0x01ae, B:80:0x01bb, B:82:0x01c1, B:84:0x01d0, B:85:0x01d4, B:86:0x01e3, B:88:0x01e9, B:90:0x0203, B:70:0x017e, B:15:0x003f, B:51:0x011e, B:53:0x0122, B:57:0x012d, B:60:0x0135, B:62:0x013f, B:78:0x01ac, B:18:0x0049, B:43:0x0104, B:45:0x0108, B:47:0x010e, B:49:0x0114), top: B:110:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c1 A[Catch: all -> 0x004e, TryCatch #4 {all -> 0x004e, blocks: (B:9:0x0026, B:95:0x0231, B:92:0x020b, B:100:0x0240, B:12:0x0035, B:68:0x0176, B:63:0x014c, B:65:0x0152, B:71:0x0182, B:72:0x018b, B:74:0x0191, B:76:0x01a3, B:77:0x01a7, B:79:0x01ae, B:80:0x01bb, B:82:0x01c1, B:84:0x01d0, B:85:0x01d4, B:86:0x01e3, B:88:0x01e9, B:90:0x0203, B:70:0x017e, B:15:0x003f, B:51:0x011e, B:53:0x0122, B:57:0x012d, B:60:0x0135, B:62:0x013f, B:78:0x01ac, B:18:0x0049, B:43:0x0104, B:45:0x0108, B:47:0x010e, B:49:0x0114), top: B:110:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e9 A[Catch: all -> 0x004e, LOOP:2: B:86:0x01e3->B:88:0x01e9, LOOP_END, TRY_LEAVE, TryCatch #4 {all -> 0x004e, blocks: (B:9:0x0026, B:95:0x0231, B:92:0x020b, B:100:0x0240, B:12:0x0035, B:68:0x0176, B:63:0x014c, B:65:0x0152, B:71:0x0182, B:72:0x018b, B:74:0x0191, B:76:0x01a3, B:77:0x01a7, B:79:0x01ae, B:80:0x01bb, B:82:0x01c1, B:84:0x01d0, B:85:0x01d4, B:86:0x01e3, B:88:0x01e9, B:90:0x0203, B:70:0x017e, B:15:0x003f, B:51:0x011e, B:53:0x0122, B:57:0x012d, B:60:0x0135, B:62:0x013f, B:78:0x01ac, B:18:0x0049, B:43:0x0104, B:45:0x0108, B:47:0x010e, B:49:0x0114), top: B:110:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020b A[Catch: all -> 0x004e, Exception -> 0x023f, TryCatch #0 {Exception -> 0x023f, blocks: (B:9:0x0026, B:95:0x0231, B:92:0x020b, B:90:0x0203), top: B:110:0x0012 }] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0172 -> B:68:0x0176). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x022e -> B:95:0x0231). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctrv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ctrv ctrvVar = new ctrv(fcxyVar, this.b, this.c, this.i);
        ctrvVar.j = obj;
        return ctrvVar;
    }
}
