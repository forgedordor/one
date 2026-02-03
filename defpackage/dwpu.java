package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.security.InvalidParameterException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dwpu implements Parcelable {
    ONE_TO_ONE(0),
    GROUP(1);

    public static final Parcelable.Creator<dwpu> CREATOR = new Parcelable.Creator() { // from class: dwpt
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return dwpu.a(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new dwpu[i];
        }
    };
    public final int c;

    dwpu(int i) {
        this.c = i;
    }

    public static dwpu a(final int i) {
        dwpu dwpuVar = (dwpu) ekeh.e(values()).a(new ejwm() { // from class: dwps
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                dwpu dwpuVar2 = dwpu.ONE_TO_ONE;
                return ((dwpu) obj).c == i;
            }
        }).f();
        if (dwpuVar != null) {
            return dwpuVar;
        }
        throw new InvalidParameterException("Invalid conversation IdType.");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
    }
}
