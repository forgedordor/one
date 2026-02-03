package defpackage;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncy {
    public static final /* synthetic */ int a = 0;
    private static final HashMap b = new HashMap();

    public static nci a() {
        List listC = c("audio/raw", false, false);
        if (listC.isEmpty()) {
            return null;
        }
        return (nci) listC.get(0);
    }

    public static String b(mau mauVar) {
        Pair pairA;
        String str = mauVar.o;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (pairA = mek.a(mauVar)) != null) {
            int iIntValue = ((Integer) pairA.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011b A[Catch: Exception -> 0x01bb, all -> 0x0224, PHI: r13
      0x011b: PHI (r13v4 boolean) = (r13v3 boolean), (r13v8 boolean) binds: [B:67:0x0116, B:69:0x011a] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {, blocks: (B:4:0x0009, B:8:0x001a, B:9:0x0025, B:11:0x0035, B:13:0x0042, B:17:0x004d, B:19:0x0058, B:21:0x0060, B:58:0x00e9, B:64:0x0104, B:70:0x011b, B:72:0x0121, B:77:0x012f, B:79:0x013a, B:86:0x015d, B:88:0x0161, B:93:0x016e, B:95:0x0175, B:99:0x0180, B:102:0x0188, B:104:0x0190, B:106:0x019a, B:111:0x01b2, B:80:0x013e, B:82:0x014e, B:84:0x0156, B:73:0x0126, B:114:0x01bc, B:115:0x01cb, B:24:0x006a, B:25:0x006d, B:27:0x0076, B:30:0x0081, B:32:0x0089, B:35:0x0094, B:37:0x009c, B:39:0x00a4, B:42:0x00af, B:44:0x00b7, B:47:0x00c2, B:49:0x00ca, B:52:0x00d5, B:54:0x00dd, B:120:0x01d9, B:121:0x01dc, B:123:0x01e4, B:124:0x01ec, B:126:0x01f2, B:128:0x01f9, B:130:0x0209, B:131:0x0212, B:135:0x021e, B:136:0x0223), top: B:142:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0121 A[Catch: Exception -> 0x01bb, all -> 0x0224, TryCatch #1 {, blocks: (B:4:0x0009, B:8:0x001a, B:9:0x0025, B:11:0x0035, B:13:0x0042, B:17:0x004d, B:19:0x0058, B:21:0x0060, B:58:0x00e9, B:64:0x0104, B:70:0x011b, B:72:0x0121, B:77:0x012f, B:79:0x013a, B:86:0x015d, B:88:0x0161, B:93:0x016e, B:95:0x0175, B:99:0x0180, B:102:0x0188, B:104:0x0190, B:106:0x019a, B:111:0x01b2, B:80:0x013e, B:82:0x014e, B:84:0x0156, B:73:0x0126, B:114:0x01bc, B:115:0x01cb, B:24:0x006a, B:25:0x006d, B:27:0x0076, B:30:0x0081, B:32:0x0089, B:35:0x0094, B:37:0x009c, B:39:0x00a4, B:42:0x00af, B:44:0x00b7, B:47:0x00c2, B:49:0x00ca, B:52:0x00d5, B:54:0x00dd, B:120:0x01d9, B:121:0x01dc, B:123:0x01e4, B:124:0x01ec, B:126:0x01f2, B:128:0x01f9, B:130:0x0209, B:131:0x0212, B:135:0x021e, B:136:0x0223), top: B:142:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0126 A[Catch: Exception -> 0x01bb, all -> 0x0224, TryCatch #1 {, blocks: (B:4:0x0009, B:8:0x001a, B:9:0x0025, B:11:0x0035, B:13:0x0042, B:17:0x004d, B:19:0x0058, B:21:0x0060, B:58:0x00e9, B:64:0x0104, B:70:0x011b, B:72:0x0121, B:77:0x012f, B:79:0x013a, B:86:0x015d, B:88:0x0161, B:93:0x016e, B:95:0x0175, B:99:0x0180, B:102:0x0188, B:104:0x0190, B:106:0x019a, B:111:0x01b2, B:80:0x013e, B:82:0x014e, B:84:0x0156, B:73:0x0126, B:114:0x01bc, B:115:0x01cb, B:24:0x006a, B:25:0x006d, B:27:0x0076, B:30:0x0081, B:32:0x0089, B:35:0x0094, B:37:0x009c, B:39:0x00a4, B:42:0x00af, B:44:0x00b7, B:47:0x00c2, B:49:0x00ca, B:52:0x00d5, B:54:0x00dd, B:120:0x01d9, B:121:0x01dc, B:123:0x01e4, B:124:0x01ec, B:126:0x01f2, B:128:0x01f9, B:130:0x0209, B:131:0x0212, B:135:0x021e, B:136:0x0223), top: B:142:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013a A[Catch: Exception -> 0x01bb, all -> 0x0224, TryCatch #1 {, blocks: (B:4:0x0009, B:8:0x001a, B:9:0x0025, B:11:0x0035, B:13:0x0042, B:17:0x004d, B:19:0x0058, B:21:0x0060, B:58:0x00e9, B:64:0x0104, B:70:0x011b, B:72:0x0121, B:77:0x012f, B:79:0x013a, B:86:0x015d, B:88:0x0161, B:93:0x016e, B:95:0x0175, B:99:0x0180, B:102:0x0188, B:104:0x0190, B:106:0x019a, B:111:0x01b2, B:80:0x013e, B:82:0x014e, B:84:0x0156, B:73:0x0126, B:114:0x01bc, B:115:0x01cb, B:24:0x006a, B:25:0x006d, B:27:0x0076, B:30:0x0081, B:32:0x0089, B:35:0x0094, B:37:0x009c, B:39:0x00a4, B:42:0x00af, B:44:0x00b7, B:47:0x00c2, B:49:0x00ca, B:52:0x00d5, B:54:0x00dd, B:120:0x01d9, B:121:0x01dc, B:123:0x01e4, B:124:0x01ec, B:126:0x01f2, B:128:0x01f9, B:130:0x0209, B:131:0x0212, B:135:0x021e, B:136:0x0223), top: B:142:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013e A[Catch: Exception -> 0x01bb, all -> 0x0224, TryCatch #1 {, blocks: (B:4:0x0009, B:8:0x001a, B:9:0x0025, B:11:0x0035, B:13:0x0042, B:17:0x004d, B:19:0x0058, B:21:0x0060, B:58:0x00e9, B:64:0x0104, B:70:0x011b, B:72:0x0121, B:77:0x012f, B:79:0x013a, B:86:0x015d, B:88:0x0161, B:93:0x016e, B:95:0x0175, B:99:0x0180, B:102:0x0188, B:104:0x0190, B:106:0x019a, B:111:0x01b2, B:80:0x013e, B:82:0x014e, B:84:0x0156, B:73:0x0126, B:114:0x01bc, B:115:0x01cb, B:24:0x006a, B:25:0x006d, B:27:0x0076, B:30:0x0081, B:32:0x0089, B:35:0x0094, B:37:0x009c, B:39:0x00a4, B:42:0x00af, B:44:0x00b7, B:47:0x00c2, B:49:0x00ca, B:52:0x00d5, B:54:0x00dd, B:120:0x01d9, B:121:0x01dc, B:123:0x01e4, B:124:0x01ec, B:126:0x01f2, B:128:0x01f9, B:130:0x0209, B:131:0x0212, B:135:0x021e, B:136:0x0223), top: B:142:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015d A[Catch: Exception -> 0x01bb, all -> 0x0224, TryCatch #1 {, blocks: (B:4:0x0009, B:8:0x001a, B:9:0x0025, B:11:0x0035, B:13:0x0042, B:17:0x004d, B:19:0x0058, B:21:0x0060, B:58:0x00e9, B:64:0x0104, B:70:0x011b, B:72:0x0121, B:77:0x012f, B:79:0x013a, B:86:0x015d, B:88:0x0161, B:93:0x016e, B:95:0x0175, B:99:0x0180, B:102:0x0188, B:104:0x0190, B:106:0x019a, B:111:0x01b2, B:80:0x013e, B:82:0x014e, B:84:0x0156, B:73:0x0126, B:114:0x01bc, B:115:0x01cb, B:24:0x006a, B:25:0x006d, B:27:0x0076, B:30:0x0081, B:32:0x0089, B:35:0x0094, B:37:0x009c, B:39:0x00a4, B:42:0x00af, B:44:0x00b7, B:47:0x00c2, B:49:0x00ca, B:52:0x00d5, B:54:0x00dd, B:120:0x01d9, B:121:0x01dc, B:123:0x01e4, B:124:0x01ec, B:126:0x01f2, B:128:0x01f9, B:130:0x0209, B:131:0x0212, B:135:0x021e, B:136:0x0223), top: B:142:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.util.List c(java.lang.String r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncy.c(java.lang.String, boolean, boolean):java.util.List");
    }

    public static List d(List list, final mau mauVar) {
        ArrayList arrayList = new ArrayList(list);
        e(arrayList, new ncx() { // from class: nct
            @Override // defpackage.ncx
            public final int a(Object obj) {
                nci nciVar = (nci) obj;
                int i = ncy.a;
                mau mauVar2 = mauVar;
                return (nciVar.f(mauVar2) && nciVar.c(mauVar2, false) && nciVar.d(mauVar2)) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static void e(List list, final ncx ncxVar) {
        Collections.sort(list, new Comparator() { // from class: ncr
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i = ncy.a;
                ncx ncxVar2 = ncxVar;
                return ncxVar2.a(obj2) - ncxVar2.a(obj);
            }
        });
    }

    public static List f(mau mauVar, boolean z, boolean z2) {
        String strB = b(mauVar);
        if (strB != null) {
            return c(strB, z, z2);
        }
        int i = ekgb.d;
        return ekoe.a;
    }

    public static List g(mau mauVar, boolean z, boolean z2) {
        List listC = c(mauVar.o, z, z2);
        List listF = f(mauVar, z, z2);
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekfwVar.j(listC);
        ekfwVar.j(listF);
        return ekfwVar.g();
    }

    private static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (mbw.i(str)) {
            return true;
        }
        String strC = ejuf.c(mediaCodecInfo.getName());
        if (strC.startsWith("arc.")) {
            return false;
        }
        if (strC.startsWith("omx.google.") || strC.startsWith("omx.ffmpeg.") || ((strC.startsWith("omx.sec.") && strC.contains(".sw.")) || strC.equals("omx.qcom.video.decoder.hevcswvdec") || strC.startsWith("c2.android.") || strC.startsWith("c2.google."))) {
            return true;
        }
        return (strC.startsWith("omx.") || strC.startsWith("c2.")) ? false : true;
    }
}
