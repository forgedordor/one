package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abrz implements abpm {
    private final abru a;

    public abrz(abru abruVar) {
        this.a = abruVar;
    }

    @Override // defpackage.abpm
    public final eiju a(eppi eppiVar, eppj eppjVar) {
        eppv eppvVar = eppiVar.b == 104 ? (eppv) eppiVar.c : eppv.a;
        if (eppvVar.equals(eppv.a)) {
            throw new IllegalStateException("Request has incorrect payload");
        }
        abru abruVar = this.a;
        epnw epnwVar = eppvVar.b;
        if (epnwVar == null) {
            epnwVar = epnw.a;
        }
        String str = epnwVar.d;
        epnw epnwVar2 = eppvVar.b;
        String str2 = (epnwVar2 == null ? epnw.a : epnwVar2).b;
        if (epnwVar2 == null) {
            epnwVar2 = epnw.a;
        }
        abruVar.f(str, str2, epnwVar2.c);
        evrl evrlVar = evrl.a;
        eppjVar.copyOnWrite();
        eppl epplVar = (eppl) eppjVar.instance;
        eppl epplVar2 = eppl.a;
        evrlVar.getClass();
        epplVar.c = evrlVar;
        epplVar.b = 104;
        return eijx.e(eppjVar.build());
    }
}
