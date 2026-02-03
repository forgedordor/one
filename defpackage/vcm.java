package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vcm extends fcyz implements fdat {
    int a;
    final /* synthetic */ vcq b;
    final /* synthetic */ ezdx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcm(fcxy fcxyVar, vcq vcqVar, ezdx ezdxVar) {
        super(2, fcxyVar);
        this.b = vcqVar;
        this.c = ezdxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vcm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            vcq vcqVar = this.b;
            ezdx ezdxVar = this.c;
            this.a = 1;
            obj = vcqVar.c(ezdxVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Integer num = (Integer) obj;
        if (num == null) {
            return null;
        }
        vcq vcqVar2 = this.b;
        ((uzw) ((Optional) vcqVar2.c.b()).get()).a(num.intValue() + ((int) ((Number) vcqVar2.k.b()).longValue()));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        vcm vcmVar = new vcm(fcxyVar, this.b, this.c);
        vcmVar.d = obj;
        return vcmVar;
    }
}
