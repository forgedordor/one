package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtbt implements eyif {
    private final eyik a;

    public dtbt(eyik eyikVar) {
        this.a = eyikVar;
    }

    @Override // defpackage.fcsu
    public final /* synthetic */ Object b() {
        Optional optional = (Optional) ((eyig) this.a).a;
        fcox fcoxVar = new fcox("mapsmobilesdks-pa.googleapis.com", 443);
        fcoxVar.q();
        fbrg fbrgVar = new fbrg();
        fbqx fbqxVar = fbrg.c;
        int i = fbrb.d;
        fbrgVar.h(new fbqw("X-Goog-Api-Key", fbqxVar), (String) optional.orElse("AIzaSyDgmW4ZMvNblSXqMOgsbY8uRrTnfR3E7pY"));
        fcoxVar.i(new fcrz(fbrgVar));
        return fcoxVar.a();
    }
}
