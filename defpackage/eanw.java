package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eanw extends eapl {
    public eatb a;
    public eatb b;
    public eatb c;
    public eatb d;

    @Override // defpackage.eapl
    public final void a(eatb eatbVar) {
        if (eatbVar == null) {
            throw new NullPointerException("Null wheelchairAccessibleEntrance");
        }
        this.b = eatbVar;
    }

    @Override // defpackage.eapl
    public final void b(eatb eatbVar) {
        if (eatbVar == null) {
            throw new NullPointerException("Null wheelchairAccessibleParking");
        }
        this.a = eatbVar;
    }

    @Override // defpackage.eapl
    public final void c(eatb eatbVar) {
        if (eatbVar == null) {
            throw new NullPointerException("Null wheelchairAccessibleRestroom");
        }
        this.c = eatbVar;
    }

    @Override // defpackage.eapl
    public final void d(eatb eatbVar) {
        if (eatbVar == null) {
            throw new NullPointerException("Null wheelchairAccessibleSeating");
        }
        this.d = eatbVar;
    }
}
