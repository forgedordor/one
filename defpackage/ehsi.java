package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehsi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Intent.CREATOR);
        String string = parcel.readString();
        int i2 = parcel.readInt();
        return new ehsj(i, arrayListCreateTypedArrayList, string, i2 != 0, parcel.readInt() == 1 ? Integer.valueOf(parcel.readInt()) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ehsj[i];
    }
}
