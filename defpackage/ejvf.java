package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ejvf implements ejwm {
    protected ejvf() {
    }

    public static ejvf m(CharSequence charSequence) {
        int length = charSequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new ejup(charSequence) : new ejuw(charSequence.charAt(0), charSequence.charAt(1)) : new ejuv(charSequence.charAt(0)) : ejvc.a;
    }

    public static ejvf n(CharSequence charSequence) {
        return m(charSequence).f();
    }

    public static String q(char c) {
        char[] cArr = new char[6];
        int i = 0;
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i2 = c;
        while (i < 4) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(i2 & 15);
            i++;
            i2 >>= 4;
        }
        return String.copyValueOf(cArr);
    }

    private static ejvf r(int i, BitSet bitSet, String str) {
        int i2;
        if (i == 0) {
            return ejvc.a;
        }
        if (i == 1) {
            return new ejuv((char) bitSet.nextSetBit(0));
        }
        int i3 = 2;
        if (i == 2) {
            char cNextSetBit = (char) bitSet.nextSetBit(0);
            return new ejuw(cNextSetBit, (char) bitSet.nextSetBit(cNextSetBit + 1));
        }
        int length = bitSet.length();
        if (i > 1023 || length <= i * 64) {
            return new ejur(bitSet, str);
        }
        int iCardinality = bitSet.cardinality();
        boolean z = bitSet.get(0);
        if (iCardinality != 1) {
            int iHighestOneBit = Integer.highestOneBit(iCardinality - 1);
            i3 = iHighestOneBit + iHighestOneBit;
            while (i3 * 0.5d < iCardinality) {
                i3 += i3;
            }
        }
        char[] cArr = new char[i3];
        int i4 = i3 - 1;
        int iNextSetBit = bitSet.nextSetBit(0);
        long j = 0;
        while (iNextSetBit != -1) {
            long j2 = (1 << iNextSetBit) | j;
            int iR = ejwz.r(iNextSetBit);
            while (true) {
                i2 = iR & i4;
                if (cArr[i2] == 0) {
                    break;
                }
                iR = i2 + 1;
            }
            cArr[i2] = (char) iNextSetBit;
            iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
            j = j2;
        }
        return new ejwz(cArr, j, z, str);
    }

    @Override // defpackage.ejwm
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return c(((Character) obj).charValue());
    }

    public void b(BitSet bitSet) {
        for (int i = 65535; i >= 0; i--) {
            if (c((char) i)) {
                bitSet.set(i);
            }
        }
    }

    public abstract boolean c(char c);

    public int d(CharSequence charSequence) {
        return e(charSequence, 0);
    }

    public int e(CharSequence charSequence, int i) {
        int length = charSequence.length();
        ejwl.x(i, length);
        while (i < length) {
            if (c(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public ejvf f() {
        return new ejva(this);
    }

    public ejvf g(ejvf ejvfVar) {
        return new ejvd(this, ejvfVar);
    }

    public String h(CharSequence charSequence, char c) {
        String string = charSequence.toString();
        int iD = d(string);
        if (iD == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iD] = '.';
        while (true) {
            iD++;
            if (iD >= charArray.length) {
                return new String(charArray);
            }
            if (c(charArray[iD])) {
                charArray[iD] = '.';
            }
        }
    }

    public boolean i(CharSequence charSequence) {
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return true;
            }
        } while (c(charSequence.charAt(length)));
        return false;
    }

    public boolean j(CharSequence charSequence) {
        return d(charSequence) == -1;
    }

    public ejvf k() {
        return o();
    }

    public final int l(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (c(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public final ejvf o() {
        BitSet bitSet = new BitSet();
        b(bitSet);
        int iCardinality = bitSet.cardinality();
        if (iCardinality + iCardinality <= 65536) {
            return r(iCardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i = 65536 - iCardinality;
        String string = toString();
        return new ejum(r(i, bitSet, string.endsWith(".negate()") ? string.substring(0, string.length() - 9) : String.valueOf(string).concat(".negate()")), string);
    }

    public final String p(CharSequence charSequence) {
        String string = charSequence.toString();
        int iD = d(string);
        if (iD == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i = 1;
        while (true) {
            iD++;
            while (iD != charArray.length) {
                if (c(charArray[iD])) {
                    break;
                }
                charArray[iD - i] = charArray[iD];
                iD++;
            }
            return new String(charArray, 0, iD - i);
            i++;
        }
    }
}
