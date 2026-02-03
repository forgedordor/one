package defpackage;

import java.io.File;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rgj implements rgn, rff {
    private final List a;
    private final rgo b;
    private final rgm c;
    private int d = -1;
    private res e;
    private List f;
    private int g;
    private volatile rlp h;
    private File i;

    public rgj(List list, rgo rgoVar, rgm rgmVar) {
        this.a = list;
        this.b = rgoVar;
        this.c = rgmVar;
    }

    private final boolean d() {
        return this.g < this.f.size();
    }

    @Override // defpackage.rgn
    public final void a() {
        rlp rlpVar = this.h;
        if (rlpVar != null) {
            rlpVar.c.d();
        }
    }

    @Override // defpackage.rgn
    public final boolean b() {
        while (true) {
            boolean z = false;
            if (this.f != null && d()) {
                this.h = null;
                while (!z && d()) {
                    List list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    rlq rlqVar = (rlq) list.get(i);
                    File file = this.i;
                    rgo rgoVar = this.b;
                    this.h = rlqVar.a(file, rgoVar.e, rgoVar.f, rgoVar.h);
                    if (this.h != null && rgoVar.h(this.h.c.a())) {
                        this.h.c.g(rgoVar.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            List list2 = this.a;
            if (i2 >= list2.size()) {
                return false;
            }
            res resVar = (res) list2.get(this.d);
            rgo rgoVar2 = this.b;
            File fileA = rgoVar2.d().a(new rgk(resVar, rgoVar2.m));
            this.i = fileA;
            if (fileA != null) {
                this.e = resVar;
                this.f = rgoVar2.g(fileA);
                this.g = 0;
            }
        }
    }

    @Override // defpackage.rff
    public final void c(Object obj) {
        this.c.d(this.e, obj, this.h.c, reb.DATA_DISK_CACHE, this.e);
    }

    @Override // defpackage.rff
    public final void f(Exception exc) {
        this.c.c(this.e, exc, this.h.c, reb.DATA_DISK_CACHE);
    }
}
