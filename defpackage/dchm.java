package defpackage;

import com.google.android.gms.common.Feature;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dchm {
    public final dcgl a;
    public final Feature b;

    public dchm(dcgl dcglVar, Feature feature) {
        this.a = dcglVar;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof dchm)) {
            dchm dchmVar = (dchm) obj;
            if (dclc.a(this.a, dchmVar.a) && dclc.a(this.b, dchmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        dclb.b("key", this.a, arrayList);
        dclb.b("feature", this.b, arrayList);
        return dclb.a(arrayList, this);
    }
}
