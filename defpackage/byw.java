package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byw implements byy {
    final /* synthetic */ Context a;
    final /* synthetic */ byz b;

    public byw(byz byzVar, Context context) {
        this.b = byzVar;
        this.a = context;
    }

    @Override // defpackage.byy
    public final cby a(cbi cbiVar, Executor executor) {
        return new cby(cbiVar, executor, this.a);
    }
}
