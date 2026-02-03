package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hia extends icr implements jfy {
    public fdap a;

    public hia(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.jfy
    public final /* synthetic */ boolean dP() {
        return false;
    }

    @Override // defpackage.jfy
    public final void dQ(final jto jtoVar) {
        jgh.c(this, hjo.a, new fdap() { // from class: hhy
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                jgg jggVar = (jgg) obj;
                jggVar.getClass();
                hjn hjnVar = (hjn) jggVar;
                hjnVar.b = true;
                hjnVar.a.invoke(jtoVar);
                jfz.a(hjnVar);
                return false;
            }
        });
        this.a.invoke(jtoVar);
    }

    @Override // defpackage.icr
    public final void s() {
        jgh.c(this, hjo.a, new fdap() { // from class: hhz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                jgg jggVar = (jgg) obj;
                jggVar.getClass();
                hjn hjnVar = (hjn) jggVar;
                hjnVar.b = false;
                jfz.a(hjnVar);
                return false;
            }
        });
    }

    @Override // defpackage.jfy
    public final /* synthetic */ boolean u() {
        return false;
    }
}
