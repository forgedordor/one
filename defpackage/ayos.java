package defpackage;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayos {
    private static final cqce a = cqce.g("BugleAction", "ParcelSerializer");
    private static final eldz b = eldz.e;

    public static Object a(String str, Class cls, String str2) {
        Object objCast = null;
        if (TextUtils.isEmpty(str2)) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("No className found when unparceling");
            cqbdVarE.I(cls.toString());
            cqbdVarE.I(". Must be parceled via old way.");
            cqbdVarE.r();
            return null;
        }
        if (str == null) {
            cqbd cqbdVarE2 = a.e();
            cqbdVarE2.I("No byteString found when unparceling");
            cqbdVarE2.I(str2);
            cqbdVarE2.I(". Must be parceled via old way.");
            cqbdVarE2.r();
            return null;
        }
        byte[] bArrK = b.k(str);
        int length = bArrK.length;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArrK, 0, length);
        parcelObtain.setDataPosition(0);
        try {
            try {
                objCast = cls.cast(parcelObtain.readParcelable(cls.getClassLoader()));
            } finally {
                parcelObtain.recycle();
            }
        } catch (BadParcelableException | ClassCastException | NullPointerException e) {
            String str3 = new String(bArrK, 0, Math.min(bArrK.length, 500), StandardCharsets.UTF_16LE);
            cqbd cqbdVarB = a.b();
            cqbdVarB.I("Caught exception when unparceling an");
            cqbdVarB.I(str2);
            cqbdVarB.I("parceled data:");
            cqbdVarB.I(str3);
            cqbdVarB.s(e);
        }
        return objCast;
    }

    public static String b(Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeParcelable(parcelable, 0);
        String strJ = b.j(parcelObtain.marshall());
        parcelObtain.recycle();
        return strJ;
    }

    public static String c(Parcel parcel) {
        String strJ = b.j(parcel.marshall());
        return strJ.length() < 1000 ? strJ : strJ.substring(0, 1000);
    }
}
