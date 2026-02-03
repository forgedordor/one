package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzyv extends dzzh {
    public dzyv(dzzf dzzfVar, String str, Long l, boolean z) {
        super(dzzfVar, str, l, z);
    }

    @Override // defpackage.dzzh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", dzxt.b(obj, this, "Invalid long value for "));
        return null;
    }
}
