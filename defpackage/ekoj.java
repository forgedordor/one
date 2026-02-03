package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekoj extends ekgp {
    public static final ekgp a = new ekoj(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    final transient Object[] c;
    public final transient int d;
    private final transient Object e;

    private ekoj(Object obj, Object[] objArr, int i) {
        this.e = obj;
        this.c = objArr;
        this.d = i;
    }

    public static ekoj a(int i, Object[] objArr) {
        return w(i, objArr, null);
    }

    static ekoj w(int i, Object[] objArr, ekgi ekgiVar) {
        if (i == 0) {
            return (ekoj) a;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            Object obj2 = objArr[1];
            obj2.getClass();
            ekcw.a(obj, obj2);
            return new ekoj(null, objArr, 1);
        }
        ejwl.x(i, objArr.length >> 1);
        Object objZ = z(objArr, i, ekhx.d(i), 0);
        if (objZ instanceof Object[]) {
            Object[] objArr2 = (Object[]) objZ;
            ekgh ekghVar = (ekgh) objArr2[2];
            if (ekgiVar == null) {
                throw ekghVar.a();
            }
            ekgiVar.c = ekghVar;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue + iIntValue);
            objZ = obj3;
            i = iIntValue;
        }
        return new ekoj(objZ, objArr, i);
    }

    static Object x(Object[] objArr, int i, int i2, int i3) {
        Object objZ = z(objArr, i, i2, i3);
        if (objZ instanceof Object[]) {
            throw ((ekgh) ((Object[]) objZ)[2]).a();
        }
        return objZ;
    }

    static Object y(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            obj3.getClass();
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            obj4.getClass();
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iA = ekfh.a(obj2.hashCode());
            while (true) {
                int i3 = iA & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iA = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iA2 = ekfh.a(obj2.hashCode());
            while (true) {
                int i5 = iA2 & length2;
                char c = (char) sArr[i5];
                if (c == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[c])) {
                    return objArr[c ^ 1];
                }
                iA2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iA3 = ekfh.a(obj2.hashCode());
            while (true) {
                int i6 = iA3 & length3;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i7])) {
                    return objArr[i7 ^ 1];
                }
                iA3 = i6 + 1;
            }
        }
    }

    private static Object z(Object[] objArr, int i, int i2, int i3) {
        int i4;
        ekgh ekghVar = null;
        int i5 = 1;
        if (i == 1) {
            Object obj = objArr[i3];
            obj.getClass();
            Object obj2 = objArr[i3 ^ 1];
            obj2.getClass();
            ekcw.a(obj, obj2);
            return null;
        }
        int i6 = i2 - 1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i7 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = i8 + i8 + i3;
                int i10 = i7 + i7 + i3;
                Object obj3 = objArr[i9];
                obj3.getClass();
                Object obj4 = objArr[i9 ^ 1];
                obj4.getClass();
                ekcw.a(obj3, obj4);
                int iA = ekfh.a(obj3.hashCode());
                while (true) {
                    int i11 = iA & i6;
                    int i12 = bArr[i11] & 255;
                    if (i12 == 255) {
                        bArr[i11] = (byte) i10;
                        if (i7 < i8) {
                            objArr[i10] = obj3;
                            objArr[i10 ^ 1] = obj4;
                        }
                        i7++;
                    } else {
                        if (obj3.equals(objArr[i12])) {
                            int i13 = i12 ^ 1;
                            Object obj5 = objArr[i13];
                            obj5.getClass();
                            ekgh ekghVar2 = new ekgh(obj3, obj4, obj5);
                            objArr[i13] = obj4;
                            ekghVar = ekghVar2;
                            break;
                        }
                        iA = i11 + 1;
                    }
                }
            }
            return i7 == i ? bArr : new Object[]{bArr, Integer.valueOf(i7), ekghVar};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i14 = 0;
            for (int i15 = 0; i15 < i; i15++) {
                int i16 = i15 + i15 + i3;
                int i17 = i14 + i14 + i3;
                Object obj6 = objArr[i16];
                obj6.getClass();
                Object obj7 = objArr[i16 ^ 1];
                obj7.getClass();
                ekcw.a(obj6, obj7);
                int iA2 = ekfh.a(obj6.hashCode());
                while (true) {
                    int i18 = iA2 & i6;
                    char c = (char) sArr[i18];
                    if (c == 65535) {
                        sArr[i18] = (short) i17;
                        if (i14 < i15) {
                            objArr[i17] = obj6;
                            objArr[i17 ^ 1] = obj7;
                        }
                        i14++;
                    } else {
                        if (obj6.equals(objArr[c])) {
                            int i19 = c ^ 1;
                            Object obj8 = objArr[i19];
                            obj8.getClass();
                            ekgh ekghVar3 = new ekgh(obj6, obj7, obj8);
                            objArr[i19] = obj7;
                            ekghVar = ekghVar3;
                            break;
                        }
                        iA2 = i18 + 1;
                    }
                }
            }
            return i14 == i ? sArr : new Object[]{sArr, Integer.valueOf(i14), ekghVar};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i20 = 0;
        int i21 = 0;
        while (i20 < i) {
            int i22 = i20 + i20 + i3;
            int i23 = i21 + i21 + i3;
            Object obj9 = objArr[i22];
            obj9.getClass();
            Object obj10 = objArr[i22 ^ i5];
            obj10.getClass();
            ekcw.a(obj9, obj10);
            int iA3 = ekfh.a(obj9.hashCode());
            while (true) {
                int i24 = iA3 & i6;
                int i25 = iArr[i24];
                if (i25 == -1) {
                    iArr[i24] = i23;
                    if (i21 < i20) {
                        objArr[i23] = obj9;
                        objArr[i23 ^ 1] = obj10;
                    }
                    i21++;
                    i4 = i5;
                } else {
                    i4 = i5;
                    if (obj9.equals(objArr[i25])) {
                        int i26 = i25 ^ 1;
                        Object obj11 = objArr[i26];
                        obj11.getClass();
                        ekgh ekghVar4 = new ekgh(obj9, obj10, obj11);
                        objArr[i26] = obj10;
                        ekghVar = ekghVar4;
                        break;
                    }
                    iA3 = i24 + 1;
                    i5 = i4;
                }
            }
            i20++;
            i5 = i4;
        }
        int i27 = i5;
        if (i21 == i) {
            return iArr;
        }
        Integer numValueOf = Integer.valueOf(i21);
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i27] = numValueOf;
        objArr2[2] = ekghVar;
        return objArr2;
    }

    @Override // defpackage.ekgp
    public final ekfn c() {
        return new ekoi(this.c, 1, this.d);
    }

    @Override // defpackage.ekgp
    public final ekhx f() {
        return new ekog(this, this.c, 0, this.d);
    }

    @Override // defpackage.ekgp
    public final ekhx g() {
        return new ekoh(this, new ekoi(this.c, 0, this.d));
    }

    @Override // defpackage.ekgp, java.util.Map
    public final Object get(Object obj) {
        Object objY = y(this.e, this.c, this.d, 0, obj);
        if (objY == null) {
            return null;
        }
        return objY;
    }

    @Override // defpackage.ekgp
    public final boolean hs() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.d;
    }

    @Override // defpackage.ekgp
    public Object writeReplace() {
        return super.writeReplace();
    }
}
