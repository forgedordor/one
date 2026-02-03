package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dshi implements ejvr {
    public abstract void a(evmf evmfVar, etlp etlpVar);

    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evmf evmfVar = (evmf) obj;
        etlp etlpVar = (etlp) etly.a.createBuilder();
        if ((evmfVar.b & 2) != 0) {
            e(evmfVar, etlpVar);
        }
        if ((evmfVar.b & 4) != 0) {
            c(evmfVar, etlpVar);
        }
        if ((evmfVar.b & 8) != 0) {
            ejvj ejvjVar = dsje.e;
            evma evmaVarB = evma.b(evmfVar.h);
            if (evmaVarB == null) {
                evmaVarB = evma.FONT_SIZE_UNSPECIFIED;
            }
            etlx etlxVar = (etlx) ejvjVar.fM(evmaVarB);
            etlpVar.copyOnWrite();
            etly etlyVar = (etly) etlpVar.instance;
            etlyVar.g = etlxVar.d;
            etlyVar.b |= 4;
        }
        i(evmfVar, etlpVar);
        b(evmfVar, etlpVar);
        a(evmfVar, etlpVar);
        h(evmfVar, etlpVar);
        f(evmfVar, etlpVar);
        g(evmfVar, etlpVar);
        d(evmfVar, etlpVar);
        return (etly) etlpVar.build();
    }

    public abstract void b(evmf evmfVar, etlp etlpVar);

    public abstract void c(evmf evmfVar, etlp etlpVar);

    public abstract void d(evmf evmfVar, etlp etlpVar);

    public abstract void e(evmf evmfVar, etlp etlpVar);

    public abstract void f(evmf evmfVar, etlp etlpVar);

    public abstract void g(evmf evmfVar, etlp etlpVar);

    public abstract void h(evmf evmfVar, etlp etlpVar);

    public abstract void i(evmf evmfVar, etlp etlpVar);
}
