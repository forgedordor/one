package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oyt extends oyy {
    public static final Parcelable.Creator<oyt> CREATOR = new oys();
    public Set a;

    public oyt(Parcel parcel) {
        super(parcel);
        int i = parcel.readInt();
        this.a = new HashSet();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Collections.addAll(this.a, strArr);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a.size());
        Set set = this.a;
        parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
    }

    public oyt(Parcelable parcelable) {
        super(parcelable);
    }
}
