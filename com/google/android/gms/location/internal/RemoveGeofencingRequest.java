package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddpr;
import defpackage.ekgb;
import defpackage.ekoe;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RemoveGeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoveGeofencingRequest> CREATOR = new ddpr();
    public final List a;
    public final PendingIntent b;
    public final String c;

    public RemoveGeofencingRequest(List list, PendingIntent pendingIntent, String str) {
        ekgb ekgbVarN;
        if (list == null) {
            int i = ekgb.d;
            ekgbVarN = ekoe.a;
        } else {
            ekgbVarN = ekgb.n(list);
        }
        this.a = ekgbVarN;
        this.b = pendingIntent;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iA = dclw.a(parcel);
        dclw.D(parcel, 1, list);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.c(parcel, iA);
    }
}
