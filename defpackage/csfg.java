package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csfg {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/fuzzymatching/TachyonTemplateFetcher");
    public final fcsu b;
    public final fdjx c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;

    public csfg(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fdjxVar.getClass();
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.b = fcsuVar4;
        this.c = fdjxVar;
    }

    private static final void b(HashMap map, String str, ezax ezaxVar) {
        ezax ezaxVar2;
        ezax ezaxVar3 = (ezax) map.get(str);
        if (ezaxVar3 == null) {
            map.put(str, ezaxVar);
            return;
        }
        ezax ezaxVar4 = ezax.RCS;
        if ((ezaxVar3 == ezaxVar4 && ezaxVar == ezax.XMS) || ((ezaxVar3 == ezax.XMS && ezaxVar == ezaxVar4) || ezaxVar3 == (ezaxVar2 = ezax.PROTOCOL_UNSPECIFIED) || ezaxVar == ezaxVar2)) {
            map.put(str, ezax.PROTOCOL_UNSPECIFIED);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014d A[Catch: all -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x006c, blocks: (B:57:0x0147, B:60:0x014d, B:63:0x016c, B:68:0x018e, B:73:0x01a9, B:75:0x01b1, B:78:0x01d6, B:88:0x01ec, B:92:0x01f3, B:93:0x020d, B:95:0x024a, B:97:0x0251, B:96:0x024f, B:103:0x027d, B:105:0x0284, B:107:0x0291, B:110:0x02bc, B:153:0x03fa, B:164:0x044e, B:165:0x0451, B:104:0x0282, B:167:0x0454, B:72:0x01a6, B:172:0x0459, B:173:0x045c, B:30:0x0068, B:39:0x0095, B:41:0x009f, B:49:0x011f, B:51:0x0127, B:54:0x012e, B:42:0x00be, B:44:0x00cf, B:45:0x00ef, B:47:0x0100, B:48:0x0107, B:37:0x0083, B:64:0x0185, B:66:0x0188, B:70:0x0192, B:170:0x0457, B:111:0x02f0, B:112:0x02fe, B:114:0x0304, B:115:0x0313, B:116:0x031c, B:118:0x0322, B:119:0x0331, B:120:0x0335, B:122:0x033b, B:124:0x034e, B:125:0x0350, B:126:0x0357, B:127:0x035b, B:129:0x0361, B:131:0x0374, B:132:0x0376, B:134:0x0381, B:137:0x0386, B:141:0x0390, B:145:0x0399, B:146:0x039d, B:142:0x0393, B:147:0x03a1, B:148:0x03b2, B:150:0x03b8, B:151:0x03f5, B:162:0x044c), top: B:181:0x0030, inners: #2, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016c A[Catch: all -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x006c, blocks: (B:57:0x0147, B:60:0x014d, B:63:0x016c, B:68:0x018e, B:73:0x01a9, B:75:0x01b1, B:78:0x01d6, B:88:0x01ec, B:92:0x01f3, B:93:0x020d, B:95:0x024a, B:97:0x0251, B:96:0x024f, B:103:0x027d, B:105:0x0284, B:107:0x0291, B:110:0x02bc, B:153:0x03fa, B:164:0x044e, B:165:0x0451, B:104:0x0282, B:167:0x0454, B:72:0x01a6, B:172:0x0459, B:173:0x045c, B:30:0x0068, B:39:0x0095, B:41:0x009f, B:49:0x011f, B:51:0x0127, B:54:0x012e, B:42:0x00be, B:44:0x00cf, B:45:0x00ef, B:47:0x0100, B:48:0x0107, B:37:0x0083, B:64:0x0185, B:66:0x0188, B:70:0x0192, B:170:0x0457, B:111:0x02f0, B:112:0x02fe, B:114:0x0304, B:115:0x0313, B:116:0x031c, B:118:0x0322, B:119:0x0331, B:120:0x0335, B:122:0x033b, B:124:0x034e, B:125:0x0350, B:126:0x0357, B:127:0x035b, B:129:0x0361, B:131:0x0374, B:132:0x0376, B:134:0x0381, B:137:0x0386, B:141:0x0390, B:145:0x0399, B:146:0x039d, B:142:0x0393, B:147:0x03a1, B:148:0x03b2, B:150:0x03b8, B:151:0x03f5, B:162:0x044c), top: B:181:0x0030, inners: #2, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7, types: [eieu, java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csfg.a(fcxy):java.lang.Object");
    }
}
