package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aisj extends fcyz implements fdat {
    int a;
    final /* synthetic */ aisn b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aisj(aisn aisnVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aisnVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aisj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aisn aisnVar = this.b;
            String str = this.c;
            this.a = 1;
            if (str.length() <= 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            cczv cczvVar = aish.a;
            obj = (!fcvo.a.contains(str) || ((ewto) aish.d.e()).b.contains(str)) ? aisnVar.b(this) : true;
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return Boolean.valueOf(!((Boolean) obj).booleanValue());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aisj(this.b, this.c, fcxyVar);
    }
}
