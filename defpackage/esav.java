package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<esav> CREATOR = new esaw();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final esau e;
    public final String f;
    public final Bundle g;

    public esav(String str, String str2, String str3, String str4, esau esauVar, String str5, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = esauVar;
        this.f = str5;
        if (bundle != null) {
            this.g = bundle;
        } else {
            this.g = Bundle.EMPTY;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        ejyb.e(classLoader);
        this.g.setClassLoader(classLoader);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionImpl { { actionType: '");
        sb.append(this.a);
        sb.append("' } { objectName: '");
        sb.append(this.b);
        sb.append("' } { objectUrl: '");
        sb.append(this.c);
        sb.append("' } ");
        String str = this.d;
        if (str != null) {
            sb.append("{ objectSameAs: '");
            sb.append(str);
            sb.append("' } ");
        }
        esau esauVar = this.e;
        if (esauVar != null) {
            sb.append("{ metadata: '");
            sb.append(esauVar.toString());
            sb.append("' } ");
        }
        String str2 = this.f;
        if (str2 != null) {
            sb.append("{ actionStatus: '");
            sb.append(str2);
            sb.append("' } ");
        }
        Bundle bundle = this.g;
        if (!bundle.isEmpty()) {
            sb.append("{ ");
            sb.append(bundle);
            sb.append(" } ");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.m(parcel, 4, this.d, false);
        dclw.k(parcel, 5, this.e, i, false);
        dclw.m(parcel, 6, this.f, false);
        dclw.p(parcel, 7, this.g);
        dclw.c(parcel, iA);
    }
}
