package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxh implements nvn {
    private final mfr a = new mfr();
    private final mfr b = new mfr();
    private final nxg c;
    private Inflater d;

    public nxh(List list) throws NumberFormatException {
        int i;
        nxg nxgVar = new nxg();
        this.c = nxgVar;
        for (String str : mgb.ah(new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim(), "\\r?\\n")) {
            if (str.startsWith("palette: ")) {
                String[] strArrAh = mgb.ah(str.substring(9), ",");
                nxgVar.d = new int[strArrAh.length];
                for (int i2 = 0; i2 < strArrAh.length; i2++) {
                    int[] iArr = nxgVar.d;
                    try {
                        i = Integer.parseInt(strArrAh[i2].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str.startsWith("size: ")) {
                String[] strArrAh2 = mgb.ah(str.substring(6).trim(), "x");
                if (strArrAh2.length == 2) {
                    try {
                        nxgVar.e = Integer.parseInt(strArrAh2[0]);
                        nxgVar.f = Integer.parseInt(strArrAh2[1]);
                        nxgVar.b = true;
                    } catch (RuntimeException e) {
                        mff.g("VobsubParser", "Parsing IDX failed", e);
                    }
                }
            }
        }
    }

    @Override // defpackage.nvn
    public final /* synthetic */ nva a(byte[] bArr, int i, int i2) {
        return nvj.a(this, bArr, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01cd  */
    @Override // defpackage.nvn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(byte[] r18, int r19, int r20, defpackage.nvm r21, defpackage.meo r22) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxh.b(byte[], int, int, nvm, meo):void");
    }

    @Override // defpackage.nvn
    public final /* synthetic */ void c() {
    }
}
