package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zex extends fcyz implements fdat {
    int a;
    final /* synthetic */ zez b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zex(zez zezVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zezVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zex) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Exception {
        zez zezVar;
        Exception e;
        Boolean bool;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            zezVar = (zez) this.c;
            try {
                fctl.b(obj);
            } catch (Exception e2) {
                e = e2;
                if ((e instanceof IOException) && !(e instanceof dbmi)) {
                    throw e;
                }
                ((ekrd) ((ekrd) zez.a.i()).g(e).h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/text/LinkPreviewUiAdapter$1", "invokeSuspend", 90, "LinkPreviewUiAdapter.kt")).q("Failed to fetch account capability");
                bool = false;
                bool.getClass();
                zezVar.l = bool.booleanValue();
                this.b.m = true;
                return fctx.a;
            }
        } else {
            fctl.b(obj);
            zez zezVar2 = this.b;
            try {
                eiju eijuVarA = zezVar2.f.a(abxb.a() ? zezVar2.h : null);
                this.c = zezVar2;
                this.a = 1;
                Object objC = fdxs.c(eijuVarA, this);
                if (objC == fcylVar) {
                    return fcylVar;
                }
                zezVar = zezVar2;
                obj = objC;
            } catch (Exception e3) {
                zezVar = zezVar2;
                e = e3;
                if (e instanceof IOException) {
                }
                ((ekrd) ((ekrd) zez.a.i()).g(e).h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/text/LinkPreviewUiAdapter$1", "invokeSuspend", 90, "LinkPreviewUiAdapter.kt")).q("Failed to fetch account capability");
                bool = false;
                bool.getClass();
                zezVar.l = bool.booleanValue();
                this.b.m = true;
                return fctx.a;
            }
        }
        bool = (Boolean) obj;
        bool.getClass();
        zezVar.l = bool.booleanValue();
        this.b.m = true;
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        zex zexVar = new zex(this.b, fcxyVar);
        zexVar.c = obj;
        return zexVar;
    }
}
