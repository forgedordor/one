package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbqm;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class SavePasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordResult> CREATOR = new dbqm();
    public final PendingIntent a;

    public SavePasswordResult(PendingIntent pendingIntent) {
        dclh.m(pendingIntent);
        this.a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SavePasswordResult) {
            return dclc.a(this.a, ((SavePasswordResult) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PendingIntent pendingIntent = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, pendingIntent, i, false);
        dclw.c(parcel, iA);
    }
}
