package com.google.android.apps.messaging.ui.mediapicker.c2o.content;

import android.net.Uri;
import android.os.Parcel;
import defpackage.elha;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class VisualContentItem extends MediaContentItem {
    private final int a;
    private final int e;

    protected VisualContentItem(Uri uri, String str, elha elhaVar, int i, int i2) {
        super(uri, str, elhaVar);
        this.a = i;
        this.e = i2;
    }

    public final int c() {
        int i = this.e;
        if (i > 0) {
            return i;
        }
        return -1;
    }

    public final int d() {
        int i = this.a;
        if (i > 0) {
            return i;
        }
        return -1;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.e);
    }

    protected VisualContentItem(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        this.e = parcel.readInt();
    }
}
