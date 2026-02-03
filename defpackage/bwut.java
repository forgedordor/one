package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.etouffee.info.E2eeInfo;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwut implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 != i; i2++) {
            arrayList.add((bwus) Enum.valueOf(bwus.class, parcel.readString()));
        }
        return new E2eeInfo(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new E2eeInfo[i];
    }
}
