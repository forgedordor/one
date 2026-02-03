package defpackage;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aczc {
    public static void a(aczd aczdVar, lvc lvcVar, egzh egzhVar) {
        anpj anpjVar = (anpj) aczdVar.d().b();
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("cannot add observe lifecycle from other than main thread");
        }
        lvcVar.c(new bvek(anpjVar, egzhVar, aczdVar.e()));
    }

    public static void b(aczd aczdVar, ehac ehacVar, bvel bvelVar, acxm acxmVar, final AtomicBoolean atomicBoolean) {
        final eygg eyggVarD = aczdVar.d();
        final acyz acyzVarB = aczdVar.b();
        ehacVar.a(new egys(bvelVar.a, new eopk() { // from class: bvei
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                return new eopy(!atomicBoolean.get() ? eijx.e(acyzVarB) : ((anpj) eyggVarD.b()).b());
            }
        }, aczdVar.e()), aczdVar.c(acxmVar));
    }
}
