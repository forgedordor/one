package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzbw extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    int f;
    final /* synthetic */ bzbx g;
    final /* synthetic */ bzbz h;
    final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzbw(bzbx bzbxVar, bzbz bzbzVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.g = bzbxVar;
        this.h = bzbzVar;
        this.i = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzbw) c((ainv) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fa, code lost:
    
        if (r12.d(r11) == null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:7:0x0012, B:60:0x0154, B:12:0x002a, B:57:0x013e, B:15:0x0040, B:37:0x00d6, B:38:0x00e2, B:39:0x00e5, B:61:0x015a, B:62:0x015d, B:40:0x00e9, B:41:0x00ee, B:42:0x00ef, B:54:0x0121, B:45:0x00f6, B:47:0x00fc, B:52:0x0114, B:53:0x0120, B:18:0x0055, B:23:0x0072, B:25:0x0081, B:33:0x00b2, B:26:0x008b, B:28:0x0092, B:29:0x009c, B:31:0x00a4, B:32:0x00ae, B:21:0x0064), top: B:72:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:7:0x0012, B:60:0x0154, B:12:0x002a, B:57:0x013e, B:15:0x0040, B:37:0x00d6, B:38:0x00e2, B:39:0x00e5, B:61:0x015a, B:62:0x015d, B:40:0x00e9, B:41:0x00ee, B:42:0x00ef, B:54:0x0121, B:45:0x00f6, B:47:0x00fc, B:52:0x0114, B:53:0x0120, B:18:0x0055, B:23:0x0072, B:25:0x0081, B:33:0x00b2, B:26:0x008b, B:28:0x0092, B:29:0x009c, B:31:0x00a4, B:32:0x00ae, B:21:0x0064), top: B:72:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:7:0x0012, B:60:0x0154, B:12:0x002a, B:57:0x013e, B:15:0x0040, B:37:0x00d6, B:38:0x00e2, B:39:0x00e5, B:61:0x015a, B:62:0x015d, B:40:0x00e9, B:41:0x00ee, B:42:0x00ef, B:54:0x0121, B:45:0x00f6, B:47:0x00fc, B:52:0x0114, B:53:0x0120, B:18:0x0055, B:23:0x0072, B:25:0x0081, B:33:0x00b2, B:26:0x008b, B:28:0x0092, B:29:0x009c, B:31:0x00a4, B:32:0x00ae, B:21:0x0064), top: B:72:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:7:0x0012, B:60:0x0154, B:12:0x002a, B:57:0x013e, B:15:0x0040, B:37:0x00d6, B:38:0x00e2, B:39:0x00e5, B:61:0x015a, B:62:0x015d, B:40:0x00e9, B:41:0x00ee, B:42:0x00ef, B:54:0x0121, B:45:0x00f6, B:47:0x00fc, B:52:0x0114, B:53:0x0120, B:18:0x0055, B:23:0x0072, B:25:0x0081, B:33:0x00b2, B:26:0x008b, B:28:0x0092, B:29:0x009c, B:31:0x00a4, B:32:0x00ae, B:21:0x0064), top: B:72:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:7:0x0012, B:60:0x0154, B:12:0x002a, B:57:0x013e, B:15:0x0040, B:37:0x00d6, B:38:0x00e2, B:39:0x00e5, B:61:0x015a, B:62:0x015d, B:40:0x00e9, B:41:0x00ee, B:42:0x00ef, B:54:0x0121, B:45:0x00f6, B:47:0x00fc, B:52:0x0114, B:53:0x0120, B:18:0x0055, B:23:0x0072, B:25:0x0081, B:33:0x00b2, B:26:0x008b, B:28:0x0092, B:29:0x009c, B:31:0x00a4, B:32:0x00ae, B:21:0x0064), top: B:72:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzbw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bzbw(this.g, this.h, this.i, fcxyVar);
    }
}
