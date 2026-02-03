package defpackage;

import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhek implements fhbm {
    private final Type a;

    public fhek(Type type) {
        this.a = type;
    }

    @Override // defpackage.fhbm
    public final /* bridge */ /* synthetic */ Object adapt(fhbk fhbkVar) {
        fhei fheiVar = new fhei(fhbkVar);
        fhbkVar.d(new fhej(fheiVar));
        return fheiVar;
    }

    @Override // defpackage.fhbm
    public final Type responseType() {
        return this.a;
    }
}
