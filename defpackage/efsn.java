package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efsn implements Parcelable.Creator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i;
        String string = parcel.readString();
        String string2 = parcel.readString();
        int i2 = parcel.readInt();
        int i3 = parcel.readInt();
        int i4 = parcel.readInt();
        Intent intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        Intent intent2 = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        int i5 = parcel.readInt();
        long j = parcel.readLong();
        efrt.c(string, "packageName cannot be null.");
        efrt.c(string2, "serviceClass cannot be null.");
        efrt.c(intent, "Service intent cannot be null.");
        efrt.c(intent2, "Item click intent cannot be null");
        boolean z = true;
        if (i2 == 1) {
            i = 1;
        } else {
            i = 1;
            z = false;
        }
        if (!z) {
            efrt.a(i3 != 0 ? i : 0, "Invalidate resource id of display name");
            efrt.a(i4 != 0 ? i : 0, "Invalidate resource id of display icon");
        }
        return new efso(string, string2, z, i5 == i ? i : 0, j, i3, i4, intent, intent2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new efso[i];
    }
}
