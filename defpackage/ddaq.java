package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ddaq implements ddaj {
    public static final ddbn a = new ddbn("InternalGmsDCC");
    public final Executor b;
    public final ddaz c;
    public final ddbm d;

    public ddaq(ddag ddagVar, Context context, Executor executor, ddaz ddazVar, diep diepVar) {
        ddbm ddbmVar = new ddbm(executor, new ddax(ddazVar, executor), ddagVar, new ddbs(context, diepVar));
        this.b = executor;
        this.c = ddazVar;
        this.d = ddbmVar;
    }
}
