package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uhy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Optional optionalOfNullable;
        String string = parcel.readString();
        Uri uri = (Uri) parcel.readParcelable(GalleryContent.class.getClassLoader());
        elha elhaVar = (elha) Enum.valueOf(elha.class, parcel.readString());
        Size size = parcel.readSize();
        long j = parcel.readLong();
        int i = parcel.readInt();
        int i2 = parcel.readInt();
        Uri uri2 = (Uri) parcel.readParcelable(GalleryContent.class.getClassLoader());
        crlx crlxVar = uhz.n;
        parcel.getClass();
        if (parcel.readByte() == 0) {
            optionalOfNullable = Optional.empty();
        } else {
            Object value = parcel.readValue(crlxVar.getClass().getClassLoader());
            value.getClass();
            optionalOfNullable = Optional.ofNullable(value);
        }
        Optional optional = optionalOfNullable;
        bvdr bvdrVar = (bvdr) Enum.valueOf(bvdr.class, parcel.readString());
        Uri uri3 = (Uri) parcel.readParcelable(GalleryContent.class.getClassLoader());
        String string2 = parcel.readInt() == 0 ? parcel.readString() : null;
        return new uhz(string, uri, elhaVar, size, j, i == 1, i2 == 1, uri2, optional, bvdrVar, uri3, string2, (amvx) Enum.valueOf(amvx.class, parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new uhz[i];
    }
}
