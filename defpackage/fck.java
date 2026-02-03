package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fck implements hnx {
    final /* synthetic */ hox a;
    final /* synthetic */ ebk b;

    public fck(hox hoxVar, ebk ebkVar) {
        this.a = hoxVar;
        this.b = ebkVar;
    }

    @Override // defpackage.hnx
    public final void a() {
        hox hoxVar = this.a;
        ebm ebmVar = (ebm) hoxVar.a();
        if (ebmVar != null) {
            ebl eblVar = new ebl(ebmVar);
            ebk ebkVar = this.b;
            if (ebkVar != null) {
                ebkVar.b(eblVar);
            }
            hoxVar.b(null);
        }
    }
}
