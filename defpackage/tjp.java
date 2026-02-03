package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tjp extends tjg {
    public static final Parcelable.Creator<tjp> CREATOR = new tjo();

    public tjp(String str, String str2, String str3, int i, boolean z, boolean z2, Boolean bool, Boolean bool2, Integer num, BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus participantBlockAndSpamStatus) {
        super(str, str2, str3, i, z, z2, bool, bool2, num, participantBlockAndSpamStatus);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("PARTICIPANT");
        String str = this.a;
        if (str == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str);
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        Boolean bool = this.g;
        if (bool == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.h;
        if (bool2 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Integer num = this.i;
        if (num == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(num.intValue());
        }
        parcel.writeParcelable(this.j, i);
    }
}
