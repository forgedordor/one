package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckor extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckot b;
    final /* synthetic */ MessagePartCoreData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckor(ckot ckotVar, MessagePartCoreData messagePartCoreData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ckotVar;
        this.c = messagePartCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckor) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ckot ckotVar = this.b;
            dnvi dnviVar = (dnvi) ckotVar.d.a();
            if (dnviVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String strE = ckotVar.e();
            strE.getClass();
            MessagePartCoreData messagePartCoreData = this.c;
            Uri uriT = messagePartCoreData.t();
            uriT.getClass();
            String strW = messagePartCoreData.W();
            this.a = 1;
            obj = dnviVar.f(strE, uriT, strW, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (obj == null) {
            throw new IllegalStateException("Failed to get or create sticker");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckor(this.b, this.c, fcxyVar);
    }
}
