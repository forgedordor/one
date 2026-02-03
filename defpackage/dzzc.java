package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzzc extends dzzh {
    final /* synthetic */ dzze a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzzc(dzzf dzzfVar, String str, Object obj, dzze dzzeVar) {
        super(dzzfVar, str, obj, false);
        this.a = dzzeVar;
    }

    @Override // defpackage.dzzh
    public final Object a(Object obj) {
        if (obj instanceof String) {
            try {
                return this.a.a(Base64.decode((String) obj, 3));
            } catch (IOException | IllegalArgumentException unused) {
            }
        }
        Log.e("PhenotypeFlag", dzxt.b(obj, this, "Invalid byte[] value for "));
        return null;
    }
}
