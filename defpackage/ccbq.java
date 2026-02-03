package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccbq implements ccbo {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/core/processors/DecryptedMessageProcessor");
    private final atzx b;
    private final atak c;

    public ccbq(atzx atzxVar, atak atakVar) {
        atakVar.getClass();
        this.b = atzxVar;
        this.c = atakVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0389 A[Catch: all -> 0x0403, TryCatch #1 {all -> 0x0403, blocks: (B:55:0x01a0, B:63:0x01fc, B:65:0x0200, B:66:0x0202, B:68:0x021e, B:70:0x0236, B:72:0x0266, B:76:0x0285, B:80:0x028d, B:81:0x0299, B:82:0x029a, B:84:0x02ab, B:86:0x02b8, B:87:0x02ba, B:89:0x02c3, B:90:0x02c5, B:92:0x02dd, B:94:0x02ef, B:95:0x02f1, B:96:0x0301, B:100:0x0333, B:102:0x0389, B:103:0x038b, B:97:0x031f, B:98:0x0326, B:99:0x0327, B:58:0x01ed, B:59:0x01f4), top: B:141:0x01a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0402 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0200 A[Catch: all -> 0x0403, TryCatch #1 {all -> 0x0403, blocks: (B:55:0x01a0, B:63:0x01fc, B:65:0x0200, B:66:0x0202, B:68:0x021e, B:70:0x0236, B:72:0x0266, B:76:0x0285, B:80:0x028d, B:81:0x0299, B:82:0x029a, B:84:0x02ab, B:86:0x02b8, B:87:0x02ba, B:89:0x02c3, B:90:0x02c5, B:92:0x02dd, B:94:0x02ef, B:95:0x02f1, B:96:0x0301, B:100:0x0333, B:102:0x0389, B:103:0x038b, B:97:0x031f, B:98:0x0326, B:99:0x0327, B:58:0x01ed, B:59:0x01f4), top: B:141:0x01a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021e A[Catch: all -> 0x0403, TryCatch #1 {all -> 0x0403, blocks: (B:55:0x01a0, B:63:0x01fc, B:65:0x0200, B:66:0x0202, B:68:0x021e, B:70:0x0236, B:72:0x0266, B:76:0x0285, B:80:0x028d, B:81:0x0299, B:82:0x029a, B:84:0x02ab, B:86:0x02b8, B:87:0x02ba, B:89:0x02c3, B:90:0x02c5, B:92:0x02dd, B:94:0x02ef, B:95:0x02f1, B:96:0x0301, B:100:0x0333, B:102:0x0389, B:103:0x038b, B:97:0x031f, B:98:0x0326, B:99:0x0327, B:58:0x01ed, B:59:0x01f4), top: B:141:0x01a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0236 A[Catch: all -> 0x0403, TryCatch #1 {all -> 0x0403, blocks: (B:55:0x01a0, B:63:0x01fc, B:65:0x0200, B:66:0x0202, B:68:0x021e, B:70:0x0236, B:72:0x0266, B:76:0x0285, B:80:0x028d, B:81:0x0299, B:82:0x029a, B:84:0x02ab, B:86:0x02b8, B:87:0x02ba, B:89:0x02c3, B:90:0x02c5, B:92:0x02dd, B:94:0x02ef, B:95:0x02f1, B:96:0x0301, B:100:0x0333, B:102:0x0389, B:103:0x038b, B:97:0x031f, B:98:0x0326, B:99:0x0327, B:58:0x01ed, B:59:0x01f4), top: B:141:0x01a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0327 A[Catch: all -> 0x0403, TryCatch #1 {all -> 0x0403, blocks: (B:55:0x01a0, B:63:0x01fc, B:65:0x0200, B:66:0x0202, B:68:0x021e, B:70:0x0236, B:72:0x0266, B:76:0x0285, B:80:0x028d, B:81:0x0299, B:82:0x029a, B:84:0x02ab, B:86:0x02b8, B:87:0x02ba, B:89:0x02c3, B:90:0x02c5, B:92:0x02dd, B:94:0x02ef, B:95:0x02f1, B:96:0x0301, B:100:0x0333, B:102:0x0389, B:103:0x038b, B:97:0x031f, B:98:0x0326, B:99:0x0327, B:58:0x01ed, B:59:0x01f4), top: B:141:0x01a0 }] */
    /* JADX WARN: Type inference failed for: r5v0, types: [fcyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // defpackage.ccbo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.cbwd r27, defpackage.epun r28, defpackage.fcxy r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1069
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccbq.a(cbwd, epun, fcxy):java.lang.Object");
    }

    @Override // defpackage.ccbo
    public final boolean b() {
        return true;
    }
}
