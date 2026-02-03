package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edot extends edmy {
    public final lvx a;
    public final edlj b;

    public edot(edlj edljVar) {
        lvx lvxVar = new lvx();
        this.a = lvxVar;
        this.b = edljVar;
        lvxVar.p(edljVar.e, new lvz() { // from class: edos
            @Override // defpackage.lvz
            public final void a(Object obj) {
                this.a.a.j((edll) obj);
            }
        });
    }

    @Override // defpackage.edmy
    public final void a(int i) {
        this.b.a(i);
    }
}
