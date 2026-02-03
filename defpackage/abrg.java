package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abrg implements abpm {
    private final abru a;

    public abrg(abru abruVar) {
        this.a = abruVar;
    }

    @Override // defpackage.abpm
    public final eiju a(eppi eppiVar, eppj eppjVar) {
        epob epobVar = eppiVar.b == 106 ? (epob) eppiVar.c : epob.a;
        if (epobVar.b.isEmpty()) {
            this.a.b();
        } else {
            this.a.c(epobVar.b);
        }
        evrl evrlVar = evrl.a;
        eppjVar.copyOnWrite();
        eppl epplVar = (eppl) eppjVar.instance;
        eppl epplVar2 = eppl.a;
        evrlVar.getClass();
        epplVar.c = evrlVar;
        epplVar.b = 106;
        return eijx.e(eppjVar.build());
    }
}
