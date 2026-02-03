package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.frameworks.client.data.android.server.contrib.parcelables.PendingIntentList;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esuq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 != i; i2++) {
            arrayList.add(parcel.readParcelable(PendingIntentList.class.getClassLoader()));
        }
        return new PendingIntentList(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PendingIntentList[i];
    }
}
