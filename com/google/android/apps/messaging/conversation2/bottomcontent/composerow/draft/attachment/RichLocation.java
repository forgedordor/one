package com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cqcy;
import defpackage.dltc;
import defpackage.dltd;
import defpackage.dohx;
import defpackage.doig;
import defpackage.elcu;
import defpackage.elcz;
import defpackage.eldl;
import defpackage.eldm;
import defpackage.fdbq;
import defpackage.wkr;
import defpackage.wks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RichLocation implements dltd {
    private static final doig f;
    public final String a;
    public final double b;
    public final double c;
    public final doig d;
    public final Uri e;
    private final dltc g;

    /* compiled from: PG */
    public interface Source extends dltc<RichLocation> {

        /* compiled from: PG */
        public static final class LocationPicker implements Source {
            public static final LocationPicker a = new LocationPicker();
            public static final Parcelable.Creator<LocationPicker> CREATOR = new wks();

            private LocationPicker() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }

    static {
        doig doigVarA = dohx.a("application/vnd.gsma.rcspushlocation+xml");
        doigVarA.getClass();
        f = doigVarA;
    }

    public /* synthetic */ RichLocation(String str, double d, double d2) {
        Source.LocationPicker locationPicker = Source.LocationPicker.a;
        this.a = str;
        this.b = d;
        this.c = d2;
        this.g = locationPicker;
        this.d = f;
        Uri uri = Uri.EMPTY;
        uri.getClass();
        this.e = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichLocation)) {
            return false;
        }
        RichLocation richLocation = (RichLocation) obj;
        return fdbq.f(this.a, richLocation.a) && Double.compare(this.b, richLocation.b) == 0 && Double.compare(this.c, richLocation.c) == 0 && fdbq.f(this.g, richLocation.g);
    }

    @Override // defpackage.dltd
    public final dltc fo() {
        return this.g;
    }

    @Override // defpackage.dlti
    public final Object fp() {
        return this.a;
    }

    @Override // defpackage.dltd
    public final /* synthetic */ String fq() {
        return toString();
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + wkr.a(this.b)) * 31) + wkr.a(this.c)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        int i = elcz.a;
        elcu elcuVar = eldm.a;
        eldl eldlVar = new eldl();
        eldlVar.m(this.b);
        eldlVar.m(this.c);
        return "RichLocation(locationUrl=" + ((Object) cqcy.c(this.a)) + ", latlong=" + eldlVar.r() + ")";
    }
}
