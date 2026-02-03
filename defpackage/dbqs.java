package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.internal.IAuthService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbqs extends dcko {
    private final Bundle a;

    public dbqs(Context context, Looper looper, dcke dckeVar, dboh dbohVar, dcgy dcgyVar, dcii dciiVar) {
        super(context, looper, 16, dckeVar, dcgyVar, dciiVar);
        this.a = dbohVar == null ? new Bundle() : new Bundle(dbohVar.a);
    }

    @Override // defpackage.dcko, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final int a() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IAuthService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle g() {
        return this.a;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gq() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final boolean h() {
        dcke dckeVar = ((dcko) this).u;
        Account account = dckeVar.a;
        if (TextUtils.isEmpty(account != null ? account.name : null)) {
            return false;
        }
        if (((dckd) dckeVar.d.get(dbog.b)) == null) {
            return !dckeVar.b.isEmpty();
        }
        throw null;
    }
}
