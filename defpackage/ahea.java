package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahea extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ aher d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahea(aher aherVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.d = aherVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ahea aheaVar = new ahea(this.d, (fcxy) obj3);
        aheaVar.b = (ajlh) obj;
        aheaVar.c = (ResolvedRecipient) obj2;
        return aheaVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18, types: [ajlh, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r11 = this.b;
            Object obj2 = this.c;
            if (obj2 == null) {
                ekrw ekrwVarH = aher.a.h();
                ekrwVarH.X(eksq.a, "BugleProfiles");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/profile/sendingas/SendingAsUiAdapterImpl$getSendingAsUiData$2", "invokeSuspend", 113, "SendingAsUiAdapterImpl.kt")).q("Not showing sending as, need eligible recipient to share to for first time");
                return null;
            }
            ekrw ekrwVarH2 = aher.a.h();
            ekrwVarH2.X(eksq.a, "BugleProfiles");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/profile/sendingas/SendingAsUiAdapterImpl$getSendingAsUiData$2", "invokeSuspend", 117, "SendingAsUiAdapterImpl.kt")).q("Checking profile sharing constraints");
            aher aherVar = this.d;
            ekgb ekgbVarR = ekgb.r(obj2);
            ekgbVarR.getClass();
            this.b = null;
            this.a = 1;
            obj = aherVar.g.a(r11, ekgbVarR, aherVar.j, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        chps chpsVar = (chps) obj;
        chpr chprVar = chpsVar.a;
        if (chprVar != chpr.b) {
            ekrw ekrwVarH3 = aher.a.h();
            ekrwVarH3.X(eksq.a, "BugleProfiles");
            ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/profile/sendingas/SendingAsUiAdapterImpl$getSendingAsUiData$2", "invokeSuspend", 127, "SendingAsUiAdapterImpl.kt")).t("Not showing sending as, unable to share profile: %s", chprVar);
            return null;
        }
        chpt chptVar = chpsVar.b;
        if (chptVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        aofd aofdVar = chptVar.f;
        if (!aofdVar.b().isPresent() && !aofdVar.c().isPresent()) {
            ekrw ekrwVarH4 = aher.a.h();
            ekrwVarH4.X(eksq.a, "BugleProfiles");
            ((ekrd) ekrwVarH4.h("com/google/android/apps/messaging/profile/sendingas/SendingAsUiAdapterImpl$getSendingAsUiData$2", "invokeSuspend", 136, "SendingAsUiAdapterImpl.kt")).q("Not showing sending as, self profile missing photo or name");
            return null;
        }
        ekrw ekrwVarH5 = aher.a.h();
        ekrwVarH5.X(eksq.a, "BugleProfiles");
        ((ekrd) ekrwVarH5.h("com/google/android/apps/messaging/profile/sendingas/SendingAsUiAdapterImpl$getSendingAsUiData$2", "invokeSuspend", 140, "SendingAsUiAdapterImpl.kt")).q("Ready to show sending as");
        String str = (String) aofdVar.b().get();
        aher aherVar2 = this.d;
        return new ahes(str, aherVar2.h.a((Uri) aofdVar.c().get(), true));
    }
}
