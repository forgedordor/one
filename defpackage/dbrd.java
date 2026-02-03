package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class dbrd extends dcfm {
    static int a = 1;

    public dbrd(Context context, GoogleSignInOptions googleSignInOptions) {
        dcfe dcfeVar = dboe.c;
        dcfk dcfkVar = new dcfk();
        dcfkVar.a = new dcgk();
        super(context, dcfeVar, googleSignInOptions, dcfkVar.a());
    }

    public final synchronized int a() {
        int i;
        i = a;
        if (i == 1) {
            Context context = this.c;
            dcdt dcdtVar = dcdt.a;
            int iH = dcdtVar.h(context, 12451000);
            if (iH == 0) {
                i = 4;
                a = 4;
            } else if (dcdtVar.i(context, iH, null) != null || DynamiteModule.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                i = 2;
                a = 2;
            } else {
                i = 3;
                a = 3;
            }
        }
        return i;
    }
}
