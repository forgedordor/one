package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.auth.IAuthManagerService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbmn implements dbmp {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;

    public dbmn(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // defpackage.dbmp
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) throws dbmi {
        Bundle bundleClearToken = IAuthManagerService.Stub.asInterface(iBinder).clearToken(this.a, this.b);
        dbmq.k(bundleClearToken);
        String string = bundleClearToken.getString("Error");
        if (bundleClearToken.getBoolean("booleanResult")) {
            return null;
        }
        throw new dbmi(string);
    }
}
