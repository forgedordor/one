package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efxe implements Parcelable {
    public static final Parcelable.Creator<efxe> CREATOR = new efxd();
    public final efwo a;
    public final egbs b;
    public final egbd c;
    public final Intent d;
    public final efxb e;

    public efxe(Parcel parcel) {
        this.a = (efwo) parcel.readParcelable(efwo.class.getClassLoader());
        try {
            this.b = (egbs) ProtoParsers.a(parcel, egbs.a, evrr.a());
            this.c = (egbd) parcel.readParcelable(egbd.class.getClassLoader());
            this.d = (Intent) parcel.readParcelable(egbd.class.getClassLoader());
            this.e = (efxb) parcel.readParcelable(egbd.class.getClassLoader());
        } catch (evtj e) {
            throw new IllegalStateException("Failed to convert AccountInfo to Parcelable!", e);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        ProtoParsers.h(parcel, this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
    }

    public efxe(efwo efwoVar, egbs egbsVar, egbd egbdVar, Intent intent, efxb efxbVar) {
        this.a = efwoVar;
        egbsVar.getClass();
        this.b = egbsVar;
        this.c = egbdVar;
        this.d = intent;
        this.e = efxbVar;
    }
}
