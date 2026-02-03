package com.google.android.gms.kids;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddhk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AreConversationsAllowedResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AreConversationsAllowedResponse> CREATOR = new ddhk();
    public ConversationResult[] a;

    private AreConversationsAllowedResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AreConversationsAllowedResponse) {
            return Arrays.equals(this.a, ((AreConversationsAllowedResponse) obj).a);
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

    public AreConversationsAllowedResponse(ConversationResult[] conversationResultArr) {
        this.a = conversationResultArr;
    }
}
