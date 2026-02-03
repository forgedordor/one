package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aadu implements fdpm {
    final /* synthetic */ aady a;

    public aadu(aady aadyVar) {
        this.a = aadyVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        cvua cvuaVar = (cvua) obj;
        boolean z = cvuaVar.d;
        aady aadyVar = this.a;
        aadyVar.b = z;
        float f = cvuaVar.c;
        if (z) {
            aadyVar.d.f(new Float(f));
        }
        return fctx.a;
    }
}
