package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dsbi implements Parcelable {
    public static final eksp b = eksp.c("GnpSdk");
    public static final Parcelable.Creator<dsbi> CREATOR = new dsbg();

    public static dsbh g() {
        dsbb dsbbVar = new dsbb();
        dsbbVar.b(ekoj.a);
        return dsbbVar;
    }

    public abstract long a();

    public abstract ekgp b();

    public abstract ethk c();

    public abstract evhv d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String e();

    public abstract String f();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(e());
        ProtoParsers.h(parcel, c());
        parcel.writeLong(a());
        ekgp ekgpVarB = b();
        parcel.writeInt(ekgpVarB.size());
        Iterator it = ekgpVarB.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            parcel.writeInt(((etli) entry.getKey()).f);
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
        parcel.writeString(f());
        evhv evhvVarD = d();
        parcel.writeInt(evhvVarD != null ? 1 : 0);
        if (evhvVarD != null) {
            ProtoParsers.h(parcel, d());
        }
    }
}
