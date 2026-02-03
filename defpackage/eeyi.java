package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.appupdate.protocol.IAppUpdateService;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeyi extends eezo {
    final /* synthetic */ String a;
    final /* synthetic */ defr b;
    final /* synthetic */ eeyn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeyi(eeyn eeynVar, defr defrVar, String str, defr defrVar2) {
        super(defrVar);
        this.a = str;
        this.b = defrVar2;
        this.c = eeynVar;
    }

    @Override // defpackage.eezo
    protected final void a() {
        Integer numValueOf;
        try {
            eeyn eeynVar = this.c;
            IAppUpdateService iAppUpdateService = (IAppUpdateService) eeynVar.b.n;
            String str = eeynVar.c;
            String str2 = this.a;
            Bundle bundle = new Bundle();
            bundle.putAll(eeyn.b());
            bundle.putString("package.name", str2);
            try {
                Context context = eeynVar.d;
                numValueOf = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                eeyn.a.b("The current version of the app could not be retrieved", new Object[0]);
                numValueOf = null;
            }
            if (numValueOf != null) {
                bundle.putInt("app.version.code", numValueOf.intValue());
            }
            iAppUpdateService.requestInfo(str, bundle, new eeym(this.c, this.b, this.a));
        } catch (RemoteException e) {
            eeyn.a.c(e, "requestUpdateInfo(%s)", this.a);
            this.b.c(new RuntimeException(e));
        }
    }
}
