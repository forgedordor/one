package defpackage;

import android.os.Looper;
import j$.time.Instant;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cczg implements cczi {
    public static final AtomicBoolean a = new AtomicBoolean(false);
    protected final dzzh b;
    public final Object c;
    protected final AtomicReference d = new AtomicReference();

    /* compiled from: PG */
    public interface a {
        eosc A();

        egzh ep();

        cczn iu();

        cogw y();
    }

    public cczg(dzzh dzzhVar, Object obj) {
        this.b = dzzhVar;
        this.c = obj;
    }

    public static boolean n() {
        return a.get() || cqbe.a.equals(elvg.ROBOLECTRIC_BUILD);
    }

    @Override // defpackage.egyi
    public final eopy a() {
        long jA = ((a) cqtf.a(a.class)).y().a();
        Object obj = this.d.get();
        return obj != null ? new eopy(eijx.e(egyh.a(obj, Instant.ofEpochMilli(jA)))) : new eopy(eijx.e(egyh.a));
    }

    @Override // defpackage.egyi
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final eiju b() {
        Object obj = this.d.get();
        if (obj != null) {
            return eijx.e(obj);
        }
        return eijx.g(new Callable() { // from class: cczf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.h();
            }
        }, ((a) cqtf.a(a.class)).A());
    }

    @Override // defpackage.cczv
    public final Object e() {
        if (Looper.myLooper() == Looper.getMainLooper() && !n()) {
            throw new IllegalThreadStateException(String.valueOf(this.b.d()).concat(" read blocked UI thread at startup"));
        }
        Object obj = this.d.get();
        return obj != null ? obj : h();
    }

    @Override // defpackage.cczv
    public final Object f() {
        return this.c;
    }

    protected final Object g() {
        try {
            return this.b.b();
        } catch (IllegalStateException | NullPointerException e) {
            ekrw ekrwVarG = cczh.a.g();
            ekrwVarG.X(eksq.a, "BuglePhenotype");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarG).g(e)).h("com/google/android/apps/messaging/shared/experiments/flags/CachedFlag", "readPhenotypeFlag", 'l', "CachedFlag.java")).q("Phenotype Flags not initialized. Initializing now.");
            ((a) cqtf.a(a.class)).iu().a();
            return this.b.b();
        }
    }

    protected Object h() {
        Object objG;
        synchronized (this.b) {
            objG = g();
            this.d.set(objG);
        }
        return objG;
    }

    @Override // defpackage.egyi
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String c() {
        return this.b.d();
    }

    @Override // defpackage.cczv
    public String j() {
        return this.b.d();
    }

    @Override // defpackage.cczv
    public void k(Object obj) {
        dzzh dzzhVar = this.b;
        synchronized (dzzhVar) {
            dzzhVar.g(obj);
            this.d.set(obj);
        }
    }

    @Override // defpackage.cczv
    public void l() {
        this.d.set(null);
        ((a) cqtf.a(a.class)).ep().b(eijx.e(null), c());
    }

    @Override // defpackage.cczv
    public final void m() {
        dzzh dzzhVar = this.b;
        synchronized (dzzhVar) {
            dzzhVar.d = -1;
            this.d.set(null);
        }
    }
}
