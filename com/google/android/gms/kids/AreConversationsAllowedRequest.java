package com.google.android.gms.kids;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddhj;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AreConversationsAllowedRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AreConversationsAllowedRequest> CREATOR = new ddhj();
    public ConversationData[] a;

    private AreConversationsAllowedRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AreConversationsAllowedRequest) {
            return Arrays.equals(this.a, ((AreConversationsAllowedRequest) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.E(parcel, 1, this.a, i);
        dclw.c(parcel, iA);
    }

    public AreConversationsAllowedRequest(ConversationData[] conversationDataArr) {
        this.a = conversationDataArr;
    }
}
