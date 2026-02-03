package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzyw extends dzzh {
    public dzyw(dzzf dzzfVar, String str, Integer num) {
        super(dzzfVar, str, num, false);
    }

    @Override // defpackage.dzzh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", dzxt.b(obj, this, "Invalid int value for "));
        return null;
    }
}
