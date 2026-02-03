package defpackage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aybd extends fcyz implements fdat {
    final /* synthetic */ aybe a;
    final /* synthetic */ byte[] b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aybd(fcxy fcxyVar, aybe aybeVar, byte[] bArr) {
        super(2, fcxyVar);
        this.a = aybeVar;
        this.b = bArr;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aybd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        File fileB;
        fctl.b(obj);
        aybe aybeVar = this.a;
        if (!aybeVar.N.q()) {
            return fctx.a;
        }
        if (((ctce) aybeVar.K.b()).b()) {
            return fctx.a;
        }
        cmoq cmoqVar = aybeVar.M;
        byte[] bArr = this.b;
        if (bArr == null || bArr.length <= 0) {
            fileB = null;
        } else {
            fileB = cmoqVar.b("mmsdump-_corrupt_wappush_" + cmoqVar.c(null) + "_email", ekgb.r(bArr));
        }
        if (fileB == null) {
            ((ekrd) aybe.b.i().h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveMmsMessageAsyncAction$saveAndNotifyMalformedPdu$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 945, "ReceiveMmsMessageAsyncAction.kt")).q("Attempted to dump a null pdu");
            return fctx.a;
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(cbpu.e(aybeVar.d, fileB.getName())));
            try {
                bufferedOutputStream.write(bArr);
                fczl.a(bufferedOutputStream, null);
            } finally {
            }
        } catch (IOException e) {
            ((ekrd) ((ekrd) aybe.b.i()).g(e).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveMmsMessageAsyncAction$saveAndNotifyMalformedPdu$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 960, "ReceiveMmsMessageAsyncAction.kt")).q("Error writing wap push raw data");
        }
        ((ekrd) aybe.b.h().h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveMmsMessageAsyncAction$saveAndNotifyMalformedPdu$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 965, "ReceiveMmsMessageAsyncAction.kt")).q("Enqueuing SharePdu notification for pdu that we failed to persist.");
        aybe aybeVar2 = this.a;
        cgkj cgkjVar = (cgkj) aybeVar2.G.b();
        cgiw cgiwVar = (cgiw) aybeVar2.P.b();
        cgrj cgrjVar = (cgrj) cgrk.a.createBuilder();
        String name = fileB.getName();
        cgrjVar.copyOnWrite();
        cgrk cgrkVar = (cgrk) cgrjVar.instance;
        name.getClass();
        cgrkVar.b |= 1;
        cgrkVar.c = name;
        cgkjVar.d(cgiwVar, cgrjVar.build(), false);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aybd aybdVar = new aybd(fcxyVar, this.a, this.b);
        aybdVar.c = obj;
        return aybdVar;
    }
}
