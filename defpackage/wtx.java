package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wtx implements wtm {
    public final Context a;
    public final fdjx b;
    public final ajmh c;
    public final zup d;
    private final wre e;

    public wtx(Context context, fdjx fdjxVar, ajmh ajmhVar, wre wreVar, zup zupVar) {
        context.getClass();
        fdjxVar.getClass();
        ajmhVar.getClass();
        wreVar.getClass();
        this.a = context;
        this.b = fdjxVar;
        this.c = ajmhVar;
        this.e = wreVar;
        this.d = zupVar;
    }

    @Override // defpackage.wtm
    public final fdvc a() {
        fdpl fdplVarA = fdqq.a(new wtr(this.e.a));
        wto wtoVar = new wto(null, this);
        int i = fdsn.a;
        return fdtg.b(new fdwg(wtoVar, fdplVarA), this.b, fdur.b, null);
    }

    public final void b() {
        this.e.c(new fdap() { // from class: wtn
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                vvw vvwVar = (vvw) obj;
                vvwVar.getClass();
                return vvw.c(vvwVar, null, null, null, false, null, null, false, 0, null, 2014);
            }
        });
    }
}
