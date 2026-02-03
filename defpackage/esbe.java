package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.firebase.appindexing.internal.IAppIndexingService;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esbe extends dcja {
    final /* synthetic */ esbf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esbe(esbf esbfVar) {
        super(null, false, 9002);
        this.a = esbfVar;
    }

    @Override // defpackage.dcja
    protected final /* bridge */ /* synthetic */ void a(dcev dcevVar, defr defrVar) {
        IAppIndexingService iAppIndexingService = (IAppIndexingService) ((esay) dcevVar).w();
        esbd esbdVar = new esbd(this, defrVar);
        esbf esbfVar = this.a;
        esaz esazVarMutate = iAppIndexingService.mutate(esbdVar, esbfVar.a, ApiMetadata.a);
        int i = esazVarMutate == null ? 2 : esazVarMutate.a;
        boolean z = true;
        esbf esbfVar2 = null;
        if (i == 3) {
            if (esbo.a(4)) {
                Log.i("FirebaseAppIndex", "Queue was full. API call will be retried.");
            }
            if (defrVar.d(null)) {
                esbg esbgVar = esbfVar.c;
                Queue queue = esbgVar.b;
                synchronized (queue) {
                    if (esbgVar.c == 0) {
                        esbf esbfVar3 = (esbf) queue.peek();
                        dclh.h(esbfVar3 == esbfVar);
                        esbfVar2 = esbfVar3;
                    } else {
                        esbgVar.c = 2;
                    }
                }
            }
        } else {
            if (i != 1) {
                String strG = a.g(i, "API call failed. Status code: ");
                if (esbo.a(6)) {
                    Log.e("FirebaseAppIndex", strG);
                }
                if (defrVar.d(null)) {
                    this.a.b.a(new esad("Indexing error."));
                }
            }
            esbf esbfVar4 = this.a;
            esbg esbgVar2 = esbfVar4.c;
            Queue queue2 = esbgVar2.b;
            synchronized (queue2) {
                if (((esbf) queue2.poll()) != esbfVar4) {
                    z = false;
                }
                dclh.h(z);
                esbfVar2 = (esbf) queue2.peek();
                esbgVar2.c = 0;
            }
        }
        if (esbfVar2 != null) {
            esbfVar2.a();
        }
    }
}
