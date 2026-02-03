package defpackage;

import android.os.Looper;
import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jkf extends fdbr implements fdae {
    public static final jkf a = new jkf();

    public jkf() {
        super(0);
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        Choreographer choreographer;
        if (jkk.a()) {
            choreographer = Choreographer.getInstance();
        } else {
            fdjq fdjqVar = fdkq.a;
            choreographer = (Choreographer) fdim.a(fdzb.a, new jke(null));
        }
        jkj jkjVar = new jkj(choreographer, laf.a(Looper.getMainLooper()));
        return jkjVar.plus(jkjVar.j);
    }
}
