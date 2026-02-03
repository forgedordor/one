package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avnt {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/conversation/draft/ComposeRowStateKt");

    public static final ComposeRowState a(lwn lwnVar) {
        ComposeRowState composeRowState = (ComposeRowState) lwnVar.b("compose_row_state");
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleComposeRow2");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.Z(eksk.SMALL);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/conversation/draft/ComposeRowStateKt", "getComposeRowState", 125, "ComposeRowState.kt")).t("SavedStateHandle.getComposeRowState %s", composeRowState);
        return composeRowState;
    }

    public static final ComposeRowState b(Intent intent) {
        intent.getClass();
        ComposeRowState composeRowState = (ComposeRowState) (Build.VERSION.SDK_INT > 33 ? (Parcelable) intent.getParcelableExtra("compose_row_state", ComposeRowState.class) : intent.getParcelableExtra("compose_row_state"));
        intent.removeExtra("compose_row_state");
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleComposeRow2");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.Z(eksk.SMALL);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/conversation/draft/ComposeRowStateKt", "removeComposeRowState", 90, "ComposeRowState.kt")).t("Intent.removeComposeRowState %s", composeRowState);
        return composeRowState;
    }

    public static final ComposeRowState c(lwn lwnVar) {
        ComposeRowState composeRowState = (ComposeRowState) lwnVar.c("compose_row_state");
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleComposeRow2");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.Z(eksk.SMALL);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/conversation/draft/ComposeRowStateKt", "removeComposeRowState", 134, "ComposeRowState.kt")).t("SavedStateHandle.removeComposeRowState %s", composeRowState);
        return composeRowState;
    }

    public static final void d(Intent intent, ComposeRowState composeRowState) {
        intent.getClass();
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleComposeRow2");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.Z(eksk.SMALL);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/conversation/draft/ComposeRowStateKt", "putComposeRowState", 99, "ComposeRowState.kt")).t("Intent.putComposeRowState %s", composeRowState);
        intent.putExtra("compose_row_state", composeRowState).getClass();
    }
}
