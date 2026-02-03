package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.audio.AudioContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MessagePartDataConverter;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.file.FileContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentItem;
import defpackage.cyzg;
import defpackage.le;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Compose2oMessagePartDataConverter implements MessagePartDataConverter {
    public static final Parcelable.Creator<Compose2oMessagePartDataConverter> CREATOR = new cyzg();

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MessagePartDataConverter
    public final MediaContentItem a(MessagePartCoreData messagePartCoreData) {
        Uri uriV = messagePartCoreData.v();
        if (uriV == null) {
            return null;
        }
        if (messagePartCoreData.I() != null) {
            return new LocationContentItem(uriV, messagePartCoreData);
        }
        if (le.f(messagePartCoreData.R())) {
            return new AudioContentItem(uriV, messagePartCoreData.k());
        }
        if (messagePartCoreData.bf()) {
            String strR = messagePartCoreData.R();
            strR.getClass();
            int iC = messagePartCoreData.c();
            int iB = messagePartCoreData.b();
            String strT = messagePartCoreData.T();
            strT.getClass();
            return new ExpressiveStickerContentItem(uriV, strR, iC, iB, strT, messagePartCoreData.K());
        }
        if (messagePartCoreData.bg()) {
            String strR2 = messagePartCoreData.R();
            strR2.getClass();
            String strU = messagePartCoreData.U();
            strU.getClass();
            return new FileContentItem(uriV, strR2, strU, messagePartCoreData.p());
        }
        if (messagePartCoreData.bh()) {
            return new GifContentItem(uriV, uriV, uriV, "", "", "", messagePartCoreData.c(), messagePartCoreData.b());
        }
        String strR3 = messagePartCoreData.R();
        strR3.getClass();
        return new GalleryContentItem(uriV, strR3, messagePartCoreData.c(), messagePartCoreData.b(), messagePartCoreData.k(), messagePartCoreData.K(), messagePartCoreData.m(), messagePartCoreData.G());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
