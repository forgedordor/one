package defpackage;

import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffcc extends fezu {
    final /* synthetic */ ffcd d;
    final /* synthetic */ ffcz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffcc(String str, ffcd ffcdVar, ffcz ffczVar) {
        super(str);
        this.d = ffcdVar;
        this.e = ffczVar;
    }

    @Override // defpackage.fezu
    public final long a() {
        long jC;
        int i;
        ffct[] ffctVarArr;
        fdci fdciVar = new fdci();
        ffcz ffczVar = this.e;
        ffcl ffclVar = this.d.a;
        synchronized (ffclVar.u) {
            synchronized (ffclVar) {
                ffcz ffczVar2 = ffclVar.r;
                ffcz ffczVar3 = new ffcz();
                ffczVar3.e(ffczVar2);
                ffczVar3.e(ffczVar);
                fdciVar.a = ffczVar3;
                jC = ((ffcz) fdciVar.a).c() - ffczVar2.c();
                ffctVarArr = null;
                if (jC != 0) {
                    Map map = ffclVar.c;
                    if (!map.isEmpty()) {
                        ffctVarArr = (ffct[]) map.values().toArray(new ffct[0]);
                    }
                } else {
                    jC = 0;
                }
                ffcz ffczVar4 = (ffcz) fdciVar.a;
                ffczVar4.getClass();
                ffclVar.r = ffczVar4;
                ffclVar.k.f(new ffbz(a.x(ffclVar.d, " onSettings"), ffclVar, fdciVar));
            }
            try {
                ffclVar.u.a((ffcz) fdciVar.a);
            } catch (IOException e) {
                ffclVar.c(e);
            }
        }
        if (ffctVarArr == null) {
            return -1L;
        }
        for (ffct ffctVar : ffctVarArr) {
            synchronized (ffctVar) {
                ffctVar.c(jC);
            }
        }
        return -1L;
    }
}
