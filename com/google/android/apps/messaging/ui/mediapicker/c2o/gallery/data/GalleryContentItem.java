package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.VisualContentItem;
import defpackage.bvdr;
import defpackage.czba;
import defpackage.elha;
import defpackage.le;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GalleryContentItem extends VisualContentItem {
    public static final Parcelable.Creator<GalleryContentItem> CREATOR = new czba();
    public final long a;
    public final long e;
    public final bvdr f;

    public GalleryContentItem(Uri uri, String str, int i, int i2, long j, elha elhaVar, long j2) {
        this(uri, true == le.w(str) ? "application/txt" : str, i, i2, j, elhaVar, j2, bvdr.STANDARD);
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.VisualContentItem, com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.a);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f.ordinal());
    }

    public GalleryContentItem(Uri uri, String str, int i, int i2, long j, elha elhaVar, long j2, bvdr bvdrVar) {
        super(uri, str, elhaVar, i, i2);
        this.a = j;
        this.e = j2;
        this.f = bvdrVar;
    }

    public GalleryContentItem(Uri uri, String str, int i, int i2, elha elhaVar, long j) {
        this(uri, true == le.w(str) ? "application/txt" : str, i, i2, -1L, elhaVar, j);
    }

    public GalleryContentItem(Parcel parcel) {
        super(parcel);
        this.a = parcel.readLong();
        this.e = parcel.readLong();
        this.f = bvdr.values()[parcel.readInt()];
    }
}
