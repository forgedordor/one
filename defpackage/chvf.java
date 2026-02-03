package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class chvf {
    public static final chvf i = j(-1, -1).a();

    public static chve j(int i2, int i3) {
        chue chueVar = new chue();
        chueVar.a = i2;
        byte b = chueVar.e;
        chueVar.b = i3;
        chueVar.e = (byte) (b | 3);
        chueVar.d(bvec.UNKNOWN);
        chueVar.b(-2);
        chueVar.f = 1;
        return chueVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract Uri d();

    public abstract bvec e();

    public abstract chve f();

    public abstract enxu g();

    public abstract Optional h();

    public abstract int i();

    public final chvf k(Uri uri) {
        chve chveVarF = f();
        ((chue) chveVarF).c = uri;
        return chveVarF.a();
    }

    public final chvf l(bvec bvecVar) {
        chve chveVarF = f();
        chveVarF.d(bvecVar);
        return chveVarF.a();
    }
}
