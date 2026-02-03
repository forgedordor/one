package com.google.android.apps.messaging.wearable;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.aijh;
import defpackage.ajhd;
import defpackage.avmp;
import defpackage.barn;
import defpackage.cqnc;
import defpackage.crnp;
import defpackage.cuhe;
import defpackage.dapd;
import defpackage.ekis;
import defpackage.ekrw;
import defpackage.ekrz;
import defpackage.eksl;
import defpackage.eksp;
import defpackage.eygg;
import defpackage.fcsu;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WearableSetDefaultSmsAppActivity extends dapd {
    private static final eksp y = eksp.c("BugleWearable");
    public eygg n;
    public fcsu o;
    public fcsu p;
    public fcsu q;
    public fcsu r;

    @Override // defpackage.cukc
    public final cuhe fa() {
        return cuhe.a;
    }

    @Override // defpackage.ecdl, defpackage.eg, defpackage.abi, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            ((ajhd) this.n.b()).q(false, true);
        }
        finish();
    }

    @Override // defpackage.cukc, defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Optional optionalEmpty;
        super.onCreate(bundle);
        eksp ekspVar = y;
        eksl ekslVar = (eksl) ekspVar.h();
        ekrz ekrzVar = cqnc.S;
        ekslVar.X(ekrzVar, "WearableSetDefaultSmsAppActivity");
        ((eksl) ekslVar.h("com/google/android/apps/messaging/wearable/WearableSetDefaultSmsAppActivity", "onCreate", 57, "WearableSetDefaultSmsAppActivity.java")).q("Processing remote intents");
        Intent intent = getIntent();
        if (!((crnp) this.r.b()).d()) {
            Uri uriBuild = new Uri.Builder().scheme("wear").path("/bugle/set_default_sms/").build();
            if ("android.intent.action.VIEW".equals(intent.getAction()) && uriBuild.equals(intent.getData())) {
                ekrw ekrwVarN = ekspVar.n();
                ekrwVarN.X(ekrzVar, "WearableSetDefaultSmsAppActivity");
                ((eksl) ekrwVarN.h("com/google/android/apps/messaging/wearable/WearableSetDefaultSmsAppActivity", "onCreateV2", 74, "WearableSetDefaultSmsAppActivity.java")).q("Default sms app intent");
                startActivityForResult(((aijh) this.o.b()).l(this), 1);
                return;
            }
        }
        if ("android.intent.action.VIEW".equals(intent.getAction()) && "wear".equals(intent.getScheme()) && intent.getCategories().contains("android.intent.category.BROWSABLE")) {
            Uri data = intent.getData();
            if (data == null) {
                eksl ekslVar2 = (eksl) ekspVar.j();
                ekslVar2.X(ekrzVar, "WearableSetDefaultSmsAppActivity");
                ((eksl) ekslVar2.h("com/google/android/apps/messaging/wearable/WearableSetDefaultSmsAppActivity", "extractConversationId", 108, "WearableSetDefaultSmsAppActivity.java")).q("Uri cannot be null");
                optionalEmpty = Optional.empty();
            } else {
                String path = data.getPath();
                if (path == null || !path.startsWith("/bugle/rpc/open_conversation/")) {
                    ekrw ekrwVarN2 = ekspVar.n();
                    ekrwVarN2.X(ekrzVar, "WearableSetDefaultSmsAppActivity");
                    ((eksl) ekrwVarN2.h("com/google/android/apps/messaging/wearable/WearableSetDefaultSmsAppActivity", "extractConversationId", 116, "WearableSetDefaultSmsAppActivity.java")).t("Unsupported intent path: %s", data.getPath());
                    optionalEmpty = Optional.empty();
                } else {
                    optionalEmpty = Optional.of(barn.b((String) ekis.j(data.getPathSegments())));
                }
            }
        } else {
            eksl ekslVar3 = (eksl) ekspVar.j();
            ekslVar3.X(ekrzVar, "WearableSetDefaultSmsAppActivity");
            ((eksl) ekslVar3.h("com/google/android/apps/messaging/wearable/WearableSetDefaultSmsAppActivity", "extractConversationId", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "WearableSetDefaultSmsAppActivity.java")).q("Intent.action is not ACTION_VIEW or Intent.scheme is not WEAR_URI_SCHEME or invalid category");
            optionalEmpty = Optional.empty();
        }
        if (optionalEmpty.isPresent()) {
            ekrw ekrwVarN3 = ekspVar.n();
            ekrwVarN3.X(ekrzVar, "WearableSetDefaultSmsAppActivity");
            ((eksl) ekrwVarN3.h("com/google/android/apps/messaging/wearable/WearableSetDefaultSmsAppActivity", "onCreateV2", 83, "WearableSetDefaultSmsAppActivity.java")).q("Open on phone intent.");
            ((avmp) this.p.b()).D((Context) this.q.b(), new BugleConversationId((ConversationIdType) optionalEmpty.get()));
        }
        finish();
    }
}
