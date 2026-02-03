package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jtz extends fdbr implements fdae {
    final /* synthetic */ jua a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtz(jua juaVar) {
        super(0);
        this.a = juaVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        jua juaVar = this.a;
        juaVar.d = null;
        Trace.beginSection("OnPositionedDispatch");
        try {
            juaVar.a();
            Trace.endSection();
            return fctx.a;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
