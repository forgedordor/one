package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eadf implements eadc {
    private static final eadc a = new eadc() { // from class: eade
        @Override // defpackage.eadc
        public final eadb a(dzyn dzynVar) {
            throw new IllegalStateException();
        }
    };
    private volatile eadc b;
    private eadb c;

    public eadf(eadc eadcVar) {
        this.b = eadcVar;
    }

    @Override // defpackage.eadc
    public final eadb a(dzyn dzynVar) {
        ejwl.a(Objects.equals("", ""));
        eadc eadcVar = this.b;
        eadc eadcVar2 = a;
        if (eadcVar != eadcVar2) {
            synchronized (this) {
                if (this.b != eadcVar2) {
                    this.c = this.b.a(dzynVar);
                    this.b = eadcVar2;
                }
            }
        }
        return this.c;
    }
}
