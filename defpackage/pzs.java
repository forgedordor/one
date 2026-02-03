package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pzs {
    public static final pzs a = new pzn().a();
    public final Map b;

    public pzs(pzs pzsVar) {
        pzsVar.getClass();
        this.b = new HashMap(pzsVar.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final pzs c(byte[] bArr) {
        Object utf;
        bArr.getClass();
        int length = bArr.length;
        if (length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (length == 0) {
            return a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        String utf2 = objectInputStream.readUTF();
                        utf2.getClass();
                        linkedHashMap.put(utf2, objectInputStream.readObject());
                    }
                    fczl.a(objectInputStream, null);
                } finally {
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s = dataInputStream.readShort();
                    if (s != -21521) {
                        throw new IllegalStateException(a.g(s, "Magic number doesn't match: "));
                    }
                    short s2 = dataInputStream.readShort();
                    if (s2 != 1) {
                        throw new IllegalStateException(a.g(s2, "Unsupported version number: "));
                    }
                    int i3 = dataInputStream.readInt();
                    for (int i4 = 0; i4 < i3; i4++) {
                        byte b = dataInputStream.readByte();
                        if (b == 0) {
                            utf = null;
                        } else if (b == 1) {
                            utf = Boolean.valueOf(dataInputStream.readBoolean());
                        } else if (b == 2) {
                            utf = Byte.valueOf(dataInputStream.readByte());
                        } else if (b == 3) {
                            utf = Integer.valueOf(dataInputStream.readInt());
                        } else if (b == 4) {
                            utf = Long.valueOf(dataInputStream.readLong());
                        } else if (b == 5) {
                            utf = Float.valueOf(dataInputStream.readFloat());
                        } else if (b == 6) {
                            utf = Double.valueOf(dataInputStream.readDouble());
                        } else if (b == 7) {
                            utf = dataInputStream.readUTF();
                        } else if (b == 8) {
                            int i5 = dataInputStream.readInt();
                            Boolean[] boolArr = new Boolean[i5];
                            for (int i6 = 0; i6 < i5; i6++) {
                                boolArr[i6] = Boolean.valueOf(dataInputStream.readBoolean());
                            }
                            utf = (Serializable) boolArr;
                        } else if (b == 9) {
                            int i7 = dataInputStream.readInt();
                            Byte[] bArr3 = new Byte[i7];
                            for (int i8 = 0; i8 < i7; i8++) {
                                bArr3[i8] = Byte.valueOf(dataInputStream.readByte());
                            }
                            utf = (Serializable) bArr3;
                        } else if (b == 10) {
                            int i9 = dataInputStream.readInt();
                            Integer[] numArr = new Integer[i9];
                            for (int i10 = 0; i10 < i9; i10++) {
                                numArr[i10] = Integer.valueOf(dataInputStream.readInt());
                            }
                            utf = (Serializable) numArr;
                        } else if (b == 11) {
                            int i11 = dataInputStream.readInt();
                            Long[] lArr = new Long[i11];
                            for (int i12 = 0; i12 < i11; i12++) {
                                lArr[i12] = Long.valueOf(dataInputStream.readLong());
                            }
                            utf = (Serializable) lArr;
                        } else if (b == 12) {
                            int i13 = dataInputStream.readInt();
                            Float[] fArr = new Float[i13];
                            for (int i14 = 0; i14 < i13; i14++) {
                                fArr[i14] = Float.valueOf(dataInputStream.readFloat());
                            }
                            utf = (Serializable) fArr;
                        } else if (b == 13) {
                            int i15 = dataInputStream.readInt();
                            Double[] dArr = new Double[i15];
                            for (int i16 = 0; i16 < i15; i16++) {
                                dArr[i16] = Double.valueOf(dataInputStream.readDouble());
                            }
                            utf = (Serializable) dArr;
                        } else {
                            if (b != 14) {
                                throw new IllegalStateException(a.g(b, "Unsupported type "));
                            }
                            int i17 = dataInputStream.readInt();
                            String[] strArr = new String[i17];
                            for (int i18 = 0; i18 < i17; i18++) {
                                String utf3 = dataInputStream.readUTF();
                                if (true == fdbq.f(utf3, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                                    utf3 = null;
                                }
                                strArr[i18] = utf3;
                            }
                            utf = (Serializable) strArr;
                        }
                        String utf4 = dataInputStream.readUTF();
                        utf4.getClass();
                        linkedHashMap.put(utf4, utf);
                    }
                    fczl.a(dataInputStream, null);
                } finally {
                }
            }
        } catch (IOException e) {
            String str = pzt.a;
            qas.c();
            Log.e(str, "Error in Data#fromByteArray: ", e);
        } catch (ClassNotFoundException e2) {
            String str2 = pzt.a;
            qas.c();
            Log.e(str2, "Error in Data#fromByteArray: ", e2);
        }
        return new pzs(linkedHashMap);
    }

    public final int a(String str, int i) {
        Map map = this.b;
        Object objValueOf = Integer.valueOf(i);
        Object obj = map.get(str);
        if (true == (obj instanceof Integer)) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).intValue();
    }

    public final long b(String str, long j) {
        Map map = this.b;
        Object objValueOf = Long.valueOf(j);
        Object obj = map.get(str);
        if (true == (obj instanceof Long)) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).longValue();
    }

    public final String d(String str) {
        Object obj = this.b.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final Map e() {
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(this.b);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto L65
            java.lang.Class r2 = r8.getClass()
            java.lang.Class r3 = r9.getClass()
            boolean r2 = defpackage.fdbq.f(r2, r3)
            if (r2 != 0) goto L16
            goto L65
        L16:
            pzs r9 = (defpackage.pzs) r9
            java.util.Map r2 = r8.b
            java.util.Map r9 = r9.b
            java.util.Set r3 = r2.keySet()
            java.util.Set r4 = r9.keySet()
            boolean r4 = defpackage.fdbq.f(r3, r4)
            if (r4 != 0) goto L2b
            return r1
        L2b:
            java.util.Iterator r3 = r3.iterator()
        L2f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L64
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.get(r4)
            java.lang.Object r4 = r9.get(r4)
            if (r5 == 0) goto L61
            if (r4 != 0) goto L48
            goto L61
        L48:
            boolean r6 = r5 instanceof java.lang.Object[]
            if (r6 == 0) goto L5a
            r6 = r5
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            boolean r7 = r4 instanceof java.lang.Object[]
            if (r7 == 0) goto L5a
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            boolean r4 = defpackage.fcur.b(r6, r4)
            goto L5e
        L5a:
            boolean r4 = defpackage.fdbq.f(r5, r4)
        L5e:
            if (r4 != 0) goto L2f
            goto L63
        L61:
            if (r5 == r4) goto L2f
        L63:
            return r1
        L64:
            return r0
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pzs.equals(java.lang.Object):boolean");
    }

    public final boolean f(String str, Class cls) {
        Object obj = this.b.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    public final byte[] g(String str) {
        Object obj = this.b.get(str);
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Object[]) {
                int length = objArr.length;
                pzp pzpVar = new pzp(obj);
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    bArr[i] = ((Number) pzpVar.invoke(Integer.valueOf(i))).byteValue();
                }
                return bArr;
            }
        }
        return null;
    }

    public final boolean h(String str) {
        Object obj = this.b.get(str);
        return ((Boolean) (true == (obj instanceof Boolean) ? obj : false)).booleanValue();
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.b.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return "Data {" + fcva.aF(this.b.entrySet(), null, null, null, pzr.a, 31) + "}";
    }

    public pzs(Map map) {
        this.b = new HashMap(map);
    }
}
