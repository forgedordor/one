package defpackage;

import android.content.Context;
import com.google.android.libraries.geller.portable.Geller;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drcv {
    public final Geller a;
    public final String b;
    public ejvr c;
    public final ExecutorService d;
    public final ExecutorService e;
    public final ExecutorService f;
    public final Set g;
    public ejvr h;
    public evrj i;
    public final Boolean j;
    public String k;
    public Map l;
    public Context m;
    public ejwi n;
    public ejwi o;
    public ejwi p;
    public final duzr q;

    public drcv(Geller geller, String str, duzr duzrVar, Set set, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        ejud ejudVar = ejud.a;
        this.h = new ejvr() { // from class: drcs
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return new dqzs();
            }
        };
        this.i = evwy.f(60L);
        this.j = true;
        this.k = "geller-pa.googleapis.com";
        this.l = ekoj.a;
        int i = ekgb.d;
        if (ekoe.a == null) {
            throw new NullPointerException("Null gellerRetryableErrorCodes");
        }
        evri evriVar = (evri) evrj.a.createBuilder();
        evriVar.copyOnWrite();
        ((evrj) evriVar.instance).b = 300L;
        if (((evrj) evriVar.build()) == null) {
            throw new NullPointerException("Null gellerSyncRetryInitialDelay");
        }
        this.m = null;
        this.n = ejudVar;
        this.o = ejudVar;
        this.p = ejudVar;
        this.a = geller;
        this.b = str;
        this.q = duzrVar;
        this.g = set;
        this.d = executorService;
        this.e = executorService2;
        this.f = executorService3;
    }
}
