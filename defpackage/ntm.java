package defpackage;

import j$.util.Objects;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ntm {
    public static String a(List list) {
        Iterator it = list.iterator();
        String str = null;
        boolean z = false;
        while (it.hasNext()) {
            String str2 = ((ntz) it.next()).a.g.o;
            if (mbw.l(str2)) {
                return "video/mp4";
            }
            if (mbw.i(str2)) {
                z = true;
            } else if (mbw.j(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? "audio/mp4" : str != null ? str : "application/mp4";
    }
}
