package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duaj extends duam {
    private final ListenableFuture a;

    public duaj(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    @Override // defpackage.duan
    public final int b() {
        return 2;
    }

    @Override // defpackage.duam, defpackage.duan
    public final ListenableFuture c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof duan) {
            duan duanVar = (duan) obj;
            if (duanVar.b() == 2 && this.a.equals(duanVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
