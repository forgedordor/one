package com.google.android.apps.messaging.replies.snippet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.ahsa;
import defpackage.ahsc;
import defpackage.bary;
import defpackage.fctd;
import defpackage.fdae;
import defpackage.fdbq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RepliedToDataAdapter implements Parcelable {
    public static final Parcelable.Creator<RepliedToDataAdapter> CREATOR = new ahsc();
    public final ahsa a;

    public RepliedToDataAdapter(ahsa ahsaVar) {
        ahsaVar.getClass();
        this.a = ahsaVar;
        bary.b(ahsaVar.c);
        fctd.a(new fdae() { // from class: ahsb
            @Override // defpackage.fdae
            public final Object invoke() {
                ahsa ahsaVar2 = this.a.a;
                ahrg ahrgVar = ahsaVar2.e;
                if (ahrgVar == null) {
                    ahrgVar = ahrg.a;
                }
                ahrj ahrjVar = ahrgVar.c;
                if (ahrjVar == null) {
                    ahrjVar = ahrj.a;
                }
                if (ahrjVar.b != 3) {
                    return null;
                }
                ahrg ahrgVar2 = ahsaVar2.e;
                if (ahrgVar2 == null) {
                    ahrgVar2 = ahrg.a;
                }
                ahrj ahrjVar2 = ahrgVar2.c;
                if (ahrjVar2 == null) {
                    ahrjVar2 = ahrj.a;
                }
                return (ahrjVar2.b == 3 ? (ahry) ahrjVar2.c : ahry.a).c;
            }
        });
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof RepliedToDataAdapter) && fdbq.f(this.a, ((RepliedToDataAdapter) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        ProtoParsers.h(parcel, this.a);
    }
}
