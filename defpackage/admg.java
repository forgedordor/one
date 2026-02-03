package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class admg {
    public static final cczv a;
    public static final ejxr b;

    static {
        cdag.e(cdag.b, "conversation_default_label", SuperSortLabel.ALL.i);
        a = cdag.m(cdag.b, "conversation_labels_enabled", false);
        cdag.d(cdag.b, "processed_messages_threshold", 0.5f);
        cdag.d(cdag.b, "processed_messages_max_sorting_notice", 0.8f);
        cdag.g(cdag.b, "supersort_mapping_strategy", "contactsToPersonalDefaultToMore");
        cdag.g(cdag.b, "supersort_model_id", "");
        cdag.g(cdag.b, "supersort_intent_label_mapping", "");
        cdag.h(cdag.b, "supersort_enable_update_donation_banner", false);
        cdag.w(185831101, "supersort_enable_primary_view_banner");
        b = cdag.x("supersort_enable_otp_banner_in_business_updates");
        cdag.e(cdag.b, "supersort_hide_category_scheme", 0);
        ekgi ekgiVar = new ekgi();
        ekgiVar.i(SuperSortLabel.BUSINESS_UPDATE, 16);
        ekgiVar.i(SuperSortLabel.TRANSACTION, 1);
        ekgiVar.i(SuperSortLabel.UPDATE, 2);
        ekgiVar.i(SuperSortLabel.OTP, 4);
        ekgiVar.i(SuperSortLabel.PROMOTION, 8);
        ekgiVar.c();
        cdag.w(187727046, "supersort_default_to_all_if_personal_is_empty");
        cdag.h(cdag.b, "supersort_enable_attaching_psd", false);
        cdag.g(cdag.b, "supersort_grammars_mdd_group_name", "supersort_india_grammars");
        cdag.x("supersort_badge_all_filter");
        cdag.x("chip_width_adjustments");
    }

    public static boolean a() {
        return ((Boolean) a.e()).booleanValue();
    }

    public static boolean b() {
        return ((Boolean) ((cczi) b.get()).e()).booleanValue();
    }
}
