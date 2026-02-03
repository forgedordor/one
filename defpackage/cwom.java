package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwom implements ehsn {
    public final Context a;
    public final fdjx b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;

    public cwom(Context context, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        context.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.a = context;
        this.b = fdjxVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
    }

    public static final String a(Intent intent) {
        Uri data;
        if (intent == null || (data = intent.getData()) == null) {
            return null;
        }
        return data.getQueryParameter("bot-id");
    }

    @Override // defpackage.ehsn
    public final ehsl b(ehsm ehsmVar) {
        return new cwol(ehsmVar, this);
    }
}
