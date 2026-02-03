package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abqx extends ppl {
    final /* synthetic */ abqy a;

    public abqx(abqy abqyVar) {
        this.a = abqyVar;
    }

    @Override // defpackage.ppl
    public final void a(ppk ppkVar) {
        abqy.a.p("Received channel message");
        String strB = ejwk.b(ppkVar.a());
        abqy abqyVar = this.a;
        abqyVar.g.b(strB, abqyVar.e);
    }
}
