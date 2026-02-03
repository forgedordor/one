package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyph implements ehaw {
    final /* synthetic */ Context a;
    final /* synthetic */ cypb b;
    final /* synthetic */ cypi c;

    public cyph(cypi cypiVar, Context context, cypb cypbVar) {
        this.a = context;
        this.b = cypbVar;
        this.c = cypiVar;
    }

    @Override // defpackage.ehaw
    public final /* bridge */ /* synthetic */ egyk a() {
        return new egyb("CAMERA_SOURCE");
    }

    @Override // defpackage.ehaw
    public final ListenableFuture b() {
        final Context context = this.a;
        final cypb cypbVar = this.b;
        return eijx.g(new Callable() { // from class: cypg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dekh dekhVar = new dekh();
                Context context2 = context;
                if (context2 == null) {
                    throw new IllegalArgumentException("No context supplied.");
                }
                cypb cypbVar2 = cypbVar;
                dekhVar.a = context2;
                dekhVar.f = true;
                dekhVar.i = new dekf(dekhVar, cypbVar2);
                return dekhVar;
            }
        }, this.c.a);
    }
}
