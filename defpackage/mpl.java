package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mpl implements mtn {
    private final Context a;
    private final nca b;
    private final ncp c = ncp.a;

    public mpl(Context context) {
        this.a = context;
        this.b = new nca(context);
    }

    @Override // defpackage.mtn
    public final void a(mth mthVar) {
        mthVar.eM();
    }

    @Override // defpackage.mtn
    public final mth[] b(Handler handler, mrk mrkVar, mrk mrkVar2, mrk mrkVar3, mrk mrkVar4) {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        nka nkaVar = new nka(context);
        nca ncaVar = this.b;
        nkaVar.d = ncaVar;
        ncp ncpVar = this.c;
        nkaVar.c = ncpVar;
        nkaVar.e = 5000L;
        nkaVar.f = handler;
        nkaVar.i = mrkVar;
        nkaVar.g = 50;
        nkaVar.h = -9223372036854775807L;
        mee.c(!nkaVar.b);
        Handler handler2 = nkaVar.f;
        mee.c((handler2 == null && nkaVar.i == null) || !(handler2 == null || nkaVar.i == null));
        nkaVar.b = true;
        arrayList.add(new nkc(nkaVar));
        mym mymVar = new mym(context);
        mee.c(!mymVar.c);
        mymVar.c = true;
        if (mymVar.f == null) {
            mymVar.f = new myo(new mdm[0]);
        }
        if (mymVar.g == null) {
            mymVar.g = new mye(mymVar.a);
        }
        arrayList.add(new mzb(context, ncaVar, ncpVar, handler, mrkVar2, new myx(mymVar)));
        arrayList.add(new ngz(mrkVar3, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new ndc(mrkVar4, looper));
        arrayList.add(new ndc(mrkVar4, looper));
        arrayList.add(new nlz());
        arrayList.add(new nbo(nbh.a));
        return (mth[]) arrayList.toArray(new mth[0]);
    }
}
