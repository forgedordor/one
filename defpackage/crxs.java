package defpackage;

import com.google.android.apps.messaging.shared.util.spam.aapm.UnusedAapmActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crxs implements adf {
    final /* synthetic */ UnusedAapmActivity a;

    public crxs(UnusedAapmActivity unusedAapmActivity) {
        this.a = unusedAapmActivity;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ehoa, java.lang.Object] */
    @Override // defpackage.adf
    public final void a() {
        UnusedAapmActivity unusedAapmActivity = this.a;
        if (unusedAapmActivity.o == null) {
            if (!unusedAapmActivity.p) {
                throw new IllegalStateException("createPeer() called outside of onCreate");
            }
            if (unusedAapmActivity.q && !unusedAapmActivity.isFinishing()) {
                throw new IllegalStateException("createPeer() called after destroyed.");
            }
            eieu eieuVarK = eiiy.k("CreateComponent");
            try {
                unusedAapmActivity.bb();
                eieuVarK.close();
                eieuVarK = eiiy.k("CreatePeer");
                try {
                    try {
                        unusedAapmActivity.bb();
                        unusedAapmActivity.o = new crxt();
                        eieuVarK.close();
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } finally {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
        this.a.bb().at().a();
    }
}
