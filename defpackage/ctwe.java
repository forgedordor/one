package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class ctwe extends fdbb implements fdaw {
    public ctwe(Object obj) {
        super(5, obj, ctwh.class, "transformToDialogUiData", "transformToDialogUiData(ZZLcom/google/android/apps/messaging/startchat/rcs/RcsGroupChatCapabilityCollector$GroupLimitExcludingSelf;Lcom/google/android/apps/messaging/startchat/rcs/RcsGroupChatCapabilityCollector$CombinedChipData;)Lcom/google/android/libraries/communications/ux/components/dialog/DialogUiData$Alert;", 4);
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        ctvx ctvxVar = (ctvx) obj3;
        ctvw ctvwVar = (ctvw) obj4;
        final ctwh ctwhVar = (ctwh) this.b;
        if (zBooleanValue) {
            int i = ctvxVar.a;
            List list = ctvwVar.c;
            if (i < list.size()) {
                return ctwhVar.c((ChipData) fcva.S(list), i);
            }
        }
        if (!zBooleanValue) {
            int i2 = ctvxVar.b;
            List list2 = ctvwVar.c;
            if (i2 < list2.size()) {
                return ctwhVar.c((ChipData) fcva.S(list2), i2);
            }
        }
        if (!zBooleanValue) {
            List list3 = ctvwVar.a;
            if (!list3.isEmpty()) {
                if (list3.size() > 1) {
                    cqbd cqbdVarE = ctwh.a.e();
                    cqbdVarE.I("More than 1 non-Rcs contact were detected");
                    cqbdVarE.r();
                }
                final ChipData chipData = (ChipData) list3.get(0);
                String string = ctwhVar.c.getString(R.string.create_new_group_message_v2);
                string.getClass();
                return ctwhVar.b(string, fcvo.a, new fdae() { // from class: ctvp
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ctwhVar.j.f(true);
                        return fctx.a;
                    }
                }, new fdae() { // from class: ctvq
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ctwhVar.d.c(chipData);
                        return fctx.a;
                    }
                });
            }
        }
        if (zBooleanValue2) {
            return null;
        }
        List list4 = ctvwVar.b;
        if (list4.isEmpty() || !ctvwVar.a.isEmpty()) {
            return null;
        }
        if (list4.size() > 1) {
            cqbd cqbdVarE2 = ctwh.a.e();
            cqbdVarE2.I("More than 1 non-E2ee contact were detected");
            cqbdVarE2.r();
        }
        final ChipData chipData2 = (ChipData) list4.get(0);
        Context context = ctwhVar.c;
        String strA = cpef.a(context);
        String string2 = context.getString(R.string.contact_picker_downgrade_to_non_e2ee_group_alert_message_with_learn_more, chipData2.b, strA);
        string2.getClass();
        final String str = (String) bvur.b.e();
        str.getClass();
        strA.getClass();
        return ctwhVar.b(string2, fcva.b(new diio(str, fdgn.O(string2, strA, 0, false, 6), fdgn.O(string2, strA, 0, false, 6) + strA.length(), new fdap() { // from class: ctvt
            @Override // defpackage.fdap
            public final Object invoke(Object obj6) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                ctwhVar.c.startActivity(intent);
                return true;
            }
        }, 24)), new fdae() { // from class: ctvu
            @Override // defpackage.fdae
            public final Object invoke() {
                ctwh ctwhVar2 = ctwhVar;
                ctwhVar2.i.e("Bugle.Contact.Picker.Non.E2EE.Group.Alert.Click.Count", 0);
                ctwhVar2.k.f(true);
                return fctx.a;
            }
        }, new fdae() { // from class: ctvv
            @Override // defpackage.fdae
            public final Object invoke() {
                ctwh ctwhVar2 = ctwhVar;
                ctwhVar2.i.e("Bugle.Contact.Picker.Non.E2EE.Group.Alert.Click.Count", 1);
                ctwhVar2.d.c(chipData2);
                return fctx.a;
            }
        });
    }
}
