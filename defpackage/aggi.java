package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aggi implements afyw {
    public final Context a;
    private final fcsu b;

    public aggi(Context context, fcsu fcsuVar) {
        this.a = context;
        this.b = fcsuVar;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        aggf aggfVar = (aggf) afzvVar;
        final ResolvedRecipient resolvedRecipient = aggfVar.a;
        final aoer aoerVar = aggfVar.b;
        Optional optional = (Optional) this.b.b();
        final fdap fdapVar = new fdap() { // from class: aggg
            @Override // defpackage.fdap
            public final Object invoke(Object obj) throws IOException {
                ahbk ahbkVar = (ahbk) obj;
                ahbkVar.getClass();
                Context context = this.a.a;
                eiid.o(context, ahbkVar.b(context, resolvedRecipient, aoerVar));
                return fctx.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: aggh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                fdapVar.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return fctx.a;
    }
}
