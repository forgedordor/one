package defpackage;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cotd extends cayv {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public static final cczi b = cdag.e(cdag.b, "persist_thumbnail_max_retry", 1);
    public static final cczi c = cdag.e(cdag.b, "persist_thumbnail_handler_retry_delay", 1000);
    public final cotw d;
    private final eosc e;
    private final eosc f;
    private final cosz g;

    public cotd(eosc eoscVar, eosc eoscVar2, cosz coszVar, cotw cotwVar) {
        this.e = eoscVar;
        this.f = eoscVar2;
        this.g = coszVar;
        this.d = cotwVar;
    }

    public static void k(basd basdVar, MessageIdType messageIdType, String str) {
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(cqnc.e, basdVar.b);
        ekslVar.X(cqnc.a, messageIdType.b());
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/incoming/PersistThumbnailHandler", "logForDebug", BasePaymentResult.ERROR_REQUEST_FAILED, "PersistThumbnailHandler.java")).q(str);
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        if (((Boolean) ((cczi) ateo.a.get()).e()).booleanValue()) {
            return caya.l().a();
        }
        caxz caxzVarL = caya.l();
        caxzVarL.c(((Integer) b.e()).intValue());
        caxzVarL.g(((Integer) c.e()).intValue());
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("PersistThumbnailHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cotf.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final cotf cotfVar = (cotf) evuhVar;
        try {
            final basd basdVarA = basd.a(((coqg) evsn.parseFrom(coqg.a, cotfVar.b, evrr.a())).b);
            eiju eijuVarI = this.g.a(basdVarA).i(new eooz() { // from class: cotb
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    Optional optional = (Optional) obj;
                    if (optional.isEmpty()) {
                        return eijx.e(cbcw.k());
                    }
                    basd basdVar = basdVarA;
                    MessageCoreData messageCoreData = (MessageCoreData) optional.get();
                    if (messageCoreData.cy()) {
                        cotd.k(basdVar, messageCoreData.C(), "Message has already finished downloading. Skipping updating thumbnail.");
                        return eijx.e(cbcw.i());
                    }
                    MessagePartCoreData messagePartCoreDataH = messageCoreData.H();
                    messagePartCoreDataH.getClass();
                    String strX = messagePartCoreDataH.X();
                    if (strX == null) {
                        cotd.k(basdVar, messageCoreData.C(), "Could not retrieve content type for the thumbnail of an incoming file transfer message. Skipping updating thumbnail.");
                        return eijx.e(cbcw.k());
                    }
                    if (MimeTypeMap.getSingleton().getExtensionFromMimeType(strX) == null) {
                        cotd.k(basdVar, messageCoreData.C(), "Could not retrieve file extension for the thumbnail of an incoming file transfer message. Skipping updating thumbnail.");
                        return eijx.e(cbcw.k());
                    }
                    cotf cotfVar2 = cotfVar;
                    cotd cotdVar = this.a;
                    Uri uri = Uri.parse(cotfVar2.d);
                    String strA = ejwk.a(cotfVar2.c);
                    cotu cotuVar = (cotu) cotv.a.createBuilder();
                    String str = basdVar.b;
                    str.getClass();
                    cotuVar.copyOnWrite();
                    ((cotv) cotuVar.instance).b = str;
                    String strB = ejwk.b(strA);
                    cotuVar.copyOnWrite();
                    ((cotv) cotuVar.instance).d = strB;
                    String string = uri.toString();
                    cotuVar.copyOnWrite();
                    cotv cotvVar = (cotv) cotuVar.instance;
                    string.getClass();
                    cotvVar.c = string;
                    cotdVar.d.a((cotv) cotuVar.build());
                    cotd.k(basdVar, messageCoreData.C(), "Finished scheduling success handler for persisted thumbnail.");
                    return eijx.e(cbcw.i());
                }
            }, this.f);
            return ((Boolean) ((cczi) ateo.a.get()).e()).booleanValue() ? eijuVarI : eijuVarI.f(cond.class, new eooz() { // from class: cotc
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    cond condVar = (cond) obj;
                    eksl ekslVar = (eksl) ((eksl) cotd.a.j()).g(condVar);
                    ekslVar.X(cqnc.e, basdVarA.b);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/incoming/PersistThumbnailHandler", "processPendingWorkItemAsync", 167, "PersistThumbnailHandler.java")).q("Failed to persist thumbnail for incoming file transfer.");
                    return condVar.d().booleanValue() ? eijx.e(cbcw.m()) : eijx.e(cbcw.k());
                }
            }, this.e);
        } catch (evtj e) {
            cqbd cqbdVarE = E.e();
            cqbdVarE.I("Could not parse opaque data. Cannot update thumbnail for incoming file transfer.");
            cqbdVarE.s(e);
            return eijx.e(cbcw.k());
        }
    }
}
