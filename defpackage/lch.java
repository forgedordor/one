package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class lch implements lci {
    public final /* synthetic */ lci a;
    public final /* synthetic */ lci b;

    public /* synthetic */ lch(lci lciVar, lci lciVar2) {
        this.a = lciVar;
        this.b = lciVar2;
    }

    @Override // defpackage.lci
    public final /* synthetic */ lci a(lci lciVar) {
        return new lch(this, lciVar);
    }

    @Override // defpackage.lci
    public final boolean b(Object obj) {
        return this.a.b(obj) || this.b.b(obj);
    }
}
