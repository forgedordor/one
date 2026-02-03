package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctmh extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Set c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctmh(Set set, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = set;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ctmh ctmhVar = new ctmh(this.c, (fcxy) obj3);
        ctmhVar.d = (fdpm) obj;
        ctmhVar.b = (Map) obj2;
        return ctmhVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ?? r0;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            Map map = (Map) this.d;
            fctl.b(obj);
            r0 = map;
        } else {
            fctl.b(obj);
            fdpm fdpmVar = (fdpm) this.d;
            Object obj2 = this.b;
            this.d = obj2;
            this.a = 1;
            if (fdpmVar.fO(obj2, this) == fcylVar) {
                return fcylVar;
            }
            r0 = obj2;
        }
        return Boolean.valueOf(r0.size() < this.c.size());
    }
}
