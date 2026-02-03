package com.google.android.gms.kids;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.ddhm;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConversationResult> CREATOR = new ddhm();
    public String a;
    public int b;

    private ConversationResult() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConversationResult) {
            ConversationResult conversationResult = (ConversationResult) obj;
            if (dclc.a(this.a, conversationResult.a) && dclc.a(Integer.valueOf(this.b), Integer.valueOf(conversationResult.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.i(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }

    public ConversationResult(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
