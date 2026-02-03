package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class ataf extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auib auibVar = (auib) obj;
        fhay fhayVar = (fhay) fhaz.a.createBuilder();
        if ((auibVar.b & 1) != 0) {
            String str = auibVar.c;
            fhayVar.copyOnWrite();
            fhaz fhazVar = (fhaz) fhayVar.instance;
            str.getClass();
            fhazVar.b = str;
        }
        return (fhaz) fhayVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        auia auiaVar = (auia) auib.a.createBuilder();
        String str = ((fhaz) obj).b;
        auiaVar.copyOnWrite();
        auib auibVar = (auib) auiaVar.instance;
        str.getClass();
        auibVar.b |= 1;
        auibVar.c = str;
        return (auib) auiaVar.build();
    }
}
