package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnqz extends dnqr {
    public String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnqz(dnky dnkyVar, dngc dngcVar, dnth dnthVar, fdjx fdjxVar) {
        super(dnkyVar, dngcVar, fdjxVar, dnthVar);
        dnkyVar.getClass();
        dngcVar.getClass();
        dnthVar.getClass();
        fdjxVar.getClass();
    }

    @Override // defpackage.dnqr
    /* renamed from: H */
    public final dnqo e(ViewGroup viewGroup, int i) {
        return G(viewGroup);
    }

    @Override // defpackage.dnqr, defpackage.vo
    public final /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        return G(viewGroup);
    }

    @Override // defpackage.dnqr
    public final /* bridge */ /* synthetic */ dnno l(int i) {
        String str = this.n;
        if (str == null) {
            fdbq.c("currentQuery");
            str = null;
        }
        return new dnnn(str);
    }
}
