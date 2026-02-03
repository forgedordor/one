package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbhx;
import defpackage.dclc;
import defpackage.dclw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CorpusId extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CorpusId> CREATOR = new dbhx();
    public final String a;
    public final String b;
    final Bundle c;

    public CorpusId(String str, String str2, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CorpusId) {
            CorpusId corpusId = (CorpusId) obj;
            if (dclc.a(this.a, corpusId.a) && dclc.a(this.b, corpusId.b) && dclc.a(this.c, corpusId.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        Bundle bundle = this.c;
        String string = bundle != null ? bundle.toString() : "null";
        String str = this.b;
        return "CorpusId[package=" + this.a + ", corpus=" + str + ", userHandle=" + string + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.p(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}
