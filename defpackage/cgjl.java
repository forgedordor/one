package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.notification2o.NotificationsReceiver;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgjl {
    public final Context a;

    public cgjl(Context context) {
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [android.os.Parcelable, java.lang.Object] */
    public final PendingIntent a(cgjm cgjmVar, cglf cglfVar, Optional optional, cgkm cgkmVar, boolean z, boolean z2, Bundle bundle) {
        final Bundle bundle2 = new Bundle();
        int i = cglfVar.j;
        cgkn cgknVarC = cgkmVar.c();
        bundle2.putInt("extra_notification_type", i);
        bundle2.putBundle("extra_notification_bundle", bundle);
        bundle2.putString("extra_notification_callback_type", cgjmVar.name());
        bundle2.putBoolean("extra_is_summary_notification", z);
        optional.ifPresent(new Consumer() { // from class: cgjj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                bundle2.putString("extra_notification_tag", (String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        cggu cgguVar = (cggu) cgknVarC;
        bundle2.putAll(cgguVar.b);
        Optional optional2 = cgguVar.a;
        if (optional2.isPresent()) {
            bundle2.putParcelable("extra_pending_intent_to_run", optional2.get());
        }
        bundle2.putBoolean("extra_is_from_notification_for_ui_handling", true);
        Intent intentB = cgkmVar.b();
        intentB.putExtras(bundle2);
        if (TextUtils.isEmpty(intentB.getAction())) {
            String str = cglfVar.name() + "_" + cgjmVar.name();
            if (optional.isPresent()) {
                str = str + "_" + ((String) optional.get());
            }
            intentB.setAction(str);
        }
        if (!cgkmVar.d()) {
            return z2 ? ebsn.c(this.a, cgkmVar.a(), intentB, 134217728 | crag.a, 1) : ebsn.b(this.a, cgkmVar.a(), intentB, crag.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        }
        Context context = this.a;
        kxg kxgVar = new kxg(context);
        kxgVar.e(intentB);
        if (z2) {
            return kxgVar.a(cgkmVar.a(), crag.a);
        }
        int iA = cgkmVar.a();
        int iA2 = crag.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
        Bundle bundle3 = new Bundle();
        ClipData clipData = ebsn.a;
        Intent[] intentArrC = kxgVar.c();
        int length = intentArrC.length;
        Intent[] intentArr = new Intent[length];
        int i2 = 0;
        while (true) {
            int i3 = length - 1;
            if (i2 >= i3) {
                intentArr[i3] = ebsn.f(intentArrC[i3], iA2, 0);
                return PendingIntent.getActivities(context, iA, intentArr, iA2, bundle3);
            }
            ejwl.b(intentArrC[i2].getComponent() != null, "Must set component on Intent.");
            intentArr[i2] = intentArrC[i2];
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.os.Parcelable, java.lang.Object] */
    public final PendingIntent b(cgjm cgjmVar, cglf cglfVar, Optional optional, cgkn cgknVar, boolean z, Bundle bundle) {
        final Bundle bundle2 = new Bundle();
        bundle2.putInt("extra_notification_type", cglfVar.j);
        bundle2.putBundle("extra_notification_bundle", bundle);
        bundle2.putString("extra_notification_callback_type", cgjmVar.name());
        bundle2.putBoolean("extra_is_summary_notification", z);
        optional.ifPresent(new Consumer() { // from class: cgjk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                bundle2.putString("extra_notification_tag", (String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        cggu cgguVar = (cggu) cgknVar;
        bundle2.putAll(cgguVar.b);
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) NotificationsReceiver.class);
        String str = cglfVar.name() + "_" + cgjmVar.name();
        if (optional.isPresent()) {
            str = str + "_" + ((String) optional.get());
        }
        intent.setAction(str);
        Optional optional2 = cgguVar.a;
        if (optional2.isPresent()) {
            bundle2.putParcelable("extra_pending_intent_to_run", optional2.get());
        }
        intent.putExtras(bundle2);
        return ebsn.d(context, 0, intent, crag.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
    }
}
