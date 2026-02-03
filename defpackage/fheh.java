package defpackage;

import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fheh implements fhbm {
    private final Type a;

    public fheh(Type type) {
        this.a = type;
    }

    @Override // defpackage.fhbm
    public final /* bridge */ /* synthetic */ Object adapt(fhbk fhbkVar) {
        fhei fheiVar = new fhei(fhbkVar);
        fhbkVar.d(new fheg(fheiVar));
        return fheiVar;
    }

    @Override // defpackage.fhbm
    public final Type responseType() {
        return this.a;
    }
}
