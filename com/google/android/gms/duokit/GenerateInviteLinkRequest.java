package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dctu;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GenerateInviteLinkRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GenerateInviteLinkRequest> CREATOR = new dctu();
    public DuoId a;
    public String b;

    public GenerateInviteLinkRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GenerateInviteLinkRequest) {
            GenerateInviteLinkRequest generateInviteLinkRequest = (GenerateInviteLinkRequest) obj;
            if (dclc.a(this.a, generateInviteLinkRequest.a) && dclc.a(this.b, generateInviteLinkRequest.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.c(parcel, iA);
    }

    public GenerateInviteLinkRequest(DuoId duoId, String str) {
        this.a = duoId;
        this.b = str;
    }
}
