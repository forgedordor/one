package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public class krf extends kqx implements krn {
    protected final krj al;
    public final ArrayList am;
    public final int an;

    public krf(krj krjVar, int i) {
        super(krjVar);
        this.am = new ArrayList();
        this.al = krjVar;
        this.an = i;
    }

    @Override // defpackage.kqx, defpackage.krg
    public final krz b() {
        return x();
    }

    public kse x() {
        return null;
    }

    public final void y() {
        super.e();
    }

    public final void z(Object... objArr) {
        Collections.addAll(this.am, objArr);
    }

    @Override // defpackage.kqx, defpackage.krg
    public void e() {
    }
}
