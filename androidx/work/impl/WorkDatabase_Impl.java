package androidx.work.impl;

import defpackage.pdi;
import defpackage.pdz;
import defpackage.pfe;
import defpackage.pjq;
import defpackage.pjt;
import defpackage.qdq;
import defpackage.qdr;
import defpackage.qds;
import defpackage.qdt;
import defpackage.qdu;
import defpackage.qdv;
import defpackage.qdw;
import defpackage.qdx;
import defpackage.qdy;
import defpackage.qdz;
import defpackage.qid;
import defpackage.qif;
import defpackage.qih;
import defpackage.qij;
import defpackage.qik;
import defpackage.qin;
import defpackage.qiq;
import defpackage.qiu;
import defpackage.qiy;
import defpackage.qja;
import defpackage.qjc;
import defpackage.qjg;
import defpackage.qjo;
import defpackage.qkk;
import defpackage.qkn;
import defpackage.qkq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile qjo l;
    private volatile qid m;
    private volatile qkn n;
    private volatile qiq o;
    private volatile qiy p;
    private volatile qjc q;
    private volatile qih r;
    private volatile qik s;

    @Override // androidx.work.impl.WorkDatabase
    public final qiq A() {
        qiq qiqVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new qiu(this);
            }
            qiqVar = this.o;
        }
        return qiqVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final qiy B() {
        qiy qiyVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new qja(this);
            }
            qiyVar = this.p;
        }
        return qiyVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final qjc C() {
        qjc qjcVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new qjg(this);
            }
            qjcVar = this.q;
        }
        return qjcVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final qjo D() {
        qjo qjoVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new qkk(this);
            }
            qjoVar = this.l;
        }
        return qjoVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final qkn E() {
        qkn qknVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new qkq(this);
            }
            qknVar = this.n;
        }
        return qknVar;
    }

    @Override // defpackage.pex
    protected final pdz a() {
        return new pdz(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.pex
    protected final pjt d(pdi pdiVar) {
        pfe pfeVar = new pfe(pdiVar, new qdz(this));
        return pdiVar.c.a(pjq.a(pdiVar.a, pdiVar.b, pfeVar, false, false));
    }

    @Override // defpackage.pex
    protected final Map g() {
        HashMap map = new HashMap();
        map.put(qjo.class, Collections.EMPTY_LIST);
        map.put(qid.class, Collections.EMPTY_LIST);
        map.put(qkn.class, Collections.EMPTY_LIST);
        map.put(qiq.class, Collections.EMPTY_LIST);
        map.put(qiy.class, Collections.EMPTY_LIST);
        map.put(qjc.class, Collections.EMPTY_LIST);
        map.put(qih.class, Collections.EMPTY_LIST);
        map.put(qik.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // defpackage.pex
    public final Set h() {
        return new HashSet();
    }

    @Override // defpackage.pex
    public final List v() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qdq());
        arrayList.add(new qdr());
        arrayList.add(new qds());
        arrayList.add(new qdt());
        arrayList.add(new qdu());
        arrayList.add(new qdv());
        arrayList.add(new qdw());
        arrayList.add(new qdx());
        arrayList.add(new qdy());
        return arrayList;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final qid x() {
        qid qidVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new qif(this);
            }
            qidVar = this.m;
        }
        return qidVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final qih y() {
        qih qihVar;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new qij(this);
            }
            qihVar = this.r;
        }
        return qihVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final qik z() {
        qik qikVar;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            if (this.s == null) {
                this.s = new qin(this);
            }
            qikVar = this.s;
        }
        return qikVar;
    }
}
