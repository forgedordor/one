package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsvl {
    public int a;
    private final dsve b = new dsve(2);
    private final dsvp c = (dsvp) dsvq.a.createBuilder();

    /* JADX WARN: Multi-variable type inference failed */
    public final dsvm a() {
        ejwl.m(this.a != 0, "Semantic events must have a semantic ID.");
        eohw eohwVar = (eohw) eohx.a.createBuilder();
        int i = this.a;
        eohwVar.copyOnWrite();
        eohx eohxVar = (eohx) eohwVar.instance;
        eohxVar.b |= 8;
        eohxVar.d = i;
        eohx eohxVar2 = (eohx) eohwVar.build();
        dsvp dsvpVar = this.c;
        dsvpVar.copyOnWrite();
        dsvq dsvqVar = (dsvq) dsvpVar.instance;
        dsvq dsvqVar2 = dsvq.a;
        eohxVar2.getClass();
        dsvqVar.d = eohxVar2;
        dsvqVar.b |= 1;
        return new dsvm((dsvq) dsvpVar.build(), this.b.a());
    }

    public final void b(dsvf dsvfVar) {
        this.b.b(dsvfVar);
    }

    public final void c(dsvb dsvbVar) {
        this.c.e(dsvbVar.a, dsvbVar.b);
    }
}
