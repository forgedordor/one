package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czxt implements eora {
    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return;
        }
        czxv.a.r("The reminder was not set successfully by reminder snackbar");
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        czxv.a.n("Failed to set reminder by reminder snackbar");
    }
}
