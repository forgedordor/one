package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.dclw;
import defpackage.deny;
import defpackage.ejwf;
import defpackage.ejwg;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DataItemFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataItemFilter> CREATOR = new deny();
    public final Uri a;
    public final int b;

    public DataItemFilter(Uri uri, int i) {
        this.a = uri;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DataItemFilter)) {
            return false;
        }
        DataItemFilter dataItemFilter = (DataItemFilter) obj;
        return Objects.equals(this.a, dataItemFilter.a) && this.b == dataItemFilter.b;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, this.a);
        ejwfVarB.f("filterType", this.b);
        return ejwfVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Uri uri = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, uri, i, false);
        dclw.i(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
