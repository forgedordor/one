package com.google.android.gms.kids;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.ddhl;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConversationData> CREATOR = new ddhl();
    public String a;
    public Uri[] b;

    private ConversationData() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConversationData) {
            ConversationData conversationData = (ConversationData) obj;
            if (dclc.a(this.a, conversationData.a) && Arrays.equals(this.b, conversationData.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.E(parcel, 2, this.b, i);
        dclw.c(parcel, iA);
    }

    public ConversationData(String str, Uri[] uriArr) {
        this.a = str;
        this.b = uriArr;
    }
}
