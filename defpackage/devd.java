package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class devd {
    public static final devf a;

    static {
        Uri uri = deve.a;
        a = devg.a();
    }

    public static int a(ContentResolver contentResolver, String str, int i) throws NumberFormatException {
        Object obj;
        Integer numValueOf;
        devf devfVar = a;
        devn.e(contentResolver);
        synchronized (devfVar) {
            ((devn) devfVar).c(contentResolver);
            obj = ((devn) devfVar).f;
            numValueOf = (Integer) devn.f(((devn) devfVar).c, str, Integer.valueOf(i));
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        String strA = ((devn) devfVar).a(contentResolver, str, null);
        if (strA != null) {
            try {
                int i2 = Integer.parseInt(strA);
                numValueOf = Integer.valueOf(i2);
                i = i2;
            } catch (NumberFormatException unused) {
            }
        }
        synchronized (devfVar) {
            ((devn) devfVar).d(obj, ((devn) devfVar).c, str, numValueOf);
        }
        return i;
    }

    public static long b(ContentResolver contentResolver, String str, long j) throws NumberFormatException {
        Object obj;
        Long lValueOf;
        devf devfVar = a;
        devn.e(contentResolver);
        synchronized (devfVar) {
            ((devn) devfVar).c(contentResolver);
            obj = ((devn) devfVar).f;
            lValueOf = (Long) devn.f(((devn) devfVar).d, str, Long.valueOf(j));
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        String strA = ((devn) devfVar).a(contentResolver, str, null);
        if (strA != null) {
            try {
                long j2 = Long.parseLong(strA);
                lValueOf = Long.valueOf(j2);
                j = j2;
            } catch (NumberFormatException unused) {
            }
        }
        synchronized (devfVar) {
            ((devn) devfVar).d(obj, ((devn) devfVar).d, str, lValueOf);
        }
        return j;
    }

    public static String c(ContentResolver contentResolver, String str, String str2) {
        return a.a(contentResolver, str, str2);
    }

    public static Map d(ContentResolver contentResolver, String... strArr) {
        try {
            devk devkVar = ((devn) a).i;
            return devk.a(contentResolver, strArr, new devl() { // from class: devi
                @Override // defpackage.devl
                public final Map a(int i) {
                    return new TreeMap();
                }
            });
        } catch (devm unused) {
            return new TreeMap();
        }
    }

    public static boolean e(ContentResolver contentResolver, String str, boolean z) {
        Object obj;
        Boolean bool;
        devf devfVar = a;
        devn.e(contentResolver);
        synchronized (devfVar) {
            ((devn) devfVar).c(contentResolver);
            obj = ((devn) devfVar).f;
            bool = (Boolean) devn.f(((devn) devfVar).b, str, Boolean.valueOf(z));
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        String strA = ((devn) devfVar).a(contentResolver, str, null);
        if (strA != null && !strA.isEmpty()) {
            if (deve.c.matcher(strA).matches()) {
                z = true;
                bool = true;
            } else if (deve.d.matcher(strA).matches()) {
                z = false;
                bool = false;
            } else {
                Log.w("Gservices", a.d(strA, str, "attempt to read Gservices key ", " (value \"", "\") as boolean"));
            }
        }
        synchronized (devfVar) {
            ((devn) devfVar).d(obj, ((devn) devfVar).b, str, bool);
        }
        return z;
    }
}
