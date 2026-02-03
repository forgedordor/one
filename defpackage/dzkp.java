package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzkp extends dzkn {
    public static final dzkp a = new dzkp();

    private dzkp() {
    }

    @Override // defpackage.dzkn
    public final /* synthetic */ evuh a(String str, Object obj) {
        return dzkq.g(str, aky$$ExternalSyntheticApiModelOutline0.m168m(obj));
    }

    @Override // defpackage.dzkn
    public final /* synthetic */ evuh b(evuh evuhVar, evuh evuhVar2) {
        return dzkq.f((fedi) evuhVar, (fedi) evuhVar2);
    }

    @Override // defpackage.dzkn
    public final /* bridge */ /* synthetic */ String c(evuh evuhVar) {
        fedi fediVar = (fedi) evuhVar;
        fecy fecyVar = fediVar.e;
        if (fecyVar == null) {
            fecyVar = fecy.a;
        }
        int i = fecyVar.b & 2;
        fecy fecyVar2 = fediVar.e;
        if (i != 0) {
            if (fecyVar2 == null) {
                fecyVar2 = fecy.a;
            }
            return fecyVar2.d;
        }
        if (fecyVar2 == null) {
            fecyVar2 = fecy.a;
        }
        return Long.toHexString(fecyVar2.c);
    }
}
