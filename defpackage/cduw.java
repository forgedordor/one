package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cduw implements dqzt {
    private static Boolean c() {
        return Boolean.valueOf(crbf.e());
    }

    @Override // defpackage.dqzt
    public final boolean a(ewut ewutVar) {
        if (ewutVar.equals(ewut.GDD_BUGLE_EMOJIFY)) {
            return c().booleanValue();
        }
        return false;
    }

    @Override // defpackage.dqzt
    public final /* bridge */ /* synthetic */ ListenableFuture b(ewut ewutVar) {
        return ewutVar == ewut.GDD_BUGLE_EMOJIFY ? eijx.e(c()) : eijx.e(false);
    }
}
