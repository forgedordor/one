package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpk implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hpl createFromParcel(Parcel parcel, ClassLoader classLoader) {
        hrn hrnVar;
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            hrnVar = hpb.a;
        } else if (i == 1) {
            hrnVar = hsi.a;
        } else {
            if (i != 2) {
                throw new IllegalStateException(a.e(i, "Unsupported MutableState policy ", " was restored"));
            }
            hrnVar = hqr.a;
        }
        return new hpl(value, hrnVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new hpl[i];
    }
}
