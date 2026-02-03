package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecgs implements ecer {
    @Override // defpackage.ecer
    public final /* bridge */ /* synthetic */ Object a(eceq eceqVar) throws ecgh {
        if (eceqVar.b()) {
            throw new ecgh("Transforms are not supported by this Opener: ".concat(String.valueOf(String.valueOf(eceqVar.e))));
        }
        return new ecgr(eceqVar.a, eceqVar.e);
    }
}
