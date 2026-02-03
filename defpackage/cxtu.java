package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.net.Uri;
import android.provider.Telephony;
import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxtu extends fcyz implements fdat {
    long a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ LoadMessagesReceiver d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxtu(LoadMessagesReceiver loadMessagesReceiver, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = loadMessagesReceiver;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxtu) c((List) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        List list;
        long j;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            j = this.a;
            list = (List) this.c;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            list = (List) this.c;
            LoadMessagesReceiver loadMessagesReceiver = this.d;
            long jA = ((cogw) loadMessagesReceiver.l().b()).a();
            fcsu fcsuVar = loadMessagesReceiver.i;
            if (fcsuVar == null) {
                fdbq.c("contentResolver");
                fcsuVar = null;
            }
            egxv egxvVar = (egxv) fcsuVar.b();
            final Uri uri = Telephony.Sms.Inbox.CONTENT_URI;
            final ContentValues[] contentValuesArr = (ContentValues[]) list.toArray(new ContentValues[0]);
            ListenableFuture listenableFutureC = egxvVar.c(new egxu() { // from class: egxr
                @Override // defpackage.egxu
                public final Object a(egrq egrqVar) {
                    final Uri uri2 = uri;
                    final ContentValues[] contentValuesArr2 = contentValuesArr;
                    Integer num = (Integer) egrqVar.e(uri2, new egro() { // from class: egqx
                        @Override // defpackage.egro
                        public final Object a(ContentProviderClient contentProviderClient) {
                            return Integer.valueOf(contentProviderClient.bulkInsert(uri2, contentValuesArr2));
                        }
                    });
                    num.intValue();
                    return num;
                }
            });
            this.c = list;
            this.a = jA;
            this.b = 1;
            if (fdxs.c(listenableFutureC, this) == fcylVar) {
                return fcylVar;
            }
            j = jA;
        }
        long jA2 = ((cogw) this.d.l().b()).a();
        ekrw ekrwVarH = LoadMessagesReceiver.d.h();
        ekrwVarH.X(eksq.a, "BugleDiagnostics");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/ui/debug/LoadMessagesReceiver$loadMessagesFromFile$3", "invokeSuspend", 160, "LoadMessagesReceiver.kt")).v("Inserted %d messages in %d ms", list.size(), jA2 - j);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cxtu cxtuVar = new cxtu(this.d, fcxyVar);
        cxtuVar.c = obj;
        return cxtuVar;
    }
}
