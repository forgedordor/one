package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pp implements oo {
    final /* synthetic */ ps a;

    public pp(ps psVar) {
        this.a = psVar;
    }

    @Override // defpackage.oo
    public final void a(oc ocVar, boolean z) {
        if (ocVar instanceof ox) {
            ocVar.a().i(false);
        }
        oo ooVar = this.a.e;
        if (ooVar != null) {
            ooVar.a(ocVar, z);
        }
    }

    @Override // defpackage.oo
    public final boolean b(oc ocVar) {
        ps psVar = this.a;
        if (ocVar == psVar.c) {
            return false;
        }
        psVar.n = ((ox) ocVar).m.a;
        oo ooVar = psVar.e;
        if (ooVar != null) {
            return ooVar.b(ocVar);
        }
        return false;
    }
}
