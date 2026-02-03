package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mhf implements mhl {
    private final boolean a;
    private final ArrayList b = new ArrayList(1);
    private int c;
    private mht d;

    protected mhf(boolean z) {
        this.a = z;
    }

    @Override // defpackage.mhl
    public /* synthetic */ Map e() {
        return Collections.EMPTY_MAP;
    }

    @Override // defpackage.mhl
    public final void f(min minVar) {
        mee.f(minVar);
        ArrayList arrayList = this.b;
        if (arrayList.contains(minVar)) {
            return;
        }
        arrayList.add(minVar);
        this.c++;
    }

    protected final void g(int i) {
        mht mhtVar = this.d;
        String str = mgb.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((min) this.b.get(i2)).a(mhtVar, this.a, i);
        }
    }

    protected final void h() {
        mht mhtVar = this.d;
        String str = mgb.a;
        for (int i = 0; i < this.c; i++) {
            ((min) this.b.get(i)).b(mhtVar, this.a);
        }
        this.d = null;
    }

    protected final void i(mht mhtVar) {
        this.d = mhtVar;
        for (int i = 0; i < this.c; i++) {
            ((min) this.b.get(i)).d(mhtVar, this.a);
        }
    }

    protected final void j() {
        for (int i = 0; i < this.c; i++) {
            ((min) this.b.get(i)).c();
        }
    }
}
