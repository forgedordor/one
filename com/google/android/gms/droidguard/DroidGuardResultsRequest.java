package com.google.android.gms.droidguard;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcdt;
import defpackage.dclw;
import defpackage.dcpp;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DroidGuardResultsRequest extends AbstractSafeParcelable {
    public final Bundle a;
    private static final int b = (int) TimeUnit.SECONDS.toMillis(60);
    public static final Parcelable.Creator<DroidGuardResultsRequest> CREATOR = new dcpp();

    public DroidGuardResultsRequest() {
        String property;
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putInt("clientVersion", dcdt.b);
        try {
            property = System.getProperty("os.arch");
        } catch (Exception unused) {
            property = "?";
        }
        this.a.putString("appArchitecture", property);
    }

    public final int a() {
        return this.a.getInt("timeoutMs", b);
    }

    public final void b(int i) {
        this.a.putInt("openHandles", i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.p(parcel, 2, this.a);
        dclw.c(parcel, iA);
    }

    public DroidGuardResultsRequest(Bundle bundle) {
        new Bundle();
        this.a = bundle;
    }
}
