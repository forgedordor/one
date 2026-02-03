package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class tcm extends fdbb implements fdau {
    public tcm(Object obj) {
        super(3, obj, tcx.class, "ensureBannersEnabled", "ensureBannersEnabled(Ljava/util/List;Z)Ljava/util/List;", 4);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (zBooleanValue) {
            return list;
        }
        ((ekrd) tcx.a.h().h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "ensureBannersEnabled", 124, "BannersUiAdapterImpl.kt")).q("Banners are disabled");
        return fcvo.a;
    }
}
