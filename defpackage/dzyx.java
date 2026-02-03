package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzyx extends dzzh {
    public dzyx(dzzf dzzfVar, String str, Boolean bool, boolean z) {
        super(dzzfVar, str, bool, z);
    }

    @Override // defpackage.dzzh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (deve.c.matcher(str).matches()) {
                return true;
            }
            if (deve.d.matcher(str).matches()) {
                return false;
            }
        }
        Log.e("PhenotypeFlag", dzxt.b(obj, this, "Invalid boolean value for "));
        return null;
    }
}
