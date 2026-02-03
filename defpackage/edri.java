package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edri extends edna {
    public final lvx a;
    private final edln b;

    public edri(edln edlnVar) {
        lvx lvxVar = new lvx();
        this.a = lvxVar;
        this.b = edlnVar;
        lvxVar.p(edlnVar.a(), new lvz() { // from class: edrh
            @Override // defpackage.lvz
            public final void a(Object obj) {
                this.a.a.j((edlw) obj);
            }
        });
    }

    @Override // defpackage.edna
    public final lvv a() {
        return this.a;
    }

    @Override // defpackage.edna
    public final void b(int i) {
        this.b.b(i);
    }

    @Override // defpackage.edna
    public final void c() {
        this.b.c();
    }
}
