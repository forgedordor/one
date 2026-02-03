package defpackage;

import android.util.Base64;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzzb extends dzzh {
    public dzzb(dzzf dzzfVar, String str, byte[] bArr) {
        super(dzzfVar, str, bArr, false);
    }

    @Override // defpackage.dzzh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof String) {
            try {
                return Base64.decode((String) obj, 3);
            } catch (IllegalArgumentException unused) {
            }
        }
        Log.e("PhenotypeFlag", dzxt.b(obj, this, "Invalid byte[] value for "));
        return null;
    }
}
