package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abjr implements adi {
    final /* synthetic */ abjq a;

    public abjr(abjq abjqVar) {
        this.a = abjqVar;
    }

    @Override // defpackage.adi
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        adh adhVar = (adh) obj;
        abjq abjqVar = this.a;
        fcsu fcsuVar = abjqVar.f;
        if (fcsuVar == null) {
            abjq.a.r("dittoExtensionsProvider is null.");
            return;
        }
        Optional optional = (Optional) fcsuVar.b();
        if (optional.isEmpty()) {
            abjq.a.r("dittoExtensions is empty.");
            return;
        }
        if (adhVar.a != -1) {
            abjq.a.p("Show switcher since user denied set as default sms.");
            ((abdk) optional.get()).h(true);
            return;
        }
        cqce cqceVar = abjq.a;
        cqceVar.p("successfully set as default sms");
        if (((abdk) optional.get()).l()) {
            cqceVar.p("Show switcher since there is valid phone number.");
            ((abdk) optional.get()).h(true);
            return;
        }
        cqceVar.p("Stay in Ditto since there is no valid phone number.");
        fcsu fcsuVar2 = abjqVar.g;
        if (fcsuVar2 == null) {
            cqceVar.r("satelliteDataServiceProvider is null.");
            return;
        }
        Optional optional2 = (Optional) fcsuVar2.b();
        if (optional2.isEmpty()) {
            cqceVar.r("satelliteDataService is empty.");
        } else {
            ((abgm) optional2.get()).c(abgx.REMOTE).k(auvh.b(), eoqg.a);
        }
    }
}
