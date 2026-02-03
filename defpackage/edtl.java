package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edtl extends edna {
    private final lvx a;
    private final edlv b;

    public edtl(edlv edlvVar) {
        final lvx lvxVar = new lvx();
        this.a = lvxVar;
        this.b = edlvVar;
        lvxVar.p(edlvVar.a(), new lvz() { // from class: edtk
            @Override // defpackage.lvz
            public final void a(Object obj) {
                lvxVar.j((edlw) obj);
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
