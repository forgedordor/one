package defpackage;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erdu {
    public static final long[] a;
    static final long[] b;
    public static final long[] c;
    static final erdn[][] d;
    public static final erdn[] e;
    private static final BigInteger f;
    private static final BigInteger g;
    private static final BigInteger h;
    private static final BigInteger i;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        h = bigIntegerMod2;
        BigInteger bigIntegerModPow = BigInteger.valueOf(2L).modPow(bigIntegerSubtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        i = bigIntegerModPow;
        erdt erdtVar = new erdt();
        erdtVar.b = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        BigInteger bigInteger = erdtVar.b;
        BigInteger bigIntegerMultiply = bigInteger.pow(2).subtract(BigInteger.ONE).multiply(bigIntegerMod.multiply(bigInteger.pow(2)).add(BigInteger.ONE).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        erdtVar.a = bigIntegerModPow2;
        a = erdz.l(c(bigIntegerMod));
        b = erdz.l(c(bigIntegerMod2));
        c = erdz.l(c(bigIntegerModPow));
        d = (erdn[][]) Array.newInstance((Class<?>) erdn.class, 32, 8);
        erdt erdtVarB = erdtVar;
        for (int i2 = 0; i2 < 32; i2++) {
            erdt erdtVarB2 = erdtVarB;
            for (int i3 = 0; i3 < 8; i3++) {
                d[i2][i3] = a(erdtVarB2);
                erdtVarB2 = b(erdtVarB2, erdtVarB);
            }
            for (int i4 = 0; i4 < 8; i4++) {
                erdtVarB = b(erdtVarB, erdtVarB);
            }
        }
        erdt erdtVarB3 = b(erdtVar, erdtVar);
        e = new erdn[8];
        for (int i5 = 0; i5 < 8; i5++) {
            e[i5] = a(erdtVar);
            erdtVar = b(erdtVar, erdtVarB3);
        }
    }

    private static erdn a(erdt erdtVar) {
        BigInteger bigIntegerAdd = erdtVar.b.add(erdtVar.a);
        BigInteger bigInteger = f;
        return new erdn(erdz.l(c(bigIntegerAdd.mod(bigInteger))), erdz.l(c(erdtVar.b.subtract(erdtVar.a).mod(bigInteger))), erdz.l(c(h.multiply(erdtVar.a).multiply(erdtVar.b).mod(bigInteger))));
    }

    private static erdt b(erdt erdtVar, erdt erdtVar2) {
        erdt erdtVar3 = new erdt();
        BigInteger bigIntegerMultiply = g.multiply(erdtVar.a.multiply(erdtVar2.a).multiply(erdtVar.b).multiply(erdtVar2.b));
        BigInteger bigInteger = f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        erdtVar3.a = erdtVar.a.multiply(erdtVar2.b).add(erdtVar2.a.multiply(erdtVar.b)).multiply(BigInteger.ONE.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        erdtVar3.b = erdtVar.b.multiply(erdtVar2.b).add(erdtVar.a.multiply(erdtVar2.a)).multiply(BigInteger.ONE.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return erdtVar3;
    }

    private static byte[] c(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = bArr[i2];
            int i3 = 31 - i2;
            bArr[i2] = bArr[i3];
            bArr[i3] = b2;
        }
        return bArr;
    }
}
