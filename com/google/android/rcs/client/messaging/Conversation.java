package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dhiz;
import defpackage.efdh;
import defpackage.effi;
import defpackage.efmj;
import defpackage.efmp;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class Conversation implements Parcelable {
    public static final Parcelable.Creator<Conversation> CREATOR = new efdh();

    public abstract effi a();

    public abstract String b();

    public abstract int c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("Conversation {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", b()), String.format("destination=%s", dhiz.PHONE_NUMBER.c(a())), String.format("type=%s", c() != 1 ? "GROUP" : "ONE_TO_ONE"))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        efmp.o(parcel, 1, c() - 1);
        efmp.r(parcel, 2, b());
        efmp.p(parcel, 3, a(), new efmj() { // from class: efdg
            @Override // defpackage.efmj
            public final void a(Parcel parcel2, Object obj, int i2) {
                efmr.a(parcel2, (effi) obj);
            }
        }, i);
        efmp.l(parcel);
    }
}
