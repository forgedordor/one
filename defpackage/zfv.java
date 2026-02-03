package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zfv extends fcyz implements fdat {
    int a;
    final /* synthetic */ zgh b;
    final /* synthetic */ String c;
    final /* synthetic */ zfd d;
    final /* synthetic */ List e;
    final /* synthetic */ List f;
    final /* synthetic */ fdci g;
    final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfv(zgh zghVar, String str, zfd zfdVar, List list, List list2, fdci fdciVar, List list3, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zghVar;
        this.c = str;
        this.d = zfdVar;
        this.e = list;
        this.f = list2;
        this.g = fdciVar;
        this.h = list3;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zfv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        List arrayList;
        fduf fdufVar;
        Object objC;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            zgh zghVar = this.b;
            String str = this.c;
            zfd zfdVar = this.d;
            this.a = 1;
            obj = zghVar.b(zghVar.a, str, zfdVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        fcti fctiVar = (fcti) obj;
        String str2 = (String) fctiVar.a;
        List list = (List) fctiVar.b;
        if (((Boolean) ((cczi) crbf.aB.get()).e()).booleanValue()) {
            List list2 = this.e;
            arrayList = new ArrayList();
            for (Object obj2 : list2) {
                diip diipVar = (diip) obj2;
                if (!(diipVar instanceof diin) || ((diin) diipVar).a.ordinal() != 2) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = fcvo.a;
        }
        zgh zghVar2 = this.b;
        List listE = zgh.e(fcva.ah(fcva.ah(this.f, arrayList), list));
        zghVar2.k.put(this.d.s.a(), new zeo(str2, listE));
        if ((!list.isEmpty() || !this.e.isEmpty()) && (fdufVar = (fduf) this.g.a) != null) {
            List list3 = this.h;
            do {
                objC = fdufVar.c();
            } while (!fdufVar.g(objC, dlhm.l((dlhm) objC, str2, zgh.e(fcva.ah(listE, list3)), null, new fdae() { // from class: zfu
                @Override // defpackage.fdae
                public final Object invoke() {
                    return fctx.a;
                }
            }, null, false, false, 4193788)));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zfv(this.b, this.c, this.d, this.e, this.f, this.g, this.h, fcxyVar);
    }
}
