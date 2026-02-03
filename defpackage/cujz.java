package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.block.ui.list.BlockedParticipantsActivity;
import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsActivity;
import com.google.android.apps.messaging.home.ArchivedActivity;
import com.google.android.apps.messaging.home.SpamFolderActivity;
import com.google.android.apps.messaging.penpal.settings.GeminiSettingsActivity;
import com.google.android.apps.messaging.suggestions.settings.SmartActionSettingsActivity;
import com.google.android.apps.messaging.ui.ClassZeroActivity;
import com.google.android.apps.messaging.ui.PermissionCheckActivity;
import com.google.android.apps.messaging.ui.appsettings.AboutPrivacyTermsActivity;
import com.google.android.apps.messaging.ui.appsettings.ApplicationSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.FederatedLearningSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.NudgeSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.PerSubscriptionSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.RcsSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.RichCardsSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.SettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.SimSelectionSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.SmartsSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.SwipeActionSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.protectionandsafety.ProtectionSafetySettingsActivity;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysActivity;
import com.google.android.apps.messaging.ui.debug.DebugMmsConfigActivity;
import com.google.android.apps.messaging.ui.debug.DebugMobileConfigurationActivity;
import com.google.android.apps.messaging.ui.debug.DebugPrefsActivity;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerActivity;
import com.google.android.apps.messaging.ui.rcs.setup.manual.PhoneNumberInputV2Activity;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cujz extends aijh {
    private final cpiz a;
    private final dakl b;
    private final srw c;
    private final Optional d;
    private final cmwe e;
    private final crny f;
    private final cjsd g;
    private final fcsu h;

    public cujz(cpiz cpizVar, dakl daklVar, srw srwVar, Optional optional, cmwe cmweVar, crny crnyVar, cjsd cjsdVar, fcsu fcsuVar) {
        this.a = cpizVar;
        this.b = daklVar;
        this.c = srwVar;
        this.d = optional;
        this.e = cmweVar;
        this.f = crnyVar;
        this.g = cjsdVar;
        this.h = fcsuVar;
    }

    private static Intent R(Context context, int i, String str) {
        return new Intent(context, (Class<?>) PerSubscriptionSettingsActivity.class).putExtra("sub_id", i).putExtra("per_sub_setting_title", str);
    }

    @Override // defpackage.aijh
    public void A(Context context, efwo efwoVar) {
        ejwl.b(false, "Not used on Go");
    }

    @Override // defpackage.aijh
    public final void B(Context context) {
        context.startActivity(new Intent(context, (Class<?>) RichCardsSettingsActivity.class));
    }

    @Override // defpackage.aijh
    public final void C(Context context) {
        context.startActivity(new Intent(context, (Class<?>) SettingsActivity.class));
    }

    @Override // defpackage.aijh
    public final void D(Context context, efwo efwoVar) {
        Intent intent = new Intent(context, (Class<?>) SettingsActivity.class);
        efyp.c(intent, efwoVar);
        context.startActivity(intent);
    }

    @Override // defpackage.aijh
    public final void E(Context context, efwo efwoVar) {
        Intent intent = new Intent(context, (Class<?>) SimSelectionSettingsActivity.class);
        efyp.c(intent, efwoVar);
        context.startActivity(intent);
    }

    @Override // defpackage.aijh
    public final void F(Uri uri, String str, Uri uri2, String str2) {
        srv srvVarA = this.c.a("Testing");
        srvVarA.b(uri, str, uri2, str2);
        srvVarA.e(new Void[0]);
    }

    @Override // defpackage.aijh
    public final Intent G(String str, Uri uri, Uri uri2) {
        return new Intent("android.intent.action.RINGTONE_PICKER").putExtra("android.intent.extra.ringtone.TYPE", 2).putExtra("android.intent.extra.ringtone.TITLE", str).putExtra("android.intent.extra.ringtone.EXISTING_URI", uri).putExtra("android.intent.extra.ringtone.DEFAULT_URI", uri2);
    }

    @Override // defpackage.aijh
    public final void I(Context context, efwo efwoVar) {
        Intent intent = new Intent(context, (Class<?>) ApplicationSettingsActivity.class);
        intent.putExtra("top_level_settings", true);
        efyp.c(intent, efwoVar);
        context.startActivity(intent);
    }

    @Override // defpackage.aijh
    public final void J(Activity activity, Uri uri, Uri uri2) {
        Intent intent = new Intent(activity, (Class<?>) MediaViewerActivity.class);
        intent.putExtra("photos", uri2);
        intent.putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        intent.setFlags(536870912);
        intent.putExtra("opening_source", 1);
        activity.startActivity(intent);
        activity.overridePendingTransition(0, 0);
    }

    @Override // defpackage.aijh
    public final void K(Activity activity, String str, int i) {
        this.g.c(str, cjsa.INPUT_FULLSCREEN, i);
        Intent intent = new Intent(activity, (Class<?>) PhoneNumberInputV2Activity.class);
        intent.putExtra("phone_number_input_ui_event_source_extra_key", cjrz.a(i));
        intent.putExtra("phone_number_input_ui_event_sim_id_extra_key", str);
        activity.startActivityForResult(intent, 1038);
    }

    @Override // defpackage.aijh
    public final void L(Context context, alqm alqmVar, aisq aisqVar) {
        String strK = alqmVar.k(true);
        strK.getClass();
        String strConcat = "tel:".concat(strK);
        crny crnyVar = this.f;
        Intent intent = new Intent(crnyVar.a() == 1 ? "android.intent.action.CALL" : "android.intent.action.DIAL", Uri.parse(strConcat));
        if (aisqVar != null) {
            aisqVar.b();
        }
        this.b.o(context, intent);
    }

    @Override // defpackage.aijh
    public final void M(Context context) {
        Intent intent = new Intent(context, (Class<?>) SpamFolderActivity.class);
        intent.putExtra("spam_folder_opened_source", 1);
        context.startActivity(intent);
    }

    @Override // defpackage.cqla
    public final void N(Context context) {
        context.startActivity(new Intent(context, (Class<?>) DebugMmsConfigActivity.class));
    }

    @Override // defpackage.cqla
    public final void O(Context context) {
        context.startActivity(new Intent(context, (Class<?>) DebugMobileConfigurationActivity.class));
    }

    @Override // defpackage.cqla
    public final void P(Context context) {
        context.startActivity(new Intent(context, (Class<?>) DebugPrefsActivity.class));
    }

    @Override // defpackage.cqla
    public final void Q(Context context) {
        context.startActivity(new Intent(context, (Class<?>) DebugGServiceKeysActivity.class));
    }

    @Override // defpackage.aiiy
    public final void a(Context context) {
        context.startActivity(new Intent(context, (Class<?>) PermissionCheckActivity.class));
    }

    @Override // defpackage.aijg
    public final Intent b(Context context) {
        return new Intent(context, (Class<?>) FederatedLearningSettingsActivity.class);
    }

    @Override // defpackage.aijg
    public final Intent c(Context context) {
        return new Intent(context, (Class<?>) GeminiSettingsActivity.class);
    }

    @Override // defpackage.aijg
    public final Intent d(Context context) {
        return new Intent(context, (Class<?>) NudgeSettingsActivity.class);
    }

    @Override // defpackage.aijg
    public final Intent e(Context context) {
        return new Intent(context, (Class<?>) SmartActionSettingsActivity.class);
    }

    @Override // defpackage.aijg
    public final Intent f(Context context) {
        return new Intent(context, (Class<?>) SmartsSettingsActivity.class);
    }

    @Override // defpackage.aijg
    public final void g(Context context) {
        context.startActivity(new Intent(context, (Class<?>) FederatedLearningSettingsActivity.class));
    }

    @Override // defpackage.aijg
    public final void h(Context context) {
        context.startActivity(new Intent(context, (Class<?>) SmartsSettingsActivity.class));
    }

    @Override // defpackage.aijh
    public final Intent i(Context context) {
        return new Intent(context, (Class<?>) AboutPrivacyTermsActivity.class);
    }

    @Override // defpackage.aijh
    public final Intent j(Context context) {
        return R(context, -1, null);
    }

    @Override // defpackage.aijh
    public final Intent k(Context context, int i, String str) {
        return R(context, i, str);
    }

    @Override // defpackage.aijh
    public final Intent l(Activity activity) {
        if (craf.c) {
            return abo$$ExternalSyntheticApiModelOutline0.m(activity.getSystemService(abo$$ExternalSyntheticApiModelOutline0.m42m())).createRequestRoleIntent("android.app.role.SMS");
        }
        Intent intent = new Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT");
        intent.putExtra("package", activity.getPackageName());
        return intent;
    }

    @Override // defpackage.aijh
    public final Intent m(Context context) {
        return new Intent(context, (Class<?>) ProtectionSafetySettingsActivity.class);
    }

    @Override // defpackage.aijh
    public final Intent n(Context context) {
        return new Intent(context, (Class<?>) RcsSettingsActivity.class).putExtra("sub_id", -1);
    }

    @Override // defpackage.aijh
    public final Intent o(Context context) {
        return new Intent(context, (Class<?>) RichCardsSettingsActivity.class);
    }

    @Override // defpackage.aijh
    public final Intent p(Context context) {
        return new Intent(context, (Class<?>) SwipeActionSettingsActivity.class);
    }

    @Override // defpackage.aijh
    public final Intent q(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(new ComponentName(asqu.a(context), "com.android.cellbroadcastreceiver.CellBroadcastListActivity"));
        intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        return intent;
    }

    @Override // defpackage.aijh
    public final void r(Context context, efwo efwoVar) {
        Intent intent = new Intent(context, (Class<?>) ArchivedActivity.class);
        efyp.c(intent, efwoVar);
        context.startActivity(intent);
    }

    @Override // defpackage.aijh
    public final void s(Context context) {
        this.a.a(context, BlockedParticipantsActivity.class);
    }

    @Override // defpackage.aijh
    public final void t(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (this.e.a()) {
            intent.addFlags(268439552);
        }
        this.b.o(context, intent);
    }

    @Override // defpackage.aijh
    public final void u(Context context, ContentValues contentValues) {
        context.startActivity(new Intent(context, (Class<?>) ClassZeroActivity.class).putExtra("message_values", contentValues).setFlags(402653184));
    }

    @Override // defpackage.aijh
    public final void v(Context context) {
        context.startActivity(new Intent(context, (Class<?>) DiagnosticsActivity.class));
    }

    @Override // defpackage.aijh
    public final void w(Context context, Uri uri, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(1);
        if (this.e.a()) {
            intent.addFlags(268439552);
        }
        intent.setDataAndType(uri, str);
        this.b.o(context, intent);
    }

    @Override // defpackage.aijh
    public final void x(Context context, Uri uri, String str) {
        Uri uriE = bxlf.e(context, uri);
        if (str == null && (str = cqmz.j(context, uriE)) == null) {
            str = "video/*";
        }
        this.d.isPresent();
        Intent intent = new Intent(context, (Class<?>) MediaViewerActivity.class);
        intent.putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uriE);
        intent.putExtra("content_type", str);
        intent.putExtra("opening_source", 1);
        intent.setFlags(536870912);
        context.startActivity(intent);
    }

    @Override // defpackage.aijh
    public final void y(Context context) {
        context.startActivity(m(context));
    }

    @Override // defpackage.aijh
    public void z(Context context) {
        cqaz.c("Not used on Go");
    }
}
