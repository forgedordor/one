package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.droidguard.internal.DroidGuardInitReply;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcqf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) parcel.readParcelable(ParcelFileDescriptor.class.getClassLoader());
        Parcelable parcelable = parcel.readParcelable(getClass().getClassLoader());
        ejwl.a((parcelFileDescriptor == null) == (parcelable == null));
        return new DroidGuardInitReply(parcelFileDescriptor, parcelable);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DroidGuardInitReply[i];
    }
}
