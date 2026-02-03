package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.events.Event;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhcc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) throws NoSuchMethodException, SecurityException {
        try {
            String string = parcel.readString();
            if (string == null) {
                throw new IllegalArgumentException("Read String returned null.");
            }
            if (string.length() == 1) {
                return new Event(parcel);
            }
            Constructor<?> constructor = Class.forName(string).getConstructor(Parcel.class);
            if (constructor != null) {
                return (Event) constructor.newInstance(parcel);
            }
            dhja.g("No constructor for Parcel found!", new Object[0]);
            throw new IllegalStateException("No constructor for Parcel found!");
        } catch (Exception e) {
            e.printStackTrace();
            return new Event(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Event[i];
    }
}
