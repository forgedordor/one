package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class udr implements fdat {
    final /* synthetic */ fdae a;

    public udr(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        ((Number) obj2).intValue();
        hmlVar.v(1803126868);
        int iIntValue = ((Number) this.a.invoke()).intValue();
        hmlVar.o();
        return Integer.valueOf(iIntValue);
    }
}
