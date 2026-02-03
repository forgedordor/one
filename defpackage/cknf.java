package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cknf implements cknb {
    public final cmfo a;
    public final egzh b;
    public final ains c;
    private final fdjx d;

    public cknf(cmfo cmfoVar, egyt egytVar, egzh egzhVar, fdjx fdjxVar, ains ainsVar) {
        egytVar.getClass();
        egzhVar.getClass();
        fdjxVar.getClass();
        ainsVar.getClass();
        this.a = cmfoVar;
        this.b = egzhVar;
        this.d = fdjxVar;
        this.c = ainsVar;
    }

    @Override // defpackage.cknb
    public final eiju a(boolean z) {
        return auvw.c(this.d, fcyi.a, fdjz.a, new ckne(this, z, null));
    }

    @Override // defpackage.cknb
    public final boolean b() throws IOException {
        eieu eieuVarH = eiiy.h("ReactionsSettingsDataServiceImpl#getEnableIosReactionClassificationSync");
        try {
            ckni ckniVar = (ckni) this.a.l();
            boolean z = (ckniVar.b & 1) != 0 ? ckniVar.c : true;
            fczl.a(eieuVarH, null);
            return z;
        } finally {
        }
    }
}
