package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<sgj> CREATOR = new sgk();
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public sgj(String str, String str2, int i, int i2, int i3, int i4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgj)) {
            return false;
        }
        sgj sgjVar = (sgj) obj;
        return this.c == sgjVar.c && this.d == sgjVar.d && Objects.equals(this.a, sgjVar.a) && this.e == sgjVar.e && this.f == sgjVar.f;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("name", this.a);
        ejwfVarB.b("modelName", this.b);
        ejwfVarB.f(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, this.c);
        ejwfVarB.f("variant", this.d);
        ejwfVarB.f("id", this.e);
        ejwfVarB.f(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, this.f);
        return ejwfVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.i(parcel, 3, this.c);
        dclw.i(parcel, 4, this.d);
        dclw.i(parcel, 5, this.e);
        dclw.i(parcel, 6, this.f);
        dclw.c(parcel, iA);
    }
}
