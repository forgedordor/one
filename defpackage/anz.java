package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anz implements bep {
    public final aoj a;
    private final Executor b;
    private final int c;

    public anz(aoj aojVar, Executor executor, int i) {
        this.a = aojVar;
        this.b = executor;
        this.c = i;
    }

    @Override // defpackage.bep
    public final ListenableFuture a() {
        return kol.a(new koi() { // from class: anx
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                this.a.a.c();
                kogVar.b(null);
                return "invokePostCaptureFuture";
            }
        });
    }

    @Override // defpackage.bep
    public final ListenableFuture b() {
        bbs.a("Camera2CapturePipeline", "invokePreCapture");
        return bqk.f(bpw.a(this.a.a(this.c)), new akv() { // from class: any
            @Override // defpackage.akv
            public final Object a(Object obj) {
                return null;
            }
        }, this.b);
    }
}
