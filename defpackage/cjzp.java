package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjzp implements cmit {
    final /* synthetic */ fcsu a;
    final /* synthetic */ fcsu b;

    public cjzp(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    @Override // defpackage.cmit
    public final Optional a() {
        ckbx ckbxVar = (ckbx) ckce.a.createBuilder();
        ckbxVar.getClass();
        ckbz ckbzVar = ((chvg) this.a.b()).d() ? ckbz.TOGGLE_STATE_ENABLED : ckbz.TOGGLE_STATE_USER_DISABLED;
        ckbzVar.getClass();
        ckbxVar.copyOnWrite();
        ckce ckceVar = (ckce) ckbxVar.instance;
        ckceVar.e = ckbzVar.e;
        ckceVar.b |= 2;
        evsn evsnVarBuild = ckbxVar.build();
        evsnVarBuild.getClass();
        return Optional.of((ckce) evsnVarBuild);
    }

    @Override // defpackage.cmis
    public final void c() {
        ((ains) this.b.b()).c("Bugle.Rcs.Settings.Data.Migration.Counts");
    }

    @Override // defpackage.cmit
    public final void b() {
    }
}
