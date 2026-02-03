package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edmp {
    public static final ekrg a = ekrg.c("com/google/android/libraries/user/profile/photopicker/common/model/profile/ProfileStateRepository");
    public final edgi b;
    private final edgc d;
    private final eosc e;
    private final etul f;
    private final edhj g;
    public final lvy c = new lvy(edhm.g());
    private int h = 1;

    public edmp(edgc edgcVar, eosc eoscVar, etul etulVar, edhj edhjVar, edgi edgiVar) {
        this.d = edgcVar;
        this.e = eoscVar;
        this.f = etulVar;
        this.g = edhjVar;
        this.b = edgiVar;
    }

    public final void a(edhm edhmVar) {
        this.h = ((edhd) edhmVar).b;
        this.c.j(edhmVar);
    }

    public final void b() {
        synchronized (this) {
            int i = this.h;
            if (i != 2 && i != 4) {
                a(edhm.h());
                edhi edhiVarA = this.g.a(exwf.OBAKE_GET_PROFILE_STATE);
                edhiVarA.d();
                edgc edgcVar = this.d;
                etvf etvfVar = (etvf) etvg.a.createBuilder();
                etul etulVar = this.f;
                etvfVar.copyOnWrite();
                etvg etvgVar = (etvg) etvfVar.instance;
                etvgVar.c = etulVar;
                etvgVar.b |= 1;
                etvfVar.copyOnWrite();
                etvg.a((etvg) etvfVar.instance);
                eork.r(eoqt.t(edgcVar.e((etvg) etvfVar.build())), new edmo(this, edhiVarA), this.e);
            }
        }
    }
}
