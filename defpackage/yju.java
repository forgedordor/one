package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yju implements fdpm {
    final /* synthetic */ yka a;

    public yju(yka ykaVar) {
        this.a = ykaVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        ((Boolean) obj).booleanValue();
        ekrg ekrgVar = yka.a;
        ekrd ekrdVar = (ekrd) ekrgVar.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataPreloaderImpl$1$4", "emit", 88, "MessageUiDataPreloaderImpl.kt");
        Set set = this.a.c;
        ekrdVar.r("MessageUiDataPreloader: Screen is idle kicking off preloading of %s lazy messages", set.size());
        set.getClass();
        ekhx ekhxVarF = ekfv.f(set);
        ekqg ekqgVarListIterator = ekhxVarF.listIterator();
        ekqgVarListIterator.getClass();
        while (ekqgVarListIterator.hasNext()) {
            yjh yjhVar = (yjh) ekqgVarListIterator.next();
            if (yjhVar.a.b()) {
                ((ekrd) ekrgVar.e().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataPreloaderImpl$1$4", "emit", 103, "MessageUiDataPreloaderImpl.kt")).t("MessageUiDataPreloader: %s Already loaded.", ((yis) yjhVar.b().b()).b());
            } else {
                ((ekrd) ekrgVar.e().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataPreloaderImpl$1$4", "emit", 99, "MessageUiDataPreloaderImpl.kt")).t("MessageUiDataPreloader: %s Finished loading.", ((yis) yjhVar.b().b()).b());
            }
        }
        set.removeAll(ekhxVarF);
        return fctx.a;
    }
}
