package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsxh {
    public final dsuh a;
    public final dswj b;
    public final dstz d;
    public final dswy e = new dsxg(this);
    public int f = 0;
    public Runnable g = null;
    public final dsxk c = new dsxk();

    public dsxh(dsuh dsuhVar, dswj dswjVar, dstz dstzVar) {
        this.a = dsuhVar;
        this.b = dswjVar;
        this.d = dstzVar;
    }

    public final void a() {
        this.g = null;
        dsxk dsxkVar = this.c;
        if (dsxkVar.d.isEmpty() && dsxkVar.a.isEmpty() && dsxkVar.b.isEmpty() && dsxkVar.f.isEmpty()) {
            return;
        }
        eieu eieuVarK = eiiy.k("GIL:AutoProcessBatch");
        try {
            this.a.c(new dsug() { // from class: dsxd
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.dsug
                public final List a() {
                    dsxk dsxkVar2 = this.a.c;
                    char c = 2;
                    if (Log.isLoggable("GIL", 2)) {
                        Log.v("GIL", String.format(Locale.US, "AutoGIL Batch: inserts=%d; visibility=%d; removes=%d", Integer.valueOf(dsxkVar2.a.size()), Integer.valueOf(dsxkVar2.b.size()), Integer.valueOf(dsxkVar2.f.size())));
                    }
                    eieu eieuVarK2 = eiiy.k("GIL:CreateInsertGrafts");
                    try {
                        Set<dsvd> set = dsxkVar2.a;
                        for (dsvd dsvdVar : set) {
                            if (dsvdVar.g == -1) {
                                dsxkVar2.b(dsvdVar);
                            }
                        }
                        set.clear();
                        List list = dsxkVar2.e;
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((dsvd) it.next()).g = -1;
                        }
                        list.clear();
                        eieuVarK2.close();
                        eieu eieuVarK3 = eiiy.k("GIL:CreateVisibilityGrafts");
                        try {
                            Set<dsvd> set2 = dsxkVar2.b;
                            for (dsvd dsvdVar2 : set2) {
                                ejwl.p(dsvdVar2.f(), "Not impressed: %s", dsvdVar2);
                                int iH = dsvdVar2.h();
                                dsvp dsvpVar = dsvdVar2.c;
                                int i = ((dsvq) dsvpVar.instance).e;
                                int iB = emmy.b(i);
                                if (iB == 0) {
                                    iB = 1;
                                }
                                if (iB != iH) {
                                    int iB2 = emmy.b(i);
                                    if (iB2 == 0) {
                                        iB2 = 1;
                                    }
                                    int i2 = iB2 - 1;
                                    if (i2 == 2 || i2 == 4) {
                                        if (iH == 2) {
                                            continue;
                                        } else {
                                            ejwl.m(iH != 1, "Repressed VE was visible.");
                                        }
                                    }
                                    dsvpVar.copyOnWrite();
                                    dsvq dsvqVar = (dsvq) dsvpVar.instance;
                                    int i3 = iH - 1;
                                    if (iH == 0) {
                                        throw null;
                                    }
                                    dsvqVar.e = i3;
                                    dsvqVar.b |= 2;
                                    ArrayList arrayList = new ArrayList();
                                    dsxc.a(dsvdVar2, arrayList);
                                    dsxj dsxjVarA = dsxkVar2.a(arrayList, 0);
                                    int iB3 = emmy.b(((dsvq) arrayList.get(0)).e);
                                    if (iB3 == 0 || iB3 == 1) {
                                        dsxjVarA.b(new dsxx(2, arrayList, dsxjVarA.e.size()));
                                        dsxi dsxiVar = new dsxi(dsxjVarA);
                                        eohx eohxVar = ((dsvq) dsvpVar.instance).d;
                                        if (eohxVar == null) {
                                            eohxVar = eohx.a;
                                        }
                                        eohz eohzVar = eohxVar.e;
                                        if (eohzVar == null) {
                                            eohzVar = eohz.a;
                                        }
                                        if ((eohzVar.b & 2) != 0) {
                                            dsxiVar.a(dsvdVar2);
                                        }
                                    } else {
                                        dsxjVarA.b(new dsxx(3, arrayList, -1));
                                    }
                                }
                            }
                            set2.clear();
                            eieuVarK3.close();
                            Map map = dsxkVar2.f;
                            if (!map.isEmpty()) {
                                eieuVarK3 = eiiy.k("GIL:CreateRemoveGrafts");
                                try {
                                    for (Map.Entry entry : map.entrySet()) {
                                        Collection<dsvq> collection = (Collection) entry.getValue();
                                        for (dsvq dsvqVar2 : collection) {
                                            dsvd dsvdVar3 = (dsvd) entry.getKey();
                                            int iB4 = emmy.b(dsvqVar2.e);
                                            if (iB4 == 0 || iB4 == 1) {
                                                ArrayList arrayList2 = new ArrayList();
                                                dsvp dsvpVar2 = (dsvp) dsvqVar2.toBuilder();
                                                dsvpVar2.copyOnWrite();
                                                dsvq dsvqVar3 = (dsvq) dsvpVar2.instance;
                                                dsvqVar3.e = 1;
                                                char c2 = c;
                                                dsvqVar3.b |= 2;
                                                arrayList2.add((dsvq) dsvpVar2.build());
                                                if (dsvdVar3 != null) {
                                                    dsxc.a(dsvdVar3, arrayList2);
                                                }
                                                dsxkVar2.a(arrayList2, 0).b(new dsxx(3, arrayList2, -1));
                                                c = c2;
                                            }
                                        }
                                        char c3 = c;
                                        collection.clear();
                                        dsxkVar2.g = collection;
                                        c = c3;
                                    }
                                    eieuVarK3.close();
                                    dsxkVar2.f.clear();
                                } finally {
                                }
                            }
                            boolean z = dsxkVar2.i;
                            eieu eieuVarK4 = eiiy.k("GIL:LogBatch");
                            try {
                                List<dsxj> list2 = dsxkVar2.d;
                                ArrayList arrayList3 = new ArrayList(list2.size());
                                for (dsxj dsxjVar : list2) {
                                    arrayList3.add(new dsxy(dsxjVar.a, dsxjVar.b, dsxjVar.c, dsxjVar.d, dsxjVar.e, dsxjVar.f));
                                }
                                list2.clear();
                                dsxkVar2.c.clear();
                                eieuVarK4.close();
                                return arrayList3;
                            } finally {
                            }
                        } finally {
                            try {
                                eieuVarK3.close();
                                throw th;
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                    } finally {
                        try {
                            eieuVarK2.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
            });
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b() {
        if (this.g != null) {
            return;
        }
        Runnable runnableA = this.b.a(new Runnable() { // from class: dsxe
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        });
        this.g = runnableA;
        int i = this.f;
        if (i > 0) {
            ecem.d(runnableA, i);
        } else {
            ecem.e(runnableA);
        }
    }
}
