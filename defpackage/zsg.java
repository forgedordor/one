package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zsg extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ztv c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsg(ztv ztvVar, String str, String str2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ztvVar;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zsg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            ztv ztvVar = this.c;
            etyp etypVarA = ((crgr) ztvVar.p.b()).a(this.d, this.e);
            if (etypVarA == null) {
                return fctx.a;
            }
            vvr vvrVar = new vvr(new doyt(etypVarA), new vvq(vuc.a(), (Uri) null, (ejxm) null, (fdkf) null, 62));
            vwj vwjVarC = ztvVar.c();
            this.a = etypVarA;
            this.b = 1;
            obj = vwjVarC.a(vvrVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            obj2 = etypVarA;
        }
        if (!((Boolean) obj).booleanValue()) {
            ((ekrd) ztv.a.i().h("com/google/android/apps/messaging/conversation2/messagelist/suggestion/SuggestionUiAdapterImpl$handleEmotionSuggestion$1", "invokeSuspend", 799, "SuggestionUiAdapterImpl.kt")).q("Failed to send emotion suggestion");
            return fctx.a;
        }
        ((cqpc) this.c.q.b()).c(new cqpn(((etyp) obj2).c, this.d));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zsg(this.c, this.d, this.e, fcxyVar);
    }
}
