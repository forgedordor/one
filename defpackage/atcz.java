package defpackage;

import j$.util.Optional;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atcz implements atdd {
    private final dggz a;
    private final atdk b;
    private int c = 0;
    private Optional d = Optional.empty();

    public atcz(dggz dggzVar, atdk atdkVar) {
        this.a = dggzVar;
        this.b = atdkVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0187 A[Catch: atdh -> 0x0328, TryCatch #1 {atdh -> 0x0328, blocks: (B:7:0x0021, B:8:0x0092, B:10:0x0098, B:14:0x00b4, B:40:0x0114, B:50:0x0163, B:51:0x017e, B:53:0x0187, B:55:0x0191, B:57:0x01a3, B:59:0x01ad, B:61:0x01b1, B:64:0x01b7, B:66:0x01dc, B:68:0x01e4, B:70:0x01ec, B:72:0x01f2, B:74:0x020a, B:76:0x0212, B:78:0x0218, B:79:0x0233, B:81:0x0245, B:83:0x0262, B:85:0x02a5, B:86:0x02b1, B:82:0x0256, B:87:0x02c5, B:88:0x02cc, B:89:0x02cd, B:90:0x02df, B:91:0x02e0, B:92:0x02e7, B:93:0x02e8, B:94:0x02ef, B:95:0x02f0, B:96:0x02f7, B:97:0x02f8, B:99:0x0301, B:100:0x0306, B:102:0x030a, B:103:0x030f, B:105:0x0313, B:106:0x0318, B:107:0x0327), top: B:124:0x0021 }] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v50 */
    @Override // defpackage.atdd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eiju a() throws defpackage.atdh {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atcz.a():eiju");
    }

    @Override // defpackage.atdd
    public final boolean b(UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        if (this.c == 1) {
            this.d = Optional.of(urlResponseInfo);
        }
        return this.c < 2 ? httpStatusCode == 401 : httpStatusCode != 200;
    }
}
