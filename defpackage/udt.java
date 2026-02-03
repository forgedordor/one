package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udt implements fdat {
    final /* synthetic */ String a;

    public udt(String str) {
        this.a = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        ((Number) obj2).intValue();
        hmlVar.v(341213565);
        int iB = ijg.b(dljt.a(hmlVar).c.a(this.a));
        hmlVar.o();
        return Integer.valueOf(iB);
    }
}
