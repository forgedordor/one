package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cnaa extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ezol ezolVar = (ezol) obj;
        aubn aubnVar = (aubn) aubq.a.createBuilder();
        c(ezolVar, aubnVar);
        String str = ezolVar.c;
        aubnVar.copyOnWrite();
        aubq aubqVar = (aubq) aubnVar.instance;
        str.getClass();
        aubqVar.b |= 2;
        aubqVar.d = str;
        return (aubq) aubnVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        aubq aubqVar = (aubq) obj;
        ezok ezokVarE = e();
        if ((aubqVar.b & 1) != 0) {
            d(aubqVar, ezokVarE);
        }
        if ((aubqVar.b & 2) != 0) {
            String str = aubqVar.d;
            ezokVarE.copyOnWrite();
            ezol ezolVar = (ezol) ezokVarE.instance;
            ezol ezolVar2 = ezol.a;
            str.getClass();
            ezolVar.c = str;
        }
        return (ezol) ezokVarE.build();
    }

    public abstract void c(ezol ezolVar, aubn aubnVar);

    public abstract void d(aubq aubqVar, ezok ezokVar);

    public ezok e() {
        throw null;
    }
}
