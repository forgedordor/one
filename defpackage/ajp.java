package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajp extends ajn implements Parcelable {
    public static final Parcelable.Creator<ajp> CREATOR = new ajq();
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final int f;
    public final List g;
    public final List h;
    public final Map i;
    private Integer j;

    public ajp(String str, String str2, String str3, long j, long j2, int i, List list, List list2) {
        csq csqVar = new csq(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            aka akaVar = (aka) list.get(i2);
            csqVar.put(akaVar.a, akaVar);
        }
        str.getClass();
        this.a = str;
        str2.getClass();
        this.b = str2;
        str3.getClass();
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.g = list;
        this.i = csqVar;
        this.h = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajp)) {
            return false;
        }
        ajp ajpVar = (ajp) obj;
        return this.a.equals(ajpVar.a) && this.b.equals(ajpVar.b) && this.c.equals(ajpVar.c) && this.e == ajpVar.e && this.d == ajpVar.d && this.f == ajpVar.f && Objects.equals(this.g, ajpVar.g) && Objects.equals(this.i, ajpVar.i) && Objects.equals(this.h, ajpVar.h);
    }

    public final int hashCode() {
        if (this.j == null) {
            this.j = Integer.valueOf(Objects.hash(this.a, this.b, this.c, Long.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.d), Integer.valueOf(Objects.hashCode(this.g)), Integer.valueOf(Objects.hashCode(this.i)), Integer.valueOf(Objects.hashCode(this.h))));
        }
        return this.j.intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("namespace", this.a);
        bundle.putString("id", this.b);
        bundle.putString("schemaType", this.c);
        bundle.putStringArrayList("parentTypes", (ArrayList) this.h);
        bundle.putInt("score", this.f);
        bundle.putLong("creationTimestampMillis", this.d);
        bundle.putLong("ttlMillis", this.e);
        Bundle bundle2 = new Bundle();
        int i2 = 0;
        while (true) {
            List list = this.g;
            if (i2 >= list.size()) {
                bundle.putBundle("properties", bundle2);
                parcel.writeBundle(bundle);
                return;
            } else {
                aka akaVar = (aka) list.get(i2);
                bundle2.putParcelable(akaVar.a, akaVar);
                i2++;
            }
        }
    }
}
