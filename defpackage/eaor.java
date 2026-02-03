package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaor extends easu {
    public eatb a;
    public eatb b;
    public eatb c;
    public eatb d;

    @Override // defpackage.easu
    public final void a(eatb eatbVar) {
        if (eatbVar == null) {
            throw new NullPointerException("Null acceptsCashOnly");
        }
        this.c = eatbVar;
    }

    @Override // defpackage.easu
    public final void b(eatb eatbVar) {
        if (eatbVar == null) {
            throw new NullPointerException("Null acceptsCreditCards");
        }
        this.a = eatbVar;
    }

    @Override // defpackage.easu
    public final void c(eatb eatbVar) {
        if (eatbVar == null) {
            throw new NullPointerException("Null acceptsDebitCards");
        }
        this.b = eatbVar;
    }

    @Override // defpackage.easu
    public final void d(eatb eatbVar) {
        if (eatbVar == null) {
            throw new NullPointerException("Null acceptsNfc");
        }
        this.d = eatbVar;
    }
}
