package defpackage;

import android.content.ContentValues;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqtx {
    public static dqtw o() {
        final dqou dqouVar = new dqou();
        dqouVar.e = new AtomicInteger(0);
        dqouVar.c(false);
        dqouVar.d = new ejxr() { // from class: dqtt
            @Override // defpackage.ejxr
            public final Object get() {
                return dqxc.c(null, null);
            }
        };
        dqouVar.a = dqsb.a;
        dqouVar.g = new AtomicLong(-1L);
        dqouVar.f = new AtomicLong(-1L);
        dqouVar.h = new AtomicBoolean(true);
        dqouVar.l = new ejxr() { // from class: dqtu
            @Override // defpackage.ejxr
            public final Object get() {
                dqsy dqsyVar = ((dqou) dqouVar).c;
                if (dqsyVar == null) {
                    throw new IllegalStateException("Property \"database\" has not been set");
                }
                bwzt bwztVar = ((bwzy) dqsyVar).j;
                boolean z = false;
                if (bwztVar.d != null && Thread.currentThread() == bwztVar.d) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        };
        return dqouVar;
    }

    public abstract ContentValues a();

    public abstract dqsb b();

    public abstract dqsy c();

    public abstract dqus d();

    public abstract dqwl e();

    public abstract ejxr f();

    public abstract ejxr g();

    public abstract ejxr h();

    public abstract String i();

    public abstract AtomicBoolean j();

    public abstract AtomicInteger k();

    public abstract AtomicLong l();

    public abstract AtomicLong m();

    public abstract boolean n();

    public final dqxc p() {
        dqxc dqxcVar = (dqxc) h().get();
        return dqxcVar == null ? dqxc.c(null, null) : dqxcVar;
    }
}
