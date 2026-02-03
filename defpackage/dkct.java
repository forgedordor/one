package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkct implements fdat {
    final /* synthetic */ dkcx a;

    public dkct(dkcx dkcxVar) {
        this.a = dkcxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkcx dkcxVar = this.a;
            dkcv.d(dkcxVar.b, dkcxVar.c, hmlVar, 0);
        }
        return fctx.a;
    }
}
