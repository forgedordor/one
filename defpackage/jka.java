package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jka extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ jkb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jka(jkb jkbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = jkbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jka) c((jnh) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        if (this.a == 0) {
            fctl.b(obj);
            jnh jnhVar = (jnh) this.b;
            jkb jkbVar = this.c;
            this.b = jnhVar;
            this.a = 1;
            fdiu fdiuVar = new fdiu(fcym.c(this), 1);
            fdiuVar.B();
            key keyVar = jkbVar.b;
            kep kepVar = keyVar.a;
            kepVar.c();
            keyVar.b.set(new kfl(keyVar, kepVar));
            fdiuVar.d(new jjz(jnhVar, jkbVar));
            if (fdiuVar.m() == fcylVar) {
                return fcylVar;
            }
        } else {
            fctl.b(obj);
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        jka jkaVar = new jka(this.c, fcxyVar);
        jkaVar.b = obj;
        return jkaVar;
    }
}
