package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzyy extends dzzh {
    public dzyy(dzzf dzzfVar, String str, Double d, boolean z) {
        super(dzzfVar, str, d, z);
    }

    @Override // defpackage.dzzh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", dzxt.b(obj, this, "Invalid double value for "));
        return null;
    }
}
