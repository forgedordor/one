package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.droidguard.internal.IDroidGuardService;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcpz extends dcko {
    public dcpz(Context context, Looper looper, dcgy dcgyVar, dcii dciiVar) {
        dcfn dcfnVar = new dcfn(context);
        dedo dedoVar = dedo.a;
        Map map = dcfnVar.e;
        dcfe dcfeVar = dedm.e;
        super(context, looper, 25, new dcke(null, dcfnVar.a, dcfnVar.d, dcfnVar.b, dcfnVar.c, map.containsKey(dcfeVar) ? (dedo) dcfnVar.e.get(dcfeVar) : dedoVar), dcgyVar, dciiVar);
    }

    @Override // defpackage.dcko, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final int a() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IDroidGuardService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.droidguard.internal.IDroidGuardService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.droidguard.service.START";
    }
}
