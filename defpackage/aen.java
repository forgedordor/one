package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aen extends adx {
    @Override // defpackage.adx
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        String str = (String) obj;
        str.getClass();
        return ael.a(new String[]{str});
    }

    @Override // defpackage.adx
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        boolean z = false;
        if (intent == null || i != -1) {
            return false;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= intArrayExtra.length) {
                    break;
                }
                if (intArrayExtra[i2] == 0) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.adx
    public final /* bridge */ /* synthetic */ adw c(Context context, Object obj) {
        String str = (String) obj;
        str.getClass();
        if (kxj.c(context, str) == 0) {
            return new adw(true);
        }
        return null;
    }
}
