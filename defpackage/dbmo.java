package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.auth.IAuthManagerService;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbmo implements dbmp {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;

    public dbmo(String str, Context context) {
        this.a = str;
        this.b = context;
    }

    @Override // defpackage.dbmp
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) throws dbmi, IOException {
        Bundle bundleRequestGoogleAccountsAccess = IAuthManagerService.Stub.asInterface(iBinder).requestGoogleAccountsAccess(this.a);
        dbmq.k(bundleRequestGoogleAccountsAccess);
        String string = bundleRequestGoogleAccountsAccess.getString("Error");
        Intent intent = (Intent) bundleRequestGoogleAccountsAccess.getParcelable("userRecoveryIntent");
        PendingIntent pendingIntent = (PendingIntent) bundleRequestGoogleAccountsAccess.getParcelable("userRecoveryPendingIntent");
        if (dbts.SUCCESS.equals(dbts.a(string))) {
            return true;
        }
        dbmq.h(this.b, "requestGoogleAccountsAccess", string, intent, pendingIntent);
        throw new dbmi("Invalid state. Shouldn't happen");
    }
}
