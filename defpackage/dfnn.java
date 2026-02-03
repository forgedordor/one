package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfnn extends Handler {
    public static final Object a = new Object();
    public dfnm[] b;
    public int c;
    public dfnm[] d;
    public int e;
    public final dfnj f;
    public final dfnk g;
    public dfnb h;
    public final List i;
    public final HashMap j;
    public dfmy k;
    public final ArrayList l;
    private boolean m;
    private Message n;
    private final dfmz o;
    private boolean p;
    private final CountDownLatch q;
    private int r;
    private dfmy s;
    private boolean t;

    public dfnn(Looper looper, dfnb dfnbVar) {
        super(looper);
        this.m = false;
        this.o = new dfmz();
        this.c = -1;
        dfnj dfnjVar = new dfnj();
        this.f = dfnjVar;
        dfnk dfnkVar = new dfnk();
        this.g = dfnkVar;
        this.q = new CountDownLatch(1);
        this.i = new CopyOnWriteArrayList();
        this.j = new HashMap();
        this.t = false;
        this.l = new ArrayList();
        this.h = dfnbVar;
        c(dfnjVar, null);
        c(dfnkVar, null);
    }

    static String d(dfmy dfmyVar) {
        return dfmyVar != null ? dfmyVar.a() : "null";
    }

    private final void g(dfnl dfnlVar) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            dfnlVar.a((dfmx) it.next());
        }
    }

    private final void h(int i) {
        int i2 = i;
        while (true) {
            int i3 = this.c;
            if (i2 > i3) {
                this.t = false;
                return;
            }
            if (i == i3) {
                this.t = false;
            }
            final dfmy dfmyVar = this.b[i2].a;
            dfmyVar.b();
            g(new dfnl() { // from class: dfni
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.dfnl
                public final void a(Object obj) {
                    obj.b(dfmyVar);
                }
            });
            this.b[i2].c = true;
            i2++;
        }
    }

    private final void i() {
        g(new dfnl() { // from class: dfne
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.dfnl
            public final void a(Object obj) {
                obj.d();
            }
        });
    }

    public final int a() {
        int i = this.c + 1;
        int i2 = this.e - 1;
        int i3 = i;
        while (i2 >= 0) {
            this.b[i3] = this.d[i2];
            i2--;
            i3++;
        }
        this.c = i3 - 1;
        return i;
    }

    final dfmy b() {
        int i;
        dfnm[] dfnmVarArr = this.b;
        if (dfnmVarArr == null || (i = this.c) < 0) {
            return null;
        }
        return dfnmVarArr[i].a;
    }

    final dfnm c(dfmy dfmyVar, dfmy dfmyVar2) {
        dfnm dfnmVarC = null;
        if (dfmyVar2 != null) {
            dfnm dfnmVar = (dfnm) this.j.get(dfmyVar2);
            dfnmVarC = dfnmVar == null ? c(dfmyVar2, null) : dfnmVar;
        }
        HashMap map = this.j;
        dfnm dfnmVar2 = (dfnm) map.get(dfmyVar);
        if (dfnmVar2 == null) {
            dfnmVar2 = new dfnm();
            map.put(dfmyVar, dfnmVar2);
        }
        dfnm dfnmVar3 = dfnmVar2.b;
        if (dfnmVar3 != null && dfnmVar3 != dfnmVarC) {
            throw new RuntimeException("state already added");
        }
        dfnmVar2.a = dfmyVar;
        dfnmVar2.b = dfnmVarC;
        dfnmVar2.c = false;
        return dfnmVar2;
    }

    final void e(dfmy dfmyVar) {
        dfnb dfnbVar;
        if (this.t && (dfnbVar = this.h) != null) {
            dfnbVar.h("transitionTo called while transition already in progress to " + String.valueOf(this.s) + ", new target state=" + String.valueOf(dfmyVar));
        }
        this.s = dfmyVar;
        dfnb dfnbVar2 = this.h;
        if (dfnbVar2 != null) {
            dfnbVar2.i("transitionTo: destState=".concat(String.valueOf(dfmyVar.a())));
        }
        g(new dfnl() { // from class: dfng
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.dfnl
            public final void a(Object obj) {
                obj.g();
            }
        });
    }

    public final void f() {
        this.r++;
        sendMessageAtFrontOfQueue(obtainMessage(-2, a));
    }

    @Override // android.os.Handler
    public final void handleMessage(final Message message) {
        final dfmy dfmyVar;
        dfnm dfnmVar;
        if (message.what == -2) {
            this.r--;
        }
        if (this.m) {
            return;
        }
        if (this.h != null && message.what != -2 && message.what != -1) {
            g(new dfnl() { // from class: dfnc
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.dfnl
                public final void a(Object obj) {
                    Integer.toString(message.what);
                    obj.f();
                }
            });
        }
        this.n = message;
        if (!this.p) {
            if (message.what != -2 || this.n.obj != a) {
                dhja.g("StateMachine.handleMessage: The start method not called, received msg: %s", message);
                return;
            }
            this.p = true;
            h(0);
            this.k.d();
            i();
            dfmyVar = this.k;
        } else if (message.what == -2 && this.n.obj == a) {
            dfnm dfnmVar2 = this.b[this.c];
            dfnmVar2.a.d();
            dfmy dfmyVar2 = dfnmVar2.a;
            i();
            dfmyVar = null;
        } else {
            dfnm dfnmVar3 = this.b[this.c];
            if (message.what == -1 && message.obj == a) {
                e(this.g);
            } else if (message.what == -2 && message.obj == a) {
                dfnmVar3.a.d();
                dfmy dfmyVar3 = dfnmVar3.a;
                i();
            } else {
                while (!dfnmVar3.a.e(message) && (dfnmVar3 = dfnmVar3.b) != null) {
                }
            }
            dfmyVar = dfnmVar3 != null ? dfnmVar3.a : null;
            if (dfmyVar != null && message.what != -2 && message.what != -1) {
                g(new dfnl() { // from class: dfnd
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.dfnl
                    public final void a(Object obj) {
                        Message message2 = message;
                        Integer.toString(message2.what);
                        obj.e(dfmyVar, message2);
                    }
                });
            }
        }
        dfmy dfmyVar4 = this.b[this.c].a;
        Object obj = message.obj;
        dfmz dfmzVar = this.o;
        Object obj2 = a;
        dfmzVar.c();
        if (obj != obj2) {
            dfmzVar.b();
        }
        dfmy dfmyVar5 = this.s;
        if (dfmyVar5 != null) {
            try {
                f();
                while (true) {
                    this.e = 0;
                    boolean z = dfmyVar == null || dfmyVar == b() || dfmyVar == dfmyVar5;
                    dfnm dfnmVar4 = (dfnm) this.j.get(dfmyVar5);
                    while (true) {
                        dfnm[] dfnmVarArr = this.d;
                        int i = this.e;
                        this.e = i + 1;
                        dfnmVarArr[i] = dfnmVar4;
                        dfnmVar4 = dfnmVar4.b;
                        if (dfnmVar4 == null) {
                            break;
                        }
                        z = z || dfnmVar4.a == dfmyVar;
                        if (dfnmVar4.c && z) {
                            break;
                        }
                    }
                    this.t = true;
                    while (true) {
                        int i2 = this.c;
                        if (i2 < 0 || (dfnmVar = this.b[i2]) == dfnmVar4) {
                            break;
                        }
                        dfnmVar.a.c();
                        g(new dfnl() { // from class: dfnf
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.dfnl
                            public final void a(Object obj3) {
                                obj3.c();
                            }
                        });
                        dfnm[] dfnmVarArr2 = this.b;
                        int i3 = this.c;
                        dfnmVarArr2[i3].c = false;
                        this.c = i3 - 1;
                    }
                    h(a());
                    ArrayList arrayList = this.l;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        sendMessageAtFrontOfQueue((Message) arrayList.get(size));
                    }
                    arrayList.clear();
                    dfmy dfmyVar6 = this.s;
                    if (dfmyVar5 == dfmyVar6) {
                        break;
                    } else {
                        dfmyVar5 = dfmyVar6;
                    }
                }
                this.s = null;
            } catch (Throwable th) {
                throw new IllegalStateException(String.format("Error while transiting from %s to %s by message %d, msgProcessedState = %s, stateStack = %s", d(dfmyVar4), d(dfmyVar5), Integer.valueOf(message.what), d(dfmyVar), Arrays.toString(this.b)), th);
            }
        }
        if (dfmyVar5 != null) {
            if (dfmyVar5 == this.g) {
                this.h.k();
                if (this.h.c != null) {
                    getLooper().quit();
                    this.h.c = null;
                }
                this.h.b = null;
                this.h = null;
                this.n = null;
                dfmzVar.a();
                this.b = null;
                this.d = null;
                this.j.clear();
                this.k = null;
                this.s = null;
                this.l.clear();
                this.m = true;
                this.q.countDown();
            } else if (dfmyVar5 == this.f) {
                this.h.j();
            }
        }
        if (this.h == null || this.r != 0) {
            return;
        }
        g(new dfnl() { // from class: dfnh
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.dfnl
            public final void a(Object obj3) {
                obj3.a();
            }
        });
    }
}
