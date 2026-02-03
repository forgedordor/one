package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.settings.ConversationSettingsOptionItemView;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uql extends vo {
    public bage a;
    final /* synthetic */ uqc d;

    public uql(uqc uqcVar) {
        this.d = uqcVar;
    }

    final ekgb F(bage bageVar) {
        if (bageVar == null) {
            int i = ekgb.d;
            return ekoe.a;
        }
        ParticipantsTable.BindData bindDataA = bageVar.a().a();
        uqc uqcVar = this.d;
        boolean zL = uqcVar.e.l();
        if (bindDataA != null && bbbe.d(bindDataA)) {
            BusinessInfoData businessInfoData = (BusinessInfoData) uqcVar.f.orElse(null);
            ArrayList arrayList = new ArrayList(bagd.a());
            if (!zL) {
                arrayList.remove(bagd.SETTING_NOTIFICATION);
            }
            arrayList.remove(bagd.SETTING_XMS_MODE);
            arrayList.remove(bagd.SETTING_SECURITY_KEY);
            arrayList.remove(bagd.SETTING_SPAM_REPORTING);
            if (businessInfoData != null) {
                BusinessInfoProperty privacyPolicyUrl = businessInfoData.getPrivacyPolicyUrl();
                if (privacyPolicyUrl == null || TextUtils.isEmpty(privacyPolicyUrl.getValue())) {
                    bagf.a.r("Can't add privacy policy setting: business doesn't have it.");
                } else {
                    arrayList.add(bagd.SETTING_PRIVACY_POLICY);
                }
                BusinessInfoProperty termsAndConditionsUrl = businessInfoData.getTermsAndConditionsUrl();
                if (termsAndConditionsUrl != null && !TextUtils.isEmpty(termsAndConditionsUrl.getValue())) {
                    arrayList.add(bagd.SETTING_TERMS_OF_SERVICE);
                }
            }
            arrayList.add(bagd.SETTING_LEARN_MORE_BUSINESS_MESSAGING);
            return ekgb.n(arrayList);
        }
        boolean z = uqcVar.c.c;
        boolean z2 = false;
        if (bindDataA != null && bageVar.b().k() == 0) {
            z2 = true;
        }
        boolean zJ = bageVar.j();
        ArrayList arrayList2 = new ArrayList(bagd.a());
        if (z2) {
            arrayList2.remove(bagd.SETTING_SPAM_REPORTING);
        } else {
            arrayList2.remove(bagd.SETTING_XMS_MODE);
            arrayList2.remove(bagd.SETTING_BLOCKED);
            arrayList2.remove(bagd.SETTING_SECURITY_KEY);
        }
        if (!z) {
            arrayList2.remove(bagd.SETTING_XMS_MODE);
            arrayList2.remove(bagd.SETTING_SECURITY_KEY);
        }
        if (!zJ) {
            arrayList2.remove(bagd.SETTING_SECURITY_KEY);
        }
        if (!zL) {
            arrayList2.remove(bagd.SETTING_NOTIFICATION);
        }
        return ekgb.n(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(ConversationSettingsOptionItemView conversationSettingsOptionItemView, int i) throws Resources.NotFoundException {
        conversationSettingsOptionItemView.d.b(this.a, (bagd) l().get(i));
        conversationSettingsOptionItemView.a.setText(conversationSettingsOptionItemView.d.b);
        conversationSettingsOptionItemView.a.setContentDescription(conversationSettingsOptionItemView.d.b);
        String str = conversationSettingsOptionItemView.d.c;
        if (TextUtils.isEmpty(str)) {
            conversationSettingsOptionItemView.b.setVisibility(8);
        } else {
            conversationSettingsOptionItemView.b.setVisibility(0);
            conversationSettingsOptionItemView.b.setText(str);
        }
        if (conversationSettingsOptionItemView.d.e) {
            conversationSettingsOptionItemView.c.setVisibility(0);
            conversationSettingsOptionItemView.c.setChecked(conversationSettingsOptionItemView.d.f);
        } else {
            conversationSettingsOptionItemView.c.setVisibility(8);
        }
        boolean z = conversationSettingsOptionItemView.d.g;
        if (z != conversationSettingsOptionItemView.isEnabled()) {
            conversationSettingsOptionItemView.a.setEnabled(z);
            conversationSettingsOptionItemView.b.setEnabled(z);
            conversationSettingsOptionItemView.c.setEnabled(z);
            conversationSettingsOptionItemView.setAlpha(true != z ? 0.5f : 1.0f);
            conversationSettingsOptionItemView.setEnabled(z);
        }
        boolean z2 = conversationSettingsOptionItemView.d.i;
        if (z2 != (conversationSettingsOptionItemView.getVisibility() == 0)) {
            conversationSettingsOptionItemView.setVisibility(true == z2 ? 0 : 8);
        }
    }

    @Override // defpackage.vo
    public final int a() {
        if (this.a == null) {
            return 0;
        }
        return l().size();
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return R.layout.conversation_settings_option_item_view;
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        return new uqk(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }

    @Override // defpackage.vo
    public final void g(wv wvVar, int i) throws Resources.NotFoundException {
        G(((uqk) wvVar).s, i);
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        return 2131624164L;
    }

    final ekgb l() {
        return F(this.a);
    }
}
