package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiey extends eiez implements eiex {
    public static final eiez a = new eiey(null, new cvw(0)).f();
    static final eiez b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        eiex eiexVarB = eiez.b();
        eiexVarB.a(eiez.c, true);
        b = ((eiez) eiexVarB).f();
    }

    public eiey(eiez eiezVar, cvw cvwVar) {
        super(eiezVar, cvwVar);
    }

    @Override // defpackage.eiex
    public final void a(eiew eiewVar, Object obj) {
        ejwl.m(!this.e, "Can't mutate after handing to trace");
        obj.getClass();
        ejwl.m(!h(eiewVar), "Key already present");
        this.d.put(eiewVar, obj);
    }
}
