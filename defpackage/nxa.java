package defpackage;

import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxa implements nvn {
    private final XmlPullParserFactory i;
    private static final Pattern c = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern d = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern e = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern a = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern b = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern g = Pattern.compile("^(\\d+) (\\d+)$");
    private static final nwy h = new nwy(30.0f, 1, 1);

    public nxa() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.i = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long d(java.lang.String r18, defpackage.nwy r19) throws java.lang.NumberFormatException, defpackage.nvc {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxa.d(java.lang.String, nwy):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.text.Layout.Alignment e(java.lang.String r5) {
        /*
            java.lang.String r5 = defpackage.ejuf.c(r5)
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L38;
                case 100571: goto L2e;
                case 3317767: goto L24;
                case 108511772: goto L1a;
                case 109757538: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L42
        L10:
            java.lang.String r0 = "start"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r4
            goto L43
        L1a:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r3
            goto L43
        L24:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 0
            goto L43
        L2e:
            java.lang.String r0 = "end"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r2
            goto L43
        L38:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r1
            goto L43
        L42:
            r5 = -1
        L43:
            if (r5 == 0) goto L55
            if (r5 == r4) goto L55
            if (r5 == r3) goto L52
            if (r5 == r2) goto L52
            if (r5 == r1) goto L4f
            r5 = 0
            return r5
        L4f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            return r5
        L52:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r5
        L55:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxa.e(java.lang.String):android.text.Layout$Alignment");
    }

    private static nxd f(nxd nxdVar) {
        return nxdVar == null ? new nxd() : nxdVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.nxd g(org.xmlpull.v1.XmlPullParser r16, defpackage.nxd r17) throws defpackage.nvc {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxa.g(org.xmlpull.v1.XmlPullParser, nxd):nxd");
    }

    private static String[] h(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : mgb.ah(strTrim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(13:40|365|41|42|383|43|(1:(6:46|385|50|51|55|(0)(0))(1:47))(1:48)|49|385|50|51|55|(0)(0)) */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x048f A[Catch: IOException -> 0x06d8, XmlPullParserException -> 0x06e1, TRY_LEAVE, TryCatch #14 {IOException -> 0x06d8, XmlPullParserException -> 0x06e1, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x0068, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:18:0x0090, B:20:0x009a, B:24:0x00ab, B:26:0x00c4, B:28:0x00d0, B:29:0x00d4, B:31:0x00e0, B:32:0x00e4, B:55:0x0156, B:67:0x01a9, B:70:0x01bf, B:72:0x01c5, B:74:0x01cd, B:76:0x01d5, B:78:0x01dd, B:80:0x01e5, B:82:0x01ed, B:84:0x01f3, B:86:0x01fb, B:88:0x0203, B:90:0x0209, B:92:0x020f, B:94:0x0217, B:96:0x021f, B:99:0x0228, B:352:0x06be, B:100:0x024e, B:102:0x0254, B:104:0x025d, B:106:0x026c, B:108:0x0277, B:110:0x0289, B:112:0x028d, B:235:0x04eb, B:113:0x0291, B:116:0x029b, B:118:0x02a1, B:120:0x02ac, B:122:0x02b2, B:123:0x02b9, B:126:0x02c3, B:234:0x04e6, B:130:0x02ce, B:132:0x02d6, B:134:0x02dc, B:136:0x02e4, B:138:0x02e8, B:141:0x02fd, B:155:0x0374, B:157:0x037e, B:159:0x0384, B:161:0x038c, B:163:0x0390, B:166:0x03a5, B:180:0x0438, B:182:0x0440, B:203:0x0487, B:205:0x048f, B:232:0x04d9, B:168:0x03c6, B:169:0x03d5, B:172:0x03dd, B:175:0x03ed, B:177:0x0414, B:178:0x0423, B:143:0x0319, B:144:0x0323, B:147:0x032d, B:150:0x0338, B:152:0x035a, B:153:0x0365, B:240:0x04fd, B:243:0x051b, B:290:0x05ac, B:277:0x0578, B:280:0x0581, B:331:0x061f, B:281:0x0586, B:284:0x0590, B:287:0x059b, B:288:0x05a1, B:289:0x05a7, B:296:0x05ba, B:300:0x05c4, B:304:0x05cd, B:314:0x05e1, B:321:0x05f3, B:323:0x0606, B:325:0x060b, B:317:0x05e8, B:58:0x0161, B:60:0x016d, B:63:0x0178, B:65:0x0197, B:36:0x00fb, B:38:0x0107, B:41:0x0113, B:43:0x0121, B:50:0x013c, B:54:0x014c, B:335:0x063f, B:338:0x0681, B:340:0x068b, B:342:0x069c, B:345:0x06af, B:349:0x06b7, B:353:0x06d2), top: B:387:0x0008, inners: #0, #4, #5, #8, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04e6 A[Catch: IOException -> 0x06d8, XmlPullParserException -> 0x06e1, TryCatch #14 {IOException -> 0x06d8, XmlPullParserException -> 0x06e1, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x0068, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:18:0x0090, B:20:0x009a, B:24:0x00ab, B:26:0x00c4, B:28:0x00d0, B:29:0x00d4, B:31:0x00e0, B:32:0x00e4, B:55:0x0156, B:67:0x01a9, B:70:0x01bf, B:72:0x01c5, B:74:0x01cd, B:76:0x01d5, B:78:0x01dd, B:80:0x01e5, B:82:0x01ed, B:84:0x01f3, B:86:0x01fb, B:88:0x0203, B:90:0x0209, B:92:0x020f, B:94:0x0217, B:96:0x021f, B:99:0x0228, B:352:0x06be, B:100:0x024e, B:102:0x0254, B:104:0x025d, B:106:0x026c, B:108:0x0277, B:110:0x0289, B:112:0x028d, B:235:0x04eb, B:113:0x0291, B:116:0x029b, B:118:0x02a1, B:120:0x02ac, B:122:0x02b2, B:123:0x02b9, B:126:0x02c3, B:234:0x04e6, B:130:0x02ce, B:132:0x02d6, B:134:0x02dc, B:136:0x02e4, B:138:0x02e8, B:141:0x02fd, B:155:0x0374, B:157:0x037e, B:159:0x0384, B:161:0x038c, B:163:0x0390, B:166:0x03a5, B:180:0x0438, B:182:0x0440, B:203:0x0487, B:205:0x048f, B:232:0x04d9, B:168:0x03c6, B:169:0x03d5, B:172:0x03dd, B:175:0x03ed, B:177:0x0414, B:178:0x0423, B:143:0x0319, B:144:0x0323, B:147:0x032d, B:150:0x0338, B:152:0x035a, B:153:0x0365, B:240:0x04fd, B:243:0x051b, B:290:0x05ac, B:277:0x0578, B:280:0x0581, B:331:0x061f, B:281:0x0586, B:284:0x0590, B:287:0x059b, B:288:0x05a1, B:289:0x05a7, B:296:0x05ba, B:300:0x05c4, B:304:0x05cd, B:314:0x05e1, B:321:0x05f3, B:323:0x0606, B:325:0x060b, B:317:0x05e8, B:58:0x0161, B:60:0x016d, B:63:0x0178, B:65:0x0197, B:36:0x00fb, B:38:0x0107, B:41:0x0113, B:43:0x0121, B:50:0x013c, B:54:0x014c, B:335:0x063f, B:338:0x0681, B:340:0x068b, B:342:0x069c, B:345:0x06af, B:349:0x06b7, B:353:0x06d2), top: B:387:0x0008, inners: #0, #4, #5, #8, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04f5 A[LOOP:1: B:102:0x0254->B:238:0x04f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x04f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0161 A[Catch: IOException -> 0x06d8, XmlPullParserException -> 0x06e1, TryCatch #14 {IOException -> 0x06d8, XmlPullParserException -> 0x06e1, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x0068, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:18:0x0090, B:20:0x009a, B:24:0x00ab, B:26:0x00c4, B:28:0x00d0, B:29:0x00d4, B:31:0x00e0, B:32:0x00e4, B:55:0x0156, B:67:0x01a9, B:70:0x01bf, B:72:0x01c5, B:74:0x01cd, B:76:0x01d5, B:78:0x01dd, B:80:0x01e5, B:82:0x01ed, B:84:0x01f3, B:86:0x01fb, B:88:0x0203, B:90:0x0209, B:92:0x020f, B:94:0x0217, B:96:0x021f, B:99:0x0228, B:352:0x06be, B:100:0x024e, B:102:0x0254, B:104:0x025d, B:106:0x026c, B:108:0x0277, B:110:0x0289, B:112:0x028d, B:235:0x04eb, B:113:0x0291, B:116:0x029b, B:118:0x02a1, B:120:0x02ac, B:122:0x02b2, B:123:0x02b9, B:126:0x02c3, B:234:0x04e6, B:130:0x02ce, B:132:0x02d6, B:134:0x02dc, B:136:0x02e4, B:138:0x02e8, B:141:0x02fd, B:155:0x0374, B:157:0x037e, B:159:0x0384, B:161:0x038c, B:163:0x0390, B:166:0x03a5, B:180:0x0438, B:182:0x0440, B:203:0x0487, B:205:0x048f, B:232:0x04d9, B:168:0x03c6, B:169:0x03d5, B:172:0x03dd, B:175:0x03ed, B:177:0x0414, B:178:0x0423, B:143:0x0319, B:144:0x0323, B:147:0x032d, B:150:0x0338, B:152:0x035a, B:153:0x0365, B:240:0x04fd, B:243:0x051b, B:290:0x05ac, B:277:0x0578, B:280:0x0581, B:331:0x061f, B:281:0x0586, B:284:0x0590, B:287:0x059b, B:288:0x05a1, B:289:0x05a7, B:296:0x05ba, B:300:0x05c4, B:304:0x05cd, B:314:0x05e1, B:321:0x05f3, B:323:0x0606, B:325:0x060b, B:317:0x05e8, B:58:0x0161, B:60:0x016d, B:63:0x0178, B:65:0x0197, B:36:0x00fb, B:38:0x0107, B:41:0x0113, B:43:0x0121, B:50:0x013c, B:54:0x014c, B:335:0x063f, B:338:0x0681, B:340:0x068b, B:342:0x069c, B:345:0x06af, B:349:0x06b7, B:353:0x06d2), top: B:387:0x0008, inners: #0, #4, #5, #8, #10 }] */
    @Override // defpackage.nvn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nva a(byte[] r42, int r43, int r44) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException, defpackage.nvc {
        /*
            Method dump skipped, instructions count: 1796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxa.a(byte[], int, int):nva");
    }

    @Override // defpackage.nvn
    public final void b(byte[] bArr, int i, int i2, nvm nvmVar, meo meoVar) {
        nux.a(a(bArr, i, i2), nvmVar, meoVar);
    }

    @Override // defpackage.nvn
    public final /* synthetic */ void c() {
    }
}
