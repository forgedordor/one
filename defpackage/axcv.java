package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axcv implements bati {
    public final awyr a;
    public final dqsn b;
    public final fcyh c;
    private final fdjx d;
    private final fdjx e;
    private final bvdj f;

    public axcv(awyr awyrVar, dqsn dqsnVar, fdjx fdjxVar, fcyh fcyhVar, fdjx fdjxVar2) {
        awyrVar.getClass();
        dqsnVar.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        fdjxVar2.getClass();
        this.a = awyrVar;
        this.b = dqsnVar;
        this.d = fdjxVar;
        this.c = fcyhVar;
        this.e = fdjxVar2;
        this.f = bvdj.PARTICIPANTS_TABLE_MY_IDENTITY;
    }

    @Override // defpackage.bati
    public final long a() {
        return 2L;
    }

    @Override // defpackage.bati
    public final bvdj b() {
        return this.f;
    }

    @Override // defpackage.bati
    public final eiju c() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new axco(this, null));
    }

    @Override // defpackage.bati
    public final eiju d(long j) {
        return auvw.c(this.e, fcyi.a, fdjz.a, new axcp(this, j, null));
    }

    @Override // defpackage.bati
    public final eiju e(Optional optional) {
        optional.getClass();
        return auvw.c(this.e, fcyi.a, fdjz.a, new axcu(this, optional, null));
    }
}
