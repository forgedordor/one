package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dclv {
    public static short A(Parcel parcel, int i) {
        M(parcel, i, 4);
        return (short) parcel.readInt();
    }

    public static void B(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new dclu(a.g(i, "Overread allowed size end="), parcel);
        }
    }

    public static void C(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + g(parcel, i));
    }

    public static boolean D(Parcel parcel, int i) {
        M(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte[] E(Parcel parcel, int i) {
        int iG = g(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iG);
        return bArrCreateByteArray;
    }

    public static double[] F(Parcel parcel, int i) {
        int iG = g(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        double[] dArrCreateDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(iDataPosition + iG);
        return dArrCreateDoubleArray;
    }

    public static float[] G(Parcel parcel, int i) {
        int iG = g(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(iDataPosition + iG);
        return fArrCreateFloatArray;
    }

    public static int[] H(Parcel parcel, int i) {
        int iG = g(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iG);
        return iArrCreateIntArray;
    }

    public static long[] I(Parcel parcel, int i) {
        int iG = g(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + iG);
        return jArrCreateLongArray;
    }

    public static Object[] J(Parcel parcel, int i, Parcelable.Creator creator) {
        int iG = g(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iG);
        return objArrCreateTypedArray;
    }

    public static String[] K(Parcel parcel, int i) {
        int iG = g(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iG);
        return strArrCreateStringArray;
    }

    public static byte[][] L(Parcel parcel, int i) {
        int iG = g(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iG);
        return bArr;
    }

    private static void M(Parcel parcel, int i, int i2) {
        int iG = g(parcel, i);
        if (iG == i2) {
            return;
        }
        throw new dclu("Expected size " + i2 + " got " + iG + " (0x" + Integer.toHexString(iG) + ")", parcel);
    }

    private static void N(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        throw new dclu("Expected size " + i2 + " got " + i + " (0x" + Integer.toHexString(i) + ")", parcel);
    }

    public static byte a(Parcel parcel, int i) {
        M(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static double b(Parcel parcel, int i) {
        M(parcel, i, 8);
        return parcel.readDouble();
    }

    public static float c(Parcel parcel, int i) {
        M(parcel, i, 4);
        return parcel.readFloat();
    }

    public static int d(int i) {
        return (char) i;
    }

    public static int e(Parcel parcel) {
        return parcel.readInt();
    }

    public static int f(Parcel parcel, int i) {
        M(parcel, i, 4);
        return parcel.readInt();
    }

    public static int g(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static int h(Parcel parcel) {
        int i = parcel.readInt();
        int iG = g(parcel, i);
        int iD = d(i);
        int iDataPosition = parcel.dataPosition();
        if (iD != 20293) {
            throw new dclu("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iG + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new dclu(a.s(i2, iDataPosition, "Size read is invalid start=", " end="), parcel);
        }
        return i2;
    }

    public static long i(Parcel parcel, int i) {
        M(parcel, i, 8);
        return parcel.readLong();
    }

    public static PendingIntent j(Parcel parcel, int i) {
        int iG = g(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        PendingIntent pendingIntentOrNullFromParcel = PendingIntent.readPendingIntentOrNullFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iG);
        return pendingIntentOrNullFromParcel;
    }

    public static Bundle k(Parcel parcel, int i) {
        int iG = g(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iG);
        return bundle;
    }

    public static IBinder l(Parcel parcel, int i) {
        int iG = g(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iG);
        return strongBinder;
    }

    public static Parcel m(Parcel parcel, int i) {
        int iG = g(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.appendFrom(parcel, iDataPosition, iG);
        parcel.setDataPosition(iDataPosition + iG);
        return parcelObtain;
    }

    public static Parcelable n(Parcel parcel, int i, Parcelable.Creator creator) {
        int iG = g(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iG);
        return parcelable;
    }

    public static Boolean o(Parcel parcel, int i) {
        int iG = g(parcel, i);
        if (iG == 0) {
            return null;
        }
        N(parcel, iG, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double p(Parcel parcel, int i) {
        int iG = g(parcel, i);
        if (iG == 0) {
            return null;
        }
        N(parcel, iG, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static Float q(Parcel parcel, int i) {
        int iG = g(parcel, i);
        if (iG == 0) {
            return null;
        }
        N(parcel, iG, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static Integer r(Parcel parcel, int i) {
        int iG = g(parcel, i);
        if (iG == 0) {
            return null;
        }
        N(parcel, iG, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static Long s(Parcel parcel, int i) {
        int iG = g(parcel, i);
        if (iG == 0) {
            return null;
        }
        N(parcel, iG, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static String t(Parcel parcel, int i) {
        int iG = g(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iG);
        return string;
    }

    public static BigDecimal u(Parcel parcel, int i) {
        int iG = g(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i2 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iG);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i2);
    }

    public static BigInteger v(Parcel parcel, int i) {
        int iG = g(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iG);
        return new BigInteger(bArrCreateByteArray);
    }

    public static ArrayList w(Parcel parcel, int i) {
        int iG = g(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iG);
        return arrayList;
    }

    public static ArrayList x(Parcel parcel, int i) {
        int iG = g(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(iDataPosition + iG);
        return arrayList;
    }

    public static ArrayList y(Parcel parcel, int i) {
        int iG = g(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iG);
        return arrayListCreateStringArrayList;
    }

    public static ArrayList z(Parcel parcel, int i, Parcelable.Creator creator) {
        int iG = g(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iG);
        return arrayListCreateTypedArrayList;
    }
}
