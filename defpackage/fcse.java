package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcse implements fbsn {
    public final fcsc a;

    public fcse(fcsc fcscVar) {
        this.a = fcscVar;
    }

    @Override // defpackage.fbsn
    public final fbsl a(fbsm fbsmVar, fbrg fbrgVar) {
        ejwl.b(fbsmVar.d().a.a(), "asyncUnaryRequestCall is only for clientSendsOneMessage methods");
        fcsb fcsbVar = new fcsb(fbsmVar);
        fbsmVar.g(2);
        return new fcsd(this, fcsbVar, fbsmVar);
    }
}
