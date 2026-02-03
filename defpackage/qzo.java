package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qzo implements Comparable {
    public final qzz a;
    public final String b;
    public final int c;
    public final Object d;
    public qzs e;
    public Integer f;
    public qzr g;
    public final boolean h;
    public boolean i;
    public qyy j;
    public qzd k;
    public rab l;
    private boolean m;

    public qzo(String str, qzs qzsVar) {
        Uri uri;
        String host;
        this.a = qzz.a ? new qzz() : null;
        this.d = new Object();
        this.h = true;
        int iHashCode = 0;
        this.m = false;
        this.i = false;
        this.j = null;
        this.b = str;
        this.e = qzsVar;
        this.k = new qzd(2500, 1, 1.0f);
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.c = iHashCode;
    }

    public final int a() {
        return this.k.a;
    }

    protected abstract qzu b(qzk qzkVar);

    public Map c() {
        return Collections.EMPTY_MAP;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        qzo qzoVar = (qzo) obj;
        int iK = qzoVar.k();
        int iK2 = k();
        return iK2 == iK ? this.f.intValue() - qzoVar.f.intValue() : (iK - 1) - (iK2 - 1);
    }

    public final void d(String str) {
        if (qzz.a) {
            this.a.a(str, Thread.currentThread().getId());
        }
    }

    public void e() {
        synchronized (this.d) {
            this.m = true;
            this.e = null;
        }
    }

    protected abstract void f(Object obj);

    final void g(String str) {
        qzr qzrVar = this.g;
        if (qzrVar != null) {
            Set set = qzrVar.a;
            synchronized (set) {
                set.remove(this);
            }
            List list = qzrVar.g;
            synchronized (list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((qzq) it.next()).a();
                }
            }
            qzrVar.b();
        }
        if (qzz.a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new qzn(this, str, id));
                return;
            }
            qzz qzzVar = this.a;
            qzzVar.a(str, id);
            qzzVar.b(toString());
        }
    }

    public final void h() {
        synchronized (this.d) {
            this.i = true;
        }
    }

    final void i() {
        rab rabVar;
        synchronized (this.d) {
            rabVar = this.l;
        }
        if (rabVar != null) {
            rabVar.a(this);
        }
    }

    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = this.m;
        }
        return z;
    }

    public int k() {
        return 2;
    }

    final void l(rab rabVar) {
        synchronized (this.d) {
            this.l = rabVar;
        }
    }

    final void m() {
        qzr qzrVar = this.g;
        if (qzrVar != null) {
            qzrVar.b();
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.c));
        String str = true != j() ? "[ ] " : "[X] ";
        String str2 = k() != 1 ? "NORMAL" : "LOW";
        return str + this.b + " " + "0x".concat(strValueOf) + " " + str2 + " " + this.f;
    }
}
