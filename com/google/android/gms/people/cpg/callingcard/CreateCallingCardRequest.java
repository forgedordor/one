package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddws;
import defpackage.ejwh;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CreateCallingCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateCallingCardRequest> CREATOR = new ddws();
    public final int a;
    public final CallingCardFileData b;
    public final CallingCardMetadata c;

    public CreateCallingCardRequest(int i, CallingCardFileData callingCardFileData, CallingCardMetadata callingCardMetadata) {
        this.a = i;
        this.b = callingCardFileData;
        this.c = callingCardMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateCallingCardRequest) {
            CreateCallingCardRequest createCallingCardRequest = (CreateCallingCardRequest) obj;
            if (this.a == createCallingCardRequest.a && ejwh.a(this.b, createCallingCardRequest.b) && ejwh.a(this.c, createCallingCardRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        int i3 = i | 1;
        dclw.k(parcel, 2, this.b, i3, false);
        dclw.k(parcel, 3, this.c, i3, false);
        dclw.c(parcel, iA);
    }
}
