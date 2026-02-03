package defpackage;

import android.util.Log;
import androidx.appsearch.app.AppSearchDocumentClassMap;
import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afv {
    public static final /* synthetic */ int b = 0;
    public final ajp a;

    static {
        new afu("", "", "").e();
    }

    public afv(ajp ajpVar) {
        ajpVar.getClass();
        this.a = ajpVar;
    }

    public static afv f(Object obj) {
        lcg.i(obj);
        afr afrVarB = afr.b();
        lcg.i(obj);
        return afrVarB.a(obj.getClass()).b(obj);
    }

    public static void q(String str, String str2, int i) {
        if (i > 1) {
            Log.w("AppSearchGenericDocumen", "The value for \"" + str2 + "\" contains " + i + " elements. Only the first one will be returned from getProperty" + str + "(). Try getProperty" + str + "Array().");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object w(defpackage.agf r7, int r8, java.util.Map r9) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afv.w(agf, int, java.util.Map):java.lang.Object");
    }

    private static Object x(String str, Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AppSearchGenericDocumen", a.a(str, "Error casting to requested type for path \"", "\""), e);
            return null;
        }
    }

    public final double a(String str) {
        int length;
        double[] dArr = (double[]) x(str, h(str), double[].class);
        if (dArr == null || (length = dArr.length) == 0) {
            return 0.0d;
        }
        q("Double", str, length);
        return dArr[0];
    }

    public final int b() {
        return this.a.f;
    }

    public final long c() {
        return this.a.d;
    }

    public final long d(String str) {
        int length;
        long[] jArrS = s(str);
        if (jArrS == null || (length = jArrS.length) == 0) {
            return 0L;
        }
        q("Long", str, length);
        return jArrS[0];
    }

    public final long e() {
        return this.a.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof afv) {
            return this.a.equals(((afv) obj).a);
        }
        return false;
    }

    public final afv g(String str) {
        int length;
        lcg.i(str);
        afv[] afvVarArrT = t(str);
        if (afvVarArrT == null || (length = afvVarArrT.length) == 0) {
            return null;
        }
        q("Document", str, length);
        return afvVarArrT[0];
    }

    public final Object h(String str) {
        str.getClass();
        Object objW = w(new agf(str), 0, this.a.i);
        if (objW instanceof ajp) {
            return new afv[]{new afv((ajp) objW)};
        }
        if (!(objW instanceof ajp[])) {
            return objW;
        }
        ajp[] ajpVarArr = (ajp[]) objW;
        afv[] afvVarArr = new afv[ajpVarArr.length];
        for (int i = 0; i < ajpVarArr.length; i++) {
            ajp ajpVar = ajpVarArr[i];
            if (ajpVar == null) {
                Log.e("AppSearchGenericDocumen", "The inner parcel is null at " + i + ", for path: " + str);
            } else {
                afvVarArr[i] = new afv(ajpVar);
            }
        }
        return afvVarArr;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Object i(Class cls) {
        return j(cls, afs.a);
    }

    public final Object j(Class cls, afs afsVar) {
        lcg.i(afsVar);
        Map map = afsVar.b;
        afr afrVarB = afr.b();
        if (!map.isEmpty()) {
            Class clsA = AppSearchDocumentClassMap.a(map, m(), cls);
            if (clsA != null) {
                cls = clsA;
            } else {
                Map map2 = afsVar.c;
                List listN = map2.containsKey(m()) ? (List) map2.get(m()) : n();
                if (listN != null) {
                    for (int i = 0; i < listN.size(); i++) {
                        Class clsA2 = AppSearchDocumentClassMap.a(map, (String) listN.get(i), cls);
                        if (clsA2 != null) {
                            cls = clsA2;
                            break;
                        }
                    }
                    Log.w("AppSearchGenericDocumen", "Cannot find any compatible target class to deserialize. Perhaps the annotation processor was not run or the generated document class map was proguarded out?\nTry to deserialize to " + cls.getCanonicalName() + " directly.");
                } else {
                    Log.w("AppSearchGenericDocumen", "Cannot find any compatible target class to deserialize. Perhaps the annotation processor was not run or the generated document class map was proguarded out?\nTry to deserialize to " + cls.getCanonicalName() + " directly.");
                }
            }
        }
        return afrVarB.a(cls).c(this, afsVar);
    }

    public final String k() {
        return this.a.b;
    }

    public final String l() {
        return this.a.a;
    }

    public final String m() {
        return this.a.c;
    }

    @Deprecated
    public final List n() {
        List list = this.a.h;
        if (list == null) {
            return null;
        }
        return DesugarCollections.unmodifiableList(list);
    }

    public final Set o() {
        return DesugarCollections.unmodifiableSet(this.a.i.keySet());
    }

    final void p(akf akfVar) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        akfVar.a("{\n");
        akfVar.d();
        akfVar.a("namespace: \"");
        akfVar.a(l());
        akfVar.a("\",\n");
        akfVar.a("id: \"");
        akfVar.a(k());
        akfVar.a("\",\n");
        akfVar.a("score: ");
        akfVar.b(Integer.valueOf(b()));
        akfVar.a(",\n");
        akfVar.a("schemaType: \"");
        akfVar.a(m());
        akfVar.a("\",\n");
        List listN = n();
        if (listN != null) {
            akfVar.a("parentTypes: ");
            akfVar.b(listN);
            akfVar.a("\n");
        }
        akfVar.a("creationTimestampMillis: ");
        akfVar.b(Long.valueOf(c()));
        akfVar.a(",\n");
        akfVar.a("timeToLiveMillis: ");
        akfVar.b(Long.valueOf(e()));
        akfVar.a(",\n");
        akfVar.a("properties: {\n");
        String[] strArr = (String[]) o().toArray(new String[0]);
        Arrays.sort(strArr);
        for (int i = 0; i < strArr.length; i++) {
            Object objH = h(strArr[i]);
            lcg.i(objH);
            akfVar.d();
            String str = strArr[i];
            lcg.i(str);
            akfVar.a("\"");
            akfVar.a(str);
            akfVar.a("\": [");
            if (objH instanceof afv[]) {
                afv[] afvVarArr = (afv[]) objH;
                int i2 = 0;
                while (true) {
                    int length = afvVarArr.length;
                    if (i2 >= length) {
                        break;
                    }
                    akfVar.a("\n");
                    akfVar.d();
                    afvVarArr[i2].p(akfVar);
                    if (i2 != length - 1) {
                        akfVar.a(",");
                    }
                    akfVar.a("\n");
                    akfVar.c();
                    i2++;
                }
            } else {
                int length2 = Array.getLength(objH);
                for (int i3 = 0; i3 < length2; i3++) {
                    Object obj = Array.get(objH, i3);
                    if (obj instanceof String) {
                        akfVar.a("\"");
                        akfVar.a((String) obj);
                        akfVar.a("\"");
                    } else if (obj instanceof byte[]) {
                        akfVar.a(Arrays.toString((byte[]) obj));
                    } else if (obj != null) {
                        akfVar.a(obj.toString());
                    }
                    if (i3 != length2 - 1) {
                        akfVar.a(", ");
                    }
                }
            }
            akfVar.a("]");
            if (i != strArr.length - 1) {
                akfVar.a(",\n");
            }
            akfVar.c();
        }
        akfVar.a("\n");
        akfVar.a("}");
        akfVar.c();
        akfVar.a("\n");
        akfVar.a("}");
    }

    public final boolean r(String str) {
        int length;
        boolean[] zArr = (boolean[]) x(str, h(str), boolean[].class);
        if (zArr == null || (length = zArr.length) == 0) {
            return false;
        }
        q("Boolean", str, length);
        return zArr[0];
    }

    public final long[] s(String str) {
        return (long[]) x(str, h(str), long[].class);
    }

    public final afv[] t(String str) {
        lcg.i(str);
        return (afv[]) x(str, h(str), afv[].class);
    }

    public final String toString() throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        akf akfVar = new akf();
        p(akfVar);
        return akfVar.toString();
    }

    public final String[] u(String str) {
        return (String[]) x(str, h(str), String[].class);
    }

    public final byte[][] v(String str) {
        return (byte[][]) x(str, h(str), byte[][].class);
    }
}
