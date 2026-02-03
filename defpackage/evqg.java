package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evqg {
    public static final /* synthetic */ int a = 0;
    private static volatile int b = 100;

    static long A(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    private static void B(int i) throws evtj {
        if (i >= b) {
            throw new evtj("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    static double a(byte[] bArr, int i) {
        return Double.longBitsToDouble(A(bArr, i));
    }

    static float b(byte[] bArr, int i) {
        return Float.intBitsToFloat(d(bArr, i));
    }

    static int c(byte[] bArr, int i, evqf evqfVar) {
        int iT = t(bArr, i, evqfVar);
        int i2 = evqfVar.a;
        if (i2 < 0) {
            throw new evtj("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iT) {
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            evqfVar.c = evqs.b;
            return iT;
        }
        evqfVar.c = evqs.z(bArr, iT, i2);
        return iT + i2;
    }

    static int d(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int e(evuz evuzVar, byte[] bArr, int i, int i2, int i3, evqf evqfVar) {
        Object objE = evuzVar.e();
        int iX = x(objE, evuzVar, bArr, i, i2, i3, evqfVar);
        evuzVar.g(objE);
        evqfVar.c = objE;
        return iX;
    }

    static int f(evuz evuzVar, byte[] bArr, int i, int i2, evqf evqfVar) {
        Object objE = evuzVar.e();
        int iY = y(objE, evuzVar, bArr, i, i2, evqfVar);
        evuzVar.g(objE);
        evqfVar.c = objE;
        return iY;
    }

    static int g(evuz evuzVar, int i, byte[] bArr, int i2, int i3, evtg evtgVar, evqf evqfVar) {
        int iF = f(evuzVar, bArr, i2, i3, evqfVar);
        evtgVar.add(evqfVar.c);
        while (iF < i3) {
            int iT = t(bArr, iF, evqfVar);
            if (i != evqfVar.a) {
                break;
            }
            iF = f(evuzVar, bArr, iT, i3, evqfVar);
            evtgVar.add(evqfVar.c);
        }
        return iF;
    }

    static int h(byte[] bArr, int i, evtg evtgVar, evqf evqfVar) {
        evqi evqiVar = (evqi) evtgVar;
        int iT = t(bArr, i, evqfVar);
        int i2 = evqfVar.a + iT;
        while (iT < i2) {
            iT = w(bArr, iT, evqfVar);
            evqiVar.f(evqfVar.b != 0);
        }
        if (iT == i2) {
            return iT;
        }
        throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int i(byte[] bArr, int i, evtg evtgVar, evqf evqfVar) {
        evrh evrhVar = (evrh) evtgVar;
        int iT = t(bArr, i, evqfVar);
        int i2 = evqfVar.a;
        int i3 = iT + i2;
        if (i3 > bArr.length) {
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = evrhVar.d + (i2 / 8);
        int length = evrhVar.c.length;
        if (i4 > length) {
            if (length == 0) {
                evrhVar.c = new double[Math.max(i4, 10)];
            } else {
                while (length < i4) {
                    length = evrh.f(length);
                }
                evrhVar.c = Arrays.copyOf(evrhVar.c, length);
            }
        }
        while (iT < i3) {
            evrhVar.h(a(bArr, iT));
            iT += 8;
        }
        if (iT == i3) {
            return iT;
        }
        throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int j(byte[] bArr, int i, evtg evtgVar, evqf evqfVar) {
        evsq evsqVar = (evsq) evtgVar;
        int iT = t(bArr, i, evqfVar);
        int i2 = evqfVar.a;
        int i3 = iT + i2;
        if (i3 > bArr.length) {
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = evsqVar.c + (i2 / 4);
        int length = evsqVar.b.length;
        if (i4 > length) {
            if (length == 0) {
                evsqVar.b = new int[Math.max(i4, 10)];
            } else {
                while (length < i4) {
                    length = evsq.f(length);
                }
                evsqVar.b = Arrays.copyOf(evsqVar.b, length);
            }
        }
        while (iT < i3) {
            evsqVar.h(d(bArr, iT));
            iT += 4;
        }
        if (iT == i3) {
            return iT;
        }
        throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int k(byte[] bArr, int i, evtg evtgVar, evqf evqfVar) {
        evtv evtvVar = (evtv) evtgVar;
        int iT = t(bArr, i, evqfVar);
        int i2 = evqfVar.a;
        int i3 = iT + i2;
        if (i3 > bArr.length) {
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = evtvVar.c + (i2 / 8);
        int length = evtvVar.b.length;
        if (i4 > length) {
            if (length == 0) {
                evtvVar.b = new long[Math.max(i4, 10)];
            } else {
                while (length < i4) {
                    length = evtv.h(length);
                }
                evtvVar.b = Arrays.copyOf(evtvVar.b, length);
            }
        }
        while (iT < i3) {
            evtvVar.g(A(bArr, iT));
            iT += 8;
        }
        if (iT == i3) {
            return iT;
        }
        throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int l(byte[] bArr, int i, evtg evtgVar, evqf evqfVar) {
        evsa evsaVar = (evsa) evtgVar;
        int iT = t(bArr, i, evqfVar);
        int i2 = evqfVar.a;
        int i3 = iT + i2;
        if (i3 > bArr.length) {
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = evsaVar.d + (i2 / 4);
        int length = evsaVar.c.length;
        if (i4 > length) {
            if (length == 0) {
                evsaVar.c = new float[Math.max(i4, 10)];
            } else {
                while (length < i4) {
                    length = evsa.f(length);
                }
                evsaVar.c = Arrays.copyOf(evsaVar.c, length);
            }
        }
        while (iT < i3) {
            evsaVar.h(b(bArr, iT));
            iT += 4;
        }
        if (iT == i3) {
            return iT;
        }
        throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int m(byte[] bArr, int i, evtg evtgVar, evqf evqfVar) {
        evsq evsqVar = (evsq) evtgVar;
        int iT = t(bArr, i, evqfVar);
        int i2 = evqfVar.a + iT;
        while (iT < i2) {
            iT = t(bArr, iT, evqfVar);
            evsqVar.h(evqz.H(evqfVar.a));
        }
        if (iT == i2) {
            return iT;
        }
        throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int n(byte[] bArr, int i, evtg evtgVar, evqf evqfVar) {
        evtv evtvVar = (evtv) evtgVar;
        int iT = t(bArr, i, evqfVar);
        int i2 = evqfVar.a + iT;
        while (iT < i2) {
            iT = w(bArr, iT, evqfVar);
            evtvVar.g(evqz.J(evqfVar.b));
        }
        if (iT == i2) {
            return iT;
        }
        throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int o(byte[] bArr, int i, evtg evtgVar, evqf evqfVar) {
        evsq evsqVar = (evsq) evtgVar;
        int iT = t(bArr, i, evqfVar);
        int i2 = evqfVar.a + iT;
        while (iT < i2) {
            iT = t(bArr, iT, evqfVar);
            evsqVar.h(evqfVar.a);
        }
        if (iT == i2) {
            return iT;
        }
        throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int p(byte[] bArr, int i, evtg evtgVar, evqf evqfVar) {
        evtv evtvVar = (evtv) evtgVar;
        int iT = t(bArr, i, evqfVar);
        int i2 = evqfVar.a + iT;
        while (iT < i2) {
            iT = w(bArr, iT, evqfVar);
            evtvVar.g(evqfVar.b);
        }
        if (iT == i2) {
            return iT;
        }
        throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int q(byte[] bArr, int i, evqf evqfVar) {
        int iT = t(bArr, i, evqfVar);
        int i2 = evqfVar.a;
        if (i2 < 0) {
            throw new evtj("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            evqfVar.c = "";
            return iT;
        }
        evqfVar.c = new String(bArr, iT, i2, evth.a);
        return iT + i2;
    }

    static int r(byte[] bArr, int i, evqf evqfVar) {
        int iT = t(bArr, i, evqfVar);
        int i2 = evqfVar.a;
        if (i2 < 0) {
            throw new evtj("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            evqfVar.c = "";
            return iT;
        }
        evqfVar.c = evwe.g(bArr, iT, i2);
        return iT + i2;
    }

    static int s(int i, byte[] bArr, int i2, int i3, evvt evvtVar, evqf evqfVar) {
        if (evwj.a(i) == 0) {
            throw new evtj("Protocol message contained an invalid tag (zero).");
        }
        int iB = evwj.b(i);
        if (iB == 0) {
            int iW = w(bArr, i2, evqfVar);
            evvtVar.f(i, Long.valueOf(evqfVar.b));
            return iW;
        }
        if (iB == 1) {
            evvtVar.f(i, Long.valueOf(A(bArr, i2)));
            return i2 + 8;
        }
        if (iB == 2) {
            int iT = t(bArr, i2, evqfVar);
            int i4 = evqfVar.a;
            if (i4 < 0) {
                throw new evtj("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i4 > bArr.length - iT) {
                throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i4 == 0) {
                evvtVar.f(i, evqs.b);
            } else {
                evvtVar.f(i, evqs.z(bArr, iT, i4));
            }
            return iT + i4;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new evtj("Protocol message contained an invalid tag (zero).");
            }
            evvtVar.f(i, Integer.valueOf(d(bArr, i2)));
            return i2 + 4;
        }
        evvt evvtVar2 = new evvt();
        int i5 = (i & (-8)) | 4;
        int i6 = evqfVar.e + 1;
        evqfVar.e = i6;
        B(i6);
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iT2 = t(bArr, i2, evqfVar);
            int i8 = evqfVar.a;
            if (i8 == i5) {
                i7 = i8;
                i2 = iT2;
                break;
            }
            i2 = s(i8, bArr, iT2, i3, evvtVar2, evqfVar);
            i7 = i8;
        }
        evqfVar.e--;
        if (i2 > i3 || i7 != i5) {
            throw new evtj("Failed to parse the message.");
        }
        evvtVar.f(i, evvtVar2);
        return i2;
    }

    static int t(byte[] bArr, int i, evqf evqfVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return u(b2, bArr, i2, evqfVar);
        }
        evqfVar.a = b2;
        return i2;
    }

    static int u(int i, byte[] bArr, int i2, evqf evqfVar) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            evqfVar.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            evqfVar.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            evqfVar.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            evqfVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                evqfVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int v(int i, byte[] bArr, int i2, int i3, evtg evtgVar, evqf evqfVar) {
        evsq evsqVar = (evsq) evtgVar;
        int iT = t(bArr, i2, evqfVar);
        evsqVar.h(evqfVar.a);
        while (iT < i3) {
            int iT2 = t(bArr, iT, evqfVar);
            if (i != evqfVar.a) {
                break;
            }
            iT = t(bArr, iT2, evqfVar);
            evsqVar.h(evqfVar.a);
        }
        return iT;
    }

    static int w(byte[] bArr, int i, evqf evqfVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            evqfVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & 127) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & 127) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        evqfVar.b = j2;
        return i3;
    }

    static int x(Object obj, evuz evuzVar, byte[] bArr, int i, int i2, int i3, evqf evqfVar) {
        int i4 = evqfVar.e + 1;
        evqfVar.e = i4;
        B(i4);
        int iC = ((evuk) evuzVar).c(obj, bArr, i, i2, i3, evqfVar);
        evqfVar.e--;
        evqfVar.c = obj;
        return iC;
    }

    static int y(Object obj, evuz evuzVar, byte[] bArr, int i, int i2, evqf evqfVar) {
        int iU = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iU = u(i3, bArr, iU, evqfVar);
            i3 = evqfVar.a;
        }
        int i4 = iU;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = evqfVar.e + 1;
        evqfVar.e = i5;
        B(i5);
        int i6 = i4 + i3;
        evuzVar.j(obj, bArr, i4, i6, evqfVar);
        evqfVar.e--;
        evqfVar.c = obj;
        return i6;
    }

    static int z(int i, byte[] bArr, int i2, int i3, evqf evqfVar) {
        if (evwj.a(i) == 0) {
            throw new evtj("Protocol message contained an invalid tag (zero).");
        }
        int iB = evwj.b(i);
        if (iB == 0) {
            return w(bArr, i2, evqfVar);
        }
        if (iB == 1) {
            return i2 + 8;
        }
        if (iB == 2) {
            return t(bArr, i2, evqfVar) + evqfVar.a;
        }
        if (iB != 3) {
            if (iB == 5) {
                return i2 + 4;
            }
            throw new evtj("Protocol message contained an invalid tag (zero).");
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = t(bArr, i2, evqfVar);
            i5 = evqfVar.a;
            if (i5 == i4) {
                break;
            }
            i2 = z(i5, bArr, i2, i3, evqfVar);
        }
        if (i2 > i3 || i5 != i4) {
            throw new evtj("Failed to parse the message.");
        }
        return i2;
    }
}
