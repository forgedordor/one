package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class man implements Parcelable {
    public static final Parcelable.Creator<man> CREATOR = new mam();
    public final UUID a;
    public final String b;
    public final String c;
    public final byte[] d;
    private int e;

    public man(Parcel parcel) {
        this.a = new UUID(parcel.readLong(), parcel.readLong());
        this.b = parcel.readString();
        String string = parcel.readString();
        String str = mgb.a;
        this.c = string;
        this.d = parcel.createByteArray();
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = maf.a;
        UUID uuid3 = this.a;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof man)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        man manVar = (man) obj;
        return Objects.equals(this.b, manVar.b) && Objects.equals(this.c, manVar.c) && Objects.equals(this.a, manVar.a) && Arrays.equals(this.d, manVar.d);
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + Arrays.hashCode(this.d);
        this.e = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.a;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
    }

    public man(UUID uuid, String str, String str2, byte[] bArr) {
        mee.f(uuid);
        this.a = uuid;
        this.b = str;
        mee.f(str2);
        this.c = mbw.f(str2);
        this.d = bArr;
    }

    public man(UUID uuid, String str, byte[] bArr) {
        this(uuid, null, str, bArr);
    }
}
