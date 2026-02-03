package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkcu implements fdat {
    final /* synthetic */ dkcx a;

    public dkcu(dkcx dkcxVar) {
        this.a = dkcxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dlcq.a(this.a.e, null, hmlVar, 0, 2);
        }
        return fctx.a;
    }
}
