package defpackage;

import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhbp implements fhbm {
    private final Type a;

    public fhbp(Type type) {
        this.a = type;
    }

    @Override // defpackage.fhbm
    public final /* bridge */ /* synthetic */ Object adapt(fhbk fhbkVar) {
        fhbq fhbqVar = new fhbq(fhbkVar);
        fhbkVar.d(new fhbo(fhbqVar));
        return fhbqVar;
    }

    @Override // defpackage.fhbm
    public final Type responseType() {
        return this.a;
    }
}
