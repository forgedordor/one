package com.google.android.apps.messaging.ui.mediaviewer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.czlf;
import defpackage.czmi;
import defpackage.czmj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class MediaViewerButton implements Parcelable {
    public static final Parcelable.Creator<MediaViewerButton> CREATOR = new czmi();

    public static czmj e() {
        czlf czlfVar = new czlf();
        czlfVar.e(-1);
        czlfVar.b(-1);
        czlfVar.d(-1);
        czlfVar.c(new BaseMediaViewerEvent());
        return czlfVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract BaseMediaViewerEvent d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(c());
        parcel.writeInt(a());
        parcel.writeInt(b());
        parcel.writeParcelable(d(), 0);
    }
}
