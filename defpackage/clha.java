package defpackage;

import android.content.Context;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clha {
    public final Context a;

    public clha(Context context) {
        context.getClass();
        this.a = context;
        ejxx.a(new ejxr() { // from class: clgz
            @Override // defpackage.ejxr
            public final Object get() {
                clha clhaVar = this.a;
                boolean z = true;
                if (!crad.d() ? Settings.Global.getInt(clhaVar.a.getContentResolver(), "device_demo_mode", 0) != 1 : Settings.Secure.getInt(clhaVar.a.getContentResolver(), "shopdemo", 0) != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }).getClass();
    }
}
