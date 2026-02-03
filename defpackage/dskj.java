package defpackage;

import android.text.TextUtils;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dskj {
    public static String a(ethk ethkVar) {
        etht ethtVar = ethkVar.c;
        if (ethtVar == null) {
            ethtVar = etht.a;
        }
        return b(ethtVar);
    }

    public static String b(etht ethtVar) {
        ejwl.a(ethtVar != null);
        ejwl.a(ethtVar.c.size() > 0);
        return TextUtils.join(",", new TreeSet(ethtVar.c));
    }
}
