package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.RebuildShortcutsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axzh implements eora {
    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((eksl) ((eksl) RebuildShortcutsAction.a.h()).h("com/google/android/apps/messaging/shared/datamodel/action/RebuildShortcutsAction$1", "onSuccess", 125, "RebuildShortcutsAction.java")).q("Successfully finished rebuilding shortcuts");
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((eksl) ((eksl) ((eksl) RebuildShortcutsAction.a.j()).g(th)).h("com/google/android/apps/messaging/shared/datamodel/action/RebuildShortcutsAction$1", "onFailure", (char) 130, "RebuildShortcutsAction.java")).q("Error rebuilding shortcuts");
    }
}
