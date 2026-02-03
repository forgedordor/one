package defpackage;

import com.google.android.apps.messaging.dittosatellite.intent.DittoAttachment;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abnk extends fcyz implements fdat {
    final /* synthetic */ DittoAttachment a;
    final /* synthetic */ abno b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abnk(fcxy fcxyVar, DittoAttachment dittoAttachment, abno abnoVar) {
        super(2, fcxyVar);
        this.a = dittoAttachment;
        this.b = abnoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abnk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        try {
            epnr epnrVar = (epnr) epns.a.createBuilder();
            DittoAttachment dittoAttachment = this.a;
            String strB = dittoAttachment.b();
            epnrVar.copyOnWrite();
            ((epns) epnrVar.instance).b = strB;
            abno abnoVar = this.b;
            InputStream inputStreamB = ebsv.b(abnoVar.c, dittoAttachment.a(), ebsu.a);
            try {
                evqs evqsVarB = evqs.B(inputStreamB);
                fczl.a(inputStreamB, null);
                epnrVar.copyOnWrite();
                epns epnsVar = (epns) epnrVar.instance;
                evqsVarB.getClass();
                epnsVar.c = evqsVarB;
                return (epns) epnrVar.build();
            } finally {
            }
        } catch (Exception e) {
            ekrw ekrwVarJ = abno.a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/dittosatellite/intent/DraftMessageJsBridgeRequestSender$convertToAttachment$lambda$9$lambda$8$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 147, "DraftMessageJsBridgeRequestSender.kt")).t("Unable to load bytes from uri: %s", cqcv.b(this.a.a().toString()));
            return null;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        abnk abnkVar = new abnk(fcxyVar, this.a, this.b);
        abnkVar.c = obj;
        return abnkVar;
    }
}
