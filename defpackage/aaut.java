package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import com.google.android.apps.messaging.datadonation.redact.RedactedSpan;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaut implements Comparable<aaut>, Parcelable {
    public static final Parcelable.Creator<aaut> CREATOR = new aaus();
    public final long a;
    public final Spanned b;
    public Spanned c;
    aarx d;
    public boolean e;

    public aaut(Parcel parcel) {
        aarw aarwVar;
        this.b = RedactedSpan.a(parcel);
        this.c = RedactedSpan.a(parcel);
        this.a = parcel.readLong();
        int i = 0;
        this.e = parcel.readByte() != 0;
        int[] iArr = new int[3];
        parcel.readIntArray(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        if (i2 == 0) {
            if (i3 == 0) {
                if (i4 != 0) {
                    i3 = 0;
                } else {
                    aarwVar = null;
                }
            }
            this.d = aarwVar;
        }
        i = i2;
        aarwVar = new aarw(i, i3, i4);
        this.d = aarwVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(aaut aautVar) {
        return Long.compare(aautVar.a, this.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RedactedSpan.c(parcel, this.b);
        RedactedSpan.c(parcel, this.c);
        parcel.writeLong(this.a);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        aarx aarxVar = this.d;
        if (aarxVar == null) {
            parcel.writeIntArray(new int[]{0, 0, 0});
        } else {
            aarw aarwVar = (aarw) aarxVar;
            parcel.writeIntArray(new int[]{aarwVar.a, aarwVar.b, aarwVar.c});
        }
    }

    public aaut(aarg aargVar) {
        Spanned spannedB = aargVar.b();
        this.b = spannedB;
        this.c = spannedB;
        this.a = aargVar.a();
        this.d = null;
        this.e = true;
    }
}
