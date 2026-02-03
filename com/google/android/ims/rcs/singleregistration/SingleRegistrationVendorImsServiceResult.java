package com.google.android.ims.rcs.singleregistration;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dhba;
import defpackage.dstt;
import defpackage.ewgx;
import defpackage.ewjk;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SingleRegistrationVendorImsServiceResult extends dstt {
    public static final Parcelable.Creator<SingleRegistrationVendorImsServiceResult> CREATOR = new dhba();
    public final ewgx a;
    public final ewjk b;

    public SingleRegistrationVendorImsServiceResult(int i) {
        this(i, ewjk.FAILURE_REASON_UNKNOWN, ewgx.IMS_EXCEPTION_CODE_ERROR_UNSPECIFIED);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.code);
        parcel.writeInt(this.b.j);
        parcel.writeInt(this.a.e);
    }

    public SingleRegistrationVendorImsServiceResult(int i, ewgx ewgxVar) {
        this(i, ewjk.FAILURE_REASON_IMS_EXCEPTION, ewgxVar);
    }

    public SingleRegistrationVendorImsServiceResult(int i, ewjk ewjkVar) {
        this(i, ewjkVar, ewgx.IMS_EXCEPTION_CODE_ERROR_UNSPECIFIED);
    }

    private SingleRegistrationVendorImsServiceResult(int i, ewjk ewjkVar, ewgx ewgxVar) {
        this.code = i;
        this.b = ewjkVar;
        this.a = ewgxVar;
    }

    public SingleRegistrationVendorImsServiceResult(Parcel parcel) {
        this.code = parcel.readInt();
        this.b = ewjk.b(parcel.readInt());
        this.a = ewgx.b(parcel.readInt());
    }
}
