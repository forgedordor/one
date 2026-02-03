package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxng {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;

    public bxng(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
    }

    public final bxnf a(bxnt bxntVar, ContentType contentType) {
        Context context = (Context) this.a.b();
        context.getClass();
        eosc eoscVar = (eosc) this.c.b();
        eoscVar.getClass();
        bxntVar.getClass();
        return new bxnf(context, this.b, eoscVar, bxntVar, contentType);
    }
}
