package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnwz implements cmit {
    final /* synthetic */ cnxa a;

    public cnwz(cnxa cnxaVar) {
        this.a = cnxaVar;
    }

    @Override // defpackage.cmit
    public final Optional a() {
        cnwk cnwkVar = (cnwk) cnwl.a.createBuilder();
        crqv crqvVar = this.a.e;
        if (crqvVar.p("bugle_full_sync_in_progress")) {
            boolean zQ = crqvVar.q("bugle_full_sync_in_progress", false);
            cnwkVar.copyOnWrite();
            cnwl cnwlVar = (cnwl) cnwkVar.instance;
            cnwlVar.b |= 1;
            cnwlVar.c = zQ;
        }
        if (crqvVar.p("last_full_sync_time_millis")) {
            evvp evvpVarC = evxc.c(crqvVar.e("last_full_sync_time_millis", -1L));
            cnwkVar.copyOnWrite();
            cnwl cnwlVar2 = (cnwl) cnwkVar.instance;
            evvpVarC.getClass();
            cnwlVar2.d = evvpVarC;
            cnwlVar2.b |= 2;
        }
        if (crqvVar.p("last_sync_time_millis")) {
            evvp evvpVarC2 = evxc.c(crqvVar.e("last_sync_time_millis", -1L));
            cnwkVar.copyOnWrite();
            cnwl cnwlVar3 = (cnwl) cnwkVar.instance;
            evvpVarC2.getClass();
            cnwlVar3.e = evvpVarC2;
            cnwlVar3.b |= 4;
        }
        return Optional.of((cnwl) cnwkVar.build());
    }

    @Override // defpackage.cmis
    public final void c() {
        ((ains) this.a.f.b()).c("Bugle.ForwardSync.SettingsStore.Migration.Count");
    }

    @Override // defpackage.cmit
    public final void b() {
    }
}
