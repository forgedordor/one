package defpackage;

import android.content.Context;
import android.content.Intent;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.protectionandsafety.ProtectionSafetySettingsActivity;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cvsf extends fdbo implements fdat {
    public cvsf(Object obj) {
        super(2, obj, cvsi.class, "loadContent", "loadContent(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        final cvsi cvsiVar = (cvsi) this.g;
        if (!zBooleanValue) {
            return null;
        }
        Context context = cvsiVar.a;
        String string = context.getString(R.string.cross_country_banner_title);
        String string2 = context.getString(R.string.cross_country_banner_body);
        tdq tdqVar = new tdq(djrr.bS);
        String string3 = context.getString(R.string.cross_country_banner_confirm_button);
        string3.getClass();
        tdk tdkVar = new tdk(string3, new fdae() { // from class: cvsc
            @Override // defpackage.fdae
            public final Object invoke() {
                cvsi cvsiVar2 = cvsiVar;
                ((cvsn) cvsiVar2.b.b()).a(cvsiVar2.e, bvdk.UNARCHIVED);
                ((csjh) cvsiVar2.c.b()).a(2);
                auvw.m(cvsiVar2.f, null, new cvsh(cvsiVar2, null), 3);
                return fctx.a;
            }
        });
        String string4 = context.getString(R.string.cross_country_banner_dismiss_button);
        string4.getClass();
        return new tdo("cross_country_banner", string, string2, tdqVar, tdkVar, new tdk(string4, new fdae() { // from class: cvsd
            @Override // defpackage.fdae
            public final Object invoke() throws IOException {
                cvsi cvsiVar2 = cvsiVar;
                Context context2 = cvsiVar2.a;
                Intent intentAddFlags = new Intent(context2, (Class<?>) ProtectionSafetySettingsActivity.class).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                intentAddFlags.getClass();
                eiid.o(context2, intentAddFlags);
                ((csjh) cvsiVar2.c.b()).a(3);
                return fctx.a;
            }
        }), false, new fdae() { // from class: cvse
            @Override // defpackage.fdae
            public final Object invoke() {
                ((csjh) cvsiVar.c.b()).a(1);
                return fctx.a;
            }
        }, null, 1024);
    }
}
