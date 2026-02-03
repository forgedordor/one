package defpackage;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzz implements nap {
    public final mzw a;
    public final long b;
    public final List c;
    public final Set d;
    public final Set e;
    public int f;
    public mzp g;
    public mzp h;
    public Looper i;
    public Handler j;
    public byte[] k;
    volatile mzr l;
    private final UUID n;
    private final HashMap o;
    private final int[] p;
    private final mzy q;
    private nav r;
    private mwx s;
    private final naz t;

    public mzz(UUID uuid, naz nazVar, HashMap map, int[] iArr) {
        mee.b(!maf.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.n = uuid;
        this.t = nazVar;
        this.o = map;
        this.p = iArr;
        this.a = new mzw();
        this.q = new mzy(this);
        this.c = new ArrayList();
        this.d = ekpg.j();
        this.e = ekpg.j();
        this.b = 300000L;
    }

    private final mzp i(List list, boolean z, nak nakVar) {
        mee.f(this.r);
        nav navVar = this.r;
        byte[] bArr = this.k;
        Looper looper = this.i;
        mee.f(looper);
        mwx mwxVar = this.s;
        mee.f(mwxVar);
        HashMap map = this.o;
        naz nazVar = this.t;
        mzp mzpVar = new mzp(this.n, navVar, this.a, this.q, list, true, z, bArr, map, nazVar, looper, mwxVar);
        mzpVar.e(nakVar);
        mzpVar.e(null);
        return mzpVar;
    }

    private final mzp j(List list, boolean z, nak nakVar, boolean z2) {
        mzp mzpVarI = i(list, z, nakVar);
        if (p(mzpVarI) && !this.e.isEmpty()) {
            m();
            q(mzpVarI, nakVar);
            mzpVarI = i(list, z, nakVar);
        }
        if (!p(mzpVarI) || !z2 || this.d.isEmpty()) {
            return mzpVarI;
        }
        n();
        if (!this.e.isEmpty()) {
            m();
        }
        q(mzpVarI, nakVar);
        return i(list, z, nakVar);
    }

    private static List k(mao maoVar, UUID uuid, boolean z) {
        int i = maoVar.b;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            man manVarA = maoVar.a(i2);
            if ((manVarA.a(uuid) || (maf.c.equals(uuid) && manVarA.a(maf.b))) && (manVarA.d != null || z)) {
                arrayList.add(manVarA);
            }
        }
        return arrayList;
    }

    private final synchronized void l(Looper looper) {
        Looper looper2 = this.i;
        if (looper2 == null) {
            this.i = looper;
            this.j = new Handler(looper);
        } else {
            mee.c(looper2 == looper);
            mee.f(this.j);
        }
    }

    private final void m() {
        ekqg ekqgVarListIterator = ekhx.o(this.e).listIterator();
        while (ekqgVarListIterator.hasNext()) {
            ((nad) ekqgVarListIterator.next()).j(null);
        }
    }

    private final void n() {
        ekqg ekqgVarListIterator = ekhx.o(this.d).listIterator();
        while (ekqgVarListIterator.hasNext()) {
            ((mzv) ekqgVarListIterator.next()).a();
        }
    }

    private final void o(boolean z) {
        if (z && this.i == null) {
            mff.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.i;
        mee.f(looper);
        if (threadCurrentThread != looper.getThread()) {
            mff.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.i.getThread().getName(), new IllegalStateException());
        }
    }

    private static boolean p(nad nadVar) {
        if (nadVar.a() != 1) {
            return false;
        }
        nac nacVarC = nadVar.c();
        mee.f(nacVarC);
        Throwable cause = nacVarC.getCause();
        return (cause instanceof ResourceBusyException) || naq.b(cause);
    }

    private static final void q(nad nadVar, nak nakVar) {
        nadVar.j(nakVar);
        nadVar.j(null);
    }

    @Override // defpackage.nap
    public final int a(mau mauVar) {
        o(false);
        nav navVar = this.r;
        mee.f(navVar);
        int iA = navVar.a();
        mao maoVar = mauVar.s;
        if (maoVar == null) {
            if (mgb.q(this.p, mbw.b(mauVar.o)) == -1) {
                return 0;
            }
        } else if (this.k == null) {
            UUID uuid = this.n;
            if (k(maoVar, uuid, true).isEmpty()) {
                if (maoVar.b == 1 && maoVar.a(0).a(maf.b)) {
                    mff.f("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: ".concat(uuid.toString()));
                }
                return 1;
            }
            String str = maoVar.a;
            if (str != null && !"cenc".equals(str) && !"cbcs".equals(str) && ("cbc1".equals(str) || "cens".equals(str))) {
                return 1;
            }
        }
        return iA;
    }

    @Override // defpackage.nap
    public final nad b(nak nakVar, mau mauVar) {
        o(false);
        mee.c(this.f > 0);
        mee.g(this.i);
        return c(this.i, nakVar, mauVar, true);
    }

    public final nad c(Looper looper, nak nakVar, mau mauVar, boolean z) {
        if (this.l == null) {
            this.l = new mzr(this, looper);
        }
        mao maoVar = mauVar.s;
        List listK = null;
        if (maoVar == null) {
            int iB = mbw.b(mauVar.o);
            nav navVar = this.r;
            mee.f(navVar);
            if ((navVar.a() == 2 && naw.a) || mgb.q(this.p, iB) == -1 || navVar.a() == 1) {
                return null;
            }
            mzp mzpVar = this.g;
            if (mzpVar == null) {
                int i = ekgb.d;
                mzp mzpVarJ = j(ekoe.a, true, null, z);
                this.c.add(mzpVarJ);
                this.g = mzpVarJ;
            } else {
                mzpVar.e(null);
            }
            return this.g;
        }
        if (this.k == null) {
            UUID uuid = this.n;
            listK = k(maoVar, uuid, false);
            if (listK.isEmpty()) {
                mzs mzsVar = new mzs(uuid);
                mff.d("DefaultDrmSessionMgr", "DRM error", mzsVar);
                nakVar.d(mzsVar);
                return new nas(new nac(mzsVar, 6003));
            }
        }
        mzp mzpVar2 = this.h;
        if (mzpVar2 != null) {
            mzpVar2.e(nakVar);
            return mzpVar2;
        }
        mzp mzpVarJ2 = j(listK, false, nakVar, z);
        this.h = mzpVarJ2;
        this.c.add(mzpVarJ2);
        return mzpVarJ2;
    }

    @Override // defpackage.nap
    public final nao d(nak nakVar, final mau mauVar) {
        mee.c(this.f > 0);
        mee.g(this.i);
        final mzv mzvVar = new mzv(this, nakVar);
        Handler handler = mzvVar.d.j;
        mee.f(handler);
        handler.post(new Runnable() { // from class: mzt
            @Override // java.lang.Runnable
            public final void run() {
                mzv mzvVar2 = mzvVar;
                mzz mzzVar = mzvVar2.d;
                if (mzzVar.f == 0 || mzvVar2.c) {
                    return;
                }
                mau mauVar2 = mauVar;
                Looper looper = mzzVar.i;
                mee.f(looper);
                mzvVar2.b = mzzVar.c(looper, mzvVar2.a, mauVar2, false);
                mzzVar.d.add(mzvVar2);
            }
        });
        return mzvVar;
    }

    public final void e() {
        if (this.r != null && this.f == 0 && this.c.isEmpty() && this.d.isEmpty()) {
            nav navVar = this.r;
            mee.f(navVar);
            navVar.h();
            this.r = null;
        }
    }

    @Override // defpackage.nap
    public final void f() {
        nav narVar;
        o(true);
        int i = this.f;
        this.f = i + 1;
        if (i != 0) {
            return;
        }
        if (this.r == null) {
            UUID uuid = this.n;
            try {
                narVar = nay.o(uuid);
            } catch (nbc unused) {
                mff.c("FrameworkMediaDrm", a.b(uuid, "Failed to instantiate a FrameworkMediaDrm for uuid: ", "."));
                narVar = new nar();
            }
            this.r = narVar;
            narVar.n(new mzq(this));
            return;
        }
        int i2 = 0;
        while (true) {
            List list = this.c;
            if (i2 >= list.size()) {
                return;
            }
            ((mzp) list.get(i2)).e(null);
            i2++;
        }
    }

    @Override // defpackage.nap
    public final void g() {
        o(true);
        int i = this.f - 1;
        this.f = i;
        if (i != 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.c);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((mzp) arrayList.get(i2)).j(null);
        }
        n();
        e();
    }

    @Override // defpackage.nap
    public final void h(Looper looper, mwx mwxVar) {
        l(looper);
        this.s = mwxVar;
    }
}
