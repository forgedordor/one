package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.view.Surface;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class obg implements oau {
    public final Context a;
    private final ncp b;

    public obg(obf obfVar) {
        this.a = obfVar.a;
        this.b = obfVar.b;
    }

    public static ocp b(mau mauVar, String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
        String string = mauVar.toString();
        String str2 = mauVar.o;
        mee.f(str2);
        return ocp.b(illegalArgumentException, 3003, new oco(string, mbw.l(str2), true, null));
    }

    public final obe a(MediaFormat mediaFormat, final mau mauVar, Surface surface, boolean z, LogSessionId logSessionId) throws ocp {
        MediaFormat mediaFormat2;
        mau mauVar2;
        Surface surface2;
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        mee.f(mauVar.o);
        try {
            ArrayList arrayList = new ArrayList(ncy.g(mauVar, false, false));
            ncy.e(arrayList, new ncx() { // from class: ncq
                @Override // defpackage.ncx
                public final int a(Object obj) {
                    nci nciVar = (nci) obj;
                    int i2 = ncy.a;
                    try {
                        return !nciVar.e(mauVar) ? 0 : 1;
                    } catch (ncv unused) {
                        return -1;
                    }
                }
            });
            if (arrayList.isEmpty()) {
                throw b(mauVar, "No decoders for format");
            }
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    nci nciVar = (nci) arrayList.get(i2);
                    if (!nciVar.g) {
                        arrayList2.add(nciVar);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                }
            }
            if (Build.VERSION.SDK_INT >= 31 && ((nci) arrayList.get(0)).c.equals("video/dolby-vision")) {
                mediaFormat.setInteger("color-transfer-request", 7);
            }
            if (Build.VERSION.SDK_INT >= 35 && logSessionId != null) {
                oet.a(mediaFormat, logSessionId);
            }
            ArrayList arrayList3 = new ArrayList();
            Context context = this.a;
            for (nci nciVar2 : arrayList.subList(0, 1)) {
                mediaFormat.setString("mime", nciVar2.c);
                try {
                    mediaFormat2 = mediaFormat;
                    mauVar2 = mauVar;
                    surface2 = surface;
                } catch (ocp e) {
                    e = e;
                    mediaFormat2 = mediaFormat;
                    mauVar2 = mauVar;
                    surface2 = surface;
                }
                try {
                    obe obeVar = new obe(context, mauVar2, mediaFormat2, nciVar2.a, true, surface2);
                    obeVar.c();
                    return obeVar;
                } catch (ocp e2) {
                    e = e2;
                    arrayList3.add(e);
                    mauVar = mauVar2;
                    mediaFormat = mediaFormat2;
                    surface = surface2;
                }
            }
            throw ((ocp) arrayList3.get(0));
        } catch (ncv e3) {
            mff.d("DefaultDecoderFactory", "Error querying decoders", e3);
            throw b(mauVar, "Querying codecs failed");
        }
    }
}
