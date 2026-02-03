package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejbd implements Runnable {
    final /* synthetic */ ejbe a;
    private final eosa b;

    public ejbd(ejbe ejbeVar, eosa eosaVar) {
        this.a = ejbeVar;
        this.b = eosaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eosa eosaVar = this.b;
        ejbe ejbeVar = this.a;
        synchronized (ejbeVar.f) {
            try {
                ejbeVar.g = (ejba) eork.q(eosaVar);
                throw null;
            } catch (Exception unused) {
                ejbc ejbcVar = ejbeVar.h;
                if (ejbcVar != null && ejbcVar.a == eosaVar) {
                    ejbeVar.h = null;
                }
            } catch (Throwable th) {
                ejbc ejbcVar2 = ejbeVar.h;
                if (ejbcVar2 != null && ejbcVar2.a == eosaVar) {
                    ejbeVar.h = null;
                }
                throw th;
            }
        }
    }
}
