package defpackage;

import android.app.Activity;
import defpackage.eyhe;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyhg implements eyhx {
    private final Activity a;
    private volatile eygp b;
    private final Object c = new Object();

    public eyhg(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.eyhx
    public final /* bridge */ /* synthetic */ Object bb() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    if (this.b == null) {
                        Activity activity = this.a;
                        Object lastNonConfigurationInstance = activity.getLastNonConfigurationInstance();
                        if (lastNonConfigurationInstance != null) {
                            this.b = (eygp) lastNonConfigurationInstance;
                        } else {
                            ahhl ahhlVarIB = ((eyhe.a) eygn.a(activity, eyhe.a.class)).iB();
                            ahhlVarIB.a = new eyhn(null);
                            this.b = ahhlVarIB.a();
                        }
                    }
                    this.b = this.b;
                }
            }
        }
        return this.b;
    }
}
