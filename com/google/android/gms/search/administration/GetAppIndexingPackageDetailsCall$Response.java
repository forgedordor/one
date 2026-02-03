package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.deay;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetAppIndexingPackageDetailsCall$Response extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<GetAppIndexingPackageDetailsCall$Response> CREATOR = new deay();
    public final Status a;
    public final CorpusConfigParcelable[] b;
    public final long c;
    public final AppIndexingErrorInfo[] d;
    public final AppIndexingUserActionInfo[] e;
    public final boolean f;
    public final boolean g;

    public GetAppIndexingPackageDetailsCall$Response(Status status, CorpusConfigParcelable[] corpusConfigParcelableArr, long j, AppIndexingErrorInfo[] appIndexingErrorInfoArr, AppIndexingUserActionInfo[] appIndexingUserActionInfoArr, boolean z, boolean z2) {
        this.a = status;
        this.b = corpusConfigParcelableArr;
        this.c = j;
        this.d = appIndexingErrorInfoArr;
        this.e = appIndexingUserActionInfoArr;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, status, i, false);
        dclw.E(parcel, 2, this.b, i);
        dclw.j(parcel, 3, this.c);
        dclw.E(parcel, 4, this.d, i);
        dclw.E(parcel, 5, this.e, i);
        dclw.d(parcel, 6, this.f);
        dclw.d(parcel, 7, this.g);
        dclw.c(parcel, iA);
    }
}
