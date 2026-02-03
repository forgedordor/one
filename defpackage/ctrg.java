package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctrg implements ctrc {
    public final ctjm a;
    public final ajoy b;
    public final dzuc c;
    public final fcsu d;
    public final Resources e;
    private final fdjx f;
    private final cudy g;
    private final fdpl h;
    private final fdvc i;

    public ctrg(Context context, fdjx fdjxVar, ctjm ctjmVar, cudy cudyVar, ajoy ajoyVar, dzuc dzucVar, fcsu fcsuVar) {
        context.getClass();
        fdjxVar.getClass();
        ctjmVar.getClass();
        cudyVar.getClass();
        ajoyVar.getClass();
        dzucVar.getClass();
        fcsuVar.getClass();
        this.f = fdjxVar;
        this.a = ctjmVar;
        this.g = cudyVar;
        this.b = ajoyVar;
        this.c = dzucVar;
        this.d = fcsuVar;
        this.e = context.getResources();
        fdui fduiVar = new fdui(new ctre(this, null));
        this.h = fduiVar;
        this.i = fdtg.b(new fdua(fduiVar, cudyVar.a(), new ctrf(this)), fdjxVar, fdur.a(0L, 3), new ctrh(null));
    }

    @Override // defpackage.ctrc
    public final fdvc a() {
        return this.i;
    }
}
