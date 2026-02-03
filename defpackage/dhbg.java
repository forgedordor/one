package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhbg implements eora {
    final /* synthetic */ dgzn a;
    final /* synthetic */ dhbi b;

    public dhbg(dhbi dhbiVar, dgzn dgznVar) {
        this.a = dgznVar;
        this.b = dhbiVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) throws NumberFormatException {
        dewi dewiVar = (dewi) obj;
        if (dewiVar == dewi.INFO_LOCALLY_AVAILABLE) {
            this.b.b.v((dhat) this.a);
        } else {
            if (dewiVar == dewi.SERVER_ERROR) {
                dhja.q("Server error retrieving business info, rejecting session.", new Object[0]);
                dgzn dgznVar = this.a;
                dgznVar.j();
                dgznVar.aT(dgzl.BUSINESS_INFO_SERVER_ERROR);
                return;
            }
            dhja.q("Client error retrieving business info, rejecting session.", new Object[0]);
            dgzn dgznVar2 = this.a;
            dgznVar2.j();
            dgznVar2.aT(dgzl.BUSINESS_INFO_CLIENT_ERROR);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        dhja.i(th, "Client error retrieving business info, rejecting session.", new Object[0]);
        dgzn dgznVar = this.a;
        dgznVar.j();
        dgznVar.aT(dgzl.BUSINESS_INFO_CLIENT_ERROR);
    }
}
