package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffmu implements ffxg {
    @Override // defpackage.ffxg
    public final Object a(ffxf ffxfVar) throws ffme {
        try {
            return new ffic(ffxfVar.d);
        } catch (Exception e) {
            throw new ffme("problem parsing cert: ".concat(String.valueOf(e.toString())), e);
        }
    }
}
