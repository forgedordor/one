package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddwv;
import defpackage.ejwh;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateCallingCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UpdateCallingCardRequest> CREATOR = new ddwv();
    public final CallingCardIdentifier a;
    public final CallingCardFileData b;
    public final CallingCardMetadata c;

    public UpdateCallingCardRequest(CallingCardIdentifier callingCardIdentifier, CallingCardFileData callingCardFileData, CallingCardMetadata callingCardMetadata) {
        this.a = callingCardIdentifier;
        this.b = callingCardFileData;
        this.c = callingCardMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateCallingCardRequest) {
            UpdateCallingCardRequest updateCallingCardRequest = (UpdateCallingCardRequest) obj;
            if (ejwh.a(this.a, updateCallingCardRequest.a) && ejwh.a(this.b, updateCallingCardRequest.b) && ejwh.a(this.c, updateCallingCardRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CallingCardIdentifier callingCardIdentifier = this.a;
        int i2 = i | 1;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, callingCardIdentifier, i2, false);
        dclw.k(parcel, 2, this.b, i2, false);
        dclw.k(parcel, 3, this.c, i2, false);
        dclw.c(parcel, iA);
    }
}
