package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esbu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<esbu> CREATOR = new esbp();
    public final boolean a;
    public final int b;
    public final String c;
    public final Bundle d;
    public final Bundle e;

    public esbu(boolean z, int i, String str, Bundle bundle, Bundle bundle2) {
        this.a = z;
        this.b = i;
        this.c = str;
        this.d = bundle == null ? new Bundle() : bundle;
        bundle2 = bundle2 == null ? new Bundle() : bundle2;
        this.e = bundle2;
        ClassLoader classLoader = getClass().getClassLoader();
        ejyb.e(classLoader);
        bundle2.setClassLoader(classLoader);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esbu)) {
            return false;
        }
        esbu esbuVar = (esbu) obj;
        if (dclc.a(Boolean.valueOf(this.a), Boolean.valueOf(esbuVar.a))) {
            if (dclc.a(Integer.valueOf(this.b), Integer.valueOf(esbuVar.b)) && dclc.a(this.c, esbuVar.c) && Thing.d(this.d, esbuVar.d) && Thing.d(this.e, esbuVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Integer.valueOf(this.b), this.c, Integer.valueOf(Thing.b(this.d)), Integer.valueOf(Thing.b(this.e))});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("worksOffline: ");
        sb.append(this.a);
        sb.append(", score: ");
        sb.append(this.b);
        String str = this.c;
        if (!str.isEmpty()) {
            sb.append(", accountEmail: ");
            sb.append(str);
        }
        Bundle bundle = this.d;
        if (!bundle.isEmpty()) {
            sb.append(", Properties { ");
            Thing.c(bundle, sb);
            sb.append("}");
        }
        Bundle bundle2 = this.e;
        if (!bundle2.isEmpty()) {
            sb.append(", embeddingProperties { ");
            Thing.c(bundle2, sb);
            sb.append("}");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, z);
        dclw.i(parcel, 2, this.b);
        dclw.m(parcel, 3, this.c, false);
        dclw.p(parcel, 4, this.d);
        dclw.p(parcel, 5, this.e);
        dclw.c(parcel, iA);
    }
}
