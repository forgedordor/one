package com.google.android.apps.messaging.ui.mediapicker.c2o.file;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import defpackage.cyxy;
import defpackage.elha;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FileContentItem extends MediaContentItem {
    public static final Parcelable.Creator<FileContentItem> CREATOR = new cyxy();
    public final String a;
    public final long e;

    public FileContentItem(Uri uri, String str, String str2, long j) {
        super(uri, str, elha.FILE_CHOOSER);
        this.a = str2;
        this.e = j;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeLong(this.e);
    }

    public FileContentItem(Parcel parcel) {
        super(parcel);
        String string = parcel.readString();
        string.getClass();
        this.a = string;
        this.e = parcel.readLong();
    }
}
