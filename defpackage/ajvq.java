package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajvq implements anpj {
    public final anpj a;
    public final anpj b;
    private final fdjx c;

    public ajvq(fdjx fdjxVar, anpj anpjVar, anpj anpjVar2) {
        fdjxVar.getClass();
        anpjVar.getClass();
        anpjVar2.getClass();
        this.c = fdjxVar;
        this.a = anpjVar;
        this.b = anpjVar2;
    }

    @Override // defpackage.anpj
    public final cquc a(anpi anpiVar) {
        return cqty.b(this.a.a(anpiVar), this.b.a(anpiVar));
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new ajvp(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new fcth("An operation is not implemented: Can't be implemented until BugleConversationPropertiesSupplier#getBlocking");
    }
}
