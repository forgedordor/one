package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eics {
    public eiik a;
    public eiik b;
    private final ea c;
    private int d = 0;

    /* compiled from: PG */
    public interface a {
        eigp b();
    }

    public eics(ea eaVar) {
        this.c = eaVar;
    }

    private final eifp m(String str) {
        if (eidc.v()) {
            return eiiy.k(str);
        }
        eg egVarG = this.c.G();
        egVarG.getClass();
        return eigt.a(egVarG).c(str, "com/google/apps/tiktok/tracing/FragmentCallbacksTraceManager", "begin", 44);
    }

    private final eifp n(String str) {
        eidc.s();
        final eifp eifpVarK = eidc.v() ? eiiy.k(str) : ((a) ehli.a(this.c.z(), a.class)).b().c(str, "com/google/apps/tiktok/tracing/FragmentCallbacksTraceManager", "resumeDialogFragmentTrace", 241);
        final eifp eifpVarK2 = eidc.k();
        return new eifp() { // from class: eicr
            @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                eifpVarK2.close();
                eifpVarK.close();
                eidc.q();
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void o(eiik eiikVar, ea eaVar, boolean z) {
        if (eaVar.z() != null) {
            for (ea eaVar2 : eaVar.I().o()) {
                if (eaVar2 instanceof eifl) {
                    ((eifl) eaVar2).bh(eiikVar, z);
                } else {
                    o(eiikVar, eaVar2, z);
                }
            }
        }
    }

    public final eifp a() {
        try {
            return b();
        } finally {
            this.a = null;
            this.b = null;
            this.d = 0;
        }
    }

    public final eifp b() {
        eiik eiikVar = this.b;
        if (eiikVar != null) {
            return eiikVar.a();
        }
        eiik eiikVar2 = this.a;
        return eiikVar2 != null ? eiikVar2.a() : eidc.j();
    }

    public final eifp c() {
        eifp eifpVarJ = eidc.j();
        if (this.d > 0) {
            e(eiik.b(), false);
        }
        return eifpVarJ;
    }

    public final void d() {
        ea eaVar = this.c;
        eaVar.I().r(new eigm(((a) ehli.a(eaVar.z(), a.class)).b()));
    }

    public final void e(eiik eiikVar, boolean z) {
        if (z) {
            if (eiikVar == null) {
                int i = this.d - 1;
                if (i < 0) {
                    i = 0;
                }
                this.d = i;
                if (i == 0) {
                    this.a = null;
                    return;
                }
                return;
            }
            this.d++;
        }
        this.a = eiikVar;
        o(eiikVar, this.c, z);
    }

    public final eifp f() {
        return m("Fragment:onActivityResult");
    }

    public final eifp g() {
        return n("DialogFragment:onCancel");
    }

    public final eifp h(int i, int i2) {
        eifp eifpVarJ = eidc.j();
        if (i == 0 && i2 == 0) {
            return eifpVarJ;
        }
        e(eiik.b(), true);
        return eifpVarJ;
    }

    public final eifp i() {
        return n("DialogFragment:onDismiss");
    }

    public final eifp j() {
        return m("Fragment:onOptionsItemSelected");
    }

    public final void k() {
        eidc.A();
        if (this.d > 0) {
            e(eiik.b(), false);
        }
    }

    public final void l() {
        e(eiik.b(), true);
    }
}
