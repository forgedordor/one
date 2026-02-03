package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class chw extends lvx {
    private lvv a;

    @Override // defpackage.lvv
    public final Object a() {
        lvv lvvVar = this.a;
        if (lvvVar == null) {
            return null;
        }
        return lvvVar.a();
    }

    final void b(lvv lvvVar) {
        lvv lvvVar2 = this.a;
        if (lvvVar2 != null) {
            super.q(lvvVar2);
        }
        this.a = lvvVar;
        super.p(lvvVar, new lvz() { // from class: chv
            @Override // defpackage.lvz
            public final void a(Object obj) {
                this.a.m(obj);
            }
        });
    }
}
