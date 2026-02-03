package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cguu implements efoj {
    public final fcsu a;
    private final fdjx b;

    public cguu(fcsu fcsuVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar;
        this.b = fdjxVar;
    }

    @Override // defpackage.efoj
    public final /* bridge */ /* synthetic */ void a(evuh evuhVar, efoi efoiVar) {
        int i;
        cidf cidfVar = (cidf) evuhVar;
        if (((Boolean) ((cczi) crbf.bu.get()).e()).booleanValue() && !((Optional) this.a.b()).isEmpty() && (i = cidfVar.b) == 14) {
            String str = (i == 14 ? (cidr) cidfVar.c : cidr.a).b;
            str.getClass();
            if (str.length() > 0) {
                auvw.k(this.b, null, null, new cgut(this, str, null), 3);
            }
        }
    }
}
