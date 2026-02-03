package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdpm implements cdpk {
    public static final cqce a = cqce.g("Lighter", "LighterEntryPointConfigImpl");
    public final fcsu b;
    private final Context c;
    private final fcsu d;
    private final fcsu e;

    public cdpm(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.c = context;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.b = fcsuVar3;
    }

    @Override // defpackage.cdpk
    public final void a() {
        boolean z = true;
        boolean z2 = false;
        if (cdpn.a() && ((crnp) this.d.b()).d()) {
            z2 = true;
        }
        cqce cqceVar = a;
        cqceVar.m("LighterFlags.enableUnifiedInbox: " + cdpn.a());
        cqceVar.m("EnableUnifiedInbox -> isDefaultSmsApp(): " + ((crnp) this.d.b()).d());
        cqceVar.m(a.r(abxb.a(), "EnableUnifiedInbox -> GaiaFlags.isBugleAccountEnabled: "));
        cqceVar.m("isBugleAccountEnabled -> enableGooglePhotosIntegration: ".concat(String.valueOf(String.valueOf(cgwx.a.e()))));
        cqceVar.m("isBugleAccountEnabled -> ENABLE_INPUT_MANAGER_REFACTOR: ".concat(String.valueOf(String.valueOf(ccze.ac.e()))));
        cqceVar.m(a.r(z2, "enable lighter entry point activity: "));
        if (!z2) {
            z = z2;
        } else if (((Boolean) ((cczi) cdpn.a.get()).e()).booleanValue()) {
            cqceVar.m("Enabling unified inbox since enable_lighter is true");
            ((ains) this.b.b()).e("Bugle.UnifiedInbox.Entrypoints", 3);
        } else {
            if (apvj.a()) {
                cqceVar.m("Checking sign-in status since lighter_enable_only_signed_in is true");
                auvh.h(((cdku) this.e.b()).a().h(new ejvr() { // from class: cdpl
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        Boolean bool = (Boolean) obj;
                        cqce cqceVar2 = cdpm.a;
                        Objects.toString(bool);
                        cqceVar2.m("EnableUnifiedInbox -> isSignedIn: ".concat(String.valueOf(bool)));
                        boolean zBooleanValue = bool.booleanValue();
                        cdpm cdpmVar = this.a;
                        if (!zBooleanValue) {
                            ((ains) cdpmVar.b.b()).e("Bugle.UnifiedInbox.Entrypoints", 2);
                        } else {
                            if (eotp.a("bugle.lighter_enable_only_already_enabled_users", "bugle")) {
                                ((ains) cdpmVar.b.b()).e("Bugle.UnifiedInbox.Entrypoints", 4);
                                return true;
                            }
                            cdpmVar.b(true);
                            ((ains) cdpmVar.b.b()).e("Bugle.UnifiedInbox.Entrypoints", 1);
                        }
                        return true;
                    }
                }, eoqg.a));
                return;
            }
            z = z2;
        }
        b(z);
    }

    public final void b(boolean z) {
        Context context = this.c;
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, "com.google.android.apps.messaging.lighterconversation.LighterEntryPointActivity"), true != z ? 2 : 1, 1);
    }
}
