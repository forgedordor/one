package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abwz implements efzm {
    final /* synthetic */ abxa a;

    public abwz(abxa abxaVar) {
        this.a = abxaVar;
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        abxa abxaVar = this.a;
        if (((aram) abxaVar.c.b()).a()) {
            ekrw ekrwVarH = abxa.a.h();
            ekrwVarH.X(eksq.a, "BugleAccountSignOut");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(new ekrz("account_id", efwo.class, false, false), efzkVar.a());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/gaia/BackstackAccountSwitcherImpl$1", "onAccountChanged", 86, "BackstackAccountSwitcherImpl.java")).q("BackstackSwitcher: onAccountChanged");
        }
        abxaVar.d = efzkVar.a();
        abxaVar.b.a = efzkVar.a();
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        abxa abxaVar = this.a;
        if (((aram) abxaVar.c.b()).a()) {
            ekrw ekrwVarJ = abxa.a.j();
            ekrwVarJ.X(eksq.a, "BugleAccountSignOut");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(efygVar)).h("com/google/android/apps/messaging/gaia/BackstackAccountSwitcherImpl$1", "onNoAccountAvailable", '_', "BackstackAccountSwitcherImpl.java")).q("BackstackSwitcher: onNoAccountAvailable error");
        }
        abxaVar.b.a = null;
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void d() {
    }
}
