package com.google.android.apps.messaging.ui.mediapicker.c2o.content;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dltc;
import defpackage.dltd;
import defpackage.elha;
import defpackage.uie;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class MediaContentItem implements Parcelable, dltd {
    public final Uri b;
    public final String c;
    public final elha d;

    protected MediaContentItem(Uri uri, String str, elha elhaVar) {
        this.b = uri;
        this.c = str;
        this.d = elhaVar == null ? elha.UNKNOWN : elhaVar;
    }

    public Uri a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MediaContentItem)) {
            return false;
        }
        MediaContentItem mediaContentItem = (MediaContentItem) obj;
        return mediaContentItem.a() != null && mediaContentItem.b() != null && mediaContentItem.a().equals(a()) && mediaContentItem.b().equals(b());
    }

    @Override // defpackage.dltd
    public final dltc fo() {
        return uie.a(this.d);
    }

    @Override // defpackage.dltd
    public final /* synthetic */ String fq() {
        return toString();
    }

    public int hashCode() {
        return Objects.hash(a(), b());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d.a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected MediaContentItem(Parcel parcel) {
        Uri uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        String string = parcel.readString();
        string.getClass();
        this(uri, string, elha.b(parcel.readInt()));
    }

    @Override // defpackage.dlti
    public final /* synthetic */ Object fp() {
        return this;
    }
}
