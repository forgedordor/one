package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class svc implements fdap {
    final /* synthetic */ svl a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ fdis e;

    public svc(svl svlVar, int i, int i2, int i3, fdis fdisVar) {
        this.a = svlVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = fdisVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((ahat) obj).getClass();
        Context context = this.a.b;
        String string = context.getString(this.b);
        String string2 = context.getString(this.c);
        string2.getClass();
        String string3 = context.getString(this.d);
        string3.getClass();
        fdis fdisVar = this.e;
        return new djmj(string2, null, null, string, false, false, new dktq(string3, new sva(fdisVar)), null, new svb(fdisVar), 182);
    }
}
