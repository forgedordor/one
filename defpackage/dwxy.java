package defpackage;

import android.util.LruCache;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwxy {
    private static WeakReference a = new WeakReference(null);
    private final LruCache b = new LruCache(50);

    public static synchronized dwxy a() {
        dwxy dwxyVar = (dwxy) a.get();
        if (dwxyVar != null) {
            return dwxyVar;
        }
        dwxy dwxyVar2 = new dwxy();
        a = new WeakReference(dwxyVar2);
        return dwxyVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x02ac A[Catch: all -> 0x02fe, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0018, B:8:0x0026, B:11:0x0031, B:12:0x0037, B:14:0x003d, B:16:0x0065, B:18:0x007d, B:19:0x0084, B:21:0x00a4, B:27:0x00b9, B:32:0x014e, B:34:0x0151, B:62:0x02e2, B:65:0x02ee, B:66:0x02f5, B:28:0x00de, B:29:0x011c, B:30:0x013c, B:36:0x01a1, B:37:0x01a6, B:38:0x01a7, B:40:0x01c2, B:42:0x01d0, B:44:0x01e2, B:45:0x01f6, B:46:0x01fc, B:48:0x020c, B:50:0x021c, B:52:0x0233, B:54:0x023b, B:57:0x0248, B:59:0x024e, B:55:0x0244, B:60:0x02ac, B:67:0x02f6, B:68:0x02fd), top: B:72:0x0003 }] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.CharSequence, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.Bitmap b(defpackage.dwpf r22, int r23, defpackage.dwyb r24) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwxy.b(dwpf, int, dwyb):android.graphics.Bitmap");
    }
}
