package com.google.android.apps.messaging.ui.mediapicker.c2o.contact;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import defpackage.cywi;
import defpackage.cywj;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class VCardContentItem extends MediaContentItem {
    public static final Parcelable.Creator<VCardContentItem> CREATOR = new cywi();

    /* compiled from: PG */
    public interface a {
        cywj dc();
    }

    public VCardContentItem(Parcel parcel) {
        super(parcel);
    }
}
