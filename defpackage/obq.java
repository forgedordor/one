package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class obq implements oav {
    public final Context a;
    public final oew b;
    public final oam c;

    public obq(obm obmVar) {
        this.a = obmVar.a;
        this.b = obmVar.c;
        this.c = obmVar.d;
    }

    public static ocp a(mau mauVar, String str) {
        return ocp.b(new IllegalArgumentException(str), 4003, new oco(mauVar.toString(), mbw.l(mauVar.o), false, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ocp b(defpackage.mau r4, boolean r5) {
        /*
            if (r5 == 0) goto L19
            mag r0 = r4.E
            boolean r1 = defpackage.mag.i(r0)
            if (r1 == 0) goto L19
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "No MIME type is supported by both encoder and muxer. Requested HDR colorInfo: "
            java.lang.String r0 = r1.concat(r0)
            goto L1b
        L19:
            java.lang.String r0 = "No MIME type is supported by both encoder and muxer."
        L1b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            oco r0 = new oco
            java.lang.String r4 = r4.toString()
            r2 = 0
            r3 = 0
            r0.<init>(r4, r5, r2, r3)
            r4 = 4003(0xfa3, float:5.61E-42)
            ocp r4 = defpackage.ocp.b(r1, r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.obq.b(mau, boolean):ocp");
    }

    public static ekgb c(List list, obn obnVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < list.size(); i2++) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) list.get(i2);
            int iA = obnVar.a(mediaCodecInfo);
            if (iA != Integer.MAX_VALUE) {
                if (iA < i) {
                    arrayList.clear();
                    arrayList.add(mediaCodecInfo);
                    i = iA;
                } else if (iA == i) {
                    arrayList.add(mediaCodecInfo);
                }
            }
        }
        return ekgb.n(arrayList);
    }
}
