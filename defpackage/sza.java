package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.auto.MessagingTemplateScreenServiceModule;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sza extends cly {
    final /* synthetic */ MessagingTemplateScreenServiceModule c;

    public sza(MessagingTemplateScreenServiceModule messagingTemplateScreenServiceModule) {
        this.c = messagingTemplateScreenServiceModule;
    }

    @Override // defpackage.cly
    public final clu c() {
        ekrw ekrwVarE = MessagingTemplateScreenServiceModule.c.e();
        ekrwVarE.X(eksq.a, "BugleAppOnAuto");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/auto/MessagingTemplateScreenServiceModule$1", "onCreateScreen", 73, "MessagingTemplateScreenServiceModule.java")).q("CarAppService onCreateScreen");
        MessagingTemplateScreenServiceModule messagingTemplateScreenServiceModule = this.c;
        syx syxVar = (syx) messagingTemplateScreenServiceModule.d.b();
        fcsu fcsuVar = syxVar.a;
        clg clgVarA = a();
        Context context = (Context) fcsuVar.b();
        context.getClass();
        fcsu fcsuVar2 = syxVar.b;
        eosc eoscVar = (eosc) syxVar.c.b();
        eoscVar.getClass();
        messagingTemplateScreenServiceModule.h = new syw(context, fcsuVar2, eoscVar, syxVar.d, syxVar.e, syxVar.f, syxVar.g, syxVar.h, syxVar.i, syxVar.j, clgVarA);
        return messagingTemplateScreenServiceModule.h;
    }
}
