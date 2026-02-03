package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czxs implements eora {
    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return;
        }
        czxv.a.r("The reminder was not removed successfully by reminder snackbar");
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        czxv.a.o("Failed to remove reminder by reminder snackbar", th);
    }
}
