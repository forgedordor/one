package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzkk extends dzkn {
    public static final dzkk a = new dzkk();

    private dzkk() {
    }

    @Override // defpackage.dzkn
    public final /* bridge */ /* synthetic */ evuh a(String str, Object obj) {
        int iIntValue = ((Long) obj).intValue();
        if (iIntValue == 0) {
            return null;
        }
        fecv fecvVar = (fecv) fecw.a.createBuilder();
        fecvVar.copyOnWrite();
        fecw fecwVar = (fecw) fecvVar.instance;
        fecwVar.b |= 1;
        fecwVar.c = iIntValue;
        if (str != null) {
            fecy fecyVarD = dzkq.d(str);
            fecvVar.copyOnWrite();
            fecw fecwVar2 = (fecw) fecvVar.instance;
            fecyVarD.getClass();
            fecwVar2.d = fecyVarD;
            fecwVar2.b |= 2;
        }
        return (fecw) fecvVar.build();
    }

    @Override // defpackage.dzkn
    public final /* synthetic */ evuh b(evuh evuhVar, evuh evuhVar2) {
        int i;
        fecw fecwVar = (fecw) evuhVar;
        fecw fecwVar2 = (fecw) evuhVar2;
        if (fecwVar == null || fecwVar2 == null) {
            return fecwVar;
        }
        if ((fecwVar.b & 1) == 0 || (i = fecwVar.c - fecwVar2.c) == 0) {
            return null;
        }
        fecv fecvVar = (fecv) fecw.a.createBuilder();
        if ((fecwVar.b & 2) != 0) {
            fecy fecyVar = fecwVar.d;
            if (fecyVar == null) {
                fecyVar = fecy.a;
            }
            fecvVar.copyOnWrite();
            fecw fecwVar3 = (fecw) fecvVar.instance;
            fecyVar.getClass();
            fecwVar3.d = fecyVar;
            fecwVar3.b |= 2;
        }
        fecvVar.copyOnWrite();
        fecw fecwVar4 = (fecw) fecvVar.instance;
        fecwVar4.b |= 1;
        fecwVar4.c = i;
        return (fecw) fecvVar.build();
    }

    @Override // defpackage.dzkn
    public final /* bridge */ /* synthetic */ String c(evuh evuhVar) {
        fecy fecyVar = ((fecw) evuhVar).d;
        if (fecyVar == null) {
            fecyVar = fecy.a;
        }
        return fecyVar.d;
    }
}
