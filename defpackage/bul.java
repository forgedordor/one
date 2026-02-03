package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bul {
    public static String a(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return buk.a("|", arrayList);
    }

    public static void b(Collection collection, int i) {
        boolean zContains = collection.contains(Integer.valueOf(i));
        Locale locale = Locale.US;
        String strA = a(i);
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(a(((Integer) it.next()).intValue()));
        }
        lcg.b(zContains, String.format(locale, "Effects target %s is not in the supported list %s.", strA, "[" + buk.a(", ", arrayList) + "]"));
    }
}
