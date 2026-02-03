package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abyl implements ehay {
    final /* synthetic */ abym a;

    public abyl(abym abymVar) {
        this.a = abymVar;
    }

    @Override // defpackage.ehay
    public final void a(Throwable th) {
        if (cpyl.a()) {
            ekrw ekrwVarJ = abym.c.j();
            ekrwVarJ.X(eksq.a, "BugleCms");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/gaia/apd/BugleNonAccountScopedOGParticleDiscActionFragmentPeer$AccountMenuCardEntryPointUiDataCallback", "onLoadError", (char) 385, "BugleNonAccountScopedOGParticleDiscActionFragmentPeer.java")).q("No linked account or failed to get linked account. Backup sync card will unconditionally refresh.");
            this.a.r = false;
        }
    }

    @Override // defpackage.ehay
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        if (cpyl.a()) {
            ekrw ekrwVarE = abym.c.e();
            ekrwVarE.X(eksq.a, "BugleCms");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/gaia/apd/BugleNonAccountScopedOGParticleDiscActionFragmentPeer$AccountMenuCardEntryPointUiDataCallback", "onLoaded", 377, "BugleNonAccountScopedOGParticleDiscActionFragmentPeer.java")).q("retrieved linked account for backup sync card refresh.");
            this.a.r = bool;
        }
    }
}
