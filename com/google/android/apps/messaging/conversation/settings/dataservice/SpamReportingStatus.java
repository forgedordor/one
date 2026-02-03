package com.google.android.apps.messaging.conversation.settings.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.bvdk;
import defpackage.usw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SpamReportingStatus implements Parcelable {
    public static final Parcelable.Creator<SpamReportingStatus> CREATOR = new usw();
    public final ParticipantsTable.BindData a;
    private final String b;

    public SpamReportingStatus(Parcel parcel) {
        this.a = (ParticipantsTable.BindData) parcel.readParcelable(ParticipantsTable.BindData.class.getClassLoader());
        String string = parcel.readString();
        this.b = string == null ? bvdk.UNARCHIVED.name() : string;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeString(this.b);
    }

    public SpamReportingStatus(ParticipantsTable.BindData bindData, bvdk bvdkVar) {
        this.a = bindData;
        this.b = bvdkVar.name();
    }
}
