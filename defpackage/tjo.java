package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tjo implements Parcelable.Creator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String string;
        Integer num;
        Integer num2;
        boolean z;
        Integer numValueOf;
        boolean z2;
        Object objValueOf;
        Boolean boolValueOf;
        String string2 = parcel.readString();
        if (string2.hashCode() != -1374584045 || !string2.equals("PARTICIPANT")) {
            throw new IllegalArgumentException();
        }
        if (parcel.readInt() == 0) {
            string = parcel.readString();
            num = null;
        } else {
            string = null;
            num = null;
        }
        String string3 = parcel.readString();
        Integer num3 = num;
        String string4 = parcel.readString();
        int i = parcel.readInt();
        if (parcel.readInt() == 1) {
            num2 = num3;
            z = true;
        } else {
            num2 = num3;
            z = false;
        }
        if (parcel.readInt() == 1) {
            numValueOf = num2;
            z2 = true;
        } else {
            numValueOf = num2;
            z2 = false;
        }
        if (parcel.readInt() == 0) {
            objValueOf = Boolean.valueOf(parcel.readInt() == 1);
        } else {
            objValueOf = numValueOf;
        }
        if (parcel.readInt() == 0) {
            boolValueOf = Boolean.valueOf(parcel.readInt() == 1);
        } else {
            boolValueOf = numValueOf;
        }
        if (parcel.readInt() == 0) {
            numValueOf = Integer.valueOf(parcel.readInt());
        }
        return new tjp(string, string3, string4, i, z, z2, objValueOf, boolValueOf, numValueOf, (BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus) parcel.readParcelable(tld.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new tjp[i];
    }
}
