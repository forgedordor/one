package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.rcsservice.ims.ImsEvent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfso extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;
    private final eyir e;
    private final eyir f;

    public dfso(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3, eyir eyirVar4, eyir eyirVar5) {
        super(eyikVar2, new eyji(dfso.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
        this.e = eyje.c(eyirVar4);
        this.f = eyje.c(eyirVar5);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        dftb dftbVar = (dftb) list.get(0);
        boolean zK = true;
        Optional optional = (Optional) list.get(1);
        dfdd dfddVar = (dfdd) list.get(3);
        Context context = (Context) list.get(4);
        dfny dfnyVar = dfsd.a;
        if (!dftbVar.b().isEmpty() && !dftbVar.a().isPresent()) {
            if (!((Boolean) dfsd.a.a()).booleanValue()) {
                zK = dfddVar.k((String) optional.orElse(null));
            } else if (!optional.isEmpty()) {
                dhdq dhdqVar = new dhdq();
                dhdqVar.a = 30015;
                dhdqVar.b = (String) optional.get();
                ImsEvent imsEventA = dhdqVar.a();
                Intent intent = new Intent(RcsIntents.ACTION_NEW_EVENT);
                intent.putExtra(RcsIntents.EXTRA_EVENT, imsEventA);
                dhjm.a(context, intent, dhjl.RECEIVE_MESSAGE_PRODUCER_MODULE2);
            }
        }
        return eork.i(Boolean.valueOf(zK));
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        eyir eyirVar = this.f;
        eyir eyirVar2 = this.e;
        eyir eyirVar3 = this.d;
        return eork.f(this.b.d(), this.c.d(), eyirVar3.d(), eyirVar2.d(), eyirVar.d());
    }
}
