package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dosh implements Parcelable {
    public static final Parcelable.Creator<dosh> CREATOR;
    public static final dosh a;
    public static final dosh b;
    private static final /* synthetic */ dosh[] c;

    static {
        dosh doshVar = new dosh("PHOTOS_LINK", 0);
        a = doshVar;
        dosh doshVar2 = new dosh("ATTACHMENT", 1);
        b = doshVar2;
        dosh[] doshVarArr = {doshVar, doshVar2};
        c = doshVarArr;
        fczb.a(doshVarArr);
        CREATOR = new Parcelable.Creator() { // from class: dosg
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return (dosh) Enum.valueOf(dosh.class, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return new dosh[i];
            }
        };
    }

    private dosh(String str, int i) {
    }

    public static dosh[] values() {
        return (dosh[]) c.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
