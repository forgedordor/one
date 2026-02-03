package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecqt implements Parcelable {
    public static final Parcelable.Creator<ecqt> CREATOR = new ecqs();
    public final String a;
    public final expq b;
    public final exqw c;
    public final String d;
    public final long e;
    public final ekgb f;
    private final String g;

    public ecqt(String str, String str2, long j, exqw exqwVar, expq expqVar, String str3, ekgb ekgbVar) {
        this.a = str;
        this.g = str2;
        this.e = j;
        this.d = str3;
        this.f = ekgbVar;
        this.b = expqVar;
        this.c = exqwVar;
    }

    public final ecpu a() {
        return new ecpu(this.a, this.g, b(), true != ecse.k(this.b) ? 2 : 3);
    }

    public final String b() {
        exqw exqwVar = this.c;
        if (exqwVar != null) {
            return exqwVar.b;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.g);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeStringList(this.f);
        ProtoParsers.h(parcel, this.b);
        ProtoParsers.h(parcel, this.c);
    }

    public ecqt(Parcel parcel) {
        this.a = parcel.readString();
        this.g = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readLong();
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        this.f = ekgbVar;
        parcel.readStringList(ekgbVar);
        expq expqVar = expq.a;
        evrr evrrVar = evrr.a;
        evuq evuqVar = evuq.a;
        evrr evrrVar2 = evrr.a;
        this.b = (expq) ProtoParsers.a(parcel, expqVar, evrrVar2);
        this.c = (exqw) ProtoParsers.a(parcel, exqw.a, evrrVar2);
    }
}
