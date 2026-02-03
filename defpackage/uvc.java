package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.android.vcard.VCardConfig;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uvc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeErrorUtils");

    public static final doeb a(final Context context, dofb dofbVar, Throwable th) {
        if ((th instanceof agrb) || (th instanceof agra) || (th instanceof agrs)) {
            return dodz.a;
        }
        if (th instanceof agrk) {
            return dodz.d;
        }
        if ((th instanceof agrp) || (th instanceof agrc)) {
            return dodz.g;
        }
        if (th instanceof agro) {
            return dodz.e;
        }
        if (th instanceof agrq) {
            return dodz.f;
        }
        if (!(th instanceof agrf)) {
            return dodz.g;
        }
        final Intent intentAddFlags = new Intent("android.settings.INTERNAL_STORAGE_SETTINGS").addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        intentAddFlags.getClass();
        ComponentName componentNameResolveActivity = intentAddFlags.resolveActivity(context.getPackageManager());
        ejdb ejdbVar = ((agrf) th).a;
        return new doea(ejdbVar != null ? ejdbVar.a : null, componentNameResolveActivity != null ? new fdae() { // from class: uvb
            @Override // defpackage.fdae
            public final Object invoke() throws IOException {
                eiid.o(context, intentAddFlags);
                return fctx.a;
            }
        } : null, ejdbVar != null ? ejdbVar.b : null, ejdbVar != null ? ejdbVar.c : null, ejdbVar != null ? ejdbVar.d : null, ((dofj) dofbVar.a.c()).d);
    }

    public static final void b(dofb dofbVar) {
        dofbVar.b(dodz.h);
    }

    public static final void c(Context context, dofb dofbVar, Throwable th, boolean z) {
        doeb doebVarA;
        th.getClass();
        if ((th instanceof agrg) || (z && (th instanceof agrm))) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BuglePenpal");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeErrorUtils", "setSuggestedTextErrorUiData", 75, "MagicComposeErrorUtils.kt")).q("Showing results blocked error for Suggested Text");
            doebVarA = dodz.c;
        } else {
            ekrw ekrwVarH2 = a.h();
            ekrwVarH2.X(eksq.a, "BuglePenpal");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeErrorUtils", "setSuggestedTextErrorUiData", 79, "MagicComposeErrorUtils.kt")).q("Showing error for Suggested Text");
            doebVarA = a(context, dofbVar, th);
        }
        dofbVar.b(doebVarA);
    }
}
