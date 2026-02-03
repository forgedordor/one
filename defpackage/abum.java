package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abum extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ abuo c;
    final /* synthetic */ MessageCoreData d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abum(abuo abuoVar, MessageCoreData messageCoreData, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = abuoVar;
        this.d = messageCoreData;
        this.e = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abum) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
            abuo abuoVar = this.c;
            Uri uriA = abuo.a(this.d);
            if (uriA == null) {
                ((eksl) abuo.a.j()).t("Empty Uri of custom sticker: ID = %s", this.e);
                return fctx.a;
            }
            dnvi dnviVar = abuoVar.b;
            String str = this.e;
            this.a = uriA;
            this.b = 1;
            obj = dnviVar.f(str, uriA, null, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            obj2 = uriA;
        }
        dnvg dnvgVar = (dnvg) obj;
        if (dnvgVar != null) {
            ((eksl) abuo.a.h()).I("Custom sticker saved: ID = %s, ORIGINAL URI = %s, SAVED URI = %s", this.e, ((Uri) obj2).toString(), dnvgVar.b);
        } else {
            ((eksl) abuo.a.j()).D("Custom sticker couldn't be saved: ID = %s, ORIGINAL URI = %s", this.e, ((Uri) obj2).toString());
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new abum(this.c, this.d, this.e, fcxyVar);
    }
}
