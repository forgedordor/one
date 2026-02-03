package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gdl implements fdat {
    public static final gdl a = new gdl();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (!hmlVar.J(i != 2, iIntValue & 1)) {
            hmlVar.s();
        }
        return fctx.a;
    }
}
