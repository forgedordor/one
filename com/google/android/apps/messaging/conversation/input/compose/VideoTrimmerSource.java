package com.google.android.apps.messaging.conversation.input.compose;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dojs;
import defpackage.ukg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VideoTrimmerSource implements dojs {
    public static final VideoTrimmerSource a = new VideoTrimmerSource();
    public static final Parcelable.Creator<VideoTrimmerSource> CREATOR = new ukg();

    private VideoTrimmerSource() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
