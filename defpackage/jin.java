package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jin extends fdbr implements fdae {
    final /* synthetic */ jof a;
    final /* synthetic */ jir b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jin(jof jofVar, jir jirVar) {
        super(0);
        this.a = jofVar;
        this.b = jirVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        jsl jslVar;
        jcr jcrVar;
        jof jofVar = this.a;
        jry jryVar = jofVar.d;
        jry jryVar2 = jofVar.e;
        Float f = jofVar.b;
        Float f2 = jofVar.c;
        float fFloatValue = (jryVar == null || f == null) ? 0.0f : ((Number) jryVar.a.invoke()).floatValue() - f.floatValue();
        float fFloatValue2 = (jryVar2 == null || f2 == null) ? 0.0f : ((Number) jryVar2.a.invoke()).floatValue() - f2.floatValue();
        if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
            jir jirVar = this.b;
            int iM = jirVar.m(jofVar.a);
            jsn jsnVar = (jsn) jirVar.q().a(jirVar.i);
            if (jsnVar != null) {
                try {
                    lhg lhgVar = jirVar.k;
                    if (lhgVar != null) {
                        lhgVar.p(jirVar.n(jsnVar));
                    }
                } catch (IllegalStateException unused) {
                }
            }
            jir jirVar2 = this.b;
            jsn jsnVar2 = (jsn) jirVar2.q().a(jirVar2.j);
            if (jsnVar2 != null) {
                try {
                    lhg lhgVar2 = jirVar2.l;
                    if (lhgVar2 != null) {
                        lhgVar2.p(jirVar2.n(jsnVar2));
                    }
                } catch (IllegalStateException unused2) {
                }
            }
            jir jirVar3 = this.b;
            jirVar3.b.invalidate();
            jsn jsnVar3 = (jsn) jirVar3.q().a(iM);
            if (jsnVar3 != null && (jslVar = jsnVar3.a) != null && (jcrVar = jslVar.b) != null) {
                if (jryVar != null) {
                    jirVar3.n.f(iM, jryVar);
                }
                if (jryVar2 != null) {
                    jirVar3.o.f(iM, jryVar2);
                }
                jirVar3.u(jcrVar);
            }
        }
        if (jryVar != null) {
            this.a.b = (Float) jryVar.a.invoke();
        }
        if (jryVar2 != null) {
            this.a.c = (Float) jryVar2.a.invoke();
        }
        return fctx.a;
    }
}
