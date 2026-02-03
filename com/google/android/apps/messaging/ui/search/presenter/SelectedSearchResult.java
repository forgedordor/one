package com.google.android.apps.messaging.ui.search.presenter;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bxtv;
import defpackage.bxwt;
import defpackage.dabp;
import defpackage.dabq;
import defpackage.dacj;
import defpackage.dack;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class SelectedSearchResult implements Parcelable {
    public static final Parcelable.Creator<SelectedSearchResult> CREATOR = new dack();

    public abstract int a();

    public abstract int b();

    public final SelectedSearchResult c(dacj dacjVar) {
        int count;
        dabp dabpVar = (dabp) dacjVar;
        int i = dabpVar.b;
        if (i == 3 || i == 1) {
            return null;
        }
        bxwt bxwtVar = dabpVar.a;
        int iB = b();
        if (iB == 1) {
            count = ((bxtv) bxwtVar.a()).a.getCount();
        } else if (iB == 2) {
            count = bxwtVar.d().size();
        } else if (iB == 3) {
            count = bxwtVar.h().size();
        } else if (iB == 4) {
            count = bxwtVar.e().size();
        } else {
            if (iB != 5) {
                return null;
            }
            count = bxwtVar.f().size();
        }
        if (count != 0) {
            return new dabq(b(), a() < count ? a() : count - 1);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(b());
        parcel.writeInt(a());
    }
}
