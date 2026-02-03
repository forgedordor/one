package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.time.Duration;
import j$.time.Instant;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dojo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        LinkedHashMap linkedHashMap;
        parcel.getClass();
        dogg doggVar = (dogg) parcel.readParcelable(dojp.class.getClassLoader());
        String string = parcel.readString();
        if (parcel.readInt() == 0) {
            linkedHashMap = null;
        } else {
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap2.put(parcel.readString(), parcel.readString());
            }
            linkedHashMap = linkedHashMap2;
        }
        return new dojp(doggVar, string, linkedHashMap, parcel.readString(), parcel.readLong(), (Instant) parcel.readSerializable(), (dltc) parcel.readParcelable(dojp.class.getClassLoader()), (Duration) parcel.readSerializable(), (dqbw) ProtoParsers.a(parcel, dqbw.a, evrr.a()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dojp[i];
    }
}
