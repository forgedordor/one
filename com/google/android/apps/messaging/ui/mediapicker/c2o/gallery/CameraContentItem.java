package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.VisualContentItem;
import defpackage.cyzd;
import defpackage.elha;
import defpackage.emrt;
import defpackage.evrr;
import defpackage.evsn;
import defpackage.evtj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CameraContentItem extends VisualContentItem {
    public static final Parcelable.Creator<CameraContentItem> CREATOR = new cyzd();
    public final emrt a;
    public final long e;
    public final long f;

    public CameraContentItem(Uri uri, String str, int i, int i2, long j, elha elhaVar, long j2, emrt emrtVar) {
        super(uri, str, elhaVar, i, i2);
        this.e = j;
        this.f = j2;
        this.a = emrtVar;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.VisualContentItem, com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        byte[] byteArray = this.a.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }

    public CameraContentItem(Parcel parcel) {
        super(parcel);
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        try {
            this.a = (emrt) evsn.parseFrom(emrt.a, bArr, evrr.a());
        } catch (evtj e) {
            throw new IllegalArgumentException("Unable to parse CameraCaptureInformation", e);
        }
    }
}
