package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eaxe {
    public final int a = 11;
    public final int b = 12;
    public final eqsf c;
    public final eqsf d;

    public eaxe(eqsf eqsfVar, eqsf eqsfVar2) {
        this.c = eqsfVar;
        this.d = eqsfVar2;
    }

    public static ejqy a(evuh evuhVar, int i, eqsf eqsfVar, byte[] bArr, evqs evqsVar) {
        byte[] bArrA = eqsfVar.a(evuhVar.toByteArray(), bArr);
        ejqx ejqxVar = (ejqx) ejqy.a.createBuilder();
        evqs evqsVarX = evqs.x(bArrA);
        ejqxVar.copyOnWrite();
        ((ejqy) ejqxVar.instance).d = evqsVarX;
        ejqxVar.copyOnWrite();
        ((ejqy) ejqxVar.instance).b = i;
        ejqxVar.copyOnWrite();
        ejqy ejqyVar = (ejqy) ejqxVar.instance;
        evqsVar.getClass();
        ejqyVar.c = evqsVar;
        return (ejqy) ejqxVar.build();
    }
}
