package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwr implements hnx {
    final /* synthetic */ iac a;
    final /* synthetic */ Object b;
    final /* synthetic */ cxg c;

    public cwr(iac iacVar, Object obj, cxg cxgVar) {
        this.a = iacVar;
        this.b = obj;
        this.c = cxgVar;
    }

    @Override // defpackage.hnx
    public final void a() {
        iac iacVar = this.a;
        Object obj = this.b;
        iacVar.remove(obj);
        this.c.d.b(obj);
    }
}
