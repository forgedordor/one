package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.notification2o.NotificationsReceiver;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgjf {
    public static final eksp a = eksp.c("BugleNotifications");
    public final Context b;
    public final cglb c;
    public final cglm d;
    public final eygg e;
    public final cgjl f;
    public final cgkb g;
    public final cogw h;
    public final Optional i;
    public final eosd j;
    public final eosc k;
    public final fcsu l;
    public final fcsu m;
    private final Optional n;

    public cgjf(Context context, cglb cglbVar, cglm cglmVar, eygg eyggVar, cgjl cgjlVar, cgkb cgkbVar, Optional optional, cogw cogwVar, Optional optional2, eosd eosdVar, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.b = context;
        this.c = cglbVar;
        this.d = cglmVar;
        this.e = eyggVar;
        this.f = cgjlVar;
        this.g = cgkbVar;
        this.n = optional;
        this.h = cogwVar;
        this.i = optional2;
        this.j = eosdVar;
        this.k = eoscVar;
        this.l = fcsuVar;
        this.m = fcsuVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v35, types: [android.os.Parcelable, java.lang.Object] */
    public final kvf a(cgiw cgiwVar, cgjh cgjhVar, cgis cgisVar, Bundle bundle) {
        PendingIntent pendingIntentE;
        boolean z = cgisVar.g().isPresent() && ((kxb[]) cgisVar.g().get()).length > 0;
        IconCompat iconCompat = (IconCompat) cgisVar.e().orElse(null);
        CharSequence charSequenceI = cgisVar.i();
        cgjl cgjlVar = this.f;
        cglf cglfVarD = cgiwVar.d();
        Optional optionalG = cgjhVar.g();
        final Bundle bundle2 = new Bundle();
        bundle2.putBundle("extra_notification_bundle", bundle);
        bundle2.putInt("extra_notification_type", cglfVarD.j);
        bundle2.putInt("extra_notification_action_type", cgisVar.b().p);
        bundle2.putBoolean("extra_is_summary_notification", false);
        optionalG.ifPresent(new Consumer() { // from class: cgji
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                bundle2.putString("extra_notification_tag", (String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        bundle2.putAll(cgisVar.a());
        if (cgisVar.f().isPresent()) {
            bundle2.putParcelable("extra_pending_intent_to_run", cgisVar.f().get());
        }
        String str = cglfVarD.name() + "_" + cgisVar.b().name();
        if (optionalG.isPresent()) {
            str = str + "_" + ((String) optionalG.get());
        }
        if (cgisVar.c().isPresent()) {
            Intent intent = (Intent) cgisVar.c().get();
            if (TextUtils.isEmpty(intent.getAction())) {
                intent.setAction(str);
            }
            bundle2.putBoolean("extra_is_from_notification_for_ui_handling", true);
            intent.putExtras(bundle2);
            if (cgisVar.l()) {
                Context context = cgjlVar.a;
                kxg kxgVar = new kxg(context);
                kxgVar.e(intent);
                Intent[] intentArrC = kxgVar.c();
                int iA = crag.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
                Bundle bundle3 = new Bundle();
                ClipData clipData = ebsn.a;
                ejwl.l(true);
                pendingIntentE = PendingIntent.getActivities(context, 4320, intentArrC, iA | VCardConfig.FLAG_APPEND_TYPE_PARAM, bundle3);
            } else {
                pendingIntentE = ebsn.b(cgjlVar.a, 4320, intent, crag.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
            }
        } else {
            Context context2 = cgjlVar.a;
            Intent intent2 = new Intent(context2, (Class<?>) NotificationsReceiver.class);
            intent2.setAction(str);
            intent2.putExtras(bundle2);
            pendingIntentE = z ? ebsn.e(context2, 4320, intent2, 134217728 | (true != craf.e ? 0 : VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING), 23) : ebsn.d(context2, 4320, intent2, crag.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        }
        kve kveVar = new kve(iconCompat, charSequenceI, pendingIntentE);
        Bundle bundle4 = new Bundle();
        bundle4.putInt("extra_notification_action_type", cgisVar.b().p);
        Optional optionalC = cgisVar.c();
        if (cgisVar.k() && optionalC.isPresent()) {
            String action = ((Intent) optionalC.get()).getAction();
            Bundle extras = ((Intent) optionalC.get()).getExtras();
            boolean zJ = cgisVar.j();
            if (!this.n.isPresent()) {
                Bundle bundle5 = new Bundle();
                bundle5.putInt(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, 2);
                bundle5.putString(GroupManagementRequest.ACTION_TAG, action);
                bundle5.putString("packageName", this.b.getPackageName());
                bundle5.putInt("flags", 268468224);
                if (extras != null) {
                    bundle5.putBundle("extras", extras.deepCopy());
                }
                Bundle bundle6 = kveVar.b;
                bundle6.putBundle("com.google.android.wearable.preview.extra.REMOTE_INTENT", bundle5);
                if (zJ) {
                    bundle6.putBoolean("com.google.android.wearable.preview.extra.REMOTE_CONTENT_INTENT", true);
                }
            }
        }
        kveVar.b(bundle4);
        kveVar.d = cgisVar.c().isPresent();
        if (cgisVar.h().isPresent()) {
            kveVar.c = ((Integer) cgisVar.h().get()).intValue();
        }
        if (cgisVar.d().isPresent()) {
            kveVar.a = ((Boolean) cgisVar.d().get()).booleanValue();
        }
        if (z) {
            for (kxb kxbVar : (kxb[]) cgisVar.g().get()) {
                kveVar.c(kxbVar);
            }
        }
        return kveVar.a();
    }

    public final void b(kvq kvqVar, cglf cglfVar, Bundle bundle, Optional optional, boolean z, cgkm cgkmVar, Optional optional2) {
        cgjl cgjlVar = this.f;
        kvqVar.g = cgjlVar.a(cgjm.NOTIFICATION_CLICKED, cglfVar, optional, cgkmVar, z, false, bundle);
        cgkn cgknVarC = cgkn.c(Optional.empty(), Optional.empty());
        optional2.isPresent();
        kvqVar.k(cgjlVar.b(cgjm.NOTIFICATION_SWIPED, cglfVar, optional, cgknVarC, z, bundle));
    }
}
