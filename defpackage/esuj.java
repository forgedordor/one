package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esuj {
    private final Context a;
    private final esui b;

    public esuj(Context context, esui esuiVar) {
        this.a = context;
        this.b = esuiVar;
    }

    public final fbqm a(fbty fbtyVar, fbur fburVar, fbuj fbujVar) {
        fbub fbubVar = fbub.a;
        ejwl.b(!fbtyVar.d().equals(this.a.getPackageName()), "Don't use RemoteEndpoints-created channels to access in-app gRPC services");
        drgk.a();
        fbud fbudVar = new fbud();
        esui esuiVar = this.b;
        return esuiVar.a.a(fbtyVar, fbudVar, fbubVar, fburVar, fbujVar, esuiVar.b, esuiVar.c);
    }
}
