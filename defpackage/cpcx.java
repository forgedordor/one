package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpcx implements rlq {
    private final cpcr a;

    public cpcx(cpcr cpcrVar) {
        this.a = cpcrVar;
    }

    @Override // defpackage.rlq
    public final /* synthetic */ rlp a(Object obj, int i, int i2, rex rexVar) {
        Uri uri = (Uri) obj;
        uri.getClass();
        rexVar.getClass();
        ejgz ejgzVar = (ejgz) ejha.a.createBuilder();
        ejgzVar.getClass();
        ejhb ejhbVar = (ejhb) ejhc.a.createBuilder();
        ejhbVar.getClass();
        String authority = uri.getAuthority();
        authority.getClass();
        ejhd.b(authority, ejhbVar);
        String lastPathSegment = uri.getLastPathSegment();
        lastPathSegment.getClass();
        ejhd.c(lastPathSegment, ejhbVar);
        ejgy.b(ejhd.a(ejhbVar), ejgzVar);
        ejha ejhaVarA = ejgy.a(ejgzVar);
        return new rlp(new ruq(ejhaVarA), this.a.a(ejhaVarA));
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        String authority;
        String lastPathSegment;
        Uri uri = (Uri) obj;
        uri.getClass();
        return (!fdbq.f(uri.getScheme(), "mdd") || (authority = uri.getAuthority()) == null || fdgn.H(authority) || (lastPathSegment = uri.getLastPathSegment()) == null || fdgn.H(lastPathSegment)) ? false : true;
    }
}
