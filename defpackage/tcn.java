package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class tcn extends fdbb implements fdau {
    public tcn(Object obj) {
        super(3, obj, tcx.class, "hideBannersIfScamAlertCardEligible", "hideBannersIfScamAlertCardEligible(Ljava/util/List;Z)Ljava/util/List;", 4);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (!((Boolean) ((cczi) crbf.by.get()).e()).booleanValue() || !zBooleanValue) {
            return list;
        }
        ((ekrd) tcx.a.h().h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "hideBannersIfScamAlertCardEligible", 134, "BannersUiAdapterImpl.kt")).q("Banners are disabled because alert card is eligible");
        return fcvo.a;
    }
}
