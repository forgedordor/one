package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxfi extends bxgz {
    public final List a;
    private final Context b;

    public bxfi(Context context, cogw cogwVar, String str, List list) {
        super(str, cogwVar);
        this.b = context;
        this.a = list;
    }

    @Override // defpackage.bxgz
    public final int a() {
        return 0;
    }

    @Override // defpackage.bxgz
    protected final void b() {
        cqdf.a(this.b, new bxfh(this));
    }
}
