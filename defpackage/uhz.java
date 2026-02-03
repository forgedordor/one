package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Size;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uhz extends uhv {
    public static final crlx n = new crlx();
    public static final Parcelable.Creator<uhz> CREATOR = new uhy();

    public uhz(String str, Uri uri, elha elhaVar, Size size, long j, boolean z, boolean z2, Uri uri2, Optional optional, bvdr bvdrVar, Uri uri3, String str2, amvx amvxVar) {
        super(str, uri, elhaVar, size, j, z, z2, uri2, optional, bvdrVar, uri3, str2, amvxVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
        parcel.writeSize(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeParcelable(this.h, i);
        parcel.getClass();
        Optional optional = this.i;
        if (optional.isPresent()) {
            parcel.writeByte((byte) 1);
            parcel.writeValue(optional.get());
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeString(this.j.name());
        parcel.writeParcelable(this.k, i);
        String str = this.l;
        if (str == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str);
        }
        parcel.writeString(this.m.name());
    }
}
