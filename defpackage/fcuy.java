package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class fcuy extends fcuv {
    public static final int A(int[] iArr) {
        return iArr.length - 1;
    }

    public static final int B(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static final int C(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    public static final int D(long[] jArr, long j) {
        for (int i = 0; i < jArr.length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int E(Object[] objArr, Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (fdbq.f(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final int F(int[] iArr) {
        int iA = fcur.A(iArr);
        int i = iArr[0];
        if (iA > 0) {
            int i2 = 1;
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == iA) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public static final Iterable G(Object[] objArr) {
        objArr.getClass();
        return objArr.length == 0 ? fcvo.a : new fcuw(objArr);
    }

    public static final Object H(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Object I(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static final Object J(Object[] objArr, int i) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static final List K(Object[] objArr) {
        objArr.getClass();
        ArrayList arrayList = new ArrayList();
        fcur.R(objArr, arrayList);
        return arrayList;
    }

    public static final List L(float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return fcvo.a;
        }
        if (length == 1) {
            return fcva.b(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static final List M(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        return length != 0 ? length != 1 ? fcur.N(objArr) : fcva.b(objArr[0]) : fcvo.a;
    }

    public static final List N(Object[] objArr) {
        objArr.getClass();
        return new ArrayList(new fcup(objArr, false));
    }

    public static final Set O(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return fcvq.a;
        }
        if (length == 1) {
            return fcwm.b(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(fcwa.a(length));
        fcur.T(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static final fddq P(int[] iArr) {
        return new fddq(0, fcur.A(iArr));
    }

    public static final boolean Q(Object[] objArr, Object obj) {
        objArr.getClass();
        return fcur.E(objArr, obj) >= 0;
    }

    public static final void R(Object[] objArr, Collection collection) {
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
    }

    public static /* synthetic */ String S(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) throws IOException {
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        charSequence.getClass();
        if ((i & 2) != 0) {
            charSequence2 = "";
        }
        charSequence2.getClass();
        if ((i & 4) != 0) {
            charSequence3 = "";
        }
        charSequence3.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            fdgn.a(sb, obj, null);
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public static final void T(Object[] objArr, Collection collection) {
        for (Object obj : objArr) {
            collection.add(obj);
        }
    }

    public static /* synthetic */ String U(byte[] bArr, fdap fdapVar) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            sb.append((CharSequence) fdapVar.invoke(Byte.valueOf(b)));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final int y(int[] iArr) {
        iArr.getClass();
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int z(float[] fArr) {
        return fArr.length - 1;
    }
}
