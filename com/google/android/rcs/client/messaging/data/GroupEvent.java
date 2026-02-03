package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dclw;
import defpackage.efiz;
import defpackage.ekgb;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class GroupEvent implements Parcelable {
    public static final Parcelable.Creator<GroupEvent> CREATOR = new efiz();

    public abstract ekgb a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("GroupEvent {%s}", TextUtils.join(",", Arrays.asList(String.format("changedMembers=[%s]", a()))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, a(), false);
        dclw.c(parcel, iA);
    }
}
