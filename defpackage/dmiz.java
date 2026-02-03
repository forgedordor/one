package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dmiz extends wv {
    public static final /* synthetic */ fdeh[] s;
    public final fdcz t;

    static {
        fdbv fdbvVar = new fdbv(dmiz.class, "size", "getSize()Landroid/util/Size;", 0);
        int i = fdcj.a;
        s = new fdeh[]{fdbvVar};
    }

    public dmiz(View view) {
        super(view);
        this.t = new dmiy(this);
    }

    public abstract Object C(fcxy fcxyVar);

    public abstract void D(dmiu dmiuVar);

    public abstract Object E();
}
