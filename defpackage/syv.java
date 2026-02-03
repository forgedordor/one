package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class syv implements anpi {
    final /* synthetic */ syw a;

    public syv(syw sywVar) {
        this.a = sywVar;
    }

    @Override // defpackage.anpi
    public final eiju a() {
        syw sywVar = this.a;
        if (sywVar.g != null) {
            ekrw ekrwVarE = syw.d.e();
            ekrwVarE.X(eksq.a, "BugleAppOnAuto");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/auto/MessagingTemplateScreen$TopConversationsDataChangedHandler", "onChanged", 585, "MessagingTemplateScreen.java")).q("Conversations changed, refreshing auto UI");
            sywVar.o.set(true);
            sywVar.c();
        }
        return eijx.e(null);
    }
}
