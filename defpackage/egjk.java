package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egjk implements egbu {
    public final Context a;
    public final eosc b;
    private final eosc c;

    public egjk(Context context, eosc eoscVar, eosc eoscVar2) {
        this.a = context;
        this.c = eoscVar;
        this.b = eoscVar2;
    }

    @Override // defpackage.egbu
    public final ListenableFuture b(egbv egbvVar) {
        return eork.n(new eooy() { // from class: egjj
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                egjk egjkVar = this.a;
                final raw rawVarB = raw.b(egjkVar.a);
                rawVarB.g();
                rawVarB.getClass();
                return egjkVar.b.submit(new Runnable() { // from class: egji
                    @Override // java.lang.Runnable
                    public final void run() {
                        rawVarB.h();
                    }
                });
            }
        }, this.c);
    }
}
