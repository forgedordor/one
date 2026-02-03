package com.google.android.apps.messaging.startchat.chip;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.alqm;
import defpackage.alre;
import defpackage.ctjb;
import defpackage.fdbk;
import defpackage.fdbq;
import defpackage.fdgn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ChipData implements Parcelable {
    public static final Parcelable.Creator<ChipData> CREATOR = new ctjb();
    public final alqm a;
    public final String b;
    public final String c;
    public final Uri d;
    public final boolean e;

    /* compiled from: PG */
    public interface a {
        alre K();
    }

    public ChipData(alqm alqmVar, String str, String str2, Uri uri, boolean z) {
        alqmVar.getClass();
        str.getClass();
        this.a = alqmVar;
        this.b = str;
        this.c = str2;
        this.d = uri;
        this.e = z;
        String strN = alqmVar.n();
        if (strN == null || fdgn.H(strN)) {
            throw new IllegalStateException("messagingIdentity's raw destination must not be null or blank.");
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChipData)) {
            return false;
        }
        ChipData chipData = (ChipData) obj;
        return fdbq.f(this.a, chipData.a) && fdbq.f(this.b, chipData.b) && fdbq.f(this.c, chipData.c) && fdbq.f(this.d, chipData.d) && this.e == chipData.e;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.d;
        return ((iHashCode2 + (uri != null ? uri.hashCode() : 0)) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "ChipData(messagingIdentity=" + this.a + ", text=" + this.b + ", lookupKey=" + this.c + ", photo=" + this.d + ", pinned=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Bundle bundle = new Bundle();
        bundle.putString(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, this.b);
        bundle.putParcelable("identity", alre.d(this.a));
        bundle.putString("lookup", this.c);
        bundle.putParcelable("photo", this.d);
        bundle.putBoolean("pinned", this.e);
        parcel.writeBundle(bundle);
    }

    public /* synthetic */ ChipData(alqm alqmVar, String str, String str2, Uri uri, boolean z, int i, fdbk fdbkVar) {
        this(alqmVar, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : uri, ((i & 16) == 0) & z);
    }
}
