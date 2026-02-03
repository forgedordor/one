package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehsj implements Parcelable {
    public static final Parcelable.Creator<ehsj> CREATOR = new ehsi();
    public final int a;
    public final List b;
    public boolean c;
    public final Integer d;
    private final String e;

    public ehsj(int i, List list, String str, boolean z, Integer num) {
        this.a = i;
        this.b = list;
        this.e = str;
        this.c = z;
        this.d = num;
    }

    public static ehsj a(String str) {
        int i = ekgb.d;
        return new ehsj(4, ekoe.a, str);
    }

    public static ehsj b(Intent intent) {
        return new ehsj(1, ekgb.r(intent), null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeTypedList(this.b);
        parcel.writeString(this.e);
        parcel.writeInt(this.c ? 1 : 0);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public ehsj(int i, List list, String str) {
        this(i, list, str, false, null);
    }
}
