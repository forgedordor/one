package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.android.vcard.VCardConfig;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crxn {
    public static final egyj a = new egyb("AAPM_SPAM_PROTECTION_SETTING_DATA_SOURCE_KEY");
    public final Context b;
    public final fcsu c;
    public final fcsu d;
    public final eosc e;
    public final fdjx f;
    public final Object g;
    public Boolean h;

    public crxn(Context context, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, fdjx fdjxVar) {
        context.getClass();
        fcsuVar.getClass();
        eoscVar.getClass();
        fdjxVar.getClass();
        this.b = context;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = eoscVar;
        this.f = fdjxVar;
        this.g = new Object();
    }

    public final void a() throws IOException {
        Intent flags = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.advancedprotection.ui.AdvancedProtectionSettingsActivity").setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        flags.getClass();
        Context context = this.b;
        if (context.getPackageManager().resolveActivity(flags, 0) == null) {
            flags = null;
        }
        if (flags == null) {
            throw new IllegalStateException("AAPM settings intent is null. Is this launch being attempted from a non-main user?");
        }
        eiid.o(context, flags);
    }

    public final boolean b() throws IOException {
        boolean zIsAdvancedProtectionEnabled = false;
        if (!crxi.a()) {
            return false;
        }
        auvw.m(this.f, null, new crxj(this, null), 3);
        eieu eieuVarH = eiiy.h("AapmManager.isAapmEnabled");
        try {
            Object obj = this.g;
            synchronized (obj) {
                Boolean bool = this.h;
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    fczl.a(eieuVarH, null);
                    return zBooleanValue;
                }
                fczl.a(eieuVarH, null);
                Context context = this.b;
                if (Build.VERSION.SDK_INT >= 36) {
                    Object systemService = context.getSystemService("advanced_protection");
                    systemService.getClass();
                    zIsAdvancedProtectionEnabled = aao$$ExternalSyntheticApiModelOutline4.m11m(systemService).isAdvancedProtectionEnabled();
                }
                synchronized (obj) {
                    this.h = Boolean.valueOf(zIsAdvancedProtectionEnabled);
                }
                return zIsAdvancedProtectionEnabled;
            }
        } finally {
        }
    }
}
