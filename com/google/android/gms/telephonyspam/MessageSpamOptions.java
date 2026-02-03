package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.degh;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MessageSpamOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MessageSpamOptions> CREATOR = new degh();
    public final int a;
    public final String b;
    public final long c;
    public final List d;

    public MessageSpamOptions(int i, String str, long j, List list) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.m(parcel, 2, this.b, false);
        dclw.j(parcel, 3, this.c);
        dclw.n(parcel, 4, this.d, false);
        dclw.c(parcel, iA);
    }
}
