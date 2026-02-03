package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fdlt extends fdme implements fdlr {
    private final boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdlt(fdlr fdlrVar) {
        fdme fdmeVarE;
        super(true);
        boolean z = true;
        L(fdlrVar);
        fdiz fdizVarI = I();
        fdja fdjaVar = fdizVarI instanceof fdja ? (fdja) fdizVarI : null;
        if (fdjaVar == null || (fdmeVarE = fdjaVar.e()) == null) {
            z = false;
            break;
        }
        while (!fdmeVarE.hx()) {
            fdiz fdizVarI2 = fdmeVarE.I();
            fdja fdjaVar2 = fdizVarI2 instanceof fdja ? (fdja) fdizVarI2 : null;
            if (fdjaVar2 == null || (fdmeVarE = fdjaVar2.e()) == null) {
                z = false;
                break;
            }
        }
        this.a = z;
    }

    @Override // defpackage.fdme
    public final boolean hL() {
        return true;
    }

    @Override // defpackage.fdme
    public final boolean hx() {
        return this.a;
    }
}
