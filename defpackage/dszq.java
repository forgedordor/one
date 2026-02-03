package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dszq {
    public static dsva a(long j) {
        evsl evslVar = dszs.a;
        dsyj dsyjVar = (dsyj) dsyk.a.createBuilder();
        dsyjVar.copyOnWrite();
        dsyk dsykVar = (dsyk) dsyjVar.instance;
        dsykVar.b |= 1;
        dsykVar.c = j;
        return new dsva(evslVar, (dsyk) dsyjVar.build());
    }
}
