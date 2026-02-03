package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.googlehelp.InProductHelp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dclx {
    public static SafeParcelable a(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        dclh.m(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
        parcelObtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return safeParcelable;
    }

    public static void b(SafeParcelable safeParcelable, Intent intent) {
        Parcel parcelObtain = Parcel.obtain();
        ddcl.a((InProductHelp) safeParcelable, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent.putExtra("EXTRA_IN_PRODUCT_HELP", bArrMarshall);
    }
}
