package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dseo implements dsea {
    private final PackageManager a;
    private final dsbr b;

    public dseo(Context context, dsbr dsbrVar) {
        this.a = context.getPackageManager();
        this.b = dsbrVar;
    }

    @Override // defpackage.dsea
    public final dsdz a() {
        return dsdz.INSTALLED_APPS;
    }

    @Override // defpackage.ejug
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) throws PackageManager.NameNotFoundException, NumberFormatException {
        int i;
        PackageInfo packageInfo;
        etom etomVar = (etom) obj;
        dsec dsecVar = (dsec) obj2;
        if (!etomVar.f.isEmpty()) {
            for (etmi etmiVar : etomVar.f) {
                etgf etgfVar = etmiVar.c;
                if (etgfVar == null) {
                    etgfVar = etgf.a;
                }
                String str = etgfVar.c == 4 ? (String) etgfVar.d : "";
                etgf etgfVar2 = etmiVar.c;
                if (etgfVar2 == null) {
                    etgfVar2 = etgf.a;
                }
                if (etgfVar2.e.isEmpty()) {
                    i = 0;
                } else {
                    etgf etgfVar3 = etmiVar.c;
                    if (etgfVar3 == null) {
                        etgfVar3 = etgf.a;
                    }
                    i = Integer.parseInt(etgfVar3.e);
                }
                try {
                    packageInfo = this.a.getPackageInfo(str, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                } catch (Exception e) {
                    this.b.f(dsecVar.a(), e, str);
                    return false;
                }
                int i2 = etmiVar.d;
                int iA = etmh.a(i2);
                if (iA == 0) {
                    iA = 1;
                }
                int i3 = iA - 1;
                if (i3 == 1) {
                    if (packageInfo != null && packageInfo.versionCode >= i) {
                        this.b.c(dsecVar.a(), "App is installed AND has version: %s but want less than version %s", Integer.valueOf(packageInfo.versionCode), Integer.valueOf(i));
                        return false;
                    }
                } else if (i3 != 2) {
                    dsbr dsbrVar = this.b;
                    dsbi dsbiVarA = dsecVar.a();
                    int iA2 = etmh.a(i2);
                    dsbrVar.d(dsbiVarA, "Invalid InstallStatus for %s: %s", str, (iA2 == 0 || iA2 == 1) ? "UNKNOWN" : iA2 != 2 ? "INSTALLED" : "NOT_INSTALLED");
                } else {
                    if (packageInfo == null) {
                        this.b.c(dsecVar.a(), "App is not installed (null package info)", new Object[0]);
                        return false;
                    }
                    if (packageInfo.versionCode < i) {
                        this.b.c(dsecVar.a(), "Want version: %s \nHave version: %s", Integer.valueOf(i), Integer.valueOf(packageInfo.versionCode));
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
