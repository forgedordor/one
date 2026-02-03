package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eaws implements eora {
    final /* synthetic */ eogr a;
    final /* synthetic */ eawt b;

    public eaws(eawt eawtVar, eogr eogrVar) {
        this.a = eogrVar;
        this.b = eawtVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = (String) obj;
        if (!str.isEmpty()) {
            eogr eogrVar = this.a;
            exaz exazVar = (exaz) exba.a.createBuilder();
            exazVar.copyOnWrite();
            exba exbaVar = (exba) exazVar.instance;
            str.getClass();
            exbaVar.b |= 4;
            exbaVar.c = str;
            eogrVar.copyOnWrite();
            eogw eogwVar = (eogw) eogrVar.instance;
            exba exbaVar2 = (exba) exazVar.build();
            eogw eogwVar2 = eogw.a;
            exbaVar2.getClass();
            eogwVar.p = exbaVar2;
            eogwVar.c |= 2;
        }
        this.b.b(this.a);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        this.b.b(this.a);
    }
}
