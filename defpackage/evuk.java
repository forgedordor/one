package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import com.sun.jna.Function;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evuk<T> implements evuz<T> {
    public static final int[] a = new int[0];
    public static final Unsafe b = evvz.j();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final evuh g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final evvs m;
    private final evrs n;

    public evuk(int[] iArr, Object[] objArr, int i, int i2, evuh evuhVar, int[] iArr2, int i3, int i4, evvs evvsVar, evrs evrsVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = evuhVar instanceof evsn;
        boolean z = false;
        if (evrsVar != null && (evuhVar instanceof evsi)) {
            z = true;
        }
        this.h = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = evvsVar;
        this.n = evrsVar;
        this.g = evuhVar;
    }

    private final Object A(Object obj, int i, Object obj2, evvs evvsVar, Object obj3) {
        evsv evsvVarY;
        int iP = p(i);
        Object objH = evvz.h(obj, w(v(i)));
        if (objH == null || (evsvVarY = y(i)) == null) {
            return obj2;
        }
        evtz evtzVarA = evuc.a(B(i));
        Iterator it = ((evub) objH).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!evsvVarY.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = evvsVar.a(obj3);
                }
                int iA = evua.a(evtzVarA, entry.getKey(), entry.getValue());
                evqs evqsVar = evqs.b;
                byte[] bArr = new byte[iA];
                evrf evrfVarAb = evrf.ab(bArr);
                try {
                    evua.b(evrfVarAb, evtzVarA, entry.getKey(), entry.getValue());
                    evvsVar.f(obj2, iP, evqo.a(evrfVarAb, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private final Object B(int i) {
        int i2 = i / 3;
        return this.d[i2 + i2];
    }

    private final Object C(Object obj, int i) {
        evuz evuzVarZ = z(i);
        long jW = w(v(i));
        if (!O(obj, i)) {
            return evuzVarZ.e();
        }
        Object object = b.getObject(obj, jW);
        if (R(object)) {
            return object;
        }
        Object objE = evuzVarZ.e();
        if (object != null) {
            evuzVarZ.h(objE, object);
        }
        return objE;
    }

    private final Object D(Object obj, int i, int i2) {
        evuz evuzVarZ = z(i2);
        if (!S(obj, i, i2)) {
            return evuzVarZ.e();
        }
        Object object = b.getObject(obj, w(v(i2)));
        if (R(object)) {
            return object;
        }
        Object objE = evuzVarZ.e();
        if (object != null) {
            evuzVarZ.h(objE, object);
        }
        return objE;
    }

    private static void E(Object obj) {
        if (!R(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void F(Object obj, Object obj2, int i) {
        if (O(obj2, i)) {
            long jW = w(v(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, jW);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + p(i) + " is present but null: " + obj2.toString());
            }
            evuz evuzVarZ = z(i);
            if (!O(obj, i)) {
                if (R(object)) {
                    Object objE = evuzVarZ.e();
                    evuzVarZ.h(objE, object);
                    unsafe.putObject(obj, jW, objE);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                I(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!R(object2)) {
                Object objE2 = evuzVarZ.e();
                evuzVarZ.h(objE2, object2);
                unsafe.putObject(obj, jW, objE2);
                object2 = objE2;
            }
            evuzVarZ.h(object2, object);
        }
    }

    private final void G(Object obj, Object obj2, int i) {
        int iP = p(i);
        if (S(obj2, iP, i)) {
            long jW = w(v(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, jW);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + p(i) + " is present but null: " + obj2.toString());
            }
            evuz evuzVarZ = z(i);
            if (!S(obj, iP, i)) {
                if (R(object)) {
                    Object objE = evuzVarZ.e();
                    evuzVarZ.h(objE, object);
                    unsafe.putObject(obj, jW, objE);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                J(obj, iP, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!R(object2)) {
                Object objE2 = evuzVarZ.e();
                evuzVarZ.h(objE2, object2);
                unsafe.putObject(obj, jW, objE2);
                object2 = objE2;
            }
            evuzVarZ.h(object2, object);
        }
    }

    private final void H(Object obj, int i, evut evutVar) {
        if (N(i)) {
            evvz.u(obj, w(i), evutVar.v());
        } else if (this.i) {
            evvz.u(obj, w(i), evutVar.u());
        } else {
            evvz.u(obj, w(i), evutVar.o());
        }
    }

    private final void I(Object obj, int i) {
        int iS = s(i);
        long j = 1048575 & iS;
        if (j == 1048575) {
            return;
        }
        evvz.s(obj, j, (1 << (iS >>> 20)) | evvz.d(obj, j));
    }

    private final void J(Object obj, int i, int i2) {
        evvz.s(obj, s(i2) & 1048575, i);
    }

    private final void K(Object obj, int i, Object obj2) {
        b.putObject(obj, w(v(i)), obj2);
        I(obj, i);
    }

    private final void L(Object obj, int i, int i2, Object obj2) {
        b.putObject(obj, w(v(i2)), obj2);
        J(obj, i, i2);
    }

    private final boolean M(Object obj, Object obj2, int i) {
        return O(obj, i) == O(obj2, i);
    }

    private static boolean N(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean O(Object obj, int i) {
        int iS = s(i);
        long j = 1048575 & iS;
        if (j != 1048575) {
            return (evvz.d(obj, j) & (1 << (iS >>> 20))) != 0;
        }
        int iV = v(i);
        long jW = w(iV);
        switch (u(iV)) {
            case 0:
                return Double.doubleToRawLongBits(evvz.b(obj, jW)) != 0;
            case 1:
                return Float.floatToRawIntBits(evvz.c(obj, jW)) != 0;
            case 2:
                return evvz.f(obj, jW) != 0;
            case 3:
                return evvz.f(obj, jW) != 0;
            case 4:
                return evvz.d(obj, jW) != 0;
            case 5:
                return evvz.f(obj, jW) != 0;
            case 6:
                return evvz.d(obj, jW) != 0;
            case 7:
                return evvz.w(obj, jW);
            case 8:
                Object objH = evvz.h(obj, jW);
                if (objH instanceof String) {
                    return !((String) objH).isEmpty();
                }
                if (objH instanceof evqs) {
                    return !evqs.b.equals(objH);
                }
                throw new IllegalArgumentException();
            case 9:
                return evvz.h(obj, jW) != null;
            case 10:
                return !evqs.b.equals(evvz.h(obj, jW));
            case 11:
                return evvz.d(obj, jW) != 0;
            case 12:
                return evvz.d(obj, jW) != 0;
            case 13:
                return evvz.d(obj, jW) != 0;
            case 14:
                return evvz.f(obj, jW) != 0;
            case 15:
                return evvz.d(obj, jW) != 0;
            case 16:
                return evvz.f(obj, jW) != 0;
            case 17:
                return evvz.h(obj, jW) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean P(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? O(obj, i) : (i3 & i4) != 0;
    }

    private static boolean Q(Object obj, int i, evuz evuzVar) {
        return evuzVar.l(evvz.h(obj, w(i)));
    }

    private static boolean R(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof evsn) {
            return ((evsn) obj).isMutable();
        }
        return true;
    }

    private final boolean S(Object obj, int i, int i2) {
        return evvz.d(obj, (long) (s(i2) & 1048575)) == i;
    }

    private static boolean T(Object obj, long j) {
        return ((Boolean) evvz.h(obj, j)).booleanValue();
    }

    private static final int U(byte[] bArr, int i, int i2, evwh evwhVar, Class cls, evqf evqfVar) {
        evwh evwhVar2 = evwh.DOUBLE;
        switch (evwhVar) {
            case DOUBLE:
                int i3 = i + 8;
                evqfVar.c = Double.valueOf(evqg.a(bArr, i));
                return i3;
            case FLOAT:
                int i4 = i + 4;
                evqfVar.c = Float.valueOf(evqg.b(bArr, i));
                return i4;
            case INT64:
            case UINT64:
                int iW = evqg.w(bArr, i, evqfVar);
                evqfVar.c = Long.valueOf(evqfVar.b);
                return iW;
            case INT32:
            case UINT32:
            case ENUM:
                int iT = evqg.t(bArr, i, evqfVar);
                evqfVar.c = Integer.valueOf(evqfVar.a);
                return iT;
            case FIXED64:
            case SFIXED64:
                int i5 = i + 8;
                evqfVar.c = Long.valueOf(evqg.A(bArr, i));
                return i5;
            case FIXED32:
            case SFIXED32:
                int i6 = i + 4;
                evqfVar.c = Integer.valueOf(evqg.d(bArr, i));
                return i6;
            case BOOL:
                int iW2 = evqg.w(bArr, i, evqfVar);
                evqfVar.c = Boolean.valueOf(evqfVar.b != 0);
                return iW2;
            case STRING:
                return evqg.r(bArr, i, evqfVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return evqg.f(evuq.a.a(cls), bArr, i, i2, evqfVar);
            case BYTES:
                return evqg.c(bArr, i, evqfVar);
            case SINT32:
                int iT2 = evqg.t(bArr, i, evqfVar);
                evqfVar.c = Integer.valueOf(evqz.H(evqfVar.a));
                return iT2;
            case SINT64:
                int iW3 = evqg.w(bArr, i, evqfVar);
                evqfVar.c = Long.valueOf(evqz.J(evqfVar.b));
                return iW3;
        }
    }

    private static final void V(int i, Object obj, evrg evrgVar) {
        if (obj instanceof String) {
            evrgVar.q(i, (String) obj);
        } else {
            evrgVar.b(i, (evqs) obj);
        }
    }

    static evvt d(Object obj) {
        evsn evsnVar = (evsn) obj;
        evvt evvtVar = evsnVar.unknownFields;
        if (evvtVar != evvt.a) {
            return evvtVar;
        }
        evvt evvtVar2 = new evvt();
        evsnVar.unknownFields = evvtVar2;
        return evvtVar2;
    }

    public static Field f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    private static double n(Object obj, long j) {
        return ((Double) evvz.h(obj, j)).doubleValue();
    }

    private static float o(Object obj, long j) {
        return ((Float) evvz.h(obj, j)).floatValue();
    }

    private final int p(int i) {
        return this.c[i];
    }

    private static int q(Object obj, long j) {
        return ((Integer) evvz.h(obj, j)).intValue();
    }

    private final int r(int i) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return t(i, 0);
    }

    private final int s(int i) {
        return this.c[i + 2];
    }

    private final int t(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iP = p(i4);
            if (i == iP) {
                return i4;
            }
            if (i < iP) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int u(int i) {
        return (i >>> 20) & 255;
    }

    private final int v(int i) {
        return this.c[i + 1];
    }

    private static long w(int i) {
        return i & 1048575;
    }

    private static long x(Object obj, long j) {
        return ((Long) evvz.h(obj, j)).longValue();
    }

    private final evsv y(int i) {
        int i2 = i / 3;
        return (evsv) this.d[i2 + i2 + 1];
    }

    private final evuz z(int i) {
        Object[] objArr = this.d;
        int i2 = i / 3;
        int i3 = i2 + i2;
        evuz evuzVar = (evuz) objArr[i3];
        if (evuzVar != null) {
            return evuzVar;
        }
        evuz evuzVarA = evuq.a.a((Class) objArr[i3 + 1]);
        objArr[i3] = evuzVarA;
        return evuzVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x03c6  */
    @Override // defpackage.evuz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evuk.a(java.lang.Object):int");
    }

    @Override // defpackage.evuz
    public final int b(Object obj) {
        int i;
        int iB;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.c.length; i4 += 3) {
            int iV = v(i4);
            int iP = p(i4);
            long jW = w(iV);
            int iHashCode = 37;
            switch (u(iV)) {
                case 0:
                    i = i3 * 53;
                    iB = evth.b(Double.doubleToLongBits(evvz.b(obj, jW)));
                    i3 = i + iB;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(evvz.c(obj, jW));
                    i3 = i + iB;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = evth.b(evvz.f(obj, jW));
                    i3 = i + iB;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = evth.b(evvz.f(obj, jW));
                    i3 = i + iB;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = evvz.d(obj, jW);
                    i3 = i + iB;
                    break;
                case 5:
                    i = i3 * 53;
                    iB = evth.b(evvz.f(obj, jW));
                    i3 = i + iB;
                    break;
                case 6:
                    i = i3 * 53;
                    iB = evvz.d(obj, jW);
                    i3 = i + iB;
                    break;
                case 7:
                    i = i3 * 53;
                    iB = evth.a(evvz.w(obj, jW));
                    i3 = i + iB;
                    break;
                case 8:
                    i = i3 * 53;
                    iB = ((String) evvz.h(obj, jW)).hashCode();
                    i3 = i + iB;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objH = evvz.h(obj, jW);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iB = evvz.h(obj, jW).hashCode();
                    i3 = i + iB;
                    break;
                case 11:
                    i = i3 * 53;
                    iB = evvz.d(obj, jW);
                    i3 = i + iB;
                    break;
                case 12:
                    i = i3 * 53;
                    iB = evvz.d(obj, jW);
                    i3 = i + iB;
                    break;
                case 13:
                    i = i3 * 53;
                    iB = evvz.d(obj, jW);
                    i3 = i + iB;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = evth.b(evvz.f(obj, jW));
                    i3 = i + iB;
                    break;
                case 15:
                    i = i3 * 53;
                    iB = evvz.d(obj, jW);
                    i3 = i + iB;
                    break;
                case 16:
                    i = i3 * 53;
                    iB = evth.b(evvz.f(obj, jW));
                    i3 = i + iB;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objH2 = evvz.h(obj, jW);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    i = i3 * 53;
                    iB = evvz.h(obj, jW).hashCode();
                    i3 = i + iB;
                    break;
                case 50:
                    i = i3 * 53;
                    iB = evvz.h(obj, jW).hashCode();
                    i3 = i + iB;
                    break;
                case 51:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = evth.b(Double.doubleToLongBits(n(obj, jW)));
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(o(obj, jW));
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = evth.b(x(obj, jW));
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = evth.b(x(obj, jW));
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = q(obj, jW);
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = evth.b(x(obj, jW));
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = q(obj, jW);
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = evth.a(T(obj, jW));
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = ((String) evvz.h(obj, jW)).hashCode();
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = evvz.h(obj, jW).hashCode();
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = evvz.h(obj, jW).hashCode();
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = q(obj, jW);
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case Function.ALT_CONVENTION /* 63 */:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = q(obj, jW);
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = q(obj, jW);
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = evth.b(x(obj, jW));
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = q(obj, jW);
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = evth.b(x(obj, jW));
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (S(obj, iP, i4)) {
                        i = i3 * 53;
                        iB = evvz.h(obj, jW).hashCode();
                        i3 = i + iB;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i3 * 53) + evvu.k(obj).hashCode();
        return this.h ? (iHashCode2 * 53) + this.n.a(obj).hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int c(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, defpackage.evqf r39) {
        /*
            Method dump skipped, instructions count: 3756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evuk.c(java.lang.Object, byte[], int, int, int, evqf):int");
    }

    @Override // defpackage.evuz
    public final Object e() {
        return ((evsn) this.g).newMutableInstance();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    @Override // defpackage.evuz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = R(r8)
            if (r0 != 0) goto L8
            goto L90
        L8:
            boolean r0 = r8 instanceof defpackage.evsn
            if (r0 == 0) goto L18
            r0 = r8
            evsn r0 = (defpackage.evsn) r0
            r0.clearMemoizedSerializedSize()
            r0.clearMemoizedHashCode()
            r0.markImmutable()
        L18:
            int[] r0 = r7.c
            r1 = 0
        L1b:
            int r2 = r0.length
            if (r1 >= r2) goto L82
            int r2 = r7.v(r1)
            long r3 = w(r2)
            int r2 = u(r2)
            r5 = 9
            if (r2 == r5) goto L6c
            r5 = 60
            if (r2 == r5) goto L54
            r5 = 68
            if (r2 == r5) goto L54
            switch(r2) {
                case 17: goto L6c;
                case 18: goto L4c;
                case 19: goto L4c;
                case 20: goto L4c;
                case 21: goto L4c;
                case 22: goto L4c;
                case 23: goto L4c;
                case 24: goto L4c;
                case 25: goto L4c;
                case 26: goto L4c;
                case 27: goto L4c;
                case 28: goto L4c;
                case 29: goto L4c;
                case 30: goto L4c;
                case 31: goto L4c;
                case 32: goto L4c;
                case 33: goto L4c;
                case 34: goto L4c;
                case 35: goto L4c;
                case 36: goto L4c;
                case 37: goto L4c;
                case 38: goto L4c;
                case 39: goto L4c;
                case 40: goto L4c;
                case 41: goto L4c;
                case 42: goto L4c;
                case 43: goto L4c;
                case 44: goto L4c;
                case 45: goto L4c;
                case 46: goto L4c;
                case 47: goto L4c;
                case 48: goto L4c;
                case 49: goto L4c;
                case 50: goto L3a;
                default: goto L39;
            }
        L39:
            goto L7f
        L3a:
            sun.misc.Unsafe r2 = defpackage.evuk.b
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L7f
            r6 = r5
            evub r6 = (defpackage.evub) r6
            r6.c()
            r2.putObject(r8, r3, r5)
            goto L7f
        L4c:
            evtg r2 = defpackage.evtr.a(r8, r3)
            r2.b()
            goto L7f
        L54:
            int r2 = r7.p(r1)
            boolean r2 = r7.S(r8, r2, r1)
            if (r2 == 0) goto L7f
            evuz r2 = r7.z(r1)
            sun.misc.Unsafe r5 = defpackage.evuk.b
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.g(r3)
            goto L7f
        L6c:
            boolean r2 = r7.O(r8, r1)
            if (r2 == 0) goto L7f
            evuz r2 = r7.z(r1)
            sun.misc.Unsafe r5 = defpackage.evuk.b
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.g(r3)
        L7f:
            int r1 = r1 + 3
            goto L1b
        L82:
            evvs r0 = r7.m
            r0.h(r8)
            boolean r0 = r7.h
            if (r0 == 0) goto L90
            evrs r0 = r7.n
            r0.c(r8)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evuk.g(java.lang.Object):void");
    }

    @Override // defpackage.evuz
    public final void h(Object obj, Object obj2) {
        E(obj);
        obj2.getClass();
        for (int i = 0; i < this.c.length; i += 3) {
            int iV = v(i);
            long jW = w(iV);
            int iP = p(i);
            switch (u(iV)) {
                case 0:
                    if (O(obj2, i)) {
                        evvz.q(obj, jW, evvz.b(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (O(obj2, i)) {
                        evvz.r(obj, jW, evvz.c(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (O(obj2, i)) {
                        evvz.t(obj, jW, evvz.f(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (O(obj2, i)) {
                        evvz.t(obj, jW, evvz.f(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (O(obj2, i)) {
                        evvz.s(obj, jW, evvz.d(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (O(obj2, i)) {
                        evvz.t(obj, jW, evvz.f(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (O(obj2, i)) {
                        evvz.s(obj, jW, evvz.d(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (O(obj2, i)) {
                        evvz.m(obj, jW, evvz.w(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (O(obj2, i)) {
                        evvz.u(obj, jW, evvz.h(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    F(obj, obj2, i);
                    break;
                case 10:
                    if (O(obj2, i)) {
                        evvz.u(obj, jW, evvz.h(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (O(obj2, i)) {
                        evvz.s(obj, jW, evvz.d(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (O(obj2, i)) {
                        evvz.s(obj, jW, evvz.d(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (O(obj2, i)) {
                        evvz.s(obj, jW, evvz.d(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (O(obj2, i)) {
                        evvz.t(obj, jW, evvz.f(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (O(obj2, i)) {
                        evvz.s(obj, jW, evvz.d(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (O(obj2, i)) {
                        evvz.t(obj, jW, evvz.f(obj2, jW));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    F(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    evtg evtgVarA = evtr.a(obj, jW);
                    evtg evtgVarA2 = evtr.a(obj2, jW);
                    int size = evtgVarA.size();
                    int size2 = evtgVarA2.size();
                    if (size > 0 && size2 > 0) {
                        if (!evtgVarA.c()) {
                            evtgVarA = evtgVarA.e(size2 + size);
                        }
                        evtgVarA.addAll(evtgVarA2);
                    }
                    if (size > 0) {
                        evtgVarA2 = evtgVarA;
                    }
                    evvz.u(obj, jW, evtgVarA2);
                    break;
                case 50:
                    evvs evvsVar = evva.a;
                    evvz.u(obj, jW, evuc.c(evvz.h(obj, jW), evvz.h(obj2, jW)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (S(obj2, iP, i)) {
                        evvz.u(obj, jW, evvz.h(obj2, jW));
                        J(obj, iP, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    G(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case Function.ALT_CONVENTION /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (S(obj2, iP, i)) {
                        evvz.u(obj, jW, evvz.h(obj2, jW));
                        J(obj, iP, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    G(obj, obj2, i);
                    break;
            }
        }
        evva.J(obj, obj2);
        if (this.h) {
            evva.n(this.n, obj, obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x0507, code lost:
    
        r10.put(r2, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x050a, code lost:
    
        ((defpackage.evra) r24).a.A(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0514, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x05b3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x05b4, code lost:
    
        r2 = r1;
        r1 = r13;
        r5 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x05ba, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:335:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x09f1 A[LOOP:3: B:344:0x09ed->B:346:0x09f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0a04  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x09b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x04fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x09c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x04f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:486:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026c A[Catch: all -> 0x09ac, TryCatch #10 {all -> 0x09ac, blocks: (B:27:0x0076, B:48:0x0113, B:49:0x0126, B:47:0x010d, B:37:0x00b4, B:38:0x00bd, B:39:0x00c7, B:40:0x00d1, B:41:0x00db, B:42:0x00e5, B:43:0x00ef, B:44:0x00f9, B:45:0x0103, B:50:0x0127, B:52:0x0134, B:54:0x0140, B:55:0x0146, B:94:0x0266, B:96:0x026c, B:97:0x0271, B:105:0x029a, B:102:0x0282, B:104:0x0288, B:56:0x014c, B:57:0x0154, B:59:0x015a, B:60:0x0164, B:61:0x016e, B:62:0x0178, B:63:0x0182, B:64:0x0189, B:65:0x018a, B:66:0x0194, B:67:0x019a, B:69:0x01a0, B:71:0x01a8, B:73:0x01b7, B:74:0x01c2, B:75:0x01c7, B:76:0x01d3, B:78:0x01d9, B:80:0x01e1, B:82:0x01f0, B:83:0x01fb, B:84:0x0200, B:85:0x021a, B:86:0x021f, B:87:0x0228, B:88:0x0231, B:89:0x023a, B:90:0x0243, B:91:0x024c, B:92:0x0255, B:93:0x025e, B:108:0x02a2, B:125:0x02e0, B:315:0x098c, B:238:0x05ec, B:239:0x05f9, B:240:0x0609, B:241:0x0619, B:242:0x0629, B:243:0x0639, B:244:0x0649, B:245:0x0659, B:246:0x0669, B:247:0x0679, B:248:0x0689, B:249:0x0699, B:250:0x06a9, B:251:0x06b9, B:257:0x06e1, B:258:0x06ee, B:260:0x0705, B:262:0x071a, B:264:0x0725, B:265:0x072c, B:266:0x0731, B:267:0x0732, B:269:0x074d, B:271:0x0762, B:273:0x0769, B:275:0x076f, B:276:0x0776, B:277:0x077b, B:278:0x077c, B:280:0x0785, B:281:0x0796, B:282:0x07a7, B:283:0x07b7, B:284:0x07c7, B:285:0x07d7, B:286:0x07e7, B:287:0x07f7, B:288:0x0807, B:289:0x0817, B:290:0x0827, B:291:0x083c, B:292:0x084f, B:293:0x0862, B:294:0x0875, B:295:0x0888, B:297:0x0899, B:300:0x08a0, B:301:0x08a6, B:302:0x08b2, B:303:0x08c5, B:304:0x08d8, B:305:0x08ed, B:306:0x08f8, B:307:0x090b, B:308:0x091e, B:309:0x0930, B:310:0x0942, B:311:0x0954, B:312:0x0966, B:313:0x0978), top: B:367:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0271 A[Catch: all -> 0x09ac, TryCatch #10 {all -> 0x09ac, blocks: (B:27:0x0076, B:48:0x0113, B:49:0x0126, B:47:0x010d, B:37:0x00b4, B:38:0x00bd, B:39:0x00c7, B:40:0x00d1, B:41:0x00db, B:42:0x00e5, B:43:0x00ef, B:44:0x00f9, B:45:0x0103, B:50:0x0127, B:52:0x0134, B:54:0x0140, B:55:0x0146, B:94:0x0266, B:96:0x026c, B:97:0x0271, B:105:0x029a, B:102:0x0282, B:104:0x0288, B:56:0x014c, B:57:0x0154, B:59:0x015a, B:60:0x0164, B:61:0x016e, B:62:0x0178, B:63:0x0182, B:64:0x0189, B:65:0x018a, B:66:0x0194, B:67:0x019a, B:69:0x01a0, B:71:0x01a8, B:73:0x01b7, B:74:0x01c2, B:75:0x01c7, B:76:0x01d3, B:78:0x01d9, B:80:0x01e1, B:82:0x01f0, B:83:0x01fb, B:84:0x0200, B:85:0x021a, B:86:0x021f, B:87:0x0228, B:88:0x0231, B:89:0x023a, B:90:0x0243, B:91:0x024c, B:92:0x0255, B:93:0x025e, B:108:0x02a2, B:125:0x02e0, B:315:0x098c, B:238:0x05ec, B:239:0x05f9, B:240:0x0609, B:241:0x0619, B:242:0x0629, B:243:0x0639, B:244:0x0649, B:245:0x0659, B:246:0x0669, B:247:0x0679, B:248:0x0689, B:249:0x0699, B:250:0x06a9, B:251:0x06b9, B:257:0x06e1, B:258:0x06ee, B:260:0x0705, B:262:0x071a, B:264:0x0725, B:265:0x072c, B:266:0x0731, B:267:0x0732, B:269:0x074d, B:271:0x0762, B:273:0x0769, B:275:0x076f, B:276:0x0776, B:277:0x077b, B:278:0x077c, B:280:0x0785, B:281:0x0796, B:282:0x07a7, B:283:0x07b7, B:284:0x07c7, B:285:0x07d7, B:286:0x07e7, B:287:0x07f7, B:288:0x0807, B:289:0x0817, B:290:0x0827, B:291:0x083c, B:292:0x084f, B:293:0x0862, B:294:0x0875, B:295:0x0888, B:297:0x0899, B:300:0x08a0, B:301:0x08a6, B:302:0x08b2, B:303:0x08c5, B:304:0x08d8, B:305:0x08ed, B:306:0x08f8, B:307:0x090b, B:308:0x091e, B:309:0x0930, B:310:0x0942, B:311:0x0954, B:312:0x0966, B:313:0x0978), top: B:367:0x010d }] */
    @Override // defpackage.evuz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Object r23, defpackage.evut r24, defpackage.evrr r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evuk.i(java.lang.Object, evut, evrr):void");
    }

    @Override // defpackage.evuz
    public final void j(Object obj, byte[] bArr, int i, int i2, evqf evqfVar) {
        c(obj, bArr, i, i2, 0, evqfVar);
    }

    @Override // defpackage.evuz
    public final boolean k(Object obj, Object obj2) {
        boolean zO;
        for (int i = 0; i < this.c.length; i += 3) {
            int iV = v(i);
            long jW = w(iV);
            switch (u(iV)) {
                case 0:
                    if (!M(obj, obj2, i) || Double.doubleToLongBits(evvz.b(obj, jW)) != Double.doubleToLongBits(evvz.b(obj2, jW))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!M(obj, obj2, i) || Float.floatToIntBits(evvz.c(obj, jW)) != Float.floatToIntBits(evvz.c(obj2, jW))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!M(obj, obj2, i) || evvz.f(obj, jW) != evvz.f(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!M(obj, obj2, i) || evvz.f(obj, jW) != evvz.f(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!M(obj, obj2, i) || evvz.d(obj, jW) != evvz.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!M(obj, obj2, i) || evvz.f(obj, jW) != evvz.f(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!M(obj, obj2, i) || evvz.d(obj, jW) != evvz.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!M(obj, obj2, i) || evvz.w(obj, jW) != evvz.w(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!M(obj, obj2, i) || !evva.o(evvz.h(obj, jW), evvz.h(obj2, jW))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!M(obj, obj2, i) || !evva.o(evvz.h(obj, jW), evvz.h(obj2, jW))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!M(obj, obj2, i) || !evva.o(evvz.h(obj, jW), evvz.h(obj2, jW))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!M(obj, obj2, i) || evvz.d(obj, jW) != evvz.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!M(obj, obj2, i) || evvz.d(obj, jW) != evvz.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!M(obj, obj2, i) || evvz.d(obj, jW) != evvz.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!M(obj, obj2, i) || evvz.f(obj, jW) != evvz.f(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!M(obj, obj2, i) || evvz.d(obj, jW) != evvz.d(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!M(obj, obj2, i) || evvz.f(obj, jW) != evvz.f(obj2, jW)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!M(obj, obj2, i) || !evva.o(evvz.h(obj, jW), evvz.h(obj2, jW))) {
                        return false;
                    }
                    continue;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    zO = evva.o(evvz.h(obj, jW), evvz.h(obj2, jW));
                    break;
                case 50:
                    zO = evva.o(evvz.h(obj, jW), evvz.h(obj2, jW));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case Function.ALT_CONVENTION /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jS = s(i) & 1048575;
                    if (evvz.d(obj, jS) != evvz.d(obj2, jS) || !evva.o(evvz.h(obj, jW), evvz.h(obj2, jW))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zO) {
                return false;
            }
        }
        if (!evvu.k(obj).equals(evvu.k(obj2))) {
            return false;
        }
        if (!this.h) {
            return true;
        }
        evrs evrsVar = this.n;
        return evrsVar.a(obj).equals(evrsVar.a(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc  */
    @Override // defpackage.evuz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evuk.l(java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094 A[PHI: r3
      0x0094: PHI (r3v51 int) = 
      (r3v9 int)
      (r3v42 int)
      (r3v9 int)
      (r3v44 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
      (r3v9 int)
     binds: [B:30:0x0091, B:116:0x03ae, B:87:0x01ab, B:204:0x0094, B:84:0x019c, B:85:0x019e, B:81:0x018d, B:82:0x018f, B:78:0x017e, B:79:0x0180, B:75:0x016f, B:76:0x0171, B:72:0x0160, B:73:0x0162, B:69:0x0151, B:70:0x0153, B:66:0x0142, B:67:0x0144, B:63:0x0133, B:64:0x0135, B:60:0x0124, B:61:0x0126, B:57:0x0111, B:58:0x0113, B:54:0x0101, B:55:0x0103, B:51:0x00f3, B:52:0x00f5, B:48:0x00e5, B:49:0x00e7, B:45:0x00d7, B:46:0x00d9, B:42:0x00c9, B:43:0x00cb, B:39:0x00bb, B:40:0x00bd, B:36:0x00ad, B:37:0x00af, B:33:0x009b, B:34:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0277  */
    @Override // defpackage.evuz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(java.lang.Object r20, defpackage.evrg r21) {
        /*
            Method dump skipped, instructions count: 1560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evuk.m(java.lang.Object, evrg):void");
    }
}
