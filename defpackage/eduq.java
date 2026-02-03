package defpackage;

import android.accounts.Account;
import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eduq {
    private static final ekrg g = ekrg.c("com/google/android/libraries/user/profile/photopicker/picker/ActivityParams");
    public final ejwi a;
    public final ejwi b;
    public final ejwi c;
    public final euqq d;
    public final boolean e;
    public final ejwi f;
    private final boolean h;

    public eduq(eg egVar, eddk eddkVar) {
        ejwi ejwiVarJ;
        String str;
        ejwi ejwiVarI = ejwi.i(egVar.getIntent().getExtras());
        ejwi ejwiVarI2 = ejwiVarI.g() ? ejwi.i(egVar.getIntent().getExtras().getString("com.google.profile.photopicker.ACCOUNT")) : ejud.a;
        this.a = ejwiVarI2;
        if (ejwiVarI2.g()) {
            Account[] accountArrA = eddkVar.a();
            String str2 = (String) ejwiVarI2.c();
            for (Account account : accountArrA) {
                if (account.name.equals(str2)) {
                    ejwiVarJ = ejwi.j(account);
                    break;
                }
            }
            ejwiVarJ = ejud.a;
        } else {
            ejwiVarJ = ejud.a;
        }
        this.b = ejwiVarJ;
        this.h = ((Boolean) ejwiVarI.b(new ejvr() { // from class: edup
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Bundle) obj).containsKey("com.google.profile.photopicker.INTENT_SIGNED_OUT"));
            }
        }).e(false)).booleanValue();
        this.e = ejwiVarI.g() && ((Bundle) ejwiVarI.c()).getBoolean("hide_photos_of_you");
        if (fbgv.n()) {
            this.f = ejwiVarI.g() ? ejwi.i(((Bundle) ejwiVarI.c()).getString("open_to_content_url_override")) : ejud.a;
        } else {
            this.f = ejud.a;
        }
        if (ejwiVarI.g() && ((Bundle) ejwiVarI.c()).containsKey("com.google.profile.photopicker.HOST_INFO")) {
            eurz eurzVar = (eurz) ((eusa) ProtoParsers.f((Bundle) ejwiVarI.c(), "com.google.profile.photopicker.HOST_INFO", eusa.a, evrr.a())).toBuilder();
            Application application = egVar.getApplication();
            try {
                str = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str = "not available";
            }
            eurzVar.copyOnWrite();
            eusa eusaVar = (eusa) eurzVar.instance;
            str.getClass();
            eusaVar.b |= 2;
            eusaVar.d = str;
            this.c = ejwi.j((eusa) eurzVar.build());
        } else {
            this.c = ejud.a;
        }
        euqp euqpVar = (euqp) euqq.a.createBuilder();
        euqpVar.copyOnWrite();
        euqq euqqVar = (euqq) euqpVar.instance;
        euqqVar.b |= 1;
        euqqVar.c = "0.1";
        euqpVar.copyOnWrite();
        euqq euqqVar2 = (euqq) euqpVar.instance;
        euqqVar2.b |= 2;
        euqqVar2.d = 757365213L;
        this.d = (euqq) euqpVar.build();
    }

    public final boolean a() {
        ejwi ejwiVar = this.a;
        if (!ejwiVar.g() && !this.h) {
            ((ekrd) ((ekrd) g.j()).h("com/google/android/libraries/user/profile/photopicker/picker/ActivityParams", "hasValidParams", 162, "ActivityParams.java")).q("Photopicker parameters invalid: PHOTO_PICKER_MESSAGE_ACCOUNT is missing.");
            return false;
        }
        if (ejwiVar.g() && this.h) {
            ((ekrd) ((ekrd) g.j()).h("com/google/android/libraries/user/profile/photopicker/picker/ActivityParams", "hasValidParams", 167, "ActivityParams.java")).q("Photopicker parameters invalid: PHOTO_PICKER_MESSAGE_ACCOUNT and PHOTO_PICKER_INTENT_SIGNED_OUT are both present.");
            return false;
        }
        if (!this.b.g() && !this.h) {
            ((ekrd) ((ekrd) g.j()).h("com/google/android/libraries/user/profile/photopicker/picker/ActivityParams", "hasValidParams", 173, "ActivityParams.java")).q("Photopicker parameters invalid: the specified account was not present.");
            return false;
        }
        if (this.c.g()) {
            return true;
        }
        ((ekrd) ((ekrd) g.j()).h("com/google/android/libraries/user/profile/photopicker/picker/ActivityParams", "hasValidParams", 178, "ActivityParams.java")).q("Photopicker parameters invalid: the contacts host information was not present.");
        return false;
    }
}
