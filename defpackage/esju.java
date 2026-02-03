package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esju extends AbstractSafeParcelable {
    public static final Parcelable.Creator<esju> CREATOR = new esjv();
    public final Bundle a;
    private Map b;

    public esju(Bundle bundle) {
        this.a = bundle;
    }

    private static final int e(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public final int a() {
        Bundle bundle = this.a;
        String string = bundle.getString("google.original_priority");
        if (string == null) {
            string = bundle.getString("google.priority");
        }
        return e(string);
    }

    public final int b() {
        Bundle bundle = this.a;
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        return e(string);
    }

    public final Map c() {
        if (this.b == null) {
            Bundle bundle = this.a;
            csq csqVar = new csq();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        csqVar.put(str, str2);
                    }
                }
            }
            this.b = csqVar;
        }
        return this.b;
    }

    public final byte[] d() {
        return this.a.getByteArray("rawData");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.p(parcel, 2, this.a);
        dclw.c(parcel, iA);
    }
}
