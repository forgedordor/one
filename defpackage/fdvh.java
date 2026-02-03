package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdvh extends fdvq {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.fdvq
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(fdvf.a);
        return true;
    }

    @Override // defpackage.fdvq
    public final /* bridge */ /* synthetic */ fcxy[] b(Object obj) {
        this.a.set(null);
        return fdvp.a;
    }
}
