package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eay implements dzz {
    private final ddz a;

    public eay(ddz ddzVar) {
        this.a = ddzVar;
    }

    @Override // defpackage.dzz
    public final /* bridge */ /* synthetic */ Object a(dwy dwyVar, Object obj, Object obj2, fdap fdapVar, fcxy fcxyVar) {
        float fFloatValue = ((Number) obj).floatValue();
        float fFloatValue2 = ((Number) obj2).floatValue();
        Object objB = eas.b(dwyVar, Math.abs(fFloatValue) * Math.signum(fFloatValue2), fFloatValue, dec.b(0.0f, fFloatValue2, 28), this.a, fdapVar, fcxyVar);
        return objB == fcyl.a ? objB : (dzy) objB;
    }
}
