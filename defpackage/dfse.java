package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfse extends eyix {
    private final eyir b;

    public dfse(eyik eyikVar, eyik eyikVar2, eyir eyirVar) {
        super(eyikVar2, new eyji(dfse.class), eyikVar);
        this.b = eyje.c(eyirVar);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        Conversation conversationC;
        dftb dftbVar = (dftb) obj;
        dfny dfnyVar = dfsd.a;
        if (dftbVar.b().isPresent()) {
            conversationC = dfwf.d((dgzn) dftbVar.b().get());
        } else {
            if (!dftbVar.a().isPresent()) {
                throw new IllegalArgumentException("No message or session presented");
            }
            conversationC = dfwf.c((dgyx) dftbVar.a().get());
        }
        return eork.i(conversationC);
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
