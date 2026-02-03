package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pzn {
    private final Map a = new LinkedHashMap();

    public final pzs a() {
        pzs pzsVar = new pzs(this.a);
        pzo.a(pzsVar);
        return pzsVar;
    }

    public final void b(pzs pzsVar) {
        pzsVar.getClass();
        c(pzsVar.b);
    }

    public final void c(Map map) {
        Object[] objArr;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            Map map2 = this.a;
            if (value == null) {
                value = null;
            } else {
                int i = fdcj.a;
                fdbi fdbiVar = new fdbi(value.getClass());
                if (!fdbq.f(fdbiVar, new fdbi(Boolean.TYPE)) && !fdbq.f(fdbiVar, new fdbi(Byte.TYPE)) && !fdbq.f(fdbiVar, new fdbi(Integer.TYPE)) && !fdbq.f(fdbiVar, new fdbi(Long.TYPE)) && !fdbq.f(fdbiVar, new fdbi(Float.TYPE)) && !fdbq.f(fdbiVar, new fdbi(Double.TYPE)) && !fdbq.f(fdbiVar, new fdbi(String.class)) && !fdbq.f(fdbiVar, new fdbi(Boolean[].class)) && !fdbq.f(fdbiVar, new fdbi(Byte[].class)) && !fdbq.f(fdbiVar, new fdbi(Integer[].class)) && !fdbq.f(fdbiVar, new fdbi(Long[].class)) && !fdbq.f(fdbiVar, new fdbi(Float[].class)) && !fdbq.f(fdbiVar, new fdbi(Double[].class)) && !fdbq.f(fdbiVar, new fdbi(String[].class))) {
                    int i2 = 0;
                    if (fdbq.f(fdbiVar, new fdbi(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        int length = zArr.length;
                        String str2 = pzt.a;
                        objArr = new Boolean[length];
                        while (i2 < length) {
                            objArr[i2] = Boolean.valueOf(zArr[i2]);
                            i2++;
                        }
                    } else if (fdbq.f(fdbiVar, new fdbi(byte[].class))) {
                        value = pzt.a((byte[]) value);
                    } else if (fdbq.f(fdbiVar, new fdbi(int[].class))) {
                        int[] iArr = (int[]) value;
                        int length2 = iArr.length;
                        String str3 = pzt.a;
                        objArr = new Integer[length2];
                        while (i2 < length2) {
                            objArr[i2] = Integer.valueOf(iArr[i2]);
                            i2++;
                        }
                    } else if (fdbq.f(fdbiVar, new fdbi(long[].class))) {
                        long[] jArr = (long[]) value;
                        int length3 = jArr.length;
                        String str4 = pzt.a;
                        objArr = new Long[length3];
                        while (i2 < length3) {
                            objArr[i2] = Long.valueOf(jArr[i2]);
                            i2++;
                        }
                    } else if (fdbq.f(fdbiVar, new fdbi(float[].class))) {
                        float[] fArr = (float[]) value;
                        int length4 = fArr.length;
                        String str5 = pzt.a;
                        objArr = new Float[length4];
                        while (i2 < length4) {
                            objArr[i2] = Float.valueOf(fArr[i2]);
                            i2++;
                        }
                    } else {
                        if (!fdbq.f(fdbiVar, new fdbi(double[].class))) {
                            throw new IllegalArgumentException(a.m(fdbiVar, str, "Key ", " has invalid type "));
                        }
                        double[] dArr = (double[]) value;
                        int length5 = dArr.length;
                        String str6 = pzt.a;
                        objArr = new Double[length5];
                        while (i2 < length5) {
                            objArr[i2] = Double.valueOf(dArr[i2]);
                            i2++;
                        }
                    }
                    value = objArr;
                }
            }
            map2.put(str, value);
        }
    }

    public final void d(String str, byte[] bArr) {
        bArr.getClass();
        this.a.put(str, pzt.a(bArr));
    }

    public final void e(String str, Object obj) {
        this.a.put(str, obj);
    }

    public final void f(String str, boolean z) {
        e(str, Boolean.valueOf(z));
    }

    public final void g(String str, int i) {
        e(str, Integer.valueOf(i));
    }

    public final void h(String str, long j) {
        e(str, Long.valueOf(j));
    }
}
