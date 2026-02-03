package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsi extends fcyz implements fdat {
    int a;
    final /* synthetic */ vvv b;
    final /* synthetic */ bpbj c;
    final /* synthetic */ wsk d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wsi(fcxy fcxyVar, vvv vvvVar, bpbj bpbjVar, wsk wskVar) {
        super(2, fcxyVar);
        this.b = vvvVar;
        this.c = bpbjVar;
        this.d = wskVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wsi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        vvv vvvVar;
        vvv vvvVar2;
        List list;
        fcyl fcylVar = fcyl.a;
        if (this.a == 0) {
            fctl.b(obj);
            vvvVar = this.b;
            bpbj bpbjVar = this.c;
            bpbjVar.aA(2, "attachments");
            wry wryVar = bpbjVar.c;
            if (wryVar != null) {
                wsk wskVar = this.d;
                this.e = vvvVar;
                this.a = 1;
                Object objA = fdin.a(eicg.a(wskVar.a), new wsh(null, wryVar, wskVar), this);
                if (objA == fcylVar) {
                    return fcylVar;
                }
                vvvVar2 = vvvVar;
                obj = objA;
            }
            vvvVar2 = vvvVar;
            list = fcvo.a;
            vvvVar2.a(list);
            return fctx.a;
        }
        vvvVar2 = (vvv) this.e;
        fctl.b(obj);
        list = (List) obj;
        if (list == null) {
            vvvVar = vvvVar2;
            vvvVar2 = vvvVar;
            list = fcvo.a;
        }
        vvvVar2.a(list);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wsi wsiVar = new wsi(fcxyVar, this.b, this.c, this.d);
        wsiVar.e = obj;
        return wsiVar;
    }
}
