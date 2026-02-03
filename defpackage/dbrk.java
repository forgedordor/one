package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.ISignInService;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbrk extends dcko {
    public final GoogleSignInOptions a;

    public dbrk(Context context, Looper looper, dcke dckeVar, GoogleSignInOptions googleSignInOptions, dcfo dcfoVar, dcfp dcfpVar) {
        super(context, looper, 91, dckeVar, dcfoVar, dcfpVar);
        dbrf dbrfVar = googleSignInOptions != null ? new dbrf(googleSignInOptions) : new dbrf();
        dbrfVar.b = dddu.a();
        if (!dckeVar.c.isEmpty()) {
            Iterator it = dckeVar.c.iterator();
            while (it.hasNext()) {
                dbrfVar.c((Scope) it.next(), new Scope[0]);
            }
        }
        this.a = dbrfVar.a();
    }

    @Override // defpackage.dcko, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final int a() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return ISignInService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
