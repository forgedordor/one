package defpackage;

import android.os.Bundle;
import com.google.android.rcs.client.messaging.data.AutoValue_FileTransferInformation;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atzx implements atyq, cbty {
    public static final cqce a = cqce.g("BugleDataModel", "UnencryptedSinglePartIncomingChatMessageProcessor");
    public final efob b;
    public final atzt c;
    public final fcsu d;
    private final eosc e;
    private final atak f;

    public atzx(eosc eoscVar, efob efobVar, atak atakVar, atzt atztVar, fcsu fcsuVar) {
        this.b = efobVar;
        this.f = atakVar;
        this.c = atztVar;
        this.e = eoscVar;
        this.d = fcsuVar;
    }

    @Override // defpackage.atyq
    public final eiju a(atys atysVar) {
        return c(atysVar, Bundle.EMPTY);
    }

    @Override // defpackage.cbty
    public final eiju b(FileTransferInformation fileTransferInformation, atys atysVar) {
        return a(atysVar);
    }

    public final eiju c(final atys atysVar, final Bundle bundle) throws Throwable {
        final efnd efndVar;
        final ContentType contentTypeA;
        final String str;
        eieu eieuVarK = eiiy.k("UnencryptedSinglePartIncomingChatMessageProcessor::process");
        try {
            efndVar = (efnd) this.f.fH().fM(atysVar.e());
            contentTypeA = efndVar.a();
            str = atysVar.b().j;
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("Processing incoming message");
            cqbdVarC.h(basd.a(str));
            cqbdVarC.A("contentType", contentTypeA);
            cqbdVarC.r();
        } catch (Throwable th) {
            th = th;
        }
        try {
            eiju eijuVarF = eiju.g(kol.a(new koi() { // from class: atzu
                @Override // defpackage.koi
                public final Object a(final kog kogVar) {
                    atzx atzxVar = this.a;
                    atzxVar.b.a(contentTypeA).a(efndVar).hl(atzxVar.c.a(atysVar, new atzr() { // from class: atzw
                        @Override // defpackage.atzr
                        public final void a(atav atavVar) {
                            kogVar.b(atavVar);
                        }
                    }, bundle));
                    return "UnencryptedIncomingChatMessageVisitor for messageId:".concat(String.valueOf(str));
                }
            })).f(efoc.class, new eooz() { // from class: atzv
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    cqbd cqbdVarE = atzx.a.e();
                    cqbdVarE.I("Deserialization of the incoming message failed");
                    cqbdVarE.h(basd.a(str));
                    cqbdVarE.A("contentType", contentTypeA);
                    cqbdVarE.s((efoc) obj);
                    ((asrx) this.a.d.b()).c(atysVar.b());
                    return eijx.e(atav.FAIL_NO_RETRY);
                }
            }, this.e);
            eieuVarK.b(eijuVarF);
            eieuVarK.close();
            return eijuVarF;
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            try {
                eieuVarK.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    @Override // defpackage.cbty
    public final /* synthetic */ Object d(FileTransferInformation fileTransferInformation, atys atysVar, fcxy fcxyVar) {
        return cbtw.b(this, fileTransferInformation, atysVar, fcxyVar);
    }

    @Override // defpackage.cbty
    public final boolean e(FileTransferInformation fileTransferInformation) {
        AutoValue_FileTransferInformation autoValue_FileTransferInformation = (AutoValue_FileTransferInformation) fileTransferInformation;
        return autoValue_FileTransferInformation.c.isEmpty() && autoValue_FileTransferInformation.d.isEmpty();
    }
}
