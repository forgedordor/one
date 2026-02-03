package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eawt implements eawu {
    private static final Integer a = 79508299;
    private final dbgt b;
    private final dtbl c;

    public eawt(dbgt dbgtVar, dtbl dtblVar) {
        this.b = dbgtVar;
        this.c = dtblVar;
    }

    @Override // defpackage.eawu
    public final void a(eogr eogrVar) {
        eork.r(this.c.a(), new eaws(this, eogrVar), eoqg.a);
    }

    public final void b(eogr eogrVar) {
        eogw eogwVar = (eogw) eogrVar.build();
        emlv emlvVar = (emlv) emlx.a.createBuilder();
        emlvVar.copyOnWrite();
        emlx emlxVar = (emlx) emlvVar.instance;
        emlxVar.c = 1;
        emlxVar.b = 1 | emlxVar.b;
        emlvVar.copyOnWrite();
        emlx emlxVar2 = (emlx) emlvVar.instance;
        eogwVar.getClass();
        emlxVar2.d = eogwVar;
        emlxVar2.b |= 2;
        this.b.a(new dbgn((emlx) emlvVar.build(), new dbgo(a)));
    }
}
