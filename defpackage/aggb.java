package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aggb implements afyw {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/navigation/targets/StartChatNavigationHandler");
    private final Context b;
    private final efwo c;

    public aggb(Context context, fcsu fcsuVar, efwo efwoVar) {
        fcsuVar.getClass();
        efwoVar.getClass();
        this.b = context;
        this.c = efwoVar;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        ctia ctiaVar = ((agga) afzvVar).a;
        ComponentCallbacks2 componentCallbacks2A = daiy.a(this.b);
        if (componentCallbacks2A == null) {
            throw new IllegalArgumentException("StartChatNavigationHandler must be created with an activity context.");
        }
        Object objH = componentCallbacks2A instanceof ehlg ? ((ehlg) componentCallbacks2A).H() : null;
        if (objH == null || !(objH instanceof ctiv)) {
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "StartChat");
            ((ekrd) ekrwVarI.h("com/google/android/apps/messaging/navigation/targets/StartChatNavigationHandler", "handleGroupRename", 106, "StartChat.kt")).q("Activity to host group name edit was not found");
        } else {
            ((ctiv) objH).a(ctiaVar.a, ctiaVar.b, ctiaVar.c, this.c);
        }
        return fctx.a;
    }
}
